package assignment1

/**
 * Created by bzhuk on 21.04.2015.
 */
object balanceParentheses {

  def balance(chars: List[Char]): Boolean = {
    def iteration(chars: List[Char], acc: Integer): Boolean = {
      if (chars.isEmpty) acc == 0
      else if (acc < 0) false
      else {
        val i = if (chars.head == ')') -1 else if (chars.head == '(') 1 else 0
        iteration(chars.tail, acc + i)
      }
    }
    iteration(chars, 0)
  }

}
