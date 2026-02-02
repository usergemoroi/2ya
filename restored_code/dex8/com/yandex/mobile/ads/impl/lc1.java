/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.mc1
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jb1;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.mc1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.f;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader$loadWrapperWithVideoAdsInfo$2", f="NativeWrapperVideoLoader.kt", i={}, l={56}, m="invokeSuspend", n={}, s={})
final class lc1
extends k
implements p<q0, d<? super List<? extends kc2<jb1>>>, Object> {
    int b;
    private Object c;
    final List<kc2<jb1>> d;
    final mc1 e;

    lc1(mc1 mc12, List list, d d14) {
        this.d = list;
        this.e = mc12;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        List<kc2<jb1>> list = this.d;
        d14 = new lc1(this.e, list, d14);
        ((lc1)((Object)d14)).c = object;
        return d14;
    }

    public final Object invoke(Object object, Object object2) {
        return ((lc1)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        Object object2 = kotlin.coroutines.intrinsics.b.f();
        int n10 = this.b;
        if (n10 != 0) {
            if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            v.b(object);
            return t.z((Iterable)((Iterable)object));
        } else {
            v.b(object);
            Object object3 = (q0)this.c;
            object = this.d;
            mc1 mc12 = this.e;
            ArrayList<Object> arrayList = new ArrayList<Object>(t.x((Iterable)object, (int)10));
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (kc2)iterator.next();
                object = object.h().o() ? i.b((q0)object3, null, null, (p)new p<q0, d<? super List<? extends kc2<jb1>>>, Object>(mc12, (kc2<jb1>)object, null){
                    int b;
                    final mc1 c;
                    final kc2<jb1> d;
                    {
                        this.c = mc12;
                        this.d = kc22;
                        super(2, d14);
                    }

                    @NotNull
                    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    public final Object invoke(Object object, Object object2) {
                        object = (q0)object;
                        object = (d)object2;
                        return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)k0.a);
                    }

                    /*
                     * Enabled force condition propagation
                     * Lifted jumps to return sites
                     */
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object) {
                        Object object2 = kotlin.coroutines.intrinsics.b.f();
                        int n10 = this.b;
                        if (n10 != 0) {
                            if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            v.b(object);
                            return object;
                        } else {
                            Object object3;
                            v.b(object);
                            mc1 mc12 = this.c;
                            object = t.e(this.d);
                            this.b = 1;
                            object = object3 = mc1.a((mc1)mc12, (List)object, (d)((Object)this));
                            if (object3 != object2) return object;
                            return object2;
                        }
                    }
                }, 3, null) : z.a(t.e((Object)object));
                arrayList.add(object);
            }
            this.b = 1;
            object = object3 = f.a(arrayList, this);
            if (object3 != object2) return t.z((Iterable)((Iterable)object));
            return object2;
        }
    }
}

