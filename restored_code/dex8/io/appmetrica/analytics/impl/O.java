/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class o
extends Enum {
    public static final /* enum */ o a;
    public static final /* enum */ o b;
    public static final o[] c;

    static {
        o o11;
        o o14;
        o o15 = new o("UNDEFINED", 0);
        a = o14 = new o("RESUMED", 1);
        b = o11 = new o("PAUSED", 2);
        c = new o[]{o15, o14, o11};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public o() {
        void var2_-1;
        void var1_-1;
    }

    public static o valueOf(String string2) {
        return Enum.valueOf(o.class, string2);
    }

    public static o[] values() {
        return (o[])c.clone();
    }
}

