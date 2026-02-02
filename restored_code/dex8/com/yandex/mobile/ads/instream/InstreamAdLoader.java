/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.ml1
 *  com.yandex.mobile.ads.impl.xs
 *  com.yandex.mobile.ads.impl.zi2
 *  com.yandex.mobile.ads.instream.InstreamAdLoadListener
 *  com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration
 */
package com.yandex.mobile.ads.instream;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.cm0;
import com.yandex.mobile.ads.impl.dn2;
import com.yandex.mobile.ads.impl.ml1;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.impl.zi2;
import com.yandex.mobile.ads.impl.zm2;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2={"Lcom/yandex/mobile/ads/instream/InstreamAdLoader;", "Lcom/yandex/mobile/ads/impl/ml1;", "Landroid/content/Context;", "context", "Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;", "configuration", "Lkotlin/k0;", "loadInstreamAd", "(Landroid/content/Context;Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;)V", "Lcom/yandex/mobile/ads/instream/InstreamAdLoadListener;", "listener", "setInstreamAdLoadListener", "(Lcom/yandex/mobile/ads/instream/InstreamAdLoadListener;)V", "<init>", "(Landroid/content/Context;)V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@MainThread
public final class InstreamAdLoader
extends ml1 {
    @NotNull
    private final cm0 a;

    public InstreamAdLoader(@NotNull Context context) {
        this.a = new cm0(context, new xn2(context));
    }

    public final void loadInstreamAd(@NotNull Context object, @NotNull InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        object = new dn2(instreamAdRequestConfiguration);
        this.a.a((zi2)object);
    }

    public final void setInstreamAdLoadListener(@Nullable InstreamAdLoadListener object) {
        object = object != null ? new zm2((InstreamAdLoadListener)object) : null;
        this.a.a((xs)object);
    }
}

