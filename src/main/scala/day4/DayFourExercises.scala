package day4

import scala.collection.mutable.ListBuffer

object DayFourExercises {
  def main(args: Array[String]): Unit = {
    println(prime1(30))
    println(commonString("eg", "egg"))
  }
  def commonString(string1: String, string2: String): String = {
    var endString = ""
    for( x <- 0 to string1.length){
      if(string2.contains(string1.substring(x))){
        endString = string1.substring(x)
      }
    }
    endString
    //method unfinished
  }
  def prime1(number: Int): String = {
    if(number < 2){
      "Please enter a number bigger than or equal to 2"
    }
    else{
      var primes = ListBuffer[Int]()
      for(x <- 2 to number){
        var isPrime = true
         for( y <- 0 to primes.length -1){
           if(primes.length != 0) {
             if (x % primes(y) == 0) {
               isPrime = false
             }
           }
         }
        if(isPrime){
          primes += x
        }
      }
     s"There are ${primes.length} prime numbers in between 1 and ${number} (Inclusive)."
    }
  }
}
