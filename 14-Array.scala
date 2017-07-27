object Array {
	def main(args: Array[String]) {
      var x:Array[Int] = new Array[Int](10)
      x(1) = 5
      x(5) = 2
      x(9) = 11
      x(3) = -11
      print(x(1) + " " + x(2) + " " + x)

      println()
      for(i <- x if i != 0)
        print(i + " ")
      
      println()
      for(i <- 0 to (x.length - 1) if x(i) != 0)
        print(x(i) + " ")


      var matr = Array.ofDim[String](5,5)
      matr(4)(4) = "ultimo"
      println()

      val array1 = Array(4,5,1,64,-123,543,54)
      val array2 = Array(5,2,123,-545)
      val array3 = Array.concat(array1, array1)

      val seq = Array.range(5,125,5)
      for(i <- seq)
        print(i + " ")
	}
}
