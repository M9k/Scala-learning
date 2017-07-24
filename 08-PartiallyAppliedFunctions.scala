import java.util.Date

object PartiallyAppliedFunctions {
   def main(args: Array[String]) {
      val date = new Date
      val logWithDateBound = funzione(date, _ : String) // NON chiamo la funzione
                    //mi manca un parametro per farlo, non so ancora cosa metterci

      logWithDateBound("message1" ) //setto il parametro mancante, la funzione viene chiamata
      Thread.sleep(1000)
      
      logWithDateBound("message2" )
      Thread.sleep(1000)
      
      logWithDateBound("message3" )
   }

   def funzione(date: Date, message: String) = {
      println(date + "----" + message)
   }
}
