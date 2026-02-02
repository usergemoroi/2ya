/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Do;
import org.json.JSONObject;

public final class s9 {
    public final Do a;

    public s9(Do do_) {
        this.a = do_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n10, long l10) {
        JSONObject jSONObject;
        Do do_ = this.a;
        synchronized (do_) {
            jSONObject = do_.a.a().optJSONObject("numbers_of_type");
        }
        do_ = jSONObject;
        if (jSONObject == null) {
            do_ = new JSONObject();
        }
        do_.put(String.valueOf(n10), l10);
        this.a.a((JSONObject)do_);
    }
}

