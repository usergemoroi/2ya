/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.impl.Gb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public abstract class f4 {
    public static Location a(String string2) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return null;
        }
        try {
            jSONObject = new JSONObject(string2);
            string2 = jSONObject.has("provider") ? jSONObject.optString("provider") : null;
        }
        catch (Throwable throwable) {
            return null;
        }
        Location location = new Location(string2);
        location.setLongitude(jSONObject.getDouble("lng"));
        location.setLatitude(jSONObject.getDouble("lat"));
        location.setTime(jSONObject.optLong("time"));
        location.setAccuracy((float)jSONObject.optDouble("accuracy"));
        location.setAltitude((double)((float)jSONObject.optDouble("alt")));
        return location;
    }

    public static String a(Location object) {
        if (object == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("provider", (Object)object.getProvider());
            jSONObject.put("time", object.getTime());
            jSONObject.put("accuracy", (double)object.getAccuracy());
            jSONObject.put("alt", object.getAltitude());
            jSONObject.put("lng", object.getLongitude());
            jSONObject.put("lat", object.getLatitude());
            object = jSONObject.toString();
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static PreloadInfo b(String object) {
        void var2_8;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        Object object22 = null;
        Iterator iterator = null;
        if (!bl2) {
            JSONObject jSONObject = new JSONObject((String)object);
            object = iterator;
            if (jSONObject.has("trackid")) {
                object = jSONObject.optString("trackid");
            }
            object = PreloadInfo.newBuilder((String)object);
            HashMap hashMap = Gb.c(jSONObject.optString("params"));
            if (hashMap != null && hashMap.size() > 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    ((PreloadInfo.Builder)object).setAdditionalParams((String)entry.getKey(), (String)entry.getValue());
                }
            }
            PreloadInfo preloadInfo = ((PreloadInfo.Builder)object).build();
        }
        return var2_8;
    }
}

