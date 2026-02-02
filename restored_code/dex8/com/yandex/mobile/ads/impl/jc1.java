/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.mc1
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.wb2
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lc1;
import com.yandex.mobile.ads.impl.mc1;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.wb2;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader$loadWrapperInVideo$2", f="NativeWrapperVideoLoader.kt", i={0}, l={38}, m="invokeSuspend", n={"video"}, s={"L$0"})
final class jc1
extends k
implements p<q0, d<? super wb2>, Object> {
    wb2 b;
    int c;
    final wb2 d;
    final mc1 e;

    jc1(wb2 wb22, mc1 mc12, d<? super jc1> d14) {
        this.d = wb22;
        this.e = mc12;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        return new jc1(this.d, this.e, d14);
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object = (d)object2;
        return new jc1(this.d, this.e, (d<? super jc1>)object).invokeSuspend(k0.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        wb2 wb22;
        Object object2 = kotlin.coroutines.intrinsics.b.f();
        int n10 = this.c;
        if (n10 != 0) {
            if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            wb22 = this.b;
            v.b(object);
        } else {
            v.b(object);
            wb22 = this.d;
            object = null;
            if (wb22 == null) return object;
            mc1 mc12 = this.e;
            object = wb22.c();
            this.b = wb22;
            this.c = 1;
            mc12.getClass();
            object = i.g((g)g1.b(), new lc1(mc12, (List)object, null), this);
            if (object == object2) {
                return object2;
            }
        }
        object = (List)object;
        if (object.isEmpty()) throw new w61("Invalid VAST in response");
        return wb2.a((wb2)wb22, (List)object);
    }
}

