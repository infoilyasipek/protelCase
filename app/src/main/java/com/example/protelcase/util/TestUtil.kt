package com.example.protelcase.util

object TestUtil {


    /*
    * test that given tow numbers are equal
    * */
    fun isNumberBetweenOtherTowNumbers(number: Int,atLeast: Int,atMost: Int): Boolean{
        return number in atLeast..atMost
    }
}