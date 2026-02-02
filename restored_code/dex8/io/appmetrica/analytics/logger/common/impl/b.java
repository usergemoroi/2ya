/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.logger.common.impl;

import io.appmetrica.analytics.logger.common.impl.e;
import java.util.ArrayList;

public final class b {
    public final e a;

    public b() {
        this(new e());
    }

    public b(e e11) {
        this.a = e11;
    }

    public final ArrayList a(String object) {
        String[] stringArray = ((String)object).split("\\n");
        object = new ArrayList();
        for (String string2 : stringArray) {
            int n10 = 0;
            while (string2.length() > n10) {
                int n13 = string2.length();
                int n14 = n10 + 3800;
                int n15 = Math.min(n13, n14);
                int n16 = n13;
                if (n13 > n14) {
                    n16 = e.a(this.a.a.matcher(string2), n10, n15);
                    n16 = n16 == -1 ? n15 : ++n16;
                }
                ((ArrayList)object).add(string2.substring(n10, n16));
                n10 = n16;
            }
        }
        return object;
    }
}

