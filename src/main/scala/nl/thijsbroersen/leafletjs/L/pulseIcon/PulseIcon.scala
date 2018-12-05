package nl.thijsbroersen.leafletjs.L.pulseIcon

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait PulseIcon extends Icon {}

@js.native
@JSGlobal("L.icon.pulse")
object PulseIcon extends js.Any {

  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Icon = js.native
}

//trait PulseIconOptions extends IconOptions {
//  val html: String = js.native
//  override val iconSize: Point = js.native
//  val animate: Boolean = js.native
//  val heartbeat: Int = js.native
//}
//
//object PulseIconOptions {
//  def apply(
//    color: js.UndefOr[String] = js.undefined,
//    iconSize: js.UndefOr[Point] = js.undefined,
//    animate: js.UndefOr[Boolean] = js.undefined,
//    heartbeat: js.UndefOr[Int] = js.undefined,
//    iconOptions: IconOptions = IconOptions()
//  ): PulseIconOptions = {
//    OptionsUtil.merge[PulseIconOptions](
//      Seq(
//        iconOptions,
//        js.Dynamic.literal(
//          color = color,
//          iconSize = iconSize,
//          animate = animate,
//          heartbeat = heartbeat
//        )
//      )
//    )
//  }
//}