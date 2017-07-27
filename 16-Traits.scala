object Traits {
  
  trait Equal {
    def isEqual(x: Any): Boolean
    def isNotEqual(x: Any) : Boolean = !isEqual(x)
  }
  
  trait Greater {
    def isGreater(x:Any): Boolean
    def isNotGreater(x:Any): Boolean = !isGreater(x)
  }

  trait Lower {
    def isLower(x:Any): Boolean
    def isNotLower(x:Any): Boolean = !isLower(x)
  }


  class vettore(x1:Int, y1:Int) extends Equal with Greater with Lower {
    private val x:Int = x1
    private val y:Int = y1
    private var k:Int = _   // _ se non voglio definirli ora
    
    def isEqual(vett2: Any) : Boolean = {
      if(vett2.isInstanceOf[vettore])   //come in C# is e as
        vett2.asInstanceOf[vettore].x == x && vett2.asInstanceOf[vettore].y == y
      else
        false
    }
    def isGreater(vett2: Any) : Boolean = {
      if(vett2.isInstanceOf[vettore])
        vett2.asInstanceOf[vettore].x*vett2.asInstanceOf[vettore].y < x*y
      else
        false
    }
    def isLower(vett2: Any) : Boolean = {
      if(vett2.isInstanceOf[vettore])
        vett2.asInstanceOf[vettore].x*vett2.asInstanceOf[vettore].y > x*y
      else
        false
    }

  }

  // universal traits
  trait Printable extends Any {
    def print: Unit = println(this)
  }
  // value class
  class Email(val underlying: String) extends AnyVal with Printable {
    def lunghezza:Int = underlying.length
    override def print: Unit = println(underlying) //non mi piace stampare l'hash
  }

  def main(args: Array[String]) {
      val x = new Email("prova1234@email.com")
      println(x.lunghezza)
      x.print
  }

}
