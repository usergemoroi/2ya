/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import org.json.JSONObject;

public final class cl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public cl(JSONObject jSONObject) {
        this.a = jSONObject.optString("analyticsSdkVersionName", "");
        this.b = jSONObject.optString("kitBuildNumber", "");
        this.c = jSONObject.optString("appVer", "");
        this.d = jSONObject.optString("appBuild", "");
        this.e = jSONObject.optString("osVer", "");
        this.f = jSONObject.optInt("osApiLev", -1);
        this.g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionRequestParams(kitVersionName='");
        stringBuilder.append(this.a);
        stringBuilder.append("', kitBuildNumber='");
        stringBuilder.append(this.b);
        stringBuilder.append("', appVersion='");
        stringBuilder.append(this.c);
        stringBuilder.append("', appBuild='");
        stringBuilder.append(this.d);
        stringBuilder.append("', osVersion='");
        stringBuilder.append(this.e);
        stringBuilder.append("', apiLevel=");
        stringBuilder.append(this.f);
        stringBuilder.append(", attributionId=");
        stringBuilder.append(this.g);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

