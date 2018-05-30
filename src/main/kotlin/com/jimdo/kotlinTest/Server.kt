package com.jimdo.kotlinTest

import spark.Spark.*
import java.math.BigDecimal

class ShoppingCartLogger(private val wrapped: IShoppingCart) : IShoppingCart by wrapped {
    override fun addProduct(product: Product) {
        print("adding product ${product}")
        this.wrapped.addProduct(product)
    }
}

fun main(args: Array<String>) {
    val cart = ShoppingCartLogger(ShoppingCart())
    cart.addProduct(Product("test", BigDecimal("2.5")))
    cart.addProduct(Product("test", BigDecimal("2.5")))

    get("/hello") { _, _ -> cart.toString() }
}

