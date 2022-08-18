class StoreSuite extends munit.FunSuite {
  test("returns 0 for empty basket") {
    assertBasketTotal(List(), 0)
  }

  test("returns 60 for single Apple") {
    assertBasketTotal(List("Apple"), 60)
  }

  test("returns 25 for single Orange") {
    assertBasketTotal(List("Orange"), 25)
  }

  test("returns 305 for 3 Apples and 5 Oranges") {
    assertBasketTotal(List("Apple", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Orange"), 305)
  }

  def assertBasketTotal(basket: List[String], expectedTotal: Int): Unit = {
    assertEquals((new Store).cost(basket), expectedTotal)
  }
}
