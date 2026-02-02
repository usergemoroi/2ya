/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class y4 {
    public final String a;
    public final Integer b;
    public final String c;

    public y4(String string2, Integer n10, String string3) {
        this.a = string2;
        this.b = n10;
        this.c = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && y4.class == object.getClass()) {
            Object object2 = (y4)object;
            if (!this.a.equals(((y4)object2).a)) {
                return false;
            }
            object = this.b;
            if (object != null ? !((Integer)object).equals(((y4)object2).b) : ((y4)object2).b != null) {
                return false;
            }
            object = this.c;
            object2 = ((y4)object2).c;
            if (object != null) {
                bl2 = ((String)object).equals(object2);
            } else if (object2 != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        Object object = this.b;
        int n13 = 0;
        int n14 = object != null ? ((Integer)object).hashCode() : 0;
        object = this.c;
        if (object != null) {
            n13 = ((String)object).hashCode();
        }
        return (n10 * 31 + n14) * 31 + n13;
    }
}

