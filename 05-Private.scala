object Private{
	def main(args: Array[String]){
		print("Tutto ok\n")
		subObj.g
	}

	object subObj{
		private def f(){
			print("f privata\n")
		}

		def g(){
			f
		}
	}
}

class Super {
	protected def f() { println("f") }
}

class Sub extends Super {
	f()
}

class Other {
	//(new Super).f() // Error: f is not accessible
}

//------------------------------------

class Outer {
   class Inner {
      def f() { println("f") }
      
      class InnerMost {
         f() // OK - JAVA LO ACCETTA!!!
      }
   }
   (new Inner).f() // OK perchè f() e pubblico
}

//------------------------------------

class Society {
	class Professional {
		class Executive {
			private[Professional] var workDetails = null
			private[Society] var friends = null
			private[this] var secrets = null

			def help(another : Executive) {
				println(another.workDetails)
				//println(another.secrets) //ERROR
			}
		}
	}
	def test() {
		val p : Professional = new Professional	// NO VAR! non ha senso modificare una classe esterna ed averne una innestata
		var e = new p.Executive
		print(s"$e.friends \n")
	}
}
