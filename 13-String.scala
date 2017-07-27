
import scala.io.StdIn.readLine //altrimenti usa un readLine() deprecato

object String {
  def main(args: Array[String]) {
    println("Inserisci una stringa:")
    var input = readLine()
    print(input)
    println()

    val x = 1234
    
    var stringa:String = "abcdefghilmnopqrstuvz"
    print(stringa)
    println()
    print(stringa.length())
    println()

    stringa = "prova: ".concat(stringa) + "\n\n\n" //+ equivale al concat
    print(stringa)
    println()
    printf("Number = %d\n", 123)

    //formati di stampa
    print(s"ho salvato $input, ${stringa} e una variabile intera $x, quindi ho stampato ${1+1+1} valori.\n")
    print(f"Number = ${123}%d\nNumber = ${123.1234}%.10f\n") //typesafe, con formattazione
    print(raw"Provo un po' di caratteri speciali: \t \n")

    println(stringa.charAt(3))
    println(stringa.compareTo(stringa))
    println(stringa.endsWith("\n"))
    println(stringa.indexOf("\n"))
    println(stringa.getBytes())
    
    //extra: replace, split, substring(da, [a]), toLowerCase, toUpperCase, trim

  }
}
