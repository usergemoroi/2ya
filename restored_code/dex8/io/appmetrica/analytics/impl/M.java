/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class m
extends Enum {
    public static final /* enum */ m b;
    public static final /* enum */ m c;
    public static final /* enum */ m d;
    public static final m[] e;
    public final String a;

    static {
        m m12;
        m m14;
        m m15;
        b = m15 = new m(0, "WATCHING", null);
        c = m14 = new m(1, "NO_APPLICATION", "Bad application object");
        d = m12 = new m(2, "NOT_WATCHING_YET", "Internal inconsistency");
        e = new m[]{m15, m14, m12};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public m() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static m valueOf(String string2) {
        return Enum.valueOf(m.class, string2);
    }

    public static m[] values() {
        return (m[])e.clone();
    }
}

