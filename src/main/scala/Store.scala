class Store {
  def cost(basket: List[String]): Int = {
    basket.map {
      case "Apple" => 60
      case "Orange" => 25
    }.sum
  }
}
