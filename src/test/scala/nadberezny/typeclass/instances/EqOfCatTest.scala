package nadberezny.typeclass.instances

import cats.Eq

import org.scalatest.FunSuite

import nadberezny.Cat
import nadberezny.typeclass.eq.instances._

class EqOfCatTest extends FunSuite {
  val cat1 = Cat("lolo", 1, "grey")
  val cat2 = Cat("olol", 2, "black")

  test("cats typesafe eq") {
    assert(Eq.eqv(cat1, cat1))
    assert(!Eq.eqv(cat1, cat2))
  }

  test("eq of option of cats") {
    val option1 = Option(cat1)
    val option2 = Option(cat2)

    assert(Eq.eqv(option1, option1))
    assert(!Eq.eqv(option1, option2))
    assert(Eq.eqv(Option.empty[Cat], Option.empty[Cat]))
    assert(!Eq.eqv(Option(cat1), Option.empty[Cat]))
  }

}
