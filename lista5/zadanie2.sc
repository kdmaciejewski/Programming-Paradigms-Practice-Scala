
def next[A](l: LazyList[A], n: Int): LazyList[A] =
  def inner[A](l: LazyList[A], n: Int): LazyList[A] =
    (n, l) match
      case (0, l) => l
      case (n, h #:: t) => inner(t, (n-1))
  inner(l, n)

def skipTakeL[A](l: LazyList[A]): LazyList[A] =
  def inner[A](list: LazyList[A], n: Int): LazyList[A] =
    list match
      case LazyList() => LazyList()
      case h #:: t => h #:: inner((next(t, n)), (n+1))
  inner(l, 1)



skipTakeL(LazyList.from(1)).take(15).force

skipTakeL(LazyList()).take(15).force
