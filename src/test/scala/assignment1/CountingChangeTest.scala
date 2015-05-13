package assignment1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Created by bzhuk on 21.04.2015.
 */

@RunWith(classOf[JUnitRunner])
class CountingChangeTest extends FunSuite {

  import countingChange._

  test("5, (1, 2, 4) = 4 ") {
    assert(countChange(5, List(1, 2, 4)) === 4)
  }

}
