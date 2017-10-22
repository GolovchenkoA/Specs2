package spec2.music
import org.joda.time.format.PeriodFormatterBuilder
/**
  *
  * Created by Artem on 22.10.2017.
  **
@author Artem Golovchenko
  */

class Track(val name: String, val length: String) {
  require(name.trim().length() != 0, "Track name cannot be blank")

  def this(name: String) = this(name, "0:00")

  def period = {
    val fmt = new PeriodFormatterBuilder()
      .printZeroAlways()
      .appendMinutes()
      .appendSeparator(":")
      .printZeroAlways()
      .appendSeconds()
      .toFormatter()
    fmt.parsePeriod(length)
  }
}