// Krzysztof Maciejewski
// zad2
def curry3[A,B,C,D](f: (A,B,C)=>D) = (x:A) => (y:B) => (z:C) => f(x,y,z)

def curry32[A,B,C,D](f: (A,B,C)=>D)(x: A)(y: B)(z: C) = f(x,y,z)


def uncurry3[A,B,C,D](f: A=>B=>C=>D) = (x:A, y:B, z:C) => f(x)(y)(z)

def uncurry32[A,B,C,D](f: A=>B=>C=>D)(x:A, y:B, z:C) = f(x)(y)(z)

def plus(x: Int, y: Int, z: Int): Int = x+y+z
def plus2(x:Int)(y: Int)(z:Int):Int = x+y+z

curry3(plus) //val res1: Int => Int => Int => Int = Lambda$3052/0x000000080157da88@6b603b97
curry3(plus) (4) (5) (5) == 14
curry32(plus) (4) (5) (5) == 14

uncurry3(plus2) (1,2,3) == 6
uncurry32(plus2) (1,2,3) == 6

// zad 3
def sumProd(xs: List[Int]) = (xs.foldLeft((0,1))) ((a, x) => (a._1 + x, a._2 * x))
sumProd(List(1,2,3,4)) == (10,24)
sumProd(List()) == (0,1)
