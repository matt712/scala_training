package day3

object DayThreeExercises {
  def main(args: Array[String]): Unit = {
    println(blackjack(21, 5))
    println(blackjack(5, 7))
    println(blackjack(4, 5))
    println(blackjack(21, 21))
    println(uniqueSum(2, 1, 2))
    println(tooHot(101, true))
    println(tooHot(100, true))
    println(tooHot(91, false))
    println(tooHot(80, false))
  }

  def blackjack(num1: Int, num2: Int): Int = {
    val num1Bool = isOverBlackjack(num1)
    val num2Bool = isOverBlackjack(num2)
    if (num1Bool && num2Bool) {
      0
    }
    else if (num1Bool) {
      num2
    }
    else if (num2Bool) {
      num1
    }
    else {
      if (num1 > num2) {
        num1
      }
      else {
        num2
      }
    }
  }

  def isOverBlackjack(number: Int): Boolean = {
    if (number > 21) {
      true
    }
    else {
      false
    }
  }

  def uniqueSum(num1: Int, num2: Int, num3: Int): Int = {
    if (num1 == num2 || num1 == num3) {
      num2 + num3 - num1
    }
    else if (num2 == num3) {
      num1
    }
    else {
      num1 + num2 + num3
    }
  }
  def tooHot(temp: Int, isSummer: Boolean): Boolean = {
    var upperLimit = 90
    if(isSummer) {
      upperLimit = 100
    }
    if(temp > upperLimit){
      true
    }
    else{
      false
    }
  }
}
