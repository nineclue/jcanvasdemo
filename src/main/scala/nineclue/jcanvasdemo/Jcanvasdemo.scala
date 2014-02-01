package nineclue.jcanvasdemo

import scala.scalajs.js
import js.Dynamic.{ global => g, literal => lit }
import org.scalajs.jquery.jQuery
import JCanvas.query2canvas

object Jcanvasdemo {
  def main(): Unit = {
    val canvas1 = jQuery("<canvas id = 'graph' width = 600 height = 600></canvas>")
    jQuery("#playground").append(canvas1).find("#graph").css("border", "2px solid red")
    drawGraph(jQuery("#graph").asInstanceOf[JCanvas], (x:Int) => x*x/10)
    val canvas2 = jQuery("<canvas></canvas>").attr(lit(id="circles", width = 400, height = 400)).css("border", "1px solid gray")
    val greenCircle = lit(draggable = true, fillStyle = "green", x = 100, y = 100, radius = 50)
    jQuery("#playground").append(canvas2).find("#circles").asInstanceOf[JCanvas].drawArc(greenCircle)
    val canvas3:JCanvas = jQuery("<canvas></canvas>")
    jQuery("#playground").append(canvas3)
    canvas3.attr(lit(id="texts", width = 800, height = 600)).css("border", "1px solid black").drawText(lit(fillStyle="#9cf", strokeStyle="#25a", strokeWidth=2, x=50, y=50, fontFamily="sans serif", fontSize=48, text="Click me!", align="left", respectAlign=true, layer=true, click=() => { canvas3.animateLayer(0, lit(scale = "+=0.5"), 250) }))
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
    val args = collection.mutable.ArrayBuffer[(String, js.Any)](("strokeStyle", "green"), ("strokeWidth", 3))
    for { 
      i <- (0 to 100)
      x = i * 2 - 100
      cx = x2x(x)
      y = f(x)
      cy = y2y(y)
    } {
      // println(i, x, cx, y, cy)
      args ++= Seq[(String, js.Any)]((s"x${i+1}", cx), (s"y${i+1}", cy))
    }
    canvas.drawLine(lit.applyDynamicNamed("apply")(args.toSeq:_*))
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
