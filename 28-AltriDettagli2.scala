
object AltriDettagli2 {
  //sealed -> non posso derivarla in altri file
  sealed abstract class TestSealed

  class testcls(a:Int, b:String) {
    def stampa = println(a + " - " + b);
  }

  //un oggetto puo' estendere classi o tratti
  //essendo singleton puo' estenderne una istanza soltanto
  object testobj extends testcls(213, "asdafsa")


  //companions -> classi con lo stesso nome di un oggetto, devono essere nel stesso file
  //solitamente usando le implicit values per passare all'oggetto i valori della classe
  //i due sono amici, i campi privati vengono visti, tranne se sono private[this], solo in quel caso sono inacessibili


  // yield -> dare, "restituire"
  case class User(val name: String, val age: Int)
  def foo(n: Int, v: Int) = for (i <- 0 until n; j <- i until n /* condizione extra */ if i + j == v) yield (i, j) //in quel caso restituisci

  def main(args: Array[String]) {

    testobj.stampa


    val userBase = List(new User("Travis", 28),
      new User("Kelly", 33),
      new User("Jennifer", 44),
      new User("Dennis", 23))

    val twentySomethings = for(user <- userBase if (user.age >=20)) yield user.name //yield crea una List

    twentySomethings.foreach(println(_)) // o foreach(name => println(name))
    
    foo(10, 10) foreach {
      //sfrutto il case per ottenere le due parti dalla tupla
      case (i, j) => print(s"($i, $j) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
    }
    
    

    println("fine");
  }
}
