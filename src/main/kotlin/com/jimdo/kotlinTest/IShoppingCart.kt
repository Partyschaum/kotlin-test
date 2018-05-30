package com.jimdo.kotlinTest

import java.math.BigDecimal

interface IShoppingCart {
    fun addProduct(product: Product)
    fun total(): BigDecimal
    override fun toString() : String
}
