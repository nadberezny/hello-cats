package nadberezny.typeclass.monoid

import nadberezny.typeclass.semigroup.Semigroup

object Monoid {
  def apply[A](implicit monoid: Monoid[A]): Monoid[A] = monoid

  def combine[A](x: A, y: A)(implicit instance: Monoid[A]): A =
    instance.combine(x, y)

  def |+|[A](x: A, y: A)(implicit instance: Monoid[A]): A = combine(x, y)
}

trait Monoid[A] extends Semigroup[A] {
  def empty: A
}

