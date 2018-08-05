package nadberezny.typeclass

// TypeClass API
object Printable {
  def apply[A]()(implicit printable: Printable[A]): Printable[A] =
    implicitly[Printable[A]]

  def format[A](f: A => String): Printable[A] =
    new Printable[A] {
      override def format(a: A): String = f(a)

      override def print(a: A): Unit = ???
    }

  def format[A](a: A)(implicit printable: Printable[A]): String =
    printable.format(a)

  def print[A](a: A)(implicit printable: Printable[A]): Unit =
    println(format(a))
}

// TypeClass
trait Printable[A] {
  def format(a: A): String

  def print(a: A): Unit
}

