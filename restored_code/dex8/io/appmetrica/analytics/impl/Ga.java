/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.aa;
import kotlin.text.d;

public abstract class ga {
    public static final aa a(int n10, String object) {
        aa aa4;
        block3: {
            block2: {
                aa4 = new aa();
                aa4.a = n10;
                if (object == null) break block2;
                byte[] byArray = ((String)object).getBytes(d.b);
                object = byArray;
                if (byArray != null) break block3;
            }
            object = aa4.b;
        }
        aa4.b = (byte[])object;
        return aa4;
    }
}

