package nadberezny.typeclass

import org.scalatest.FunSuite

import nadberezny.typeclass.monoid.instances._


class SuperAdderTest extends FunSuite {
  test("for ints") {
    val result = SuperAdder.apply(1, 2)
    assert(result == 3)
  }

  test("adding option of ints") {
    val result1 = SuperAdder.apply(Option(42), None)
    assert(result1.isEmpty)

    val result2 = SuperAdder.apply(Option(40), Option(2))
    assert(result2.contains(42))
  }
}
