package com.jimdo.kotlinTest

import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal

class ShoppingCartTest {
    @Test
    fun testThis() {
        val cart = ShoppingCart()
        cart.addProduct(Product("Schokolade", BigDecimal("1.24")))
        cart.addProduct(Product("Erdbeeren", BigDecimal("2.37")))

        assertEquals(BigDecimal("3.61"), cart.total())
    }
}
