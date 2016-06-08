package br.coursera.scala.week2

/**
 * Created by cesmart on 06/06/16.
 */
object SumFactorials extends App {
  def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1)

  def sumFactorials(a: Int, b: Int): Int = sum(fact, a, b)

  println(sumFactorials(1, 3))
}
