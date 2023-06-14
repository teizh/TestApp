package com.example.testapp

import java.text.NumberFormat
import java.text.ParsePosition


class Math {

    fun add(a: String, b: String): String {
        var result = " "
        if (a.isEmpty() || b.isEmpty()) {
            result = "Поля не должны быть пусты"
        } else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
            //} else if (!a.isNumeric() || !b.isNumeric()) {
        } else if (!isInteger(a) || !isInteger(b)) {
            result = "Не должно быть символов"
        } else {
            result = (a.toInt() + b.toInt()).toString()
        }
        return result
    }



    fun divide(a: String, b: String): String {
        var result = " "
        if (b == "0") {
            result = "На ноль делить нельзя"
        } else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
        } else if (!a.isNumeric() || !b.isNumeric()) {
            result = "Не должно быть символов"
        } else {
            result = (a.toInt() / b.toInt()).toString()
        }
        return result
    }

    private fun String.isNumeric(): Boolean {
        val pos = ParsePosition(0)
        NumberFormat.getInstance().parse(this, pos)
        return this.length == pos.index
    }
    private fun isInteger(str : String?) = str?.toIntOrNull()?.let { true } ?: false
}