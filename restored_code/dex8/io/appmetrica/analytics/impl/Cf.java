/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.s6;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

public final class cf
implements Converter {
    @NotNull
    public final Map<String, String> a(@NotNull s6[] s6Array) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final s6[] a(@NotNull Map<String, String> object) {
        int n10;
        int n13 = object.size();
        s6[] s6Array = new s6[n13];
        int n14 = 0;
        for (n10 = 0; n10 < n13; ++n10) {
            s6Array[n10] = new s6();
        }
        Iterator<Map.Entry<String, String>> iterator = object.entrySet().iterator();
        n10 = n14;
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            object = s6Array[n10];
            String string2 = entry.getKey();
            Charset charset = d.b;
            ((s6)object).a = string2.getBytes(charset);
            s6Array[n10].b = entry.getValue().getBytes(charset);
            ++n10;
        }
        return s6Array;
    }

    public final Object toModel(Object s6Array) {
        s6Array = s6Array;
        throw new UnsupportedOperationException();
    }
}

