object IfDemo {
  //if循环demo
  def ifDemo(): Unit ={
      var x=10
    if(x<20){
      println("x<20")
    }
    else{
      println("x>20")
    }
  }
  //while循环demo
  def whileDemo(): Unit ={
    var a="hello world"
    while (true){
      println(a)
    }
  }
  //for循环demo
  def forDemo(): Unit ={
    for(a <- 1 until 3;b<-1 to 10){
      print("value of a="+a+"    ")
      println("value of b="+b)
    }
  }
  //遍历集合
  def listDemo(): Unit ={
    val numList=List(1,2,3,4,5,67)
    for(a<-numList){
      println(a)
    }
  }
  //遍历集合的时候的过滤器
  def listDemo2(): Unit ={
    val numList=List(1,2,3,4,5,67)
    for(a<-numList if a!=3;if a<8){
      println(a)
    }
  }

  def main(args: Array[String]): Unit = {
   // ifDemo()
   // whileDemo()
   // forDemo()
   // listDemo()
    listDemo2()
  }

}
