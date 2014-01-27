package nineclue.jcanvasdemo

import scala.scalajs.js
import js.Dynamic.{ global => g, literal => lit }
import org.scalajs.jquery.jQuery

object Jcanvasdemo {
  def main(): Unit = {
    for (i <- (1 to 3)) {
      val canvas = g.document.createElement("canvas")
      g.document.getElementById("playground").appendChild(canvas)
    }
    val greenCircle = lit(draggable = true, fillStyle = "green", x = 100, y = 100, radius = 50)
    val another = lit(fillStyle = "#36b", x = 120, y = 120, radius = 50, draggable = true)
    jQuery("canvas").attr(lit(width = 800, height = 200)).asInstanceOf[JCanvas].drawArc(greenCircle).drawArc(another)
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
