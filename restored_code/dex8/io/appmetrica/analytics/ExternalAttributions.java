/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONObject
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.impl.De;
import io.appmetrica.analytics.impl.Eb;
import io.appmetrica.analytics.impl.ad;
import io.appmetrica.analytics.impl.ja;
import io.appmetrica.analytics.impl.ze;
import java.util.Map;
import org.json.JSONObject;

public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(@Nullable Object object) {
        if (object == null) {
            return new ze(ja.b);
        }
        return new De(ja.b, object);
    }

    @NonNull
    public static ExternalAttribution airbridge(@Nullable Map<String, String> map2) {
        if (map2 == null) {
            return new ze(ja.e);
        }
        return new ad(ja.e, map2);
    }

    @NonNull
    public static ExternalAttribution appsflyer(@Nullable Map<String, Object> map2) {
        if (map2 == null) {
            return new ze(ja.a);
        }
        return new ad(ja.a, map2);
    }

    @NonNull
    public static ExternalAttribution kochava(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return new ze(ja.c);
        }
        return new Eb(ja.c, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(@Nullable Map<String, Object> map2) {
        if (map2 == null) {
            return new ze(ja.f);
        }
        return new ad(ja.f, map2);
    }

    @NonNull
    public static ExternalAttribution tenjin(@Nullable Map<String, String> map2) {
        if (map2 == null) {
            return new ze(ja.d);
        }
        return new ad(ja.d, map2);
    }
}

