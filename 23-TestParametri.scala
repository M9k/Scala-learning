object TestParametri {
  class c1(v: Int) {
    var x = v
    def inc() {
      x = x+1
    }
  }
  def main (args: Array[String]) {
    var x = new c1(1)
    x.inc()
    x.inc()
    x.inc()
    println(x.x)

    incrementC1(x)
    incrementC1(x)
    incrementC1(x)
    println(x.x)
  }

  def incrementC1(x:c1) {
    // Scala non impedisce il side effect, ma viene sconsigliato essendo programmazione funzionale
    // funzione pura = funzione senza side effect
    x.inc             //VALIDO
    x.inc()           //VALIDO
    //x = new c1(20)  //INVALIDO
  }
}
