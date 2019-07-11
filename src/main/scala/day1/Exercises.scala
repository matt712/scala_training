package day1

import sun.text.normalizer.Replaceable

object Exercises {
    def main(args: Array[String]): Unit ={
        sayThis(helloWorld())
        printTheInput(5)
        printTheInput(5.5)
        printTheInput("cat")
        println(stringEnder("Thomas", 20))
        println(stringEnder("Thomas", 4))
        printTheInput(stringMergeAndReplace("Hal", "lo", 'a','e'))
        println(addOrMult(2, 3, true))
        println(addOrMult(2, 3, false))
        println(addOrMult(0, 0, false))
        println(addOrMult(5, 0, false))
        spamOut("You must construct additional pylons", 5)
        spamSquare("woah", 5)
        fizzbuzz("fizz", "buzz", 15)
    }
    def helloWorld(): String = {
        val hello = "Hello World"
        hello
    }
    def sayThis(input: String){
        println(input)
    }
    def printTheInput(input: Any) = {
        println(input)
    }
    def stringEnder(word: String, number: Integer): String ={
        val wordLength = word.length()
        if(wordLength <= number){
            word
        }
        else{
            word.substring(wordLength - number)
        }
    }
    def stringMergeAndReplace(firstHalf: String, secondHalf: String, replaceThis: Char, replaceWith: Char): String ={
        val ourString = (firstHalf + secondHalf).replace(replaceThis, replaceWith)
        ourString
    }
    def addOrMult(intOne: Integer, intTwo: Integer, doYouAdd: Boolean): Integer = {
        if(intOne == 0  && intTwo == 0){
            0
        }
        else if(intOne == 0){
            intTwo
        }
        else if(intTwo == 0){
            intOne
        }
        else if(doYouAdd){
            intOne + intTwo
        }
        else {
            intOne * intTwo
        }
    }
    def spamOut(phrase: String, times: Integer): Unit ={
            println(phrase)
            if(times != 0){
                spamOut(phrase, times - 1)
            }
    }
    def spamSquare(phrase: String, times: Integer): Unit ={
        for(i <- 1 to times){
            for(j <- 1 to times){
                print(phrase + " ")
            }
            println()
        }
    }
    def fizzbuzz(phrase1: String, phrase2: String, iterateTo: Integer): Unit ={
        if(iterateTo != 0){
            val fizzy =  iterateTo%5
            val buzzy = iterateTo%3
            fizzbuzz(phrase1, phrase2, (iterateTo -1) )
            if(fizzy == 0 && buzzy == 0){
                print(phrase1 + phrase2 + " ")
            }
            else if(fizzy == 0){
                print(phrase2 + " ")
            }
            else if (buzzy == 0){
                print(phrase1 + " ")
            }
            else{
                print(iterateTo + " ")
            }
        }
    }
}