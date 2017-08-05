object ConfrontoSommatorie {
  def main(args: Array[String]) {
    confrontoSommmatorie(4,5,2,7,2,3,4,3,1,9,9,9,9,9,9,3,4,5,12)(34,36,74) match {
      case 0 => println("uguali")
      case 1 => println("vince la prima")
      case _ => println("vince la seconda")
    }
  }

  def confrontoSommmatorie(x:Int*)(y:Int*) : Int = {
    val sumy = y.sum
    x.sum match {
      case k if k == sumy => 0
      case k if k > sumy => 1
      case _ => -1
    }
  }
}
