/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class ja
extends Enum {
    public static final /* enum */ ja a;
    public static final /* enum */ ja b;
    public static final /* enum */ ja c;
    public static final /* enum */ ja d;
    public static final /* enum */ ja e;
    public static final /* enum */ ja f;
    public static final ja[] g;

    static {
        ja ja4;
        ja ja5;
        ja ja6;
        ja ja7;
        ja ja8;
        ja ja9;
        ja ja10 = new ja("UNKNOWN", 0);
        a = ja9 = new ja("APPSFLYER", 1);
        b = ja8 = new ja("ADJUST", 2);
        c = ja7 = new ja("KOCHAVA", 3);
        d = ja6 = new ja("TENJIN", 4);
        e = ja5 = new ja("AIRBRIDGE", 5);
        f = ja4 = new ja("SINGULAR", 6);
        g = new ja[]{ja10, ja9, ja8, ja7, ja6, ja5, ja4};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public ja() {
        void var2_-1;
        void var1_-1;
    }

    public static ja valueOf(String string2) {
        return Enum.valueOf(ja.class, string2);
    }

    public static ja[] values() {
        return (ja[])g.clone();
    }
}

