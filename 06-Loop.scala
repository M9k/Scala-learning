object Loop {
	def main(args: Array[String]){
		for(i <- 1 to 10)
			print("test\n")
        var i=1
        while(i<5) {
            print("i = "+i+'\n')
            i+=1
        }
        var x:Int = 0;
		for(i <- 1 to 10 if i%2!=0)
			print(i+" ")

	}
}
