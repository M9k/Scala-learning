object passaggioFunzioni {
  def main(args: Array[String]) {
    
    println(f3(f1,f2))
    println(f6(f1,f2))
    println(f3(f1,7))
    println(f3(f3(1,2),f4(3,4)))
    println(f7(f1))

  }

  def f1 () : Int = 5
  def f2 () : Int = 5+2
  def f3 (f1: => Int, f2: => Int ) : Int = f1+f2
  //il => NON indica che f1,f2 sono funzioni, ma e unicamente un passaggio per nome e non per valore, cosi non sono valutate se non utilizzate
  def f4 (a: Int, b:Int) : Int = a*b
  def f5 (a: Int, b:Int) : Int = a+b+b
  
  def f6 (f1: Int, f2: Int ) : Int = f1+f2
  def f7 (f: () => Int) : Int = f() //deprecato l'utilizzo in questo modo senza argomenti
}
