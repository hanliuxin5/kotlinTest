package com.test.kotlin;

import java.util.Collection;
import java.util.List;

/**
 * Created by lychee on 18-3-6.
 */

public class Test {
    class A<T> {
        private T t;

        public A(T t) {
            this.t = t;
        }

        public void a() {
        }

        public T getT() {
            return t;
        }
    }

    class B<T> extends A<T> {
        public B(T t) {
            super(t);
        }

        public void b() {
        }
    }

    class C<T> extends B<T> {
        public C(T t) {
            super(t);
        }

        public void c() {
        }
    }

    @org.junit.Test
    public void test1() {
        A<Integer> a = new A<>(20);
        Integer t = a.getT();
        System.out.println(t);
        B<String> b = new B<>("222");
        C<Integer> c = new C<>(3);

    }




}
