package day4

import java.util.Scanner

import scala.collection.mutable.ListBuffer

object Hangman {
  def main(args: Array[String]): Unit = {
    println("hello".length)
    hangmanGame()
  }
  def hangmanGame(): Unit = {
    var lives  = 9
    val words = List("dog", "cat", "biscuit", "orangutan", "apple", "egg", "bottle", "rune", "middle")
    val r = scala.util.Random
    val scannyboi = new Scanner(System.in)
    val currentWord = words(r.nextInt(words.length))
    var guessed = "stillGuessing"
    var guessedLetters = ListBuffer[String]()
    while(lives > 0 && guessed == "stillGuessing"){
        println(s"Guessed letters:")
        println(fillbox(currentWord, guessedLetters))
        println("Guess a letter")
        var currentGuess = scannyboi.nextLine()
        if(currentWord.contains(currentGuess)){
          if(!guessedLetters.contains(currentGuess)){
            guessedLetters += currentGuess
            if(!fillbox(currentWord, guessedLetters).contains("_")){
              guessed = "win"
            }
          }
          println("You guessed a letter")
        }
        else{
          lives -= 1
          if(lives == 0){
            guessed = "lose"
          }
          else{
            println(s"You guessed wrong, ${lives} lives remaining")
          }
          drawBloke(lives)
        }
    }
    println(s"You ${guessed}, game over")
  }
  def fillbox(word: String, guesses: ListBuffer[String]): String ={
    var resultList = ""
    for (x <- 0 to word.length - 1) {
      if (guesses.contains(word(x).toString)) {
        resultList += word(x).toString
      }
      else {
        resultList += " _ "
      }
    }
    resultList
  }
  def drawBloke(lives: Int): Unit = lives match{
    case 8 => {println("|\n|\n|\n|\n|\n|\n|")}
    case 7 => {println("|_______\n|\n|\n|\n|\n|\n|")}
    case 6 => {println("|_______\n|     |\n|     |\n|     \n|\n|\n|")}
    case 5 => {println("|_______\n|     |\n|     0\n|     \n|\n|\n|")}
    case 4 => {println("|_______\n|     |\n|     0\n|    / \\ \n|\n|\n|")}
    case 3 => {println("|_______\n|     |\n|     0\n|    /|\\ \n|\n|\n|")}
    case 2 => {println("|_______\n|     |\n|     0\n|    /|\\ \n|\n|\n|")}
    case 1 => {println("|_______\n|     |\n|     0\n|    /|\\ \n|    /\n|\n|")}
    case 0 => {println("|_______\n|     |\n|     0\n|    /|\\ \n|    / \\ \n|\n|")}
  }
}
