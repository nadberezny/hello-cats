package nadberezny.typeclass

import nadberezny.SalesOrder
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

  test("sales order") {
    assert(
      SuperAdder(None: Option[SalesOrder], None: Option[SalesOrder]).isEmpty
    )

    assert(
      SuperAdder(Option(SalesOrder(20, 2)), None: Option[SalesOrder]).isEmpty
    )

    assert(
      SuperAdder(Option(SalesOrder(20, 2)), Option(SalesOrder(10, 1))) contains SalesOrder(30, 3)
    )
  }
}
