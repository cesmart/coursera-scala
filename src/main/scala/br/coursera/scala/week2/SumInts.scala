package br.coursera.scala.week2

/**
 * Created by cesmart on 06/06/16.
 */
object SumInts extends App{
  //def id(x: Int): Int = x
  //def sumInts(a: Int, b: Int): Int = sum(id, a, b)

  def sumInts(a: Int, b: Int): Int = sum(x => x, a, b)

  println(sumInts(1, 3))
}