package assignment1

/**
 * Created by bzhuk on 21.04.2015.
 */
object countingChange {

  def countChange(money: Int, coins: List[Int]): Int = {
    def count(capacity: Int, coins: List[Int]): Int = {
      if (capacity == 0)
        1
      else if (capacity < 0 || (coins.isEmpty && capacity >= 1))
        0
      else
        count(capacity, coins.tail) + count(capacity - coins.head, coins)
    }
    count(money, coins.sortWith(_.compareTo(_) < 0))
  }

}
