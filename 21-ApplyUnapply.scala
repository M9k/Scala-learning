object ApplyUnapply  {
   def main(args: Array[String]) {
      println ("Apply method : " + email.apply("Zara", "gmail.com"));
      println ("Unapply method : " + email.unapply("Zara@gmail.com"));
      println ("Unapply method : " + email.unapply("Zara Ali"));

      def x = email.apply("Zara", "gmail.com"
      //oppure solo
      //def x = email("Zara", "gmail.com")


      x match {
        case email("Zara","gmail.com") //equal
          => println("x equivalenete a Zara@gmail.com")
        case _ => println("x non equivalente a Zara@gmail.com")
      }

   }
   
}

object email {
   // The injection method (optional)
   def apply(user: String, domain: String) = {
      user +"@"+ domain
   }

   // The extraction method (mandatory)
   def unapply(str: String): Option[(String, String)] = {
      val parts = str split "@"
      
      if (parts.length == 2){
         Some(parts(0), parts(1)) 
      } else {
         None
      }
   }
}
