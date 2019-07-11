import org.scalatest._
import day1.Exercises

class Test extends FlatSpec{
  "An empty set" should "be empty" in {
    assert(Set.empty.isEmpty)
  }
  it should "produce NoSuchElementException when head is invoked on an emptySet" in {
    assertThrows[NoSuchElementException] {
    Set.empty.head
    }
   }
  "Hello World method" should "returns hello world" in {
    assert(day1.Exercises.helloWorld() == "Hello World")
  }
  "add or mult" should "Return 0 when fed zeroes" in {
    assert(day1.Exercises.addOrMult(0, 0, true) == 0)
  }
}
