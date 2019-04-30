package app
import java.time.LocalDateTime
class HelloWord {
  def handler(date: LocalDateTime): Unit ={
    println(date)
  }
  def sum(a:Int,b:Int): Int ={
    return a+b
  }
  def jian(a:Int,b:Int): Int ={
    return a-b
  }
  def cheng(a:Int,b:Int): Int ={
    return a*b
  }
  def chu(a:Double,b:Double): Double ={
    return a/b
  }
}
