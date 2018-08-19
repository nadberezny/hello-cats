package nadberezny.typeclass.functor

import scala.language.higherKinds

object syntax {
  implicit class FunctorOps[F[_], A](src: F[A]) {
    def map[B](func: A => B)(implicit functor: Functor[F]): F[B] =
      functor.map(src)(func)
  }
}
