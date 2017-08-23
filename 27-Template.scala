object Template {

  //se non e' numerico non funziona la sum, quindi devo indicare che lo deve essere
  def somma[A:Numeric](a:A*) : A = a.sum

  class Quadrato[A] (a1: A, a2:A, b1:A, b2:A)
  // _|_1_2_
  // a| X X
  // b| X X
  //  |

  def main(args: Array[String]) {
    println(somma(55,6))
    println(somma[Int](55,6))
    println(somma[Char](55,6))
    println(somma[Double](55,6))
    val x = new Quadrato(1,2,3,4)
    val y = new Quadrato('a','b','c','d')
    val z = new Quadrato[Float](5,6,7,8) //senza perdita, cast implicito
  }
}
