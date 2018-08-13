package nadberezny.typeclass.monoid

trait Semigroup[A] {
  def combine(x: A, y: A): A
}
