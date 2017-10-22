package spec2.music

/**
  *
  * Created by Artem on 22.10.2017.
  **
@author Artem Golovchenko
  */
case class Artist(firstName: String, middleName: Option[String],
                  lastName: String, albums: List[Album]) extends Act {
  def this(firstName: String, lastName: String) = this(firstName, None,
    lastName, Nil)

  def this(firstName: String, middleName: String, lastName: String) =
    this(firstName, Some(middleName), lastName, Nil)

  def getAlbums = albums

  def addAlbum(album: Album) = new Artist(firstName, middleName, lastName, album :: albums)

  def fullName = middleName match {
    case Some(x) => firstName + " " + x + " " + lastName
    case _ => firstName + " " + lastName
  }
}
