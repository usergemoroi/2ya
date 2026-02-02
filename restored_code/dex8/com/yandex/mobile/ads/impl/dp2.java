/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.ep2$b
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.ep2;
import com.yandex.mobile.ads.impl.ip2;
import com.yandex.mobile.ads.impl.mp2;
import com.yandex.mobile.ads.impl.rp2;
import com.yandex.mobile.ads.impl.up2;
import java.util.HashSet;
import org.json.JSONObject;

public final class dp2
implements ep2.b {
    private JSONObject a;
    private final ip2 b;

    public dp2(ip2 ip22) {
        this.b = ip22;
    }

    public final void a() {
        this.b.a(new mp2(this));
    }

    @VisibleForTesting
    public final void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final void a(JSONObject jSONObject, HashSet<String> hashSet, long l10) {
        this.b.a(new up2(this, hashSet, jSONObject, l10));
    }

    @VisibleForTesting
    public final JSONObject b() {
        return this.a;
    }

    public final void b(JSONObject jSONObject, HashSet<String> hashSet, long l10) {
        this.b.a(new rp2(this, hashSet, jSONObject, l10));
    }
}

