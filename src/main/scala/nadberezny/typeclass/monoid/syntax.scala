package nadberezny.typeclass.monoid

object syntax {
  implicit class IntAddMonoid[A](value: A) {
    def combine(other: A)(implicit instance: Monoid[A]): A =
      instance.combine(value, other)

    def |+|(other: A)(implicit instance: Monoid[A]): A = combine(other)
  }

  implicit class OptionOfIntAddMonoid[A](value: Option[A]) {
    def combine(other: Option[A])(implicit instance: Monoid[Option[A]]): Option[A] =
      instance.combine(value, other)

    def |+|(other: Option[A])(implicit instance: Monoid[Option[A]]): Option[A] = combine(other: Option[A])
  }

}
