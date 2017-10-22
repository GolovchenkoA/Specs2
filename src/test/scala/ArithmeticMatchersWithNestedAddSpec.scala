import org.specs2.mutable.Specification

/**
  *
  * Created by Artem on 22.10.2017.
  **
@author Artem Golovchenko
  */
class ArithmeticMatchersWithNestedAddSpec extends Specification {
  "Arithmetic with nested" should {
    "add" in {
      "4 numbers" in {
        1 + 1 + 1 + 1 mustEqual 4
      }
      "5 numbers" in {
        1 + 1 + 1 + 1 + 1 mustEqual 5
      }
    }
  }
}