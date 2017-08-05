object ReturnFunction {
  def main(args: Array[String]) {
    ritfun1(2)('a')
    ritfun1(1)('b')
    ritfun1(2)('c')

    ritfun2(2)('j') //senza () non viene valutata
    ritfun2(1)('k')
    ritfun2()('s')
    ritfun2(1)
    ritfun2(1)
    ritfun3(1)('q')
    ritfun3(2)('w')

  }
  def ritfun1(x:Int) :  (Char) => Unit  = { //ritorna una funzione e poi il main la valutera
    if(x == 1)
      richiesta1
    else
      richiesta2  //se non ha parametri risulta deprecato, a quel punto meglio usare il metodo sotto
  }

  def ritfun2(x:Int = 5) /* : Unit  SOTTOINTESO */ = (c: Char) => { //la funzione ritorna Unit
    if(x == 1)
      richiesta1(c)
    else
      richiesta2(c)
  }

  // rispetto a quella sopra questa non funzione senza due parentesi, mentre quella sopra in mancanza della
  // seconda parentesi attendava a valutare il valore
  def ritfun3(x:Int = 5)(c: Char) { //la funzione ritorna Unit
    if(x == 1)
      richiesta1(c)
    else
      richiesta2(c)
  }

  def richiesta1(c: Char) {
    print(s"1 - $c\n")
  }
  def richiesta2(c: Char) {
    print(s"2 - $c\n")
  }
}
