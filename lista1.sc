//Krzysztof Maciejewski

//zadanie 1
def flatten1[A] (xss: List[List[A]]): List[A] =
  if xss == Nil then Nil
  else xss.head ::: flatten1(xss.tail)

val xss = List(List(4.0,5.0), 7.0:: 8.0:: Nil, 1.0 :: 2.0 :: Nil)

println(flatten1(xss))
println(flatten1(List(List())))

//zadanie 2
def count[A](x:A, xs:List[A]):Int =
  if (xs == Nil) 0
  else (if xs.head == x then 1 else 0) + count(x, xs.tail)


println( count('a', List('a','b','c')))
println( count('a', List('b','b','c')))
println( count('a', List('a','a','a')))

//zadanie 3
def replicate[A] (x: A, n: Int): List[A] =
  if (n == 0) List()
  else List(x) ::: replicate(x,(n-1))


println(replicate("ala ", 5))
println(replicate("a", 0))

//zadanie 4
def sqrList(xs: List[Int]): List[Int] =
  if xs == Nil then Nil
  else
    List(xs.head*xs.head) ::: sqrList(xs.tail)

println(sqrList(List(1, 2, 3, 4,5)))
println(sqrList(List()))

//zadanie 5
def palindrome[A] (xs: List[A]): Boolean =
  xs == xs.reverse

val l = List('a', 'd', 'a', 'z')
val l1 = List()

println(palindrome(l))
println(palindrome(l1))
println(palindrome(List('a', 'd', 'a')))

//zadanie 6

def listLength[A](xs: List[A]): Int =
  if xs == Nil then 0
  else
    1 + listLength(xs.tail)


val l = List(1,2,3,4)
val l1 = List()

println(listLength(l))
println(listLength(l1))