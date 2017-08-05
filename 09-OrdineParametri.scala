object OrdineParametri {
   def main(args: Array[String]) {
      printInt(b = 5, a = 7); //posso invertirli specificando i nomi, su C++ stamperebbe 5 e 7
   }
   
   def printInt( a:Int, b:Int ) = {
      println("Value of a : " + a );
      println("Value of b : " + b );
   }
}
