package com.example.coffe

class latte(
    private val sugar : Int,
    private val milk:Int,
    private val hasCaramel:Boolean
) {
    private val basePrice = 2.3
    private val caramelprice get() = if (hasCaramel) 2.0 else 0.0
    val  price get() = basePrice+(sugar*1.0)+(milk*2.0)+caramelprice

    override fun toString(): String {
        return "latte with $sugar,$milk and $hasCaramel"
    }

}