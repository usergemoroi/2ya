/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.base.a
 *  com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher
 *  com.yandex.mobile.ads.impl.g01
 *  com.yandex.mobile.ads.impl.hz0
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.jk1
 *  com.yandex.mobile.ads.impl.kz0
 *  com.yandex.mobile.ads.impl.mk1
 *  com.yandex.mobile.ads.impl.uk1
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import com.yandex.mobile.ads.impl.g01;
import com.yandex.mobile.ads.impl.hz0;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.jk1;
import com.yandex.mobile.ads.impl.kz0;
import com.yandex.mobile.ads.impl.mk1;
import com.yandex.mobile.ads.impl.uk1;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.g3;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworkMediationDataAsync$1", f="PrefetchedMediationNetworksDataLoader.kt", i={0, 0}, l={127}, m="invokeSuspend", n={"mediationNetwork", "mediatedAdapter"}, s={"L$0", "L$1"})
final class pk1
extends k
implements p<q0, d<? super jk1>, Object> {
    kz0 b;
    MediatedAdapterPrefetcher c;
    int d;
    final uk1 e;
    final g01 f;
    final Context g;
    final String h;
    final is i;
    final long j;
    final iz1 k;

    pk1(uk1 uk12, g01 g012, Context context, String string2, is is3, long l10, iz1 iz12, d<? super pk1> d14) {
        this.e = uk12;
        this.f = g012;
        this.g = context;
        this.h = string2;
        this.i = is3;
        this.j = l10;
        this.k = iz12;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        return new pk1(this.e, this.f, this.g, this.h, this.i, this.j, this.k, d14);
    }

    public final Object invoke(Object object, Object object2) {
        return ((pk1)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        Object object2;
        block15: {
            Object object3;
            Object object4;
            Object object5;
            block17: {
                Exception exception2;
                block16: {
                    block18: {
                        kz0 kz02;
                        block14: {
                            object5 = kotlin.coroutines.intrinsics.b.f();
                            int n10 = this.d;
                            if (n10 != 0) {
                                if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                object4 = this.c;
                                kz02 = this.b;
                                object2 = object4;
                                object5 = object4;
                                object3 = kz02;
                                try {
                                    v.b(object);
                                    break block14;
                                }
                                catch (Throwable throwable) {
                                    break block15;
                                }
                                catch (Exception exception2) {
                                    break block16;
                                }
                            }
                            v.b(object);
                            object4 = uk1.e((uk1)this.e);
                            object = this.f;
                            object4.getClass();
                            object4 = new kz0(object.d(), object.e(), null, null, null, null, null);
                            try {
                                uk1.a((uk1)this.e, (kz0)object4);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                return hz0.a((String)object4.e(), (Exception)illegalArgumentException);
                            }
                            object = uk1.c((uk1)this.e).a(this.g, (kz0)object4, a.class);
                            object = object instanceof MediatedAdapterPrefetcher ? (MediatedAdapterPrefetcher)object : null;
                            if (object == null) {
                                object = hz0.a((String)object4.e());
                                uk1.b((uk1)this.e).a(this.g, this.h, this.i, (jk1)object, null);
                                return object;
                            }
                            uk1.a((uk1)this.e).b();
                            try {
                                long l10 = this.j;
                                object3 = new p<q0, d<? super jk1>, Object>(this.e, this.g, this.k, (kz0)object4, (MediatedAdapterPrefetcher)object, null){
                                    int b;
                                    final uk1 c;
                                    final Context d;
                                    final iz1 e;
                                    final kz0 f;
                                    final MediatedAdapterPrefetcher g;
                                    {
                                        this.c = uk12;
                                        this.d = context;
                                        this.e = iz12;
                                        this.f = kz02;
                                        this.g = mediatedAdapterPrefetcher;
                                        super(2, d14);
                                    }

                                    @NotNull
                                    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                                        return new /* invalid duplicate definition of identical inner class */;
                                    }

                                    public final Object invoke(Object object, Object object2) {
                                        return ((Object)this.create((q0)object, (d)object2)).invokeSuspend(k0.a);
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
                                            mk1 mk12 = uk1.d((uk1)this.c);
                                            object = this.d;
                                            iz1 iz12 = this.e;
                                            kz0 kz02 = this.f;
                                            MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.g;
                                            this.b = 1;
                                            object = object3 = mk12.a((Context)object, iz12, kz02, mediatedAdapterPrefetcher, (d)((Object)this));
                                            if (object3 != object2) return object;
                                            return object2;
                                        }
                                    }
                                };
                                this.b = object4;
                                this.c = object;
                                this.d = 1;
                                object3 = g3.c(l10, object3, this);
                                if (object3 == object5) {
                                    return object5;
                                }
                                object5 = object;
                                object = object3;
                                kz02 = object4;
                                object4 = object5;
                            }
                            catch (Throwable throwable) {
                                object2 = object;
                                object = throwable;
                                break block15;
                            }
                            catch (Exception exception3) {
                                // empty catch block
                                break block17;
                            }
                        }
                        object2 = object4;
                        object5 = object4;
                        object3 = kz02;
                        {
                            object = (jk1)object;
                            object2 = object4;
                            object5 = object4;
                            object3 = kz02;
                            uk1.a((uk1)this.e).c();
                            object2 = object4;
                            object5 = object4;
                            object3 = kz02;
                            Long l11 = uk1.a((uk1)this.e).a();
                            if (object == null) break block18;
                            object2 = object4;
                            object5 = object4;
                            object3 = kz02;
                            uk1 uk12 = this.e;
                            object2 = object4;
                            object5 = object4;
                            object3 = kz02;
                            Context context = this.g;
                            object2 = object4;
                            object5 = object4;
                            object3 = kz02;
                            String string2 = this.h;
                            object2 = object4;
                            object5 = object4;
                            object3 = kz02;
                            is is3 = this.i;
                            object2 = object4;
                            object5 = object4;
                            object3 = kz02;
                            uk1.b((uk1)uk12).a(context, string2, is3, (jk1)object, l11);
                        }
                    }
                    object4.onInvalidate();
                    return object;
                }
                object4 = object3;
                object3 = object5;
                object5 = exception2;
                object = object3;
            }
            try {
                uk1.a((uk1)this.e).c();
                object3 = uk1.a((uk1)this.e).a();
                object4 = hz0.a((String)object4.e(), (Exception)object5);
                uk1.b((uk1)this.e).a(this.g, this.h, this.i, (jk1)object4, (Long)object3);
            }
            catch (Throwable throwable) {
                object2 = object;
                object = throwable;
                break block15;
            }
            object.onInvalidate();
            return object4;
        }
        object2.onInvalidate();
        throw object;
    }
}

