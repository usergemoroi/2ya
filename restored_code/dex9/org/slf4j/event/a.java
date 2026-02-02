/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.a
 *  org.slf4j.c
 *  org.slf4j.event.b
 */
package org.slf4j.event;

import java.util.Queue;
import org.slf4j.c;
import org.slf4j.event.b;
import org.slf4j.event.d;
import org.slf4j.helpers.e;

public class a
implements org.slf4j.a {
    String c;
    e d;
    Queue<d> e;

    public a(e e4, Queue<d> queue) {
        this.d = e4;
        this.c = e4.getName();
        this.e = queue;
    }

    private void c(b b4, c c4, String string, Object[] objectArray, Throwable throwable) {
        d d4 = new d();
        d4.j(System.currentTimeMillis());
        d4.c(b4);
        d4.d(this.d);
        d4.e(this.c);
        d4.f(c4);
        d4.g(string);
        d4.h(Thread.currentThread().getName());
        d4.b(objectArray);
        d4.i(throwable);
        this.e.add(d4);
    }

    private void d(b b4, c c4, String string, Throwable throwable) {
        this.c(b4, c4, string, null, throwable);
    }

    public void a(String string) {
        this.d(b.i, null, string, null);
    }

    public void b(String string) {
        this.d(b.f, null, string, null);
    }

    public String getName() {
        return this.c;
    }
}

