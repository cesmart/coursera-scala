package br.coursera.scala

/**
 * Created by cesmart on 06/06/16.
 */
package object week2 {
  def sum(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)
}
