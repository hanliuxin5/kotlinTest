package com.test.kotlin

import org.junit.Test

/**
 * Created by lychee on 18-3-7.
 */
class TestG {
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

    class Hlx(bit: Bit) : Bit by bit {
        override fun dig(cm: Double) {
            println("proxy dig:$cm")
        }

        override fun show() {
            println("proxy show")
        }
    }

}