/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class sf {
    public final String a;
    public final String b;

    public sf(String string2, String string3) {
        this.a = string2;
        this.b = this.a(string3);
    }

    public final String a(String string2) {
        if (string2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        } else {
            string2 = this.a;
        }
        return string2;
    }
}

