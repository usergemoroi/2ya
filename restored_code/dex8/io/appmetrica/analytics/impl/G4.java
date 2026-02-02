/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.internal.CounterConfiguration;

public class g4 {
    public final Vf a;
    public final CounterConfiguration b;

    public g4(Vf vf3, CounterConfiguration counterConfiguration) {
        this.a = vf3;
        this.b = counterConfiguration;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static g4 a(@NonNull Context context, @NonNull Bundle object) {
        Object object2 = Vf.c;
        if (object != null) {
            try {
                object2 = (Vf)object.getParcelable("PROCESS_CFG_OBJ");
            }
            catch (Throwable throwable) {}
        }
        object2 = null;
        CounterConfiguration counterConfiguration = CounterConfiguration.fromBundle(object);
        if (counterConfiguration != null && object2 != null && context.getPackageName().equals(((Vf)object2).a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && ((Vf)object2).a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL") == AppMetrica.getLibraryApiLevel()) {
            return new g4((Vf)object2, counterConfiguration);
        }
        return null;
    }

    @NonNull
    public final Vf a() {
        return this.a;
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientConfiguration{mProcessConfiguration=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mCounterConfiguration=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

