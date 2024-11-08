import util.Random

object Main extends App {
  def InputSize(): Int = 
  {
    println("Введите размер случайного списка (натуральное число)")
    scala.io.StdIn.readInt()
  }
  def RandomList(size: Int): List[Int] = 
  {    
    List.fill(size)(Random.between(0, 10))
  }
  def FindDups(list: List[Int]) : List[Int] = 
  {
    list.groupBy(identity).filter(_._2.size > 1).keys.toList
  }
  val size = InputSize()
  val list = RandomList(size)
  val duplicates = FindDups(list)
  println("Исходный список: " + list)
  println("Результат: " + duplicates)
} 