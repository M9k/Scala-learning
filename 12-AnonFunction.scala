object AnonFunction {
	def main(args: Array[String]) {
        var inc = (x:Int) => x+1
        def incd = (x:Int) => x+1 //uguale
        def incdi(x:Int) :Int = { x+1} //metodo classico

        var x = 5
        x = inc(x)
        x = incd(x)
        x = incdi(x)
        print(x)
        println()

        var factor = 3
        val multiplier = (i:Int) => i * factor
      
        var y = 1
        y = multiplier(y)
        factor = 5
        y = multiplier(y)
        print(y)

    }

}

