package nadberezny.typeclass


// TypeClass
trait Printable[A] {
  def format(a: A): String

  def print(a: A): Unit
}

// TypeClass API
object Printable {
  def format[A](a: A)(implicit printable: Printable[A]): String =
    printable.format(a)

  def print[A](a: A)(implicit printable: Printable[A]): Unit =
    println(format(a))
}