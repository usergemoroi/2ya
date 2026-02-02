/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class q8
extends Enum {
    public static final /* enum */ q8 b;
    public static final /* enum */ q8 c;
    public static final /* enum */ q8 d;
    public static final /* enum */ q8 e;
    public static final q8[] f;
    public final String a;

    static {
        q8 q84;
        q8 q85;
        q8 q86;
        q8 q87;
        b = q87 = new q8(0, "UNDEFINED", "UNDEFINED");
        c = q86 = new q8(1, "APP", "APP");
        d = q85 = new q8(2, "SATELLITE", "SATELLITE");
        e = q84 = new q8(3, "RETAIL", "RETAIL");
        f = new q8[]{q87, q86, q85, q84};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public q8() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static q8 valueOf(String string2) {
        return Enum.valueOf(q8.class, string2);
    }

    public static q8[] values() {
        return (q8[])f.clone();
    }
}

