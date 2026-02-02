/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.A3;

public class z3
implements A3 {
    public final int a;

    public z3(int n10) {
        this.a = n10;
    }

    public static A3 a(A3 ... a3Array) {
        return new z3(z3.b(a3Array));
    }

    public static int b(A3 ... a3Array) {
        int n10 = a3Array.length;
        int n13 = 0;
        for (int i14 = 0; i14 < n10; ++i14) {
            A3 a33 = a3Array[i14];
            int n14 = n13;
            if (a33 != null) {
                n14 = a33.getBytesTruncated() + n13;
            }
            n13 = n14;
        }
        return n13;
    }

    @Override
    public final int getBytesTruncated() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BytesTruncatedInfo{bytesTruncated=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

