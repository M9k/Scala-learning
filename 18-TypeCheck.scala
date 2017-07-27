object TypeCheck {
  class C1(x: Int) {
    var i = x
  }
  class C2(x: Int) extends C1(x)

  // isInstanceOf[] funzione templetizzata, indica se il tipo e esattamente quello 
  // asInstanceOf[] cast
  // match invece basta che riesca a castarlo, quindi indica anche se e un sottotipo => ottimo da usare assieme a asInstanceOf

  def main(args: Array[String]) {
    val a:C1 = new C2(5)
    val b:C1 = new C1(5)

    if(a.isInstanceOf[C1])
      print("\"a\" is a C1\n")
    else
      print("\"a\" is not a C1\n")
    if(a.isInstanceOf[C2])
      print("\"a\" is a C2\n")
    else
      print("\"a\" is not a C2\n")
    
    a match {
      case _:C2 => print("a is a C2 and a C1\n")
      case _:C1 => print("a is a C1\n")
      case _ => print("No idea about a :/\n")
    }

    if(b.isInstanceOf[C1])
      print("\"b\" is a C1\n")
    else
      print("\"b\" is not a C1\n")
    if(b.isInstanceOf[C2])
      print("\"b\" is a C2\n")
    else
      print("\"b\" is not a C2\n")
    
    b match {
      case _:C2 => print("b is a C2 and a C1\n")
      case _:C1 => print("b is a C1\n")
      case _ => print("No idea about b :/\n")
    }


    a match {
      case _:C2 => println("a = "+a.asInstanceOf[C2].i)
      case _ => println("a is not an istance of C2")
    }

    println(a.i)
    println(b.i)

    println("fine")
  }

}
