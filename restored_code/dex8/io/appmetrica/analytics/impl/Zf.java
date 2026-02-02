/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Ff;
import io.appmetrica.analytics.impl.Gf;
import io.appmetrica.analytics.impl.Hf;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.Lf;
import io.appmetrica.analytics.impl.uf;
import io.appmetrica.analytics.impl.wf;
import io.appmetrica.analytics.impl.xf;
import java.util.ArrayList;

public final class zf
implements ProtobufConverter {
    public final Lf a;
    public final uf b;

    public zf() {
        this(new Lf(), new uf());
    }

    public zf(Lf lf3, uf uf3) {
        this.a = lf3;
        this.b = uf3;
    }

    @NonNull
    public final Hf a(@NonNull xf object) {
        Hf hf3 = new Hf();
        hf3.a = this.a.a(((xf)object).a);
        hf3.b = new Gf[((xf)object).b.size()];
        object = ((xf)object).b.iterator();
        int n10 = 0;
        while (object.hasNext()) {
            wf wf3 = (wf)object.next();
            hf3.b[n10] = this.b.a(wf3);
            ++n10;
        }
        return hf3;
    }

    @NonNull
    public final xf a(@NonNull Hf object) {
        ArrayList<wf> arrayList = new ArrayList<wf>(((Hf)object).b.length);
        for (Gf gf3 : ((Hf)object).b) {
            arrayList.add(this.b.a(gf3));
        }
        object = ((Hf)object).a;
        object = object == null ? this.a.a(new Ff()) : this.a.a((Ff)object);
        return new xf((Kf)object, arrayList);
    }
}

