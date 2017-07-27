object MatchCase {

  case class Ogg(val x:Int, val y:Int){ //case -> utilizzabili per il match, oggetti nel "parametro" accessibili, non solo dei costruttori
      protected var xcopy = x
      private var abc123:Int = _
  }

  def main(args: Array[String]) {
    println("start")
    println(match1(3))
    println(match2(3))
    println(match2("3"))

    confrontacinque(2)
    confrontacinque(5)
    confrontacinque(9)
    //matchwithoutdefault(4) Errore
    
    var ogg1 = new Ogg(3,6)
    var ogg2 = new Ogg(6,3)
    var ogg3 = new Ogg(2,6)
    matchObject(ogg1)
    matchObject(ogg2)

  }

  
   def match1(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      // case 3 => "three too" // warning
      case _ => "many"
   }

   def match2(x: Any): String = {
      x match {
        case s:String => "String" //tenta una conversione a String, se funziona prende il case
        case _:Int => "Int"
        case _ => "No idea"
      }
   }

   def confrontacinque(x:Int) :Unit = {
      x match {
        case _ if x<5 => println("Minore di 5")
        case _ if x>5 => println("Maggiore di 5")
        case _ if x==5 => println("Uguale di 5")
      }
   }

   def matchwithoutdefault(x:Int) : Unit = {
     x match {
       case 1 => println("One")
     }
   }

   def matchObject(x:Ogg) : Unit = x match {
      case Ogg(3,6) => println("Oggetto con campi 3 e 6")
      case Ogg(_,6) => println("Oggetto con il secondo campo 6")
      case _ => println("Oggetto con campi diversi da 3 e 6")
   }


}
