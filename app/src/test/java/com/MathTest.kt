package com

import com.example.testapp.Math
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun doubleAdd() {
        assertEquals("4", math?.add("2.0", "2"))
    }

    @Test
    fun negativeAdd() {
        assertEquals("-4", math?.add("-2", "-2"))
    }

    @Test
    fun emptyAdd() {
        assertEquals("Поля не должны быть пусты", math?.add("", "2"))
    }

    @Test
    fun charAdd() {
        assertEquals("Не должно быть символов", math?.add("4sdas", "2"))
    }

    @Test
    fun simpleDivide(){
        assertEquals("4", math?.divide("8","2"))
    }

    @Test
    fun zeroDivide() {
        assertEquals("На ноль делить нельзя", math?.divide("8", "0"))
    }

    @After
    fun detach() {
        math = null
    }
}