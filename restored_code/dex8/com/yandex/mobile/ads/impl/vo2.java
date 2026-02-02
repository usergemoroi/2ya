/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ep2
 *  com.yandex.mobile.ads.impl.ep2$b
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ep2;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class vo2
extends ep2 {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public vo2(ep2.b b10, HashSet<String> hashSet, JSONObject jSONObject, long l10) {
        super(b10);
        this.c = new HashSet<String>(hashSet);
        this.d = jSONObject;
        this.e = l10;
    }
}

