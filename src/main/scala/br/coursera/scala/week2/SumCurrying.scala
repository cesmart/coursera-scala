package br.coursera.scala.week2

/**
 * Created by cesmart on 07/06/16.
 */
object SumCurrying extends App {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }

  def sum1(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum1(f)(a + 1, b)
  }

  println(sum(x => x)(1, 10))
  println(sum(x => x * x * x)(1, 10))
}
