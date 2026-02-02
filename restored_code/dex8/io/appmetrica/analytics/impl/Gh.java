/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 */
package io.appmetrica.analytics.impl;

import androidx.collection.a;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gh
implements RemoteConfigMetaInfo {
    public final long a;
    public final long b;

    public gh(long l10, long l11) {
        this.a = l10;
        this.b = l11;
    }

    public static gh a(gh gh3, long l10, long l11, int n10, Object object) {
        if ((n10 & 1) != 0) {
            l10 = gh3.a;
        }
        if ((n10 & 2) != 0) {
            l11 = gh3.b;
        }
        gh3.getClass();
        return new gh(l10, l11);
    }

    public final long a() {
        return this.a;
    }

    @NotNull
    public final gh a(long l10, long l11) {
        return new gh(l10, l11);
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof gh)) {
            return false;
        }
        object = (gh)object;
        if (this.a != ((gh)object).a) {
            return false;
        }
        return this.b == ((gh)object).b;
    }

    @Override
    public final long getFirstSendTime() {
        return this.a;
    }

    @Override
    public final long getLastUpdateTime() {
        return this.b;
    }

    public final int hashCode() {
        int n10 = androidx.collection.a.a((long)this.a);
        return androidx.collection.a.a((long)this.b) + n10 * 31;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lastUpdateTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

