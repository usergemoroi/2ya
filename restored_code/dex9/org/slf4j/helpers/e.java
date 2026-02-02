/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.a
 *  org.slf4j.event.c
 */
package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.a;
import org.slf4j.event.c;
import org.slf4j.event.d;
import org.slf4j.helpers.b;

public class e
implements a {
    private final String c;
    private volatile a d;
    private Boolean e;
    private Method f;
    private org.slf4j.event.a g;
    private Queue<d> h;
    private final boolean i;

    public e(String string, Queue<d> queue, boolean bl) {
        this.c = string;
        this.h = queue;
        this.i = bl;
    }

    private a d() {
        if (this.g == null) {
            this.g = new org.slf4j.event.a(this, this.h);
        }
        return this.g;
    }

    public void a(String string) {
        this.c().a(string);
    }

    public void b(String string) {
        this.c().b(string);
    }

    a c() {
        if (this.d != null) {
            return this.d;
        }
        if (this.i) {
            return b.d;
        }
        return this.d();
    }

    public boolean e() {
        Boolean bl = this.e;
        if (bl != null) {
            return bl;
        }
        try {
            this.f = this.d.getClass().getMethod("log", c.class);
            this.e = Boolean.TRUE;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            this.e = Boolean.FALSE;
        }
        return this.e;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (e)object;
            return this.c.equals(((e)object).c);
        }
        return false;
    }

    public boolean f() {
        return this.d instanceof b;
    }

    public boolean g() {
        boolean bl = this.d == null;
        return bl;
    }

    public String getName() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(c c4) {
        if (!this.e()) return;
        try {
            this.f.invoke((Object)this.d, c4);
            return;
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
            return;
        }
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public void i(a a4) {
        this.d = a4;
    }
}

