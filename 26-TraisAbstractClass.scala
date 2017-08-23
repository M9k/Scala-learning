object TraisAbstractClass {

  abstract class AbsIterator {
    //da definire, templetizzato
    type T
    def hasNext: Boolean
    def next(): T
  }

  class StringIterator(s: String) extends AbsIterator {
    //definisco la classe T, devo definirla perche' questa classe non e' astratta
    type T = Char

    //nuovo campo
    private var i = 0
    
    //definisco quello che manca
    def hasNext = i < s.length
    def next() = {
      val ch = s charAt i
      i += 1
      ch
    }
  }

  //tratto che estende una classe astratta, aggiunge un metodo, non definisce hasNext, next e T
  trait RichIterator extends AbsIterator {
    def foreach(f: T => Unit): Unit = while (hasNext) f(next())
  }

  // estende CLASSE con MIXIN, MIXIN, MIXIN etc
  // oppure
  // estende TRAIT con MIXIN, MIXIN etc
  class Iter extends StringIterator("prova 12345 test test") with RichIterator
  // StringIterator e' una classe concreta, RichIterator e' un traid, da definire T, hasNext e next, che sono definiti da StringIterator, quindi Iter e' concreta e compila correttamente
  
  // ------------------------------------------------------------------------------
  // Non ho nessun obbligo a usare traits o derivare traits con metodi in parte definiti o completamente definiti
  // Quindi una classe puo' derivare da due traits che derivano a loro volta da una classe, avendo quindi una multi ereditarieta'
  //
  // PROBLEMA DEL DIAMANTE:
  // Scala resolves method names using a right-first depth-first search of extended 'traits',
  // Quindi non ci saranno errori di doppia dichiarazione di un metodo, ma verra' sempre preso il "primo" a destra in alto

  class concreta {
    def f() = println("funzione da classe concreta, assunta da un tratto")
  }
  trait trattoconcreto extends concreta {
    def f2() = println("funzione da tratto concreto")
  }
  class concreta2 extends trattoconcreto

  def main(args: Array[String]) {
    val iter = new Iter
    iter.foreach(println(_))
    (new concreta2).f
    (new concreta2).f2
  }
}
