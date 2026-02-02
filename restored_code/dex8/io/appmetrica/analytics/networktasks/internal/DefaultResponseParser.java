/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

public class DefaultResponseParser {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public Response parse(@Nullable byte[] object) {
        void var1_5;
        if (object != null) {
            try {
                if (((byte[])object).length > 0) {
                    String string2 = new String((byte[])object, "UTF-8");
                    JSONObject jSONObject = new JSONObject(string2);
                    Response response = new Response(jSONObject.optString("status"));
                    return var1_5;
                }
            }
            catch (Throwable throwable) {}
        }
        Object var1_4 = null;
        return var1_5;
    }

    public static class Response {
        @NonNull
        public final String mStatus;

        public Response(@NonNull String string2) {
            this.mStatus = string2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Response{mStatus='");
            stringBuilder.append(this.mStatus);
            stringBuilder.append("'}");
            return stringBuilder.toString();
        }
    }
}

