//Krzysztof Maciejewski
//zad 3

sealed trait BT[+A]
case object Empty extends BT[Nothing]
case class Node[+A](elem:A, left:BT[A], right:BT[A]) extends BT[A]


val t = Node(1, Node(2, Empty, Node(3, Empty, Empty)), Empty)
val tt = Node(1,Node(2,Node(4,Empty,Empty),Empty),Node(3,Node(5,Empty,Node(6,Empty,Empty)),Empty))

def breadthBT[A](tree: BT[A]): List[A] =
  def inner (l: List[BT[A]]) (acc: List[A]): List[A] =
    l match
      case Nil => acc
      case Empty::t => inner(t) (acc)
      case Node(w, l, r)::t => inner((t ::: List(l, r))) (acc ::: List(w))
  inner (List(tree)) (Nil)

breadthBT(tt) == List(1, 2, 3, 4, 5, 6)
breadthBT(t) == List(1, 2, 3)
breadthBT(Empty) == List()

// zad 4

def wew[A](tree: BT[A]) =
  def inner(x: BT[A], g: Int, acc: Int): Int =
    x match
      case Empty => acc
      case Node(w, l, r) => inner(l, (g+1), inner(r, (g+1), (acc+g)))
  inner(tree, 0, 0)

wew(tt) == 9
wew(Empty) == 0


def zew[A](tree: BT[A]) =
  def inner(x: BT[A], g: Int, acc: Int): Int =
    x match
      case Empty => acc + g       //gdy liść to dodajemy
      case Node(w, l, r) => inner(l, (g+1), inner(r, (g+1), acc))
  inner(tree, 0, 0)

zew(tt) == 21
zew(Empty) == 0

//zad 5
sealed trait Graphs[A]
case class Graph[A](succ: A=>List[A]) extends Graphs[A]

val g = Graph((i: Int) =>
  i match
    case 0 => List(3)
    case 1 => List(0, 2, 4)
    case 2 => List(1)
    case 3 => Nil
    case 4 => List(0, 2)
    case n => throw new Exception(s"Graph g: node $n doesn't exist")
)
val g2 = Graph((i: Int) =>
  i match
    case 0 => Nil
    case n => throw new Exception(s"Graph g: node $n doesn't exist")
)

def depthSearch[A] (g: Graph[A]) (startNode: A): List[A] =
  def search(visited: List[A])(queue: List[A]): List[A] =
    queue match
      case Nil => Nil
      case h :: t => if visited contains h then search(visited)(t)
                      else h :: search(h :: visited)((g succ h) ::: t) // z tej strony t bo wchodzimy głębiej
  search (Nil) (List(startNode))


depthSearch(g)(4) == List(4, 0, 3, 2, 1)
depthSearch(g2)(0) == List(0)

