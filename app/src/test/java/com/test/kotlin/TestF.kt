package com.test.kotlin

import org.junit.Test

/**
 * Created by lychee on 18-3-9.
 */
class TestF {

    @Test
    fun test1() {
        val fun1 = fun(x: Int) {
            x + 10
        }
//        println(fun1(20))

        arrayOf(1, 2, 3, 4, 5).forEach { if (it == 4) else print(it) }

        mapOf("1" to "k", "2" to "g", "3" to "b").mapValues { (_, value) -> println(value) }

        val ok = Ok()
        with(ok) {
            this.fun1(222)
            var x = 10
            if (x * x > 50) x = 5
            println(fun2(x))
        }

//        val a: Int? = 1
//        val b: Long? = a
        val l = 1L + 3.0
        println(l.javaClass)

        val x = (1 shl 2) and 0b100
        println(x)

        val ia = 1
        println(ia shr 3)

        var ba = 0xff
        println(ba ushr 7)

    }

    fun funWithName(x: Int, y: Int) = if (x > y) x else y

    fun funWithName2(x: Int, y: Int) {
        if (x > y) return
        else y
    }

    fun funWithFun(no: () -> Unit) {
        println("function")
        no()
    }

    class Ok {
        fun fun1(x: Int) {
            print(x)
        }

        fun fun2(y: Int) = y
    }

}