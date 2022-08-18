class StoreSuite extends munit.FunSuite {
  test("returns 0 for empty basket") {
    val store = new Store

    val basketTotal = store.cost(List())

    assertEquals(basketTotal, 0)
  }

  test("returns correct cost for an Apple") {
    val store = new Store

    val basketTotal = store.cost(List("Apple"))

    assertEquals(basketTotal, 60)
  }

  test("returns correct cost for an Orange") {
    val store = new Store

    val basketTotal = store.cost(List("Orange"))

    assertEquals(basketTotal, 25)
  }

  test("returns correct cost for 3 Apples and 5 Oranges") {
    val store = new Store

    val basketTotal = store.cost(List("Apple", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Orange"))

    assertEquals(basketTotal, 305)
  }
}
