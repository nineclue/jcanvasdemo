package nineclue.jcanvasdemo

import scala.scalajs.js
import js.Dynamic.{ global => g, literal => lit }
import org.scalajs.jquery.jQuery

object Jcanvasdemo {
  def main(): Unit = {
    val canvas1 = jQuery("<canvas id = 'graph' width = 600 height = 600></canvas>")
    jQuery("#playground").append(canvas1).find("#graph").css("border", "2px solid red")
    drawGraph(jQuery("#graph").asInstanceOf[JCanvas], (x:Int) => x*x/10)
    val canvas2 = jQuery("<canvas></canvas>").attr(lit(id="circles", width = 400, height = 400)).css("border", "1px solid gray")
    val greenCircle = lit(draggable = true, fillStyle = "green", x = 100, y = 100, radius = 50)
    jQuery("#playground").append(canvas2).find("#circles").asInstanceOf[JCanvas].drawArc(greenCircle)
  }


  def drawGraph(canvas:JCanvas, f:Int => Int):Unit = {
    /*
    val another = lit(fillStyle = "blue", x = 120, y = 120, radius = 50, draggable = true)
    canvas.drawArc(another)
    */
    def ratio2value(range1:(Int, Int), range2:(Int, Int))(value:Int):Int = ((range1._2 - range1._1) * (value - range2._1)) / (range2._2 - range2._1) + range1._1
    val width = canvas.attr("width").toInt
    val height = canvas.attr("height").toInt
    def x2x = ratio2value((0, width), (-100, 100))_
    def y2y = ratio2value((0, height), (200, -10))_
    for (x <- (-100 to 100 by 2)) {
      canvas.drawLine(lit(strokeStyle = "green", strokeWidth = 3, x1 = x2x(x), y1 = y2y(f(x)), x2 = x2x(x+10), y2 = y2y(f(x+10))))
    }
  }

  def default = {
    for (i <- (1 to 3)) {
      val canvas = g.document.createElement("canvas")
      g.document.getElementById("playground").appendChild(canvas)
    }
    val greenCircle = lit(draggable = true, fillStyle = "green", x = 100, y = 100, radius = 50)
    val another = lit(fillStyle = "#36b", x = 120, y = 120, radius = 50, draggable = true)
    jQuery("canvas").attr(lit(width = 800, height = 200)).asInstanceOf[JCanvas].drawArc(greenCircle).drawArc(another)
  }
}
