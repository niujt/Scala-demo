import java.time.LocalDateTime

import app.HelloWord

object ScalaDemo {
  def main(args:Array[String]) {
    //var可以被多次赋值，val就不行，编译报错
    val helloWord=new HelloWord();
    val year =2018
    val month =12
    val monthOfDay =28
    val hour =4
    val minute=40
    helloWord.handler(LocalDateTime.of(year,month,monthOfDay,hour,minute))
    println("相加为"+helloWord.sum(1,2))
    println(helloWord.jian(4,2))
    println(helloWord.cheng(3,6))
    println(helloWord.chu(5.0,2.0))
    //方法  （可以将函数作为参数传入到方法中，反之不行）
    def m2(f:(Int,Int)=>Int)=f(3,6)
    //函数
    val f2=(x:Int,y:Int)=>x-y
    println(m2(f2))
  }

}
