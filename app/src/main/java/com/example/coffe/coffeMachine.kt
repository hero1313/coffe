package com.example.coffe

import java.util.*

class coffeMachine(private val scanner: Scanner) {


    fun requestSugar():Int{
        println("please enter sugar quantity:")
        return when(val sugar =  scanner.nextInt() ){
            in Int.MIN_VALUE..0 -> 0
            else -> sugar
        }

    }
    fun requsetmilk():Int{
        println("please enter milk quantity:")
        return when (val milk = scanner.nextInt()){
            in  Int.MIN_VALUE..0 -> 0
            else -> milk
        }
    }
    fun hasCaramel():Boolean{
        println("do you want caramel")
        return scanner.nextBoolean()
    }
    fun hasExtraCoffe():Int{
        println("please enter extracoffe quantity")
        return  when (val hasExtraCoffe = scanner.nextInt()){
            in Int.MIN_VALUE..0 -> 0
            else -> hasExtraCoffe
        }
    }
    fun hasCoconutExtract(): Boolean{
        println("do you want coconutExtract")
        return scanner.nextBoolean()
    }
}