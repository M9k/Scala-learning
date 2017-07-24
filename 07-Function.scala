object Function {
  def main(args: Array[String]) {
    print("start\n")
    print(somma(4,5))
    println()
    stampasomma(7,8) // ritorna Unit, ma non assegnabile, "void"
    println()
    callByName(retint1, retint2)
    printInts(1,2,3,4,5,6,7)
    printInts(1)
    printInts()
    println()
    stampasomma2(1234)
  }

  def funzione_astatta() = 0

  def somma(a:Int, b:Int) :Int = { // = necessario se ha un ritorno
      a+b //sottointeso il ritorno
  }
  def stampasomma(a:Int, b:Int) {
    print(a+b)
  }

  def stampasomma2(a:Int, b:Int = 0) :Unit = {
    print(a+b)
  }
  
  // per chiamarlo di una istanza: istanza.metodo o (new istanza).metodo
  def retint1() : Int = {
    print('*')
    1
  }
  def retint2() : Int = {
    print('^')
    2
  }
  def callByName( f1: => Int, f2: => Int) : Unit = {
    print(f1+"\n")
    print(f2+"\n")
    print(f1+"\n")
    print(f2+"\n")
  }

  def printInts(x:Int*) { // * indica piu argomenti, vale solo per l'ultimo
    for( v <- x)
      print(v+" ")
  }
}
