package nadberezny.typeclass.functor

import nadberezny.{Box, EmptyBox, NonEmptyBox}

object instances {

  implicit val boxFunctor = new Functor[Box] {
    override def map[A, B](fa: Box[A])(f: A => B): Box[B] = fa match {
      case NonEmptyBox(value) => NonEmptyBox(f(value))
      case _ => EmptyBox
    }
  }
}
