var list = Array[Int](1,1,1)
var res = new Array[Int](0)
var j = 0

def countAdd(): Unit =
  while (j+2) < list.length do
    res = res ++ Array(list(j)+list(j+1)+list(j+2))
    j+=1
  j = 0
  list = (Array[Int](1,1) ++ res ++ Array[Int](1,1))
  res = Array[Int](0)

var i = 0;

def pascalTrapezoidI(lvl: Int): Array[Int] =
  while i < lvl do
    countAdd()
    //j = 0
    i -= 1
  list

pascalTrapezoidI(5)

