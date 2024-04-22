class GroupAnagrams {
  def group(ls: Array[String]): List[List[String]] = {
    ls.groupBy(_.sorted).map(x => x._2.toList).toList
  }
}

object GroupAnagrams extends App{
  val groupAnagrams = new GroupAnagrams
  println(groupAnagrams.group(Array("listen", "silent", "hello", "world", "act", "cat")))
}
