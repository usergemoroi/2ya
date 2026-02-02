/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class fl
extends Enum {
    public static final /* enum */ fl b;
    public static final /* enum */ fl c;
    public static final fl[] d;
    public final int a;

    static {
        fl fl3;
        fl fl4;
        b = fl4 = new fl("FOREGROUND", 0, 0);
        c = fl3 = new fl("BACKGROUND", 1, 1);
        d = new fl[]{fl4, fl3};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public fl() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    public static fl valueOf(String string2) {
        return Enum.valueOf(fl.class, string2);
    }

    public static fl[] values() {
        return (fl[])d.clone();
    }
}

