import org.scalatest.{FeatureSpec, GivenWhenThen}
import day3.DayThreeExercises
class Test2 extends FeatureSpec with GivenWhenThen {
  feature("Tells you if its too hot"){
    scenario("Too hot"){
      Given("It's too hot")
      var temp = 110
      val summertime = true
      assert(day3.DayThreeExercises.tooHot(temp, summertime))
      When("It cools down")
      temp -= 30
      Then("It shouldn't be too hot")
      assert(DayThreeExercises.tooHot(temp, summertime) == false)
    }
  }
}
