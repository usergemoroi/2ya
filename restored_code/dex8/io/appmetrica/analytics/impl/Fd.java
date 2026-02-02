/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Gb;
import java.util.AbstractMap;
import java.util.HashMap;

public final class fd
extends HashMap {
    public int a = 0;

    public fd() {
    }

    public fd(String string22) {
        super(Gb.d(string22));
        for (String string22 : ((AbstractMap)this).keySet()) {
            String string3 = (String)((AbstractMap)this).get(string22);
            int n10 = this.a;
            int n13 = string22.length();
            int n14 = string3 == null ? 0 : string3.length();
            this.a = n13 + n14 + n10;
        }
    }

    public final String a(String string2, String string3) {
        if (((AbstractMap)this).containsKey(string2)) {
            int n10 = 0;
            int n13 = 0;
            if (string3 == null) {
                if (((AbstractMap)this).containsKey(string2)) {
                    string3 = (String)((AbstractMap)this).get(string2);
                    int n14 = this.a;
                    n10 = string2.length();
                    if (string3 != null) {
                        n13 = string3.length();
                    }
                    this.a = n14 - (n10 + n13);
                }
                return (String)super.remove(string2);
            }
            String string4 = (String)((AbstractMap)this).get(string2);
            int n15 = this.a;
            int n16 = string3.length();
            n13 = string4 == null ? n10 : string4.length();
            this.a = n16 - n13 + n15;
            return super.put(string2, string3);
        }
        if (string3 != null) {
            int n17 = this.a;
            int n18 = string2.length();
            this.a = string3.length() + n18 + n17;
            return super.put(string2, string3);
        }
        return null;
    }

    @Override
    public final Object remove(Object object) {
        if (((AbstractMap)this).containsKey(object)) {
            String string2 = (String)((AbstractMap)this).get(object);
            int n10 = this.a;
            int n13 = ((String)object).length();
            int n14 = string2 == null ? 0 : string2.length();
            this.a = n10 - (n13 + n14);
        }
        return (String)super.remove(object);
    }
}

