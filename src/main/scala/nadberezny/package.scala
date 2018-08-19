package object nadberezny {
  final case class Cat(name: String, age: Int, color: String)

  final case class SalesOrder(totalCost: Double, quantity: Double)

  sealed trait Box[+A]
  final case class NonEmptyBox[A](value: A) extends Box[A]
  final case object EmptyBox extends Box[Nothing]
}
