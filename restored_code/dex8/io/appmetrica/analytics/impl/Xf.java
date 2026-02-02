/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.o8;
import io.appmetrica.analytics.impl.wf;
import java.util.List;

public final class xf
implements o8 {
    @NonNull
    public final Kf a;
    @NonNull
    public final List<wf> b;

    public xf(@NonNull Kf kf3, @NonNull List<wf> list) {
        this.a = kf3;
        this.b = list;
    }

    @Override
    @NonNull
    public final List<wf> a() {
        return this.b;
    }

    @Override
    @Nullable
    public final Object b() {
        return this.a;
    }

    @Nullable
    public final Kf c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        stringBuilder.append(this.a);
        stringBuilder.append(", candidates=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

