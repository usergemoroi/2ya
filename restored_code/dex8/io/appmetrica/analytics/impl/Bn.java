/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class bn
extends Enum {
    public static final /* enum */ bn a;
    public static final bn[] b;

    static {
        bn bn3;
        bn bn4 = new bn("CLIENT", 0);
        a = bn3 = new bn("SERVICE", 1);
        b = new bn[]{bn4, bn3, new bn("AUTO_INAPP", 2)};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public bn() {
        void var2_-1;
        void var1_-1;
    }

    public static bn valueOf(String string2) {
        return Enum.valueOf(bn.class, string2);
    }

    public static bn[] values() {
        return (bn[])b.clone();
    }
}

