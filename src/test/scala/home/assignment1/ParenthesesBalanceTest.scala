package home.assignment1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Created by bzhuk on 20.04.2015.
 */
@RunWith(classOf[JUnitRunner])
class ParenthesesBalanceTest extends FunSuite {

  import balanceParentheses._

  test("(if (zero? x) max (/ 1 x))") {
    assert(balance("(if (zero? x) max (/ 1 x))".toList) === true)
  }

  test("I told him (that it`s not (yet) done). (But he wasn`t listening)") {
    assert(balance("I told him (that it`s not (yet) done). (But he wasn`t listening)".toList) === true)
  }

  test("())(") {
    assert(balance("())(".toList) === false)
  }

  test(":-)") {
    assert(balance(":-)".toList) === false)
  }
}
