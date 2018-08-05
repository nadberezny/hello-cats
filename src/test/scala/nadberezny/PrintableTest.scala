package nadberezny

import org.scalatest.FunSuite

import nadberezny.typeclass.Printable
import nadberezny.typeclass.printable.instances._

class PrintableTest extends FunSuite {
  test("apply summons implicit proof") {
    val proofForInt = Printable[Int]
    assert(proofForInt.format(42) == "Integer value: 42")
  }

  test("type class constructor for #format") {
    val formatForLong = Printable.format((l: Long) => s"Long value: $l")
    assert(formatForLong.format(1L) == "Long value: 1")
  }
}
