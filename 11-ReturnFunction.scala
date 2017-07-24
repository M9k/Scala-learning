object ReturnFunction {
  def main(args: Array[String]) {
    ritfun(2)()
    ritfun(1)()
    ritfun(2)

  }
  def ritfun(x:Int) : ()  => Unit  = {
    if(x == 1)
      richiesta1
    richiesta2
  }
  def richiesta1() {
    print("1\n")
  }
  def richiesta2() {
    print("2\n")
  }
}
