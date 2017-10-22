package spec2.music

/**
  *
  * Created by Artem on 22.10.2017.
  **
@author Artem Golovchenko
  */
class Album (val title:String, val year:Int, val tracks:Option[List[Track]],
             val acts:Act*) {
  require(acts.size > 0)
  def this(title:String, year:Int, acts:Act*) = this (title, year, None,
    acts:_*)
}
