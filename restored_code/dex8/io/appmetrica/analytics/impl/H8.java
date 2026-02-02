/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

public final class h8 {
    public final Map a;
    public final String b;
    public final String c;

    public h8(String string2, HashMap hashMap, String string3) {
        this.b = string2;
        this.a = hashMap;
        this.c = string3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeferredDeeplinkState{mParameters=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mDeeplink='");
        stringBuilder.append(this.b);
        stringBuilder.append("', mUnparsedReferrer='");
        stringBuilder.append(this.c);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

