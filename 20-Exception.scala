object Exception {

  class Eccezione1 extends Throwable //se non deriva da Throwable non posso lanciarlo come eccezione, non posso quindi lanciare qualsiasi oggetto come in C++
  class Eccezione2 extends Throwable
  class Eccezione3 extends Throwable

  def main(args: Array[String]) {
    try {
      println("dentro al try!")
      def a = 12
      if(a < 5 && a > -12)
        throw new Eccezione1
      else
        throw new Eccezione2
      throw new Eccezione3

    } catch {
      //in caso di errore
      case _: Eccezione1 => println("entrato nell'else")
      case _: Eccezione2 => println("non entrato nell'else")
      case _: Throwable => println("come ci sono arrivato qui?") //oppure case_ =>, ma genera un warning

    } finally { //opzionale
      println("chiudo il programma")
    }
  }
}
