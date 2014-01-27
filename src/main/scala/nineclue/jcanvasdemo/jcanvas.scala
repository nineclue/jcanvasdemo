package nineclue.jcanvasdemo

import scala.scalajs.js
import js.Dynamic.{ global => g, literal => lit }
import org.scalajs.jquery.JQuery

class JCanvas extends JQuery {
  def addLayer(properties:js.Any):JCanvas = ???
  def addLayerToGroup(layerID:js.Any, groupName:js.Any):JCanvas = ???
  def animateLayer(layerID:js.Any, properties:js.Dynamic, duration:js.Number, easing:js.String, complete:js.Function):JCanvas = ???
  def animateLayer(layerID:js.Any, properties:js.Dynamic, duration:js.Number, easing:js.String):JCanvas = ???
  def animateLayer(layerID:js.Any, properties:js.Dynamic, duration:js.Number, complete:js.Function):JCanvas = ???
  def animateLayer(layerID:js.Any, properties:js.Dynamic, easing:js.String, complete:js.Function):JCanvas = ???
  def animateLayer(layerID:js.Any, properties:js.Dynamic, duration:js.Number):JCanvas = ???
  def animateLayer(layerID:js.Any, properties:js.Dynamic, easing:js.String):JCanvas = ???
  def animateLayer(layerID:js.Any, properties:js.Dynamic, complete:js.Function):JCanvas = ???
  def animateLayer(layerID:js.Any, properties:js.Dynamic):JCanvas = ???
  def animateLayerGroup(groupID:js.Any, properties:js.Dynamic, duration:js.Number, easing:js.String, complete:js.Function):JCanvas = ???
  def animateLayerGroup(groupID:js.Any, properties:js.Dynamic, duration:js.Number, easing:js.String):JCanvas = ???
  def animateLayerGroup(groupID:js.Any, properties:js.Dynamic, duration:js.Number, complete:js.Function):JCanvas = ???
  def animateLayerGroup(groupID:js.Any, properties:js.Dynamic, easing:js.String, complete:js.Function):JCanvas = ???
  def animateLayerGroup(groupID:js.Any, properties:js.Dynamic, duration:js.Number):JCanvas = ???
  def animateLayerGroup(groupID:js.Any, properties:js.Dynamic, easing:js.String):JCanvas = ???
  def animateLayerGroup(groupID:js.Any, properties:js.Dynamic):JCanvas = ???
  def clearCanvas(section:js.Dynamic):JCanvas = ???
  def clearCanvas:JCanvas = ???
  def createGradient(properties:js.Dynamic):JCanvasGradient = ???
  def createPattern(properties:js.Dynamic):JCanvasPattern = ???
  def delayLayer(layerID:js.Any, duration:js.Number):JCanvas = ???
  def delayLayerGroup(groupID:js.Any, duration:js.Number):JCanvas = ???
  def detectPixelRatio(callback:js.Function):JCanvas = ???
  def draw(properties:js.Any):JCanvas = ???
  def drawArc(properties:js.Any):JCanvas = ???
  def drawBezier(properties:js.Any):JCanvas = ???
  def drawEllipse(properties:js.Any):JCanvas = ???
  def drawImage(properties:js.Any):JCanvas = ???
  def drawLayers:JCanvas = ???
  def drawLine(properties:js.Any):JCanvas = ???
  def drawPolygon(properties:js.Any):JCanvas = ???
  def drawQuadratic(properties:js.Any):JCanvas = ???
  def drawRect(properties:js.Any):JCanvas = ???
  def drawSlice(properties:js.Any):JCanvas = ???
  def drawText(properties:js.Any):JCanvas = ???
  def drawVector(properties:js.Any):JCanvas = ???
  def getCanvasImage(imageType:js.Any):String = ???
  def getEventHooks:js.Object = ???
  def getLayer(layerID:js.Any):JCanvasLayer = ???
  def getLayerGroup(groupID:js.Any):JCanvasLayer = ???
  def getLayerIndex(layerID:js.Any):js.Number = ???
  def getLayers(callback:js.Function):js.Array[js.Object] = ???
  def getLayers:js.Array[js.Object] = ???
  // depreciated
  // def jCanvas(properties:js.Any):JCanvas = ???
  def extend(properties:js.Any):js.Function = ???
  def measureText(properties:js.Any):js.Object = ???
  def measureText(layerID:js.Any, properties:js.Any):js.Object = ???
  def moveLayer(layerID:js.Any, groupName:js.Any):JCanvas = ???
  def removeLayer(layerID:js.Any):JCanvas = ???
  def removeLayerFromGroup(layerID:js.Any, groupName:js.Any):JCanvas = ???
  def removeLayerGroup(groupID:js.Any):JCanvas = ???
  def removeLayers:JCanvas = ???
  def restoreCanvas(properties:js.Any):JCanvas = ???
  def restoreCanvasOnRedraw(properties:js.Any):JCanvas = ???
  def rotateCanvas(properties:js.Any):JCanvas = ???
  def saveCanvas(properties:js.Any):JCanvas = ???
  def scaleCanvas(properties:js.Any):JCanvas = ???
  def setEventHooks(properties:js.Any):JCanvas = ???
  def setLayer(layerID:js.Any, properties:js.Any):JCanvas = ???
  def setLayerGroup(layerID:js.Any, properties:js.Any):JCanvas = ???
  def setLayers(properties:js.Any, callback:js.Function):JCanvas = ???
  def setLayers(properties:js.Any):JCanvas = ???
  def setPixels(properties:js.Any):JCanvas = ???
  def stopLayer(layerID:js.Any, clearQueue:js.Boolean):JCanvas = ???
  def stopLayer(layerID:js.Any):JCanvas = ???
  def stopLayerGroup(groupID:js.Any, clearQueue:js.Boolean):JCanvas = ???
  def stopLayerGroup(groupID:js.Any):JCanvas = ???
  def translateCanvas(properties:js.Any):JCanvas = ???
}

class JCanvasGradient extends JQuery

class JCanvasPattern extends JQuery

class JCanvasLayer extends JQuery