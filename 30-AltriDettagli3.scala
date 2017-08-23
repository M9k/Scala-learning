object AltriDettagli3 {

  abstract class classe1 {
    type T
  }
  abstract class classe2 {
    def f
  }
  abstract class classe3

  // -----------------------------------------------------------------------
  trait A { val s1 = "A"}
  trait B { val s2 = "B"}
  trait C {
    // in pratica non fa differenza tra un self-type e una inheritance, si utilizzano secondo la logica del contesto
    this: A with B => //type-self, indica che C e' anche A e B
    val s3 = "C"
    def f = println(s"$s1 $s2 $s3")
  }

  //class classe4 extends C //ERRORE! C necessita di ereditare anche B e A
  class classe4 extends C with B with A


  // -----------------------------------------------------------------------
  def somma(a:Int)(implicit b:Int):Int = a+b
  def stampa(implicit a:Int) = println(a)

  import scala.language.implicitConversions //questo fa sparire il warning sotto perche' indico che voglio utilizzare le conversioni implicite
  implicit def Int2String(a:Int) = "_" + a + "_" //lancia un warning, perche' le conversioni implicite sono pericolose
  def stampastringa(a:String) = println("Stringa: " + a)

  // -----------------------------------------------------------------------
  def f1(a: Int) = a+a+a
  def f2(a: => Int) = a+a+a //a viene valutata ad ogni suo utilizzo, in questo caso la si legge 3 volte
  
  // -----------------------------------------------------------------------
  @deprecated("il metodo non mi piace","adesso")
  def deprecato() = println("non usarmi!")
  // altro => @tailrec per essere certi che il compilatore ottimizzi una ricorsione, visibile dopo import scala.annotation.tailrec

  // -----------------------------------------------------------------------
  // -----------------------------------------------------------------------
  
  def main(args: Array[String]) {

    //le classi astratte POSSO istanziarle nel momento che definisco i metodi non istanziati, creando una nuova classe "anonima" con lo stesso nome
    val ogg1 = new classe1 { type T = Int}
    val ogg2 = new classe2 { def f = println("ok")}
    //val ogg3 = new classe3 //o new classe3 //ERRORE! classe 3 astratta
    val ogg3 = new classe3 {}
    ogg2.f
  
    implicit val x:Int = 5 //in caso di valori impliciti considera questa val

    stampa(somma(4))
    stampa
    stampastringa(5) //chiama implicitamente Int2String perche' nota che acceta Int e restituisce un String

    deprecato

    println("fine");
  }
}
