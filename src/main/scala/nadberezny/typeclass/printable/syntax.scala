package nadberezny.typeclass.printable

import nadberezny.typeclass.Printable

object syntax {
  implicit class PrintableApi[A](value: A) {
    def format(implicit printable: Printable[A]): String =
      printable.format(value)

    def print(implicit printable: Printable[A]): Unit =
      printable.print(value)
  }
}
