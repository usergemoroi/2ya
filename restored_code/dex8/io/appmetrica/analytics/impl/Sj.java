/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Nf;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;
import org.json.JSONObject;

public final class sj
extends nh {
    public final Nf b;

    public sj(@NonNull v5 v54) {
        this(v54, Na.j().s());
    }

    public sj(v5 v54, Nf nf3) {
        super(v54);
        this.b = nf3;
    }

    @Override
    public final boolean a(@NonNull o6 o63) {
        String string2 = o63.getValue();
        try {
            o63 = new JSONObject(string2);
            o63 = o63.optJSONObject("preloadInfo");
        }
        catch (Throwable throwable) {
            o63 = null;
        }
        this.b.b(Kf.a((JSONObject)o63));
        return false;
    }
}

