/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class g9
extends Enum {
    public static final /* enum */ g9 b;
    public static final /* enum */ g9 c;
    public static final /* enum */ g9 d;
    public static final g9[] e;
    public final int a;

    static {
        g9 g94;
        g9 g95;
        g9 g96;
        b = g96 = new g9("NONE", 0, 0);
        c = g95 = new g9("EXTERNALLY_ENCRYPTED_EVENT_CRYPTER", 1, 1);
        d = g94 = new g9("AES_VALUE_ENCRYPTION", 2, 2);
        e = new g9[]{g96, g95, g94};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public g9() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    public static g9 a(Integer n10) {
        if (n10 != null) {
            for (g9 g94 : g9.values()) {
                if (g94.a != n10) continue;
                return g94;
            }
        }
        return b;
    }

    public static g9 valueOf(String string2) {
        return Enum.valueOf(g9.class, string2);
    }

    public static g9[] values() {
        return (g9[])e.clone();
    }
}

