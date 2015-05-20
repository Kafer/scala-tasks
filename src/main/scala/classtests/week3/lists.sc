trait List[T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]

  def nth(n: Int, xs: List[T]): T
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false

  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

  def nth(n: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)

}

class Nil[T] extends List[T] {
  def isEmpty = true

  def head = throw new NoSuchElementException("Nil.head")

  def tail = throw new NoSuchElementException("Nil.tail")

  def nth(n: Int, xs: List[T]): T = throw new IndexOutOfBoundsException
}