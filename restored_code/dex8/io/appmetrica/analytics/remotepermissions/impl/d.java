/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.remotepermissions.impl.a;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class d
implements JsonParser {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public d() {
        this.a = "permissions";
        this.b = "name";
        this.c = "list";
        this.d = "enabled";
    }

    @NotNull
    public final a a(@NotNull JSONObject jSONObject) {
        HashSet<JSONObject> hashSet = new HashSet<JSONObject>();
        if ((jSONObject = jSONObject.optJSONObject(this.a)) != null && (jSONObject = jSONObject.optJSONArray(this.c)) != null) {
            int n10 = jSONObject.length();
            for (int i14 = 0; i14 < n10; ++i14) {
                Object object = jSONObject.optJSONObject(i14);
                if (object == null || !object.optBoolean(this.d) || TextUtils.isEmpty((CharSequence)(object = object.optString(this.b)))) continue;
                hashSet.add((JSONObject)object);
            }
        }
        return new a(hashSet);
    }

    @Nullable
    public final a b(@NotNull JSONObject jSONObject) {
        return (a)JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override
    public final Object parseOrNull(Object object) {
        return (a)JsonParser.DefaultImpls.parseOrNull(this, (JSONObject)object);
    }
}

