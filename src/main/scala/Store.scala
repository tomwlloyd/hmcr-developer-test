/*
This is a 'simplest possible solution' given the specific product, cost & offer requirements. In reality,
we would not want to hardcode these, as they would most likely be database driven. The responsibility of calculating individual prices
and discounts could be pulled into their own classes, and passed to the store on instantiation. This would allow us to wire in calls to a database in production,
but also allow for fixed values in tests, removing the current issue where tests fail as prices and offers are updated!
*/

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
