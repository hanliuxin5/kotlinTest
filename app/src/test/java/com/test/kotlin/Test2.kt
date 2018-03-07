package com.test.kotlin

import org.junit.Test

/**
 * Created by lychee on 18-3-7.
 */
class Test2 {
    @Test
    fun test1() {
        val c: Array<out G>? = null
        val a: G? = c?.get(1)

        val d: Array<in A>? = null
        d?.set(0, A())

       go(arrayOf(O()))
    }

    fun <T : F> go(list: Array<T>) {

    }

    fun copy(from: Array<out Any>, to: Array<Any>) {
        val a: Any = from.get(1)
    }

    class Source<out T>

    open class G {
        fun g() {}
    }

    open class F : G() {
        fun f() {}
    }

    open class A : F() {
        fun a() {}
    }

    class O : F() {
        fun o() {}
    }

    class J : A() {
        fun j() {}
    }
}