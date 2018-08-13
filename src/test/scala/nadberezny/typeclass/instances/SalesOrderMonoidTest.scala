package nadberezny.typeclass.instances

import nadberezny.SalesOrder
import org.scalatest.FunSuite
import nadberezny.typeclass.monoid.instances._
import nadberezny.typeclass.monoid.syntax._

class SalesOrderMonoidTest extends FunSuite {
  test("idem") {
    assert(
      (SalesOrder(20, 2) |+| SalesOrder(10, 1)) ==  SalesOrder(30, 3)
    )
  }

  test("option of sales order") {
    assert(
      (Option(SalesOrder(20, 2)) |+| Option(SalesOrder(10, 1))) contains  SalesOrder(30, 3)
    )

    assert(
      (Option(SalesOrder(20, 2)) |+| None).isEmpty
    )
  }

}
