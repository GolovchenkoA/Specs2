package spec2.music

/**
  *
  * Created by Artem on 22.10.2017.
  **
@author Artem Golovchenko
  */
class JukeBox private (val albums:Option[List[Album]],
                       val currentTrack:Option[Track]) {
  def this(albums:Option[List[Album]]) = this(albums, None)
  def readyToPlay = albums.isDefined
  def play = new JukeBox(albums, Some(albums.get(0).tracks.get(0)))
}
