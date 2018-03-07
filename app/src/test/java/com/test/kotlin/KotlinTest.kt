package com.test.kotlin

import android.os.Parcel
import android.os.Parcelable
import org.junit.Test

/**
 * Created by lychee on 18-3-2.
 */
class KotlinTest {

    open class Outer {
        private val a = 1
        protected open val b = 2
        internal val c = 3
        val d = 4 // 默认是public

        protected class Nested {
            public val e: Int = 5
        }
    }

    class Subclass : Outer() {
        // a不可见
        // b,c和d是可见的
        // 内部类和e都是可见的
        fun test() {
            print(Nested().e)
        }

        override val b = 5   // 'b' i具有protected可见性
    }

    @Test
    fun kotlin1() {

        val boy = Boy("lychee", 10)
        boy.age = 30

        val black = Black()
    }

    class MyClass {
        companion object Factory {
            fun create(): MyClass = MyClass()
        }
    }

    class Boy(val name: String, var age: Int) {
        init {
            println("$name,$age")
        }
    }

    open class Black(val name: String = "")

    class B : Black {
        constructor(name: Int) : super(name.toString()) {
            print(name)
        }
    }

    @Test
    fun test1() {
        val tmp = mutableListOf(1, 2, 3, 4)
        tmp.swap(0, 1)
        println(tmp)

        val c = C()
        c.printS(2)

        println(null.toString())
    }

    fun Any?.toString(): String {
        if (this == null) {
            return "this is null!!!"
        }
        return toString()
    }

    fun MutableList<Int>.swap(x: Int, y: Int) {
        val tmp = this[x]
        this[x] = this[y]
        this[y] = tmp
    }

    class C {
        fun printS() {
            print("member")
        }
    }

    fun C.printS() {
        print("extention")
    }

    fun C.printS(i: Int) {
        print("extention $i")
    }

    val <T> List<T>.wow: Int
        get() = this.size

    @Test
    fun test2() {
        val size = listOf(1, 23).wow
        println(size)

        val go = Try(age = 10)
        val age: Int? = null
        go.age = age ?: 22
        println(go)

        val out = Out("wow")
        out.go()
        Out.go1.what()
    }

    data class Try(val name: String = "default", var age: Int)

    class Out(val msg: String) {
        companion object go1 {
            private var x = "x"
            fun what() {
                print(x)
            }
        }

        fun go(str: String = "gogogo") {
            println(msg + str)
        }
    }


    @Test
    fun test3() {
        val user = User()
        user.speak("hahaha")
    }

    data class User(var name: String = "default") {
//        init {
//            name = "sss"
//        }

        fun speak(words: String) {
            println("$name,$words")
        }

        companion object see {
            fun saw(thing: String) {
                println(thing)
            }
        }
    }


    @Test
    fun test4() {
        val box = Box(10)
        println(box.name)


    }

    class Box<T>(t: T) {
        val name = t
    }

    @Test
    fun test5() {
        val list: MutableList<AA> = mutableListOf<AA>()

    }

    open class AA() {
        fun printA() {
            println("a")
        }
    }

    open class BB : AA() {
        fun printB() {
            println("b")
        }
    }

    class CC : BB() {
        fun printC() {
            println("c")
        }
    }


    @Test
    fun test6() {
        val w = W()
        w.setT("100")
        val result = w.nextT()
        println("${w.r},$result")
    }


    interface Source<out T, in R> {
        fun nextT(): T
        fun setT(r: R)

    }

    class W : Source<Int, String> {
        var r: String = ""

        override fun setT(r: String) {
            this.r = r
        }

        override fun nextT(): Int {
            return r.toInt()
        }
    }

    @Test
    fun test7() {

    }


    open class X {
        fun x() {}
    }

    open class Y : X() {
        fun y() {}
    }

    class Z : X() {
        fun z() {}
    }
}


