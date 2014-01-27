package nineclue.jcanvasdemo

import scala.scalajs.js
import js.Dynamic.{ global => g, literal => lit }
import org.scalajs.jquery.jQuery

object Jcanvasdemo {
  def main(): Unit = {
    val canvas = g.document.createElement("canvas")
    g.document.getElementById("playground").appendChild(canvas)
    jQuery("canvas").asInstanceOf[JCanvas].drawArc(lit(draggable = true, fillStyle = "green", x = 100, y = 100, radius = 50))
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
