package nadberezny.typeclass.instances

import cats.Eq

import org.scalatest.FunSuite

import nadberezny.Cat
import nadberezny.typeclass.eq.instances._

class EqOfCatTest extends FunSuite {
  test("cats typesafe eq") {
    val cat1 = Cat("lolo", 1, "grey")
    val cat2 = Cat("olol", 2, "black")

    assert(Eq.eqv(cat1, cat1))
    assert(!Eq.eqv(cat1, cat2))
  }

}
