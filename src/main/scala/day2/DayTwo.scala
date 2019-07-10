package day2

import java.util.TimeZone
//These are the continued exercises from day 1
object DayTwo {
  def main(args: Array[String]): Unit = {
    for( x <- timeIDs()){
      println(x)
    }
  }
  def timeIDs(): Array[String] = {
    TimeZone.getAvailableIDs().filter(sizeCheck(_))
  }
  def sizeCheck(ourString: String): Boolean = {
    if(ourString.length() > 3){
        true
    }
    else{
        false
    }
  }
}
