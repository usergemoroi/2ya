/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.ui0
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.ui0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.NativeImagesLoader$loadInBackground$1", f="NativeImagesLoader.kt", i={}, l={79}, m="invokeSuspend", n={}, s={})
final class i91
extends k
implements p<q0, d<? super k0>, Object> {
    int b;
    final h<ui0> c;
    final ej0 d;

    i91(h<ui0> h10, ej0 ej02, d<? super i91> d10) {
        this.c = h10;
        this.d = ej02;
        super(2, d10);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
        return new i91(this.c, this.d, d10);
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object = (d)object2;
        return new i91(this.c, this.d, (d<? super i91>)object).invokeSuspend(k0.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object h10) {
        Object object = kotlin.coroutines.intrinsics.b.f();
        int n10 = this.b;
        if (n10 != 0) {
            if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            v.b(h10);
            return k0.a;
        } else {
            v.b(h10);
            h10 = this.c;
            i i14 = new i(this.d){
                final ej0 a;
                {
                    this.a = ej02;
                }

                public final Object emit(Object object, d d10) {
                    object = (ui0)object;
                    this.a.a(object.b(), object.a());
                    return k0.a;
                }
            };
            this.b = 1;
            if (h10.collect(i14, (d<k0>)((Object)this)) != object) return k0.a;
            return object;
        }
    }
}

