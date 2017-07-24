object Fibonacci {
  def main(args: Array[String]) {
    print(fattoriale(4))
    println()
    print(fattoriale(8))
  }

  def fattoriale(x:Int) :Int = {
    if(x <=2)
      1
    else
      fattoriale(x-1) + fattoriale(x-2)
  }
}

