/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebSettings
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.base.webview.prewarm.WebViewPreWarmer$preWarmWebViewOnBackground$2", f="WebViewPreWarmer.kt", i={}, l={}, m="invokeSuspend", n={}, s={})
final class hk2
extends k
implements p<q0, d<? super u<? extends String>>, Object> {
    private Object b;
    final Context c;

    hk2(Context context, d<? super hk2> d10) {
        this.c = context;
        super(2, d10);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
        d10 = new hk2(this.c, d10);
        ((hk2)((Object)d10)).b = object;
        return d10;
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object2 = (d)object2;
        object2 = new hk2(this.c, (d<? super hk2>)object2);
        ((hk2)((Object)object2)).b = object;
        return ((hk2)((Object)object2)).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        kotlin.coroutines.intrinsics.b.f();
        v.b(object);
        object = (q0)this.b;
        Context context = this.c;
        try {
            object = u.d;
            object = u.b(WebSettings.getDefaultUserAgent((Context)context.getApplicationContext()));
        }
        catch (Throwable throwable) {
            object = u.d;
            object = u.b(v.a(throwable));
        }
        return u.a(object);
    }
}

