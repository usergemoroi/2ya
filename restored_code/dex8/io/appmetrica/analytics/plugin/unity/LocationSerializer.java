/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import android.location.Location;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

final class LocationSerializer {
    private LocationSerializer() {
    }

    @NonNull
    public static Location fromJsonString(@NonNull String string2) throws JSONException {
        JSONObject jSONObject = new JSONObject(string2);
        string2 = new Location("");
        string2.setLatitude(jSONObject.getDouble("Latitude"));
        string2.setLongitude(jSONObject.getDouble("Longitude"));
        return string2;
    }
}

