/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.coreapi.internal.data;

import io.appmetrica.analytics.coreapi.internal.data.Parser;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003\u00a8\u0006\u0005"}, d2={"Lio/appmetrica/analytics/coreapi/internal/data/JsonParser;", "T", "", "Lio/appmetrica/analytics/coreapi/internal/data/Parser;", "Lorg/json/JSONObject;", "core-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface JsonParser<T>
extends Parser<JSONObject, T> {

    @Metadata(k=3, mv={1, 6, 0}, xi=48)
    public static final class DefaultImpls {
        @Nullable
        public static <T> T parseOrNull(@NotNull JsonParser<? extends T> jsonParser, @NotNull JSONObject jSONObject) {
            return (T)Parser.DefaultImpls.parseOrNull(jsonParser, jSONObject);
        }
    }
}

