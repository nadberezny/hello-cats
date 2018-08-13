package nadberezny.typeclass.monoid

object syntax {
  implicit class IntAddMonoid[A](value: A) {
    def combine(other: A)(implicit instance: Monoid[A]): A =
      instance.combine(value, other)

    def |+|(other: A)(implicit instance: Monoid[A]): A = combine(other)
  }

}
