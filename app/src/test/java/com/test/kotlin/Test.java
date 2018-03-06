package com.test.kotlin;

import java.util.Collection;
import java.util.List;

/**
 * Created by lychee on 18-3-6.
 */

public class Test {
    class A {
        public void a() {
        }
    }

    class B extends A {
        public void b() {
        }
    }

    class C extends B {
        public void c() {
        }
    }

    @org.junit.Test
    public void test1() {
        A a = new A();
        B b = new B();
        C c = new C();

        LL<A> l1 = new LL<>();
        LL<B> l2 = new LL<>();
        l1.read(l2);

    }

    interface L<E> {
        void read(L<? extends E> l);
    }

    class LL<E> implements L<E> {

        @Override
        public void read(L<? extends E> l) {

        }
    }
}
