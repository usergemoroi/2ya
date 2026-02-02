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
import io.appmetrica.analytics.impl.K4;
import io.appmetrica.analytics.impl.jo;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.r2;
import java.util.HashMap;

public final class gc
implements r2 {
    public final K4 a;

    public gc(@NonNull K4 k44) {
        this.a = k44;
    }

    @Override
    @Nullable
    public final lo a(@NonNull jo jo3, @NonNull lo lo3) {
        int n10;
        int n13 = this.a.a;
        if ((n10 = jo3.b++) == n13) {
            n13 = lo3.b;
            String string2 = new String(lo3.a);
            if ((lo)((HashMap)jo3.a.get(n13)).get(string2) != null) {
                ((HashMap)jo3.a.get(lo3.b)).put(new String(lo3.a), lo3);
            }
        } else if (n10 < n13) {
            ((HashMap)jo3.a.get(lo3.b)).put(new String(lo3.a), lo3);
        }
        return lo3;
    }
}

