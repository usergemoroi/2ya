/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.coreutils.internal.parsing;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.y;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u00a8\u0006\u0016"}, d2={"Lio/appmetrica/analytics/coreutils/internal/parsing/RemoteConfigJsonUtils;", "", "Lorg/json/JSONObject;", "input", "", "name", "", "fallback", "extractFeature", "key", "extractQuery", "type", "", "", "extractHosts", "(Lorg/json/JSONObject;Ljava/lang/String;)[[B", "", "defaultMillis", "extractMillisFromSecondsOrDefault", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "extractMillisOrDefault", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class RemoteConfigJsonUtils {
    @NotNull
    public static final RemoteConfigJsonUtils INSTANCE = new RemoteConfigJsonUtils();

    private RemoteConfigJsonUtils() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @JvmStatic
    public static final boolean extractFeature(@NotNull JSONObject jSONObject, @NotNull String string2, boolean bl2) {
        try {
            jSONObject = jSONObject.optJSONObject("features");
            if (jSONObject == null) return bl2;
        }
        catch (Throwable throwable) {
            return bl2;
        }
        jSONObject = jSONObject.optJSONObject("list");
        if (jSONObject == null) return bl2;
        jSONObject = jSONObject.optJSONObject(string2);
        if (jSONObject == null) return bl2;
        return jSONObject.optBoolean("enabled", bl2);
    }

    @JvmStatic
    @NotNull
    public static final byte[][] extractHosts(@NotNull JSONObject object, @NotNull String object2) {
        JSONArray jSONArray;
        object = object.optJSONObject("query_hosts");
        int n10 = 0;
        if (object != null && (object = object.optJSONObject("list")) != null && (object = object.optJSONObject((String)object2)) != null && (jSONArray = object.optJSONArray("urls")) != null) {
            int n13 = jSONArray.length();
            object2 = new byte[n13][];
            while (true) {
                object = object2;
                if (n10 < n13) {
                    object2[n10] = jSONArray.optString(n10).getBytes(d.b);
                    ++n10;
                    continue;
                }
                break;
            }
        } else {
            object = new byte[0][];
        }
        return object;
    }

    @JvmStatic
    public static final long extractMillisFromSecondsOrDefault(@NotNull JSONObject jSONObject, @NotNull String string2, long l10) {
        return RemoteConfigJsonUtils.extractMillisOrDefault(jSONObject, string2, TimeUnit.SECONDS, l10);
    }

    @JvmStatic
    public static final long extractMillisOrDefault(@NotNull JSONObject jSONObject, @NotNull String string2, @NotNull TimeUnit timeUnit, long l10) {
        return WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, string2), timeUnit, l10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @JvmStatic
    @Nullable
    public static final String extractQuery(@NotNull JSONObject object, @NotNull String string2) {
        JSONObject jSONObject;
        Object var3_3 = null;
        try {
            jSONObject = object.optJSONObject("queries");
            object = var3_3;
            if (jSONObject == null) return object;
        }
        catch (Throwable throwable) {
            return var3_3;
        }
        jSONObject = jSONObject.optJSONObject("list");
        object = var3_3;
        if (jSONObject == null) return object;
        string2 = jSONObject.optJSONObject(string2);
        object = var3_3;
        if (string2 == null) return object;
        object = INSTANCE;
        string2 = string2.optString("url", "");
        object.getClass();
        boolean bl2 = y.e(string2, "");
        object = var3_3;
        if (bl2) return object;
        return string2;
    }
}

