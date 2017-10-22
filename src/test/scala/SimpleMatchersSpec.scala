import org.specs2.mutable.Specification
import spec2.music.{Album, Artist, Band, Track}

/**
  *
  * Created by Artem on 22.10.2017.
  **
@author Artem Golovchenko
  */
class SimpleMatchersSpec extends Specification {
  "Simple Matchers with Album" should {
    "Album Equels" in {
      val rumours = new Album("Rumours", 1977,
        Some(List(new Track("Second Hand News", "2:43"),
          new Track("Dreams", "4:14"),
          new Track("Never Going Back Again", "2:02"),
          new Track("Don't Stop", "3:11"))), new Band("Fleetwood Mac"))
      rumours.title must be_==("Rumours")
      rumours.title must beEqualTo("Rumours")
      rumours.title must_== ("Rumours")
      rumours.title mustEqual "Rumours"
      rumours.title should_== "Rumours"
      rumours.title === "Rumours"
      rumours.title must be equalTo ("Rumours")
      rumours.title must not be equalTo("Sweet Emotion")
      rumours.title must_!= "Sweet Emotion"
      rumours.title mustNotEqual "Sweet Emotion"
      rumours.title must be_!=("Sweet Emotion")
      rumours.title !== "Sweet Emotion"
    }
  }

}
