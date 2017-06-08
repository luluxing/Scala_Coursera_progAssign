package patmat

import common._

object Main extends App {
  import Huffman._
  println("Hello World!")
  println(decodedSecret)

  val tmp1 = "Tests that were aborted took too long too complete or crashed the JVM. Such crashes can arise due to infinite non-terminitaing loops or recursion (StackOverflowException) or excessive mamory consumption (OutOfMemoryException)."
  println(times(string2Chars(tmp1)))
  println(createCodeTree(string2Chars(tmp1)))

  // val t1 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
  // val enc1 = encode(t1)(string2Chars("abd"))
  // println(string2Chars("abd"))
  // println( enc1 )
  // println( quickEncode(t1)(string2Chars("abd")) )

}