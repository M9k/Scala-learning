object AltriDettagli {
  
  //case class -> senza costruttori, utilizzabili come val, senza dovere usare new
  case class Point(x: Int, y: Int)

  def main(args: Array[String]) {
    var punto = Point(4,5)
    if(punto == Point(5,4))
      println("qualcosa non quadra")
    else
      println("tutto come previsto")

    // ----------------------------------------------------------------------------------
    //lista di Any, puo' contenere qualsiasi oggetto essendo Any il genitore di tutti
    val list: List[Any] = List(
      "a string",
      732,  // an integer
      'c',  // a character
      true, // a boolean value
      () => "an anonymous function returning a string"
    )
    
    list.foreach(element => println(element))

    //Da Any derivano AnyVal, cioe' i valori (Int, Double, etc), e AnyRef, cioe' i riferimenti (List, Options, qualsiasi nuova classe)
    //Null deriva automaticamente da tutti i riferimenti, Nothing deriva automaticamente da tutti i valori e da Null
    //Unit rappresenta il vuolo, e' sempre vero, usato nei return ad esempio, mentre Nothing e' sempre falso, usato per i throw ad esempio per catturare
    //Null usato per compatibilita' con Java, da non usare in Scala

    // ----------------------------------------------------------------------------------
    //i cast senza perdita sono automatici, i cast con perdita sono bloccati
    
    // ----------------------------------------------------------------------------------
    //il costruttore dichiara comunque dei membri della classe che rimangono
    class Point2(var x: Int = 0, private var y: Int = 0)

    val origin = new Point2  // x and y are both set to 0
    val point1 = new Point2(1)
    val point2 = new Point2(y=2)
    println(point1.x)  // prints 1

    // ----------------------------------------------------------------------------------
    //If Else inline
    val i = 5
    if (i<6) println("i minore di 5") else println("i maggiore di 5")

    // ----------------------------------------------------------------------------------



    println("Fine")
  }
}
