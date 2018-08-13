package nadberezny

import nadberezny.typeclass.monoid.Monoid

object SuperAdder {
  def apply[A](x: A, y: A)(implicit monoid: Monoid[A]): A = monoid.combine(x, y)
}
