package home.assignment1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Created by bzhuk on 20.04.2015.
 */
@RunWith(classOf[JUnitRunner])
class PascalTriangleTest extends FunSuite {

  import pascalTriangle._

  test("factorial calculates ok greater than 1") {
    assert(factorial(5) === 120)
  }

  test("pascal(5,10)=252") {
    assert(pascal(5, 10) === 252)
  }

}
