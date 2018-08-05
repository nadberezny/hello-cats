package nadberezny

import nadberezny.typeclass.Printable
import org.scalatest.FunSuite

import nadberezny.typeclass.printable.instances._
import nadberezny.typeclass.printable.syntax._

class PrintableOfIntTest extends FunSuite {
  val expected = "Integer value: 42"

  test("proof as object for #format") {
    assert(Printable.format(42) == expected)
  }

  test("proof as syntax for #format") {
    assert(42.format == expected)
  }

  test("proof as object for #format when Option of Int") {
    assert(Printable.format(Option(42)) == expected)
  }

  test("proof as syntax for #format when Option of Int") {
    assert(Option(42).format == expected)

    assert((None: Option[Int]).format == "")
  }

  test("proof for #print") {
    val stream = new java.io.ByteArrayOutputStream()
    Console.setOut(stream)
    42.print
    assert(stream.toString == s"$expected\n")
  }
}
