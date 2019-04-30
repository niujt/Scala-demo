package file

import java.io.{File, PrintWriter}
import java.util

import scala.io.Source

/**
  * 读写文件
  */
object FileUtils {
  def main(args: Array[String]): Unit = {
    //val filename = "D:\\dictionary\\BLOOMBERG_COMMODITY_DAILY_OBSERVATION.md"
    val outfilename = "test.md"
    // val list = readFile(filename)
    // print(writeMD(outfilename, list))
    var final_list = new util.ArrayList[String]()
    getFileNames("D:\\dictionary").forEach((filename: String) => {
      println(filename)
      val list = readFile("D:\\dictionary\\" + filename)
      final_list.addAll(list)
      final_list.add("---")
    })
    println(writeMD(outfilename, final_list))
  }

  def readFile(filename: String): util.ArrayList[String] = {
    val file = Source.fromFile(filename)
    var list = new util.ArrayList[String]()
    for (line <- file.getLines()
         if (line.startsWith("|")
           || line.startsWith("表名")
           || line.startsWith("表名")
           || line.startsWith("说明")
           || line.startsWith("父表")
           || line.startsWith("ID表")
           || line.length() == 0)
    ) {
      list.add(line)
    }
    return list
  }

  def writeMD(filename: String, list: util.ArrayList[String]): String = {
    val out = new PrintWriter(filename)
    list.forEach((line: String) => out.println(line))
    out.close()
    return "success"
  }

  def getFileNames(dir: String): util.ArrayList[String] = {
    val file = new File(dir)
    var list = new util.ArrayList[String]()
    for (d <- subDir(file)) {
      list.add(d.getName)
    }
    return list
  }

  def subDir(dir: File): Iterator[File] = {
    val dirs = dir.listFiles(_.isDirectory)
    val files = dir.listFiles().filter(_.isFile)
    files.toIterator ++ dirs.toIterator.flatMap(subDir _)
  }

}
