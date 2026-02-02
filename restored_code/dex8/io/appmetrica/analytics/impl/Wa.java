/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

public final class wa {
    public static boolean a(JSONObject object, String string2, boolean bl2) {
        object = object.has(string2) ? Boolean.valueOf(object.getJSONObject(string2).getBoolean("enabled")) : null;
        return WrapUtils.getOrDefault(object, bl2);
    }
}

