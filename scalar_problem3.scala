import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the aVeryBigSum function below.
    def aVeryBigSum(ar: Array[Long]): Long = {
        var lvalue: Long =0
        ar.foreach(i => lvalue += i)

        return lvalue
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arCount = stdin.readLine.trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toLong)
        val result = aVeryBigSum(ar)

        printWriter.println(result)

        printWriter.close()
    }
}

