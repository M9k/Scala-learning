// COMPILO CON scalac ImplicitExample.scala Test01.scala

object ImplicitExample {
  //implicita, non istanzio IntTimes, verra' istanziata quando uso times, x assumera' il valore implicito precedente a "times"
  implicit class IntTimes(x: Int) {
    // unita' times A -> f prende il valore di A -> eseguo qualcosa sfruttando unita' e f 
	def times [A](f: =>A): Unit = {
		def loop(current: Int): Unit =
        
		if(current > 0){
           	f
           	loop(current - 1)
       	}
		loop(x)
    }
  }

  implicit class TestImpl(x: Int) { //x parametro implicito, solamente 1 possibile
    // unita' times A -> f prende il valore di A -> eseguo qualcosa sfruttando unita' e f 
    def riprovo [STR](str: =>STR): Unit = {
      println(s"mi metto a stampare $x volte la stringa $str")
      for( i <- 1 to x)
        print(s"$str - ")
    }
  }
}

