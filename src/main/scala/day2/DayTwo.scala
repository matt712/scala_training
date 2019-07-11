package day2

import java.util.TimeZone
//These are the continued exercises from day 1
object DayTwo {
  def main(args: Array[String]): Unit = {
    val array2
    for(x <- pattern2()){
      print(x + ", ")
    }
    for( x <- timeIDs()){
      for( y <- x){
        print(y + ", ")
      }
      println()
    }
  }
  def pattern2(numbers: any): Array[Int] = numbers match{
    case numbers:Array[Int] => numbers.reverse
    case numbers:List[Int] => numbers.toArray.reverse
    case numbers: (x, y) => (y, x)
  }
  def timeIDs(): Array[Array[String]] = {
    TimeZone.getAvailableIDs().filter(_.length() > 3).filter(_.contains('/')).mapInPlace(_.split('/')(1)).sliding(10, 10).toArray
  }
}
