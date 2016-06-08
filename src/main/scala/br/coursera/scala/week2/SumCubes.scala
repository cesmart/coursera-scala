package br.coursera.scala.week2

/**
 * Created by cesmart on 06/06/16.
 */
object SumCubes extends App {
//  def cube(x: Int): Int = x * x * x
//  def sumCubes(a: Int, b: Int): Int = sum(cube, a, b)

  def sumCubes(a: Int, b: Int): Int = sum(x => x * x * x, a, b)

  println(sumCubes(1, 3))
}