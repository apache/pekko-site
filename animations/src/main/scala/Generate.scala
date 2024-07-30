import math._
import java.io._

import scala.util.Random

import scalatags.Text.svgAttrs._
import scalatags.Text.svgTags.{path, _}
import scalatags.Text.implicits._

val random = new Random(0)

// in pixels by frame
val frames = 100

case class Message(startFrame: Int, from: (Double, Double), to: (Double, Double))

val width = 300
val height = sqrt(width*width-(width*width/4))
val actorRadius: Double = 45
val speed = 70
val messages = 
  List.fill(10){
    val (start, end) = random.between(0, 3) match
      case 0 => ((2*actorRadius, actorRadius), (width-2*actorRadius, actorRadius))
      case 1 => ((actorRadius+actorRadius*cos(Pi/3), actorRadius+actorRadius*sin(Pi/3)),
                 (width/2-actorRadius*cos(Pi/3), height-actorRadius-actorRadius*sin(Pi/3)))
      case 2 => ((width-actorRadius-actorRadius*cos(Pi/3), actorRadius+actorRadius*sin(Pi/3)),
                 (width/2+actorRadius*cos(Pi/3), height-actorRadius-actorRadius*sin(Pi/3)))
    val (from, to) = random.between(0, 2) match
      case 0 => (start, end)
      case 1 => (end, start)
    Message(random.between(0, frames-speed), from, to)
  }

def actor(frame: Int) =
  val actorStyle = "fill: #dd3135"
  val messageCircles =
    messages
      .filter(_.startFrame <= frame)
      .filter(_.startFrame + speed > frame)
      .map(m => {
        val d = (frame - m.startFrame).toDouble / speed
        circle(
          cx:=m.from._1 + (m.to._1 - m.from._1) * d,
          cy:=m.from._2 + (m.to._2 - m.from._2) * d,
          r:=10,
          style:="fill: #007396"
        )
      })
  val image = svg(
    xmlns := "http://www.w3.org/2000/svg",
    viewBox := s"0,0,$width,${height}",
    g(
      path(
        style:="stroke:black;fill:none;stroke-width:4px",
        d:=s"M ${actorRadius},${actorRadius} ${width-actorRadius},${actorRadius} ${width/2},${height-actorRadius} Z"
      ),
      circle(cx:=actorRadius,cy:=actorRadius,r:=actorRadius,style:=actorStyle),
      circle(cx:=width-actorRadius,cy:=actorRadius,r:=actorRadius,style:=actorStyle),
      circle(cx:=width/2,cy:=height-actorRadius,r:=actorRadius,style:=actorStyle),
      messageCircles
    )
  )
  val filename = s"actor_$frame.svg"
  val pw = new PrintWriter(new File(filename))
  pw.write("""<?xml version="1.0" encoding="UTF-8" standalone="no"?>""")
  pw.write("\n")
  pw.write(image.render)
  pw.close()
  filename

@main
def generate =
  val files = for {
    frame <- Range(0, frames)
  } yield
    actor(frame)
  println(s"magick ${files.mkString(" ")} -loop 0 actor.gif")
