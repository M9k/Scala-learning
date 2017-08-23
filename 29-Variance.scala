
object Variance {
  
  class A
  class B extends A
  class C extends A
  class D extends B
  class E extends D
  class F extends C
  //      A
  //    /   \
  //   B     C
  //   |     |
  //   D     F
  //   |
  //   E

  class C1[T]
  //covariante
  class C2[+T]
  //controvariante
  class C3[-T]

  def f1a(o:C1[A]) = println("C1[A]")
  def f1b(o:C1[B]) = println("C1[B]")
  def f1d(o:C1[D]) = println("C1[D]")

  def f2a(o:C2[A]) = println("C2[A]")
  def f2b(o:C2[B]) = println("C2[B]")
  def f2d(o:C2[D]) = println("C2[D]")

  def f3a(o:C3[A]) = println("C3[A]")
  def f3b(o:C3[B]) = println("C3[B]")
  def f3d(o:C3[D]) = println("C3[D]")

  // ---------------------------------------
  // ------------ Type Bound ---------------
  def fTsubB[T <: B](a:T) = println("T sottotipo di B")
  def fTsuperB[T >: B](a:T) = println("T supertipo di B")



  def main(args: Array[String]) {
    // o3 non e' sottotipo di C1[X], e' solamente di tipo C1[B]
    val o1 = new C1[B]
    // o2 e' sottotipo di C2[A]
    val o2 = new C2[B]
    // o2 e' sottotipo di C3[D] e C3[E]
    val o3 = new C3[B]

    //le linee commentate generano errori di tipo
    //f1a(o1)
    f1b(o1)
    //f1d(o1)
    
    f2a(o2)
    f2b(o2)
    //f2d(o2)
    
    //f3a(o3)
    f3b(o3)
    f3d(o3)
     
    // ---------------------------------------
    // ------------ Type Bound ---------------
    //fTsubB(new A)
    fTsubB(new B)
    fTsubB(new D)
    
    fTsuperB(new A)
    fTsuperB(new B)
    //fTsuperB(new D)
  }
}
