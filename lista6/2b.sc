var list = Array[Int](1,1,1)

def countAdd(): Array[Int] =
  var j = 0
  var res = new Array[Int](0)

  while (j+2) < list.length do
    res = res ++ Array(list(j)+list(j+1)+list(j+2))
    j+=1
  Array[Int](1,1) ++ res ++ Array[Int](1,1)

def pascalTrapezoidI(lvl: Int): Array[Int] =
  var i = 0;
  while i < lvl do
    list = countAdd()
    i += 1
  list

pascalTrapezoidI(2)

