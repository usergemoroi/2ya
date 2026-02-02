/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.c
 *  org.slf4j.event.b
 *  org.slf4j.event.c
 */
package org.slf4j.event;

import org.slf4j.c;
import org.slf4j.event.b;
import org.slf4j.helpers.e;

public class d
implements org.slf4j.event.c {
    b a;
    String b;
    e c;
    String d;
    String e;
    Object[] f;
    long g;
    Throwable h;

    public e a() {
        return this.c;
    }

    public void b(Object[] objectArray) {
        this.f = objectArray;
    }

    public void c(b b4) {
        this.a = b4;
    }

    public void d(e e4) {
        this.c = e4;
    }

    public void e(String string) {
        this.b = string;
    }

    public void f(c c4) {
    }

    public void g(String string) {
        this.e = string;
    }

    public void h(String string) {
        this.d = string;
    }

    public void i(Throwable throwable) {
        this.h = throwable;
    }

    public void j(long l4) {
        this.g = l4;
    }
}

