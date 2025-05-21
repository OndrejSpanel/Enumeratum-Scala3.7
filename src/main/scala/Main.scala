object Main {

  import enumeratum._

  sealed trait Greeting extends EnumEntry

  object Greeting extends Enum[Greeting] {
    val values = findValues

    case object Hello extends Greeting

    case object GoodBye extends Greeting

    case object Hi extends Greeting

    case object Bye extends Greeting

  }



  def main(args: Array[String]): Unit = {
    println(Greeting.withName("Hello"))
  }
}
