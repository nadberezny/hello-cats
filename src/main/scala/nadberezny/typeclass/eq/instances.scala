package nadberezny.typeclass.eq

import cats.Eq
import nadberezny.Cat

object instances {
  implicit val catEq = Eq.instance[Cat] { (cat, otherCat) => cat == otherCat }
}
