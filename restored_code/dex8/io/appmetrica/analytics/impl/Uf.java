/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Gf;
import io.appmetrica.analytics.impl.Jf;
import io.appmetrica.analytics.impl.wf;
import org.json.JSONObject;

public final class uf
implements ProtobufConverter {
    public final Jf a;

    public uf() {
        this(new Jf());
    }

    public uf(Jf jf3) {
        this.a = jf3;
    }

    @NonNull
    public final Gf a(@NonNull wf wf3) {
        Gf gf3 = new Gf();
        if (!TextUtils.isEmpty((CharSequence)wf3.a)) {
            gf3.a = wf3.a;
        }
        gf3.b = wf3.b.toString();
        gf3.c = this.a.a(wf3.c);
        return gf3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public final wf a(@NonNull Gf gf3) {
        JSONObject jSONObject;
        String string2 = gf3.a;
        String string3 = gf3.b;
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            try {
                jSONObject = new JSONObject(string3);
                return new wf(string2, jSONObject, this.a.a(gf3.c));
            }
            catch (Throwable throwable) {}
        }
        jSONObject = new JSONObject();
        return new wf(string2, jSONObject, this.a.a(gf3.c));
    }
}

