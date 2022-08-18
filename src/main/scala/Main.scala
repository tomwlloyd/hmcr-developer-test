@main def goShopping: Unit =
  val prices = Map(
    "Apple" -> 60,
    "Orange" -> 25,
    "Milk" -> 105,
    "Bread" -> 80
  )

  val store = new Store(prices)

  val basket = List("Apple", "Orange", "Apple", "Apple", "Apple", "Milk", "Bread", "Milk")

  val receiptLines = basket.toSet.map(product => s"$product (${basket.count(_ == product)})")

  println(receiptLines.mkString("\n") + s"\nTotal cost: ${store.cost(basket)}p")

//  val appleCount = basket.count(_ == "Apple")
//  val orangeCount = basket.count(_ == "Orange")
//  val cost = store.cost(basket)
//
//  println(s"I went to the shop today and bought $appleCount Apple(s) and $orangeCount Orange(s). It cost me ${cost}p!")
