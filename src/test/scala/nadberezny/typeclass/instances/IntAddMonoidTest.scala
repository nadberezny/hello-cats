package nadberezny.typeclass.instances

import org.scalatest.FunSuite

import nadberezny.typeclass.monoid.instances.intAddMonoid
import nadberezny.typeclass.monoid.Monoid
import nadberezny.typeclass.monoid.syntax._

class IntAddMonoidTest extends FunSuite {

  test("idem") {
    assert(Monoid.combine(40, 2) == 42)

    assert((40 combine 2) == 42)

    assert(Monoid.|+|(40, 2) == 42)

    assert((40 |+| 2) == 42)
  }
}
