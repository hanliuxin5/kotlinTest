package com.test.kotlin

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun kotlin4() {
        val str: String? = null
        val x = str?.length ?: return
        println(x)
    }

    @Test
    fun kotlin3() {
        val a: Any? = null
//        val b = if (a > 3) 10 else 11
//        print(b)
        val result = when {
            a is String -> "string"
            a in 1..10 -> "1-10"
            a !in 20..22 && a is Int -> "not in 20-22"
            else -> "wow"
        }

        println(result)
    }

    @Test
    fun kotlin2() {
        val str = "lychee"
        println(str[2])
        for (s in str) {
            print(s)
        }

        val str1 = "hellow \n"

        val str2 = """
            for(){
            >>>
            }
            """.trim()

        for (s in str2) {
            print(s)
        }
    }

    @Test
    fun kotlin1() {
        val x: Int = 3
        println(x.javaClass)
        val a: Int? = 1
        println(a?.javaClass)
        val b: Long? = a?.toLong() ?: -1L
        println("$a,$b")

//        for (num in '1'..'4') {
//            println(num.javaClass)
//        }

        val asc = Array(5, { i -> (i * i).toString() })
        println(asc[4])
//        for (it in asc) {
//            println(it.javaClass)
//        }

    }

    @Test
    fun filed_test() {
        val a = 1
        val b: Int = 1
        val c: Int = 10
        var e: Int = 11
        e = 12

        var s = ""
        val str = "havana$s"

        assertEquals(10, maxOf(10, 8))
    }

    @Test
    fun for_test() {
        val items = listOf("hhh", "ffff", "dadasdasdas")

        for (index in items.indices) {
            println("$index,${items[index]}")
        }

        for (item in 10 downTo 1) {
            println(item)
        }

        val map = mapOf("a" to 1, "b" to 2, "c" to 2)
        for ((k, v) in map) {
            println("$k,$v")
        }
    }

    @Test
    fun kotlin_test() {
        assertEquals(5, sum(3, 2))
        assertEquals(10, sum1(12, 2))
        assertEquals(Unit, printSum(10, 9))
    }

    @Test
    fun kotlin_random() {
        for (x in 1 until 10) {
            println(x)
        }

        "lychee".lychee()

        val single = Single
        val age1 = single.age
        val age2 = single.age
        println("$age1,$age2")

        val age3: String? = "1"
        age3?.let {
            println("it's ok!")
        }

        fun tky() = 42
        println(tky())
    }


    object Single {
        val age = Math.random()
    }

    fun String.lychee() {
        println("wow")
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum1(a: Int, b: Int) = a - b

    fun printSum(a: Int, b: Int) = println("sum is ${a + b}")

    fun maxOf(a: Int, b: Int) = if (a > b) a else b
}
