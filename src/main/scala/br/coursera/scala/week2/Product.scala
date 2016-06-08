package br.coursera.scala.week2

/**
 * Created by cesmart on 07/06/16.
 */
object Product extends App {
  //  def sum(f: Int => Int)(a: Int, b: Int): Int = {
  //    if (a > b) 1 else f(a) + sum(f)(a + 1, b)
  //  }

  //  def product(f: Int => Int)(a: Int, b: Int): Int = {
  //    if (a > b) 1 else f(a) * product(f)(a + 1, b)
  //  }

  def sum(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b)

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

  def fact(n: Int): Int = product(x => x)(1, n)

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }

  println(sum(x => x)(1, 2))
  println(product(x => x * x)(1, 2))

  println(fact(5))
}
