package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 11) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    // println(countChange(4, List(1,2)))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = 
      if (c==0||r==0) 1 else if (c==r) 1
      else  pascal(c-1, r-1) + pascal(c, r-1)

    
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = 
      if(chars.isEmpty) true
      else sumOfChars(chars, 0)

    def sumOfChars(chars: List[Char], open: Int): Boolean = 
      if(chars.isEmpty) open == 0
      else {
        if (chars.head=='(') sumOfChars(chars.tail, open+1)
        else {
          if (chars.head==')') open > 0 && sumOfChars(chars.tail, open-1)
          else sumOfChars(chars.tail, open)
        }
      }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = 
      if(money==0) 1
      else 
        if(money>0 && !coins.isEmpty) countChange(money-coins.head, coins)+countChange(money, coins.tail)
        else 0
  }
