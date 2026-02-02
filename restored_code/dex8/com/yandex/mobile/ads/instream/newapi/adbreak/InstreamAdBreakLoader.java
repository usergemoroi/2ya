/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ll0
 *  com.yandex.mobile.ads.impl.ll1
 *  com.yandex.mobile.ads.impl.pa2
 *  com.yandex.mobile.ads.impl.wm2
 *  com.yandex.mobile.ads.impl.yr
 *  com.yandex.mobile.ads.instream.newapi.InstreamExperimentalApi
 *  com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakLoadListener
 *  com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakRequestConfiguration
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.instream.newapi.adbreak;

import android.content.Context;
import com.yandex.mobile.ads.impl.ie0;
import com.yandex.mobile.ads.impl.ll0;
import com.yandex.mobile.ads.impl.ll1;
import com.yandex.mobile.ads.impl.ml0;
import com.yandex.mobile.ads.impl.ol0;
import com.yandex.mobile.ads.impl.pa2;
import com.yandex.mobile.ads.impl.tm2;
import com.yandex.mobile.ads.impl.wm2;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.yr;
import com.yandex.mobile.ads.instream.newapi.InstreamExperimentalApi;
import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakLoadListener;
import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakRequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2={"Lcom/yandex/mobile/ads/instream/newapi/adbreak/InstreamAdBreakLoader;", "Lcom/yandex/mobile/ads/impl/ll1;", "Lcom/yandex/mobile/ads/instream/newapi/adbreak/InstreamAdBreakRequestConfiguration;", "configuration", "Lkotlin/k0;", "loadAd", "(Lcom/yandex/mobile/ads/instream/newapi/adbreak/InstreamAdBreakRequestConfiguration;)V", "Lcom/yandex/mobile/ads/instream/newapi/adbreak/InstreamAdBreakLoadListener;", "listener", "setListener", "(Lcom/yandex/mobile/ads/instream/newapi/adbreak/InstreamAdBreakLoadListener;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@InstreamExperimentalApi
public final class InstreamAdBreakLoader
extends ll1 {
    @NotNull
    private final Context a;
    @NotNull
    private final ol0 b;
    @NotNull
    private final wm2 c;

    public InstreamAdBreakLoader(@NotNull Context context) {
        this.a = yr.a((Context)context);
        this.b = new ol0(context, new xn2(context));
        this.c = new wm2();
    }

    public final void loadAd(@NotNull InstreamAdBreakRequestConfiguration object) {
        this.c.getClass();
        ie0.a a14 = new ie0.a(object.getPageId(), object.getImpId());
        Map map2 = object.getParameters();
        object = map2;
        if (map2 == null) {
            object = s0.j();
        }
        object = new pa2(a14, (Map)object);
        this.b.a((pa2)object);
    }

    public final void setListener(@Nullable InstreamAdBreakLoadListener object) {
        if (object != null) {
            Context context = this.a;
            object = new tm2((InstreamAdBreakLoadListener)object, new ll0(context, new xn2(context)), new ml0());
        } else {
            object = null;
        }
        this.b.a((tm2)object);
    }
}

