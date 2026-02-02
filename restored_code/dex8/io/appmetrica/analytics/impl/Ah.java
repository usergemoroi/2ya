/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Dn;
import io.appmetrica.analytics.impl.G6;
import io.appmetrica.analytics.impl.Kl;
import io.appmetrica.analytics.impl.Ln;
import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.Zg;
import io.appmetrica.analytics.impl.bf;
import io.appmetrica.analytics.impl.cf;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.w6;
import java.util.List;

public final class ah
implements ProtobufConverter {
    public final Ln a;
    public final V b;
    public final G6 c;
    public final Kl d;
    public final bf e;
    public final cf f;

    public ah() {
        this(new Ln(), new V(new Dn()), new G6(), new Kl(), new bf(), new cf());
    }

    public ah(Ln ln3, V v14, G6 g63, Kl kl2, bf bf3, cf cf3) {
        this.a = ln3;
        this.b = v14;
        this.c = g63;
        this.d = kl2;
        this.e = bf3;
        this.f = cf3;
    }

    @NonNull
    public final Zg a(@NonNull w6 w64) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final w6 a(@NonNull Zg object) {
        w6 w64 = new w6();
        w64.f = StringUtils.correctIllFormedString(WrapUtils.getOrDefault(((Zg)object).a, w64.f));
        object = ((Zg)object).b;
        if (object != null) {
            Object object2 = ((Wn)object).a;
            if (object2 != null) {
                w64.a = this.a.a((Mn)object2);
            }
            if ((object2 = ((Wn)object).b) != null) {
                w64.b = this.b.a((U)object2);
            }
            if ((object2 = ((Wn)object).c) != null) {
                w64.e = this.d.a((List<Ml>)object2);
            }
            w64.c = WrapUtils.getOrDefault(((Wn)object).g, w64.c);
            w64.d = this.c.a(((Wn)object).h);
            if (!TextUtils.isEmpty((CharSequence)((Wn)object).d)) {
                w64.i = this.e.a(((Wn)object).d);
            }
            if (!TextUtils.isEmpty((CharSequence)((Wn)object).e)) {
                w64.j = ((Wn)object).e.getBytes();
            }
            if (!ro.a(((Wn)object).f)) {
                w64.k = this.f.a(((Wn)object).f);
            }
        }
        return w64;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (w6)object;
        throw new UnsupportedOperationException();
    }
}

