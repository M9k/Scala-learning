//esempi di import:
//import scala.xml._
//import scala.collection.immutable.{TreeMap, TreeSet}

//di default sono importati:
//    java.lang._
//    scala._
//    scala.Predef._

object HelloWorld {

   //fields - possono essere private o protected, con vari livelli di protezione, public non esiste, e di default "public"
   //Le lettere accentate saranno scritte sempre come lettere normali o la jvm di default non riesce ad interpretarle, anche se presenti solo nei commenti
   private var b :Double = _

   def main(args: Array[String]) { // main() non e avviato, serve il parametro
      println("Hello,\nworld!\n") // stampa su una riga ln=line Hello capo World capo
      
      //variabili locali
      val costante :String = "test" //value, valore, costante
      var x :String = ""            //variable, variabile, modificabile
      var l :Int = 123
      l = 544
      //l = "Ciao"                  // ERRORE!
      var tipoauto = 40             // tipizzazione NON dinamica ma statica, se non specificato il tipo e automatico
      //deprecato var (v1,v2) = Pair(23,'a') //per assegnare piu valori
      var a = 5; var b=7; var c = "Ciao"
      println(tipoauto)
      metodo1(l,l,l)
   }

   def metodo1(v1: Int, v2:Int, v3:Double) //tutti i parametri val, costanti
   {
     //v1 = 1;          //ERRORE
     println(v1)
     println(v3)
     println(v1+v2+v3)
     //return 1         //errato, di default il ritorno e Unit, non posso ritornare un Int
   }

}
