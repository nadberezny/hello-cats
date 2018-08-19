package nadberezny.typeclass.instances

import nadberezny.{Box, EmptyBox, NonEmptyBox}
import org.scalatest.FunSuite
import nadberezny.typeclass.functor.instances._
import nadberezny.typeclass.functor.syntax._

class BoxFunctorTest extends FunSuite {
  test("idem") {
    val someBox: Box[Int] = NonEmptyBox(42)
    val res = someBox.map(_ * 2)
    assert(res == NonEmptyBox(84))

    val emptyBox: Box[Int] = EmptyBox
    assert(emptyBox.map(_ * 2) == EmptyBox)
  }
}
