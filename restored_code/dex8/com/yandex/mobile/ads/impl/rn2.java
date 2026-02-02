/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.rt
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.nativeads.NativeBulkAdLoadListener
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.nativeads.NativeBulkAdLoadListener;
import com.yandex.mobile.ads.nativeads.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class rn2
implements rt {
    @NotNull
    private final NativeBulkAdLoadListener a;

    public rn2(@NotNull NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.a = nativeBulkAdLoadListener;
    }

    public final void a(@NotNull f3 f34) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new AdRequestError(f34.b(), f34.d(), f34.a())){
            final rn2 b;
            final AdRequestError c;
            {
                this.b = rn22;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdsFailedToLoad(this.c);
                return k0.a;
            }
        });
    }

    public final void onAdsLoaded(@NotNull List<? extends t61> object) {
        ArrayList<e> arrayList = new ArrayList<e>(t.x(object, (int)10));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(new e((t61)object.next()));
        }
        new CallbackStackTraceMarker((a)new a<k0>(this, arrayList){
            final rn2 b;
            final List<e> c;
            {
                this.b = rn22;
                this.c = arrayList;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdsLoaded(this.c);
                return k0.a;
            }
        });
    }
}

