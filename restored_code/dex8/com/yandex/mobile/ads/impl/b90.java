/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fa0
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a90;
import com.yandex.mobile.ads.impl.ba0;
import com.yandex.mobile.ads.impl.fa0;
import com.yandex.mobile.ads.impl.y90;
import java.util.Collection;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.j;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.feed.ui.FeedAdapterInternal$observePagedData$1", f="FeedAdapterInternal.kt", i={}, l={65}, m="invokeSuspend", n={}, s={})
final class b90
extends k
implements p<q0, d<? super k0>, Object> {
    int b;
    private Object c;
    final a90 d;

    b90(a90 a902, d<? super b90> d10) {
        this.d = a902;
        super(2, d10);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
        d10 = new b90(this.d, d10);
        ((b90)((Object)d10)).c = object;
        return d10;
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object2 = (d)object2;
        object2 = new b90(this.d, (d<? super b90>)object2);
        ((b90)((Object)object2)).c = object;
        return ((b90)((Object)object2)).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        Object object2 = kotlin.coroutines.intrinsics.b.f();
        int n10 = this.b;
        if (n10 != 0) {
            if (n10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(object);
        } else {
            v.b(object);
            Object object3 = (q0)this.c;
            object = a90.access$getFeedViewModel$p(this.d).c();
            object3 = new i(this.d, (q0)object3){
                final a90 a;
                final q0 b;
                {
                    this.a = a902;
                    this.b = q02;
                }

                public final Object emit(Object object, d d10) {
                    d10 = (object = (fa0)object).c();
                    if (d10 instanceof y90.a) {
                        d10 = ((y90.a)object.c()).a();
                        this.a.submitList(object.b());
                        r0.e(this.b, d10.d(), null, 2, null);
                    } else if (d10 instanceof y90.c) {
                        this.a.submitList(t.N0((Collection)object.b(), (Object)((Object)ba0.a)));
                    } else if (d10 instanceof y90.b) {
                        this.a.submitList(object.b());
                    } else if (d10 instanceof y90.d) {
                        if (object.b().isEmpty()) {
                            this.a.submitList(object.b());
                        } else {
                            this.a.submitList(t.N0((Collection)object.b(), (Object)((Object)ba0.a)));
                        }
                    }
                    return k0.a;
                }
            };
            this.b = 1;
            if (object.collect((i)object3, (d)((Object)this)) == object2) {
                return object2;
            }
        }
        throw new j();
    }
}

