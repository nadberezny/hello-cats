package nadberezny.typeclass.printable

import nadberezny.typeclass.Printable

object instances {

  implicit def optionOfPrintable[A](implicit printable: Printable[A]): Printable[Option[A]] =
    new Printable[Option[A]] {
      def format(option: Option[A]): String = option match {
        case None => ""
        case Some(value) => printable.format(value)
      }

      def print(option: Option[A]): Unit = option match {
        case None => format(None)
        case _ => format(option)
      }
    }

  implicit val intPrintable = new Printable[Int] {
    def format(value: Int) = s"Integer value: ${value.toString}"

    def print(value: Int) = println(format(value))
  }

  implicit val stringPrintable = new Printable[String] {
    def format(value: String) = s"String value: $value"

    def print(value: String) = println(format(value))
  }
}
