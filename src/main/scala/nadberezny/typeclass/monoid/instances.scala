package nadberezny.typeclass.monoid

object instances {
  implicit val intAddMonoid: Monoid[Int] = new Monoid[Int] {
    override def empty: Int = 0

    override def combine(x: Int, y: Int): Int = x + y
  }
}
