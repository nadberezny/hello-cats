package nadberezny.typeclass.eq

import cats.Eq
import nadberezny.Cat

object instances {
  implicit val catEq = Eq.instance[Cat] { (cat, otherCat) => cat == otherCat }

  implicit def optionEq[A](implicit proof: Eq[A]): Eq[Option[A]] = (option: Option[A], otherOption: Option[A]) =>
    (option, otherOption) match {
      case (None, None) => true
      case (None, Some(_)) => false
      case (Some(_), None) => false
      case (Some(a), Some(b)) => a == b
  }
}
