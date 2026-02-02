/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.impl.og;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.xo;
import io.appmetrica.analytics.impl.yo;
import java.util.Arrays;
import java.util.List;

public final class jj
implements yo {
    public final xo a = new xo();

    public final wo a(@Nullable Revenue object) {
        xo xo3 = this.a;
        og og2 = new og();
        object = ((Revenue)object).quantity;
        if (object != null && (Integer)object <= 0) {
            StringBuilder stringBuilder = new StringBuilder("Invalid quantity value ");
            stringBuilder.append(object);
            object = new wo(og2, false, stringBuilder.toString());
        } else {
            object = new wo(og2, true, "");
        }
        object = Arrays.asList(object);
        xo3.getClass();
        return xo3.a((List<wo>)object);
    }
}

