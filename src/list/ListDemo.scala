package list

object ListDemo {


  def main(args: Array[String]): Unit = {
    var list = List(1,2,3)
    var list1 = List(4,5,6)
    //向队列的头部追加数据，创造新的列表,
    //它都只将成为新生成列表的第一个元素，也就是说新生成的列表长度为list的长度＋1(btw, x::list等价于list.::(x))
    //即便是添加一个集合，也是一个元素如list::list1   ((1,2,3),4,5,6)
    //var list2=list1::list
    //添加头元素
    //var list2=6+:list
    //添加尾部
    //var list2=list:+6
    //该方法只能用于连接两个List类型的集合
    var list2=list1 ::: list
    print(list2)
  }

}
