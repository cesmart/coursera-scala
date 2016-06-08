package br.coursera.scala.week2

/**
 * Created by cesmart on 07/06/16.
 */
object SumIntsTailRecursion extends App {

  def soma(f: Int => Int, a: Int, b: Int): Int = {
    def somaAcc(atual: Int, acc: Int): Int = {
      if (atual > b) acc else somaAcc(atual + 1, f(atual) + acc)
    }

    somaAcc(a, 0)
  }

  def soma1(f: Int => Int)(a: Int, b: Int): Int = {
    def somaAcc(atual: Int, acc: Int): Int = {
      if (atual > b) acc else somaAcc(atual + 1, f(atual) + acc)
    }

    somaAcc(a, 0)
  }

  def somaQuadrados(a: Int, b: Int) = soma1(x => x * x)(a, b)

  val s = somaQuadrados(1, 3)

  println(s)
}
