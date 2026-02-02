/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 *  org.json.JSONArray
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.v;
import java.util.Collection;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

public final class t
implements v {
    public final String a;

    public t() {
        this.a = "yandex";
    }

    @Nullable
    public final String a() {
        try {
            Object object = A4.l().m().d;
            object = kotlin.collections.t.M0((Collection)kotlin.collections.t.e((Object)this.a), (Iterable)object);
            JSONArray jSONArray = new JSONArray((Collection)object);
            object = jSONArray.toString();
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }
}

