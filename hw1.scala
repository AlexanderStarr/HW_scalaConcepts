/*==================================================
    22c22 Fall 2013

    Homework 1
    
    Name: Alexander Starr

  ==================================================
*/

//---------
// Part 1
//---------

/* Problem 1.1 */
def mul(m: Int, n: Int): Int = {
    var count:Int = 1
    var total:Int = m
    while (n > count) {
        product += m
        count += 1
    }
    total
}

/* Problem 1.2 */
def concatAll(l: List[String]): String = {
    var result = ""
    for (i <- l) {
        result += i
    }
    result
}

/* Problem 1.3 */
def isIn(x: Int, l: List[Int]): Boolean = {
    var found = false
    for (i <- l) {
        if (x == i) found = true
    }
    found
}

/* Problem 1.4 */
def squareAll(l: List[Int]): List[Int] = {
    var squares = List[Int]()
    for (i <- l) {
        squares = squares ::: List[Int](i*i)
    }
    squares
}

//---------
// Part 2
//---------

/* Problem 2.1 */
def mul(m: Int, n: Int): Int = {
    n match {
        case 0 => 0
        case 1 => m
        case _ => m + mul(m, n-1)
    }
}

/* Problem 2.2 */
def concatAll(l: List[String]): String = {
    l match {
        case Nil => ""
        case h :: t => h ++ concatAll(t)
    }
}

/* Problem 2.3 */
def isIn(x: Int, l: List[Int]): Boolean = {
    l match {
        case Nil => false
        case h :: t => (h == x) || isIn(x, t)
    }
}

/* Problem 2.4 */
def squareAll(l: List[Int]): List[Int] = {
    l match {
        case Nil => Nil
        case h :: t => h*h :: squareAll(t)
    }
}

/* Problem 2.5 */
def remove(x: Int, l: List[Int]): List[Int] = {
    l match {
        case Nil => Nil
        case h :: t => if (h == x) remove(x, t) else h :: remove(x, t)
    }
}

/* Problem 2.6 */
/* The Scala method m(l1:List[Int], l2:List[Int]):List[Int], when given
   two integer lists in ascending order, returns a list which contains
   all elements of each list (duplicate elements retained), still in
   ascending order. */

/* The Scala method s(l:List[Int]), when given a list of integers,
   returns a (List[Int], List[Int]), where the first list contains the
   first, third, fifth, etc elements of the input list, but in reverse
   order.  The second list contains the second, fourth, sixth, etc elements
   of the input list, but in reverse order.*/

/* Problem 2.7 */
def pair(list1: List[Int], list2: List[Int]): List[(Int, Int)] = {
    (list1, list2) match {
        case (Nil, Nil) => Nil
        case (_, Nil) => Nil
        case (Nil, _) => Nil
        case (h1 :: t1, h2 :: t2) => (h1, h2) :: pair(t1, t2)
    }
    
}

/* Problem 2.8 */
def mergeSort(l: List[Int]): List[Int] = {
    def merge(L1: List[Int], L2: List[Int]): List[Int] = {
        (L1, L2) match {
            case (Nil, Nil) => Nil
            case (_, Nil) => L1
            case (Nil, _) => L2
            case (h1 :: t1, h2 :: t2) => if (h1 < h2) h1 :: merge(t1, h2 :: t2) else h2 :: merge(h1 :: t1, t2)            
        }
    }
}





  
