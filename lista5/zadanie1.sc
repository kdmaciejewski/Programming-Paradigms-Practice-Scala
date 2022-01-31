
def sublistsL[A](l: LazyList[A]): LazyList[A] =
  def inner[A](list: LazyList[A], xs: LazyList[A]): LazyList[A] =
    // przekazujemy w xs te pare elementów
    list match
      case LazyList() => LazyList()
      //case h #:: t => inner(t,(h #:: xs))#:::(h #:: xs)
      case h #:: t => ( xs #::: LazyList(h))#:::inner(t,(h #:: xs))
  inner(l, LazyList())

sublistsL(LazyList(1,2,3,4)).take(15).toList
