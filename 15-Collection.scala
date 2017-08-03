object Collection {
  def main(args: Array[String]) {
    
    //ARRAY
    var arr1:Array[String] = new Array[String](3)
    var arr2 = Array("Zara", "Nuha", "Ayan")

    //LISTA
    var lista: List[Int] = List(1,23,4,455,35,34,5)
    var lista_vuota : List[Int] = Nil
    var lista2 : List[Int] = 8 :: (3 :: (1 :: Nil))
    // Nil = coda
    // cons (::) = lista non vuota, classe con costruttore e metodo
    // new ::[Nil](4,Nil)
    
    //ATTENZIONE!
    // I metodi che terminano per : vengono applicati al "contrario", da destra a sinistra, quindi
    //
    // a metodo b => a.(b)
    // a metodo: b => b.(a)
    //
    
    val sasd = 1 :: 2 :: 3 :: Nil
    // List.concat() o ::: o List.:::()
    
    val uni = List.fill(100)(1) 
    println(uni)

    val squares = List.tabulate(6)(i => i * i) //indice => assegna
    println("squares: " + squares)
    val mul = List.tabulate(4,5)(_ * _) //4 liste di 5 element, ognuno coordinata*coordinata
    //il primo segnaposto "segue" i 4, il secondo i 5
    println("mul: " + mul)
    println("mul: " + mul.reverse)
    
    println(squares.apply(3)) //mi restituisce l'elemento in posizione 3
    println(mul.apply(2).apply(4))
    
    // The general rule is that you should add an empty parameter list at both declaration site
    // and call site whenever the method (not function) has side effects.
    var it = squares.iterator
    
    for(x <- it)
      print(x + " ")
    println()

    // def map[B](f: (A) => B): List[B]
    // Builds a new collection by applying a function to all elements of this list.
    val halfsquares = squares.map(x=>x/2) //oppure uso una funzione
    println(halfsquares)

    print("fine parte con le liste\n")
    
    //set - immutabili (default) o mutabili, senza doppioni e NON IN ORDINE
    //mutabili -> scala.collection.mutable.Set
    var s1 : Set[Int] = Set(1,2,3,4,5,6)
    var giorni: Set[String] = Set("lun","mar","mer","gio","ven","sab","dom")
    var s2 = Set(5,6,7,8,9)
    var s12 = s1.++(s2)
    println(giorni.head)
    println(giorni.apply("lun")) //mi restituisce true se lo trova
    println(giorni)
    println(s12)
    //intersezioni .&() o .intersect()
    var giorniferiali = giorni.-("sab","dom")
    println(giorniferiali)

    print("fine parte con i set\n")

    //mappe - chiave/valore, chiavi univoche, chiamate anche hash table
    //come sopra esiste mutable.Map
    var mappa1:Map[Int,String] = Map( 0-> "Test", 123->" ", 7->"Mappe")
    println(mappa1)
    var colori = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
    colori+=("black"->"#000000")
    println(colori.values)
    println(colori.keys)
    println(colori.apply("red")) //restituisce il valore associato a red
    println(colori.get("red"))
    println(colori.getOrElse("redrr", "Not found"))

    colori.keys.foreach{ i =>  
         print( "Key = " + i ); println(" Value = " + colori(i) )} // o niente ; e vado a capo

    print("fine parte con le mappe\n")
  
    //tupla - come una struct, ordinata e con tipi anche diversi
    var tupla1 = (1, 23, "test", 'a', 234)
    var t2 = new Tuple5(1, 23, "test", 'a', 234)
    println(t2)
    println(t2._1 + t2._2 + t2._3 + t2._4 + t2._5) // NON parte da 0
    t2.productIterator.foreach{ i =>println("Value = " + i )}

    print("fine parte con le tuple\n")
    
    //opzioni - zero o un elemento di un tipo - per i ritorni che possono essere "null", None
    //ritorno di Map.get nel caso non trovi l'indice
    var op = None : Option[Int]
    var op2: Option[Int] = Some(2)
    var op3 = Some(3)
    op2 = None : Option[Int]
    println(op)
    println(op.getOrElse("Non settato"))
    op = Some(4)
    println(op)


    print("fine parte con le opzioni\n")
  }

}
