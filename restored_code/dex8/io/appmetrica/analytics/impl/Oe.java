/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class oe
extends Enum {
    public static final /* enum */ oe a;
    public static final /* enum */ oe b;
    public static final oe[] c;

    static {
        oe oe2;
        oe oe3;
        a = oe3 = new oe("REPORT", 0);
        oe oe4 = new oe("LOCATION", 1);
        b = oe2 = new oe("STARTUP", 2);
        c = new oe[]{oe3, oe4, oe2, new oe("DIAGNOSTIC", 3)};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public oe() {
        void var2_-1;
        void var1_-1;
    }

    public static oe valueOf(String string2) {
        return Enum.valueOf(oe.class, string2);
    }

    public static oe[] values() {
        return (oe[])c.clone();
    }
}

