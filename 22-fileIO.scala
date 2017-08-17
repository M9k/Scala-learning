import scala.io.StdIn._ //per readline
import java.io._ //per il FileOutputStream e PrintWriter
import scala.io.Source //per il source

object FileIO {
   def main(args: Array[String]) {

     print("Input: " )
     val riga = readLine
     println("Hai digitato: " + riga)

     //sovrascrive il file
     new PrintWriter("test.txt") { write("--HEADER--\n"); close }
     //altro modo per scrivere su file, questa volta in append
     val f1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt", true))) // true su append, di default false
     f1.write("Input inserito: "+riga)
     f1.write("\naltro testo inutile\nasdasdasd\nasdasd\nasd asd as da sda\nasd as d as d\n asdasda \n\n\n\nasdads\tasd\n")
     f1.close()

     Source.fromFile("test.txt").foreach { 
         print //sottointesto print(_), _ e la variabile che si cicla
     }


     //esempio con la sintassi precendete
     println((new test(4) {print; printInfo; hello; hello2}).x) //chiama prima _.metodo, poi le funzioni, hello2 e inacessibile
   }

   class test(x:Int = 5, y:Int = 10) {

     def printInfo {
       println("printInfo")
       print
     }
     def print {
       println("print")
       println(x+" "+y)
     }
     
    def hello2() {
      println("CIAO DALLA CLASSE!")
    }
   }

   def hello() {
     println("CIAO!")
   }
   def hello2() {
     println("CIAO!")
   }

}
