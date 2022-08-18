class Store {
  def cost(basket: List[String]): Int = {
    basket.map(cost).sum
  }

  def cost(item: String): Int = item match {
    case "Apple" => 60
    case "Orange" => 25
  }
}
