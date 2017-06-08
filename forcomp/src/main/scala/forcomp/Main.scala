package forcomp

import common._

object Main extends App {
  import Anagrams._
  println("Hello World!")
  val s = List("Xerxes", "yell")
  // val s = List("ice", "Man")
  // val s = List("I", "love", "you")
  println(s)
  println(sentenceAnagrams(s))
}