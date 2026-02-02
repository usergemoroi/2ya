/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.e9;
import io.appmetrica.analytics.impl.f9;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.zo;

public final class a9
implements zo {
    public final f9 a;

    public a9() {
        this(new f9());
    }

    public a9(f9 f94) {
        this.a = f94;
    }

    @Override
    @NonNull
    public final byte[] a(@NonNull l9 object, @NonNull Gh object2) {
        object2 = object.b;
        object2 = object2 != null ? (Object)StringUtils.getUTF8Bytes((String)object2) : (Object)new byte[0];
        f9 f94 = this.a;
        object = object.o;
        return ((e9)f94.a.a(object)).a((byte[])object2);
    }
}

