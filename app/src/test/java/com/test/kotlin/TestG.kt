package com.test.kotlin

import com.test.kotlin.Test.A
import org.junit.Test
import java.util.*
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by lychee on 18-3-7.
 */


class TestG {

    val lazyValue: Double by lazy {
        Math.random() * 10
    }

    var mutableV: Int by Delegates.observable(0) { pro, old, new ->
        println("$pro,$old,$new")
    }

    var v2: Int by Delegates.vetoable(-1) { property, oldValue, newValue ->
        newValue > 10
    }

    class Go<T : Test2.F>(val t: T) {
        fun fun1() {
            print(t)
        }
    }

    @Test
    fun test1() {
        val op = object : O("wow"), P {
            override fun ed() = "jj"
        }
        val wy = object {
            var x: Int = 1
            var y: Int = 2
        }
        println("${wy.x},${wy.x.javaClass}")

        val bit: Bit = Hlx(Impl())
        bit.dig(20.0)
        bit.show()

        val impl = Impl()
        Laj(impl).dig(233.0)
        Laj(impl).show()

        val zs = Zs()
        println(zs.location)
        zs.location = "wow"

        println(lazyValue)
        println(lazyValue)

        mutableV = 10

        v2 = 11
        println(v2)

        val list = intArrayOf(1, 2, 3, 4, 5, 6, 0)
        longF(*list)

        val go = Go<Test2.F>(Test2.A())

//        fun go1(i: Int): (index: Int) -> Int = i * i

        var l = List<Number>(5, { i -> i * i })
        val ll = List<Int>(5, { it * it })
        val list1: MutableCollection<Int>? = null
        val list2: MutableCollection<Number>? = null

//        testList(list1 ?: mutableListOf())

        val map = mapOf<String, String>("1" to "11", "2" to "22")
        val listFmap = map.map { it.value }
        println(listFmap)

        val r = lychee<String>(mutableListOf("1", "s", "gg", "wp"), { x, y -> x + y == "ss" })
        println(r ?: "nope")
    }

    fun testList(mu: MutableCollection<Number>) {

    }

    fun <T> lychee(collection: MutableCollection<out T>, wow: (T, T) -> Boolean): T? {
        var w: T? = null
        for (it in collection) {
            if (w != null && wow(w, it))
                w = it
        }
        return w
    }

    open class O(val x: String) {
        public open var y = x

        companion object fun1 {
            fun fun1() {}
        }
    }

    interface P {
        fun ed() = "kk"
    }

    interface Bit {
        fun dig(cm: Double)
        fun show()
    }

    class Impl() : Bit {
        override fun dig(cm: Double) {
            println("origin dig:$cm")
        }

        override fun show() {
            println("origin show")
        }
    }

    class Laj(bit: Bit) : Bit by bit {
        override fun dig(cm: Double) {
            println("laj proxy dig:$cm")
        }
    }

    class Hlx(bit: Bit) : Bit by bit {
        override fun dig(cm: Double) {
            println("proxy dig:$cm")
        }

        override fun show() {
            println("proxy show")
        }
    }

    class Zs {
        var location: String by HighSchool()
    }

    class HighSchool {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
            return "$thisRef, thank you for delegating '${property.name}' to me!"
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
            println("$value has been assigned to '${property.name} in $thisRef.'")
        }
    }

    fun longF(vararg t: Int) {
        for (i in t)
            print(i)

    }
//    class Lyl(val map:Map)
}