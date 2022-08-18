type Product = String
type Price = Int
type Basket = List[Product]

class Store(getPrice: Product => Price) {
  def cost(basket: Basket): Price = {
    basket.map(getPrice).sum - discounts(basket)
  }

  def discounts(basket: Basket): Price = {
    val totalApples = basket.count(_ == "Apple")
    val totalOranges = basket.count(_ == "Orange")

    val freeApples = totalApples / 2
    val freeOranges = totalOranges / 3

    freeApples * getPrice("Apple") + freeOranges * getPrice("Orange")
  }
}
