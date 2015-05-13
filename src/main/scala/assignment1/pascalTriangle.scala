package assignment1

import scala.annotation.tailrec

/**
 * Created by bzhuk on 20.04.2015.
 */
object pascalTriangle {


  def factorial(n: Integer) = {
    @tailrec
    def iteration(acc: Integer, n: Integer): Integer = {
      if (n == 0) acc else iteration(acc * n, n - 1)
    }
    iteration(1, n)
  }

  def pascalFact(c: Integer, r: Integer) = {
    factorial(r) / (factorial(c) * factorial(r - c))
  }

  def pascal(c: Integer, r: Integer): Integer = {
    if (c == 0 || c == r) 1
    else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

}
