class Store {
  def cost(basket: List[String]): Int = {
    basket.map(cost).sum - discounts(basket)
  }

  def cost(item: String): Int = item match {
    case "Apple" => 60
    case "Orange" => 25
  }
  
  def discounts(basket: List[String]): Int = {
    val totalApples = basket.count(_ == "Apple")
    val totalOranges = basket.count(_ == "Orange")
    
    val freeApples = totalApples / 2
    val freeOranges = totalOranges / 3
    
    freeApples * cost("Apple") + freeOranges * cost("Orange")
  }
}
