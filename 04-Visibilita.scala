import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
   }
}

object Visibilita {
   def main(args: Array[String]) {
      val point = new Point(10, 20)
      printPoint
      //printPoint2
      stampaQualcosa
      //stampaQualcosa2

      def printPoint{
         println ("Point x location : " + point.x);
         println ("Point y location : " + point.y);
      }
   }
   def stampaQualcosa{
      println("ciao")
   }
   //def printPoint2{ NON VA - non ha visibilita' di di point
   //   println ("Point x location : " + point.x);
   //   println ("Point y location : " + point.y);
   // }
}

// Va bene in qualsiasi object, in qualsiasi punto, ma non fuori.
//def stampaQualcosa2{
//   println("ciao")
//}
