package com.example.coffe

class cappuchino (private val sugar: Int,
                  private val milk: Int,
                  private val hasCoconutExtract: Boolean, )

{
    private val baseprice = 3.0
    private val Coconut_extract_price get() = if(hasCoconutExtract) 1.7 else 0.0
    val price get() = baseprice+ (sugar*1.0)+(milk*1.9)+Coconut_extract_price

    override fun toString(): String {
        return "cappuchino with $hasCoconutExtract ,$sugar and $milk"
    }



}