/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class h0 {
    public final String a;
    public final long b;

    public h0(String string2, long l10) {
        this.a = string2;
        this.b = l10;
    }

    public final boolean equals(Object object) {
        block5: {
            boolean bl2;
            block7: {
                block8: {
                    Object object2;
                    block6: {
                        bl2 = true;
                        if (this == object) {
                            return true;
                        }
                        if (object == null || h0.class != object.getClass()) break block5;
                        object2 = (h0)object;
                        if (this.b != ((h0)object2).b) {
                            return false;
                        }
                        object = this.a;
                        object2 = ((h0)object2).a;
                        if (object == null) break block6;
                        if (((String)object).equals(object2)) break block7;
                        break block8;
                    }
                    if (object2 == null) break block7;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n10 = string2 != null ? string2.hashCode() : 0;
        long l10 = this.b;
        return n10 * 31 + (int)(l10 ^ l10 >>> 32);
    }
}

