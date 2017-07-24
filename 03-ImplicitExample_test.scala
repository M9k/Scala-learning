import ImplicitExample._
//usare:
//scala
//:load ImplicitExample.scala
//:load 03-ImplicitExample_test.scala
//ImplicitExample_test.main(Array("1","2"))

import java.io._

object ImplicitExample_test {
   // case class oggetto (num:Int, nome:String, codice:String) //senza case non posso accede ai membri nella definizione

   // alternativa al case - uso un oggetto che fa da "costruttore"
    class oggetto {
      var num:Int = _
      var nome:String = _
      var codice:String = _
    }

    object oggetto {
      def apply(num:Int, nome:String, codice:String) : oggetto = { //chiamato con oggetto(Int, String, String), implicitamente diventa oggetto.apply(...)
          var r = new oggetto
          r.num = num
          r.nome = nome
          r.codice = codice
          r
      }
    }
    
    //uso una implicit class come metodo esteso
    implicit class estensioneOggetto(ogg: oggetto) {
        def stampa = println(s"${ogg.nome} - ${ogg.codice} - n. elementi ${ogg.num}")
    }

	def main(args: Array[String]) {
		
        var oggetto1: oggetto = oggetto(5,"prova","ABC12345")
        oggetto1.stampa

      
        val pt = new Point(3,4)
		pt.move(10,30)

		print("------\n")
		
     	val loc = new Location(10, 20, 15);
     	loc.move(10, 10, 5);

		print("------\n")
		
		10 times println("prova ")

		print("------\n")
		
		println(somma(4,5))

		print("------\n")

		5 riprovo "prova2" //equivale a 5.riprovo("prova2")
        2.riprovo("prova3")

		println("fine\n")
	}

  	//private class Point(xc: Int, yc: Int) {
    //		var x: Int = xc
    //		var y: Int = yc
    //		SBAGLIATO! Ho 4 variabili, me ne servono 2
  	private class Point(var x: Int, var y: Int) { //var, altrimenti sono val, di default i parametri sono sempre val

		def move(dx: Int, dy: Int) {
			x = x + dx
			y = y + dy
			println ("Point x location : " + x);
			println ("Point y location : " + y);
		}
	}

	def somma(a:Int, b:Int) :Int = //ritorno
	{
			return a+b
	}

	private final class Location(xc: Int, yc: Int, zc :Int) extends Point(xc, yc){
		   var z: Int = zc

		   def move(dx: Int, dy: Int, dz: Int) {
			  x = x + dx
			  y = y + dy
			  z = z + dz
			  println ("Point x location : " + x);
			  println ("Point y location : " + y);
			  println ("Point z location : " + z);
		   }
	}

}


