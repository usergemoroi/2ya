/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.N8;
import io.appmetrica.analytics.impl.Ra;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.Zi;
import java.util.List;

public final class eg
implements Converter {
    public final Ra a;

    public eg() {
        this(new Ra(20, 100));
    }

    @VisibleForTesting
    public eg(@NonNull Ra ra4) {
        this.a = ra4;
    }

    @NonNull
    public final Zi a(@NonNull List<String> object) {
        Sn sn3 = this.a.a((List<Object>)object);
        List list = (List)sn3.a;
        int n10 = 0;
        object = new N8[]{};
        if (list != null) {
            N8[] n8Array = new N8[list.size()];
            while (true) {
                object = n8Array;
                if (n10 >= list.size()) break;
                n8Array[n10] = object = new N8();
                object.a = StringUtils.getUTF8Bytes((String)list.get(n10));
                ++n10;
            }
        }
        sn3.b.getBytesTruncated();
        return new Zi(object, sn3.b);
    }

    @NonNull
    public final List<String> a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

