/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.V4;
import io.appmetrica.analytics.impl.Z4;
import io.appmetrica.analytics.impl.Zf;
import io.appmetrica.analytics.impl.v9;
import io.appmetrica.analytics.impl.w9;
import java.util.ArrayList;

public final class a5
extends Zf {
    public final Z4 a;

    public a5(V4 v44) {
        this.a = new Z4(v44);
    }

    @Override
    public final w9 a(int n10) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if ((n10 = Bb.a(n10).ordinal()) != 12) {
            if (n10 != 14) {
                if (n10 == 34) {
                    arrayList.add(this.a.c);
                }
            } else {
                arrayList.add(this.a.b);
            }
        } else {
            arrayList.add(this.a.a);
        }
        return new v9(arrayList);
    }
}

