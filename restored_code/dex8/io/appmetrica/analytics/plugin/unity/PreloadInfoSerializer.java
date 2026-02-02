/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.PreloadInfo;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

final class PreloadInfoSerializer {
    private PreloadInfoSerializer() {
    }

    @NonNull
    public static PreloadInfo fromJsonString(@NonNull String object) throws JSONException {
        Object object2 = new JSONObject((String)object);
        object = PreloadInfo.newBuilder(object2.getString("TrackingId"));
        if (object2.has("AdditionalParams")) {
            JSONObject jSONObject = object2.getJSONObject("AdditionalParams");
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                object2 = (String)iterator.next();
                ((PreloadInfo.Builder)object).setAdditionalParams((String)object2, jSONObject.getString((String)object2));
            }
        }
        return ((PreloadInfo.Builder)object).build();
    }
}

