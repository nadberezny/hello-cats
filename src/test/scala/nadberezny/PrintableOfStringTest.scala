package nadberezny

import org.scalatest.FunSuite

import nadberezny.typeclass.Printable
import nadberezny.typeclass.printable.instances._
import nadberezny.typeclass.printable.syntax._

class PrintableOfStringTest extends FunSuite {
  val expected = "String value: 42"

  test("proof as object for #format") {
    assert(Printable.format("42") == expected)
  }

  test("proof as syntax for #format when Option of String") {
    assert(Option("42").format == expected)

    assert((None:  Option[String]).format == "")
  }

  test("proof for #print") {
    val stream = new java.io.ByteArrayOutputStream()
    Console.setOut(stream)
    "42".print
    assert(stream.toString == s"$expected\n")
  }
}
