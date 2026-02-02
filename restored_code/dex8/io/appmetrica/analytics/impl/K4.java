/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class k4
extends Enum {
    public static final /* enum */ k4 a;
    public static final /* enum */ k4 b;
    public static final k4[] c;

    static {
        k4 k44;
        k4 k45;
        a = k45 = new k4("NAME", 0);
        b = k44 = new k4("VALUE", 1);
        c = new k4[]{k45, k44};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public k4() {
        void var2_-1;
        void var1_-1;
    }

    public static k4 valueOf(String string2) {
        return Enum.valueOf(k4.class, string2);
    }

    public static k4[] values() {
        return (k4[])c.clone();
    }
}

