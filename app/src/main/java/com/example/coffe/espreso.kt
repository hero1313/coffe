package com.example.coffe

class espreso(private val sugar : Int,
              private val hasExtraCoffe : Int, ) {


    private val baseprice = 3.0
    val price = baseprice+(sugar * 1.0)+(hasExtraCoffe * 2.5)

    override fun toString(): String {
        return "espreso with : $sugar and $hasExtraCoffe"
    }
}