package nadberezny.typeclass.monoid

object instances {
  implicit def optionOfIntAddMonoid[A](implicit instance: Monoid[A]): Monoid[Option[A]] =
    new Monoid[Option[A]] {
      override def empty: Option[A] = Option(instance.empty)

      override def combine(x: Option[A], y: Option[A]): Option[A] = (x, y) match {
        case (Some(a), Some(b)) =>
          Some(instance.combine(a, b))

        case _ =>
          None
      }
    }

  implicit val intAddMonoid: Monoid[Int] = new Monoid[Int] {
    override def empty: Int = 0

    override def combine(x: Int, y: Int): Int = x + y
  }
}
