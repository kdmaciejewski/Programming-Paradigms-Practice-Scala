def countAdd(l: List[Int]): List[Int] =
  def inner(l: List[Int], res: List[Int]): List[Int] =
    (l, res) match
      case (h::m::n::Nil, res) => List(1,1) ::: res ::: List(h+m+n) ::: List(1,1)
      case (h::m::n::t, res) => inner(m::n::t, (res ::: List(h+m+n)) )
      case (List(), res) => List(1,1) ::: res ::: List(1,1)
  inner(l, List())

def pascalTrapezoidF(lvl: Int): List[Int] =
  def inner(lvl: Int, l: List[Int]): List[Int] =
    lvl match
      case 0 => l
      case a => inner((lvl-1), countAdd(l))
  inner((lvl-1), List(1,1,1))

pascalTrapezoidF(1)
pascalTrapezoidF(2)
pascalTrapezoidF(3)
pascalTrapezoidF(4)