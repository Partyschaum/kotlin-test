package com.jimdo.kotlinTest

import java.math.BigDecimal

open class ShoppingCart : IShoppingCart {
    private val products: MutableList<Product> = ArrayList()

    override fun addProduct(product: Product) {
        this.products.add(product)
    }

    override fun total(): BigDecimal = this.products.map({ it.price }).reduce({ sum, price -> sum + price })

    override fun toString() : String = this.total().toString()
}
