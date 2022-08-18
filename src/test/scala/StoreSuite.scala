class StoreSuite extends munit.FunSuite {
  test("returns 0 for empty basket") {
    assertBasketTotal(List(), 0)
  }

  test("returns 60 for single Apple") {
    assertBasketTotal(List("Apple"), 60)
  }

  test("returns 180 for 5 Apples (2 free Apples)") {
    assertBasketTotal(List.fill(5)("Apple"), 180)
  }

  test("returns 25 for single Orange") {
    assertBasketTotal(List("Orange"), 25)
  }

  test("returns 75 for 4 Oranges (1 free Orange)") {
    assertBasketTotal(List.fill(4)("Orange"), 75)
  }

  test("returns 220 for 3 Apples and 5 Oranges") {
    assertBasketTotal(List.fill(3)("Apple") :++ List.fill(5)("Orange"), 220)
  }

  def assertBasketTotal(basket: List[String], expectedTotal: Int): Unit = {
    val prices = Map(
      "Apple" -> 60,
      "Orange" -> 25
    )
    
    val store = new Store(prices)

    assertEquals(store.cost(basket), expectedTotal)
  }
}
