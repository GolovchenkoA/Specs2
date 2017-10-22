import org.specs2.mutable.Specification

/**
  *
  * Created by Artem on 22.10.2017.
  **
@author Artem Golovchenko
  */
class ArithmeticMatchersSpec extends Specification {
  "Arithmetic" should {
    "add two numbers" in {
      1 + 1 mustEqual 2
    }
    "add three numbers" in {
      1 + 1 + 1 mustEqual 3
    }
  }
}
