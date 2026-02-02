/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.q8;
import org.json.JSONObject;

public final class wf {
    public final String a;
    public final JSONObject b;
    public final q8 c;

    public wf(String string2, JSONObject jSONObject, q8 q84) {
        this.a = string2;
        this.b = jSONObject;
        this.c = q84;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Candidate{trackingId='");
        stringBuilder.append(this.a);
        stringBuilder.append("', additionalParams=");
        stringBuilder.append(this.b);
        stringBuilder.append(", source=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

