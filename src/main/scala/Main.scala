@main def goShopping: Unit =
  val store = new Store

  val basket = List("Apple", "Orange", "Apple", "Apple", "Apple")

  val appleCount = basket.count(_ == "Apple")
  val orangeCount = basket.count(_ == "Orange")
  val cost = store.cost(basket)

  println(s"I went to the shop today and bought $appleCount Apple(s) and $orangeCount Orange(s). It cost me ${cost}p!")
