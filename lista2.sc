import scala.annotation.tailrec

// Krzysztof Maciejewski
// zad 2
def fib(x: Int): Int =
x match
  case 0 => 0
  case 1 => 1
  case _ => fib(x-1) + fib(x-2)

fib(3) == 2
fib(0) == 0
fib(1) == 1
fib(42) == 267914296

def fibTail(x: Int): Int =
  @tailrec
  def fibRec(x: Int, y: Int, s: Int): Int =
    x match
      case 0 => y
      case 1 => s
      case _ => fibRec(x - 1, s, y+s) // suma dwóch poprzednich
  fibRec(x, 0, 1)

fibTail(42) == 267914296
fibTail(3) == 2

//zadanie 3
def root3(a:Double) =
  def root3Inner(x:Double):Double = // przekazujemy kolejne przybliżenia
  //porównujemy je z dozwoloną dokładnością xi - xi-1 = dokładność
    if math.abs(math.pow(x, 3) - a) <= 1E-15 * Math.abs(a) then x
    else root3Inner(x + (a / math.pow(x, 2) - x) / 3)
  root3Inner(if a > 1 then a/3 else a)

root3(27) == 3.0

//zadanie 4

val xs = List(-2, -1, 0, 1, 2)

val List(_, _, x, _, _) = xs
x == 0

val xss = List((1,2), (0,1))

val List((_,_),(z,_)) = xss
z == 0

// zad 5
def InitSegment[A](xs: List[A], ys: List[A]): Boolean =
  (xs, ys) match
    case (Nil, _) => true //to musi być na początku ponieważ inaczej następny
    // warunek mógłby błędnie dać false (sytuacja (Nil, Nil))
    case (_, Nil) => false
    case (h1::t1, h2::t2) => if h1 == h2 then InitSegment(t1, t2) else false

InitSegment(List(1,2),List(1,2,3,4,5)) == true
InitSegment(List(),List(1,2,3,4,5)) == true
InitSegment(List(),List()) == true
InitSegment(List(1),List()) == false

// zad 6
def replaceNth[A](xs: List[A], n: Int, x: A): List[A] =
  xs match
    case Nil => Nil
    case h::t => if n==0 then x::t else h::replaceNth(t,n-1,x)

replaceNth(List('o','l','a', 'm', 'a', 'k', 'o', 't', 'a'), 1, 's')
== List('o','s','a', 'm', 'a', 'k', 'o', 't', 'a')
replaceNth(List(), 3, 'c') == List()
replaceNth(List(1,2), 460, 3) == List(1, 2)