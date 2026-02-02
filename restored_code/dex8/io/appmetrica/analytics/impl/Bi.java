/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Of;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.g4;
import io.appmetrica.analytics.internal.CounterConfiguration;
import java.util.AbstractMap;
import java.util.Map;
import org.json.JSONObject;

public class bi
extends g4 {
    @NonNull
    protected b9 c;
    protected Of d;
    public boolean e = true;
    public String f;

    public bi(@NonNull Vf vf3, @NonNull CounterConfiguration counterConfiguration, @NonNull b9 b94) {
        this(vf3, counterConfiguration, b94, null);
    }

    public bi(@NonNull Vf vf3, @NonNull CounterConfiguration counterConfiguration, @NonNull b9 b94, @Nullable String string2) {
        super(vf3, counterConfiguration);
        this.f = string2;
        this.c = b94;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.b.toBundle(bundle);
        Vf vf3 = this.a;
        synchronized (vf3) {
            bundle.putParcelable("PROCESS_CFG_OBJ", (Parcelable)vf3);
            return bundle;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final String d() {
        synchronized (this) {
            void var1_5;
            b9 b94 = this.c;
            if (((AbstractMap)b94.a).isEmpty()) {
                Object var1_2 = null;
            } else {
                JSONObject jSONObject = new JSONObject((Map)b94.a);
                String string2 = jSONObject.toString();
            }
            return var1_5;
        }
    }

    @Nullable
    public final String e() {
        synchronized (this) {
            String string2 = this.f;
            return string2;
        }
    }

    public boolean f() {
        return this.e;
    }
}

