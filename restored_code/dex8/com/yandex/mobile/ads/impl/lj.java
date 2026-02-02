/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  androidx.annotation.VisibleForTesting
 *  com.monetization.ads.mediation.base.model.MediatedAdObjectInfo
 *  com.yandex.mobile.ads.impl.as0
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ba
 *  com.yandex.mobile.ads.impl.bo
 *  com.yandex.mobile.ads.impl.c3
 *  com.yandex.mobile.ads.impl.dh1
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.g3
 *  com.yandex.mobile.ads.impl.gf0
 *  com.yandex.mobile.ads.impl.gh1
 *  com.yandex.mobile.ads.impl.gh1$b
 *  com.yandex.mobile.ads.impl.h3
 *  com.yandex.mobile.ads.impl.h3$a
 *  com.yandex.mobile.ads.impl.i3
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.ik1
 *  com.yandex.mobile.ads.impl.iq1
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.j3
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.kx1
 *  com.yandex.mobile.ads.impl.m32
 *  com.yandex.mobile.ads.impl.m32$a
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.qk
 *  com.yandex.mobile.ads.impl.rv1
 *  com.yandex.mobile.ads.impl.s4
 *  com.yandex.mobile.ads.impl.sp1$a
 *  com.yandex.mobile.ads.impl.sp1$c
 *  com.yandex.mobile.ads.impl.sq0
 *  com.yandex.mobile.ads.impl.tk0
 *  com.yandex.mobile.ads.impl.u6
 *  com.yandex.mobile.ads.impl.uv1
 *  com.yandex.mobile.ads.impl.w6
 *  com.yandex.mobile.ads.impl.w82
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xq1
 *  com.yandex.mobile.ads.impl.yr
 *  com.yandex.mobile.ads.impl.zg1
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.yandex.mobile.ads.impl.a3;
import com.yandex.mobile.ads.impl.aa;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ba;
import com.yandex.mobile.ads.impl.bo;
import com.yandex.mobile.ads.impl.c3;
import com.yandex.mobile.ads.impl.dh1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.g3;
import com.yandex.mobile.ads.impl.gf0;
import com.yandex.mobile.ads.impl.gh1;
import com.yandex.mobile.ads.impl.h3;
import com.yandex.mobile.ads.impl.i3;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.ii;
import com.yandex.mobile.ads.impl.ik1;
import com.yandex.mobile.ads.impl.iq1;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.j3;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.ja;
import com.yandex.mobile.ads.impl.kg1;
import com.yandex.mobile.ads.impl.kj;
import com.yandex.mobile.ads.impl.kx1;
import com.yandex.mobile.ads.impl.m32;
import com.yandex.mobile.ads.impl.mj;
import com.yandex.mobile.ads.impl.nj;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.qk;
import com.yandex.mobile.ads.impl.rv1;
import com.yandex.mobile.ads.impl.s4;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.sq0;
import com.yandex.mobile.ads.impl.tk0;
import com.yandex.mobile.ads.impl.u6;
import com.yandex.mobile.ads.impl.uv1;
import com.yandex.mobile.ads.impl.v6;
import com.yandex.mobile.ads.impl.w6;
import com.yandex.mobile.ads.impl.w82;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.x6;
import com.yandex.mobile.ads.impl.xq1;
import com.yandex.mobile.ads.impl.yr;
import com.yandex.mobile.ads.impl.zg1;
import java.util.Collection;
import java.util.Objects;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class lj<T>
implements gh1.b,
bo,
ak.a<b8<T>>,
iq1 {
    @NotNull
    private final Context a;
    @NotNull
    private final p4 b;
    @NotNull
    private final x2 c;
    @NotNull
    private final q0 d;
    @NotNull
    private final u6 e;
    @NotNull
    private final Handler f;
    @NotNull
    private final w82 g;
    @NotNull
    private final kx1 h;
    @NotNull
    private final as0 i;
    @NotNull
    private final uv1 j;
    @NotNull
    private final gf0 k;
    @NotNull
    private final ik1 l;
    @NotNull
    private final m32 m;
    @NotNull
    private final xq1 n;
    @NotNull
    private final gh1 o;
    @NotNull
    private final h3 p;
    @NotNull
    private s4 q;
    private boolean r;
    private long s;
    @Nullable
    private c3 t;
    @Nullable
    private b8<T> u;

    public /* synthetic */ lj(Context context, p4 p42, x2 x22, q0 q02) {
        u6 u62 = new u6(x22, context);
        Handler handler = new Handler(Looper.getMainLooper());
        aa aa2 = new aa();
        kx1 kx12 = new kx1();
        as0 as02 = new as0(context, x22);
        uv1 uv12 = new uv1(context, x22.p(), q02, p42, null, null, 1048560);
        gf0 gf02 = new gf0(x22);
        ik1 ik12 = new ik1(x22);
        int n10 = m32.d;
        this(context, p42, x22, q02, u62, handler, aa2, kx12, as02, uv12, gf02, ik12, m32.a.a(), new xq1(), gh1.h.a(context), new i3());
    }

    @JvmOverloads
    protected lj(@NotNull Context context, @NotNull p4 p42, @NotNull x2 x22, @NotNull q0 q02, @NotNull u6 u62, @NotNull Handler handler, @NotNull w82 w822, @NotNull kx1 kx12, @NotNull as0 as02, @NotNull uv1 uv12, @NotNull gf0 gf02, @NotNull ik1 ik12, @NotNull m32 m322, @NotNull xq1 xq12, @NotNull gh1 gh12, @NotNull i3 i33) {
        this.a = context;
        this.b = p42;
        this.c = x22;
        this.d = q02;
        this.e = u62;
        this.f = handler;
        this.g = w822;
        this.h = kx12;
        this.i = as02;
        this.j = uv12;
        this.k = gf02;
        this.l = ik12;
        this.m = m322;
        this.n = xq12;
        this.o = gh12;
        i33.getClass();
        this.p = i3.a((lj)this);
        this.q = s4.c;
    }

    public static final /* synthetic */ gf0 a(lj lj2) {
        return lj2.k;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(lj var0, w82 var1_1, d var2_2) {
        block9: {
            block10: {
                var0.getClass();
                if (!(var2_2 /* !! */  instanceof mj)) ** GOTO lbl-1000
                var4_3 = (mj)var2_2 /* !! */ ;
                var3_4 = var4_3.f;
                if ((var3_4 & -2147483648) != 0) {
                    var4_3.f = var3_4 + -2147483648;
                    var2_2 /* !! */  = var4_3;
                } else // 2 sources

                {
                    var2_2 /* !! */  = new mj((lj<Object>)var0, var2_2 /* !! */ );
                }
                var5_5 = var2_2 /* !! */ .d;
                var4_3 = kotlin.coroutines.intrinsics.b.f();
                var3_4 = var2_2 /* !! */ .f;
                if (var3_4 == 0) break block9;
                if (var3_4 != 1) break block10;
                var1_1 = var2_2 /* !! */ .c;
                var0 = var2_2 /* !! */ .b;
                v.b(var5_5);
                var2_2 /* !! */  = var5_5;

            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(var5_5);
        var5_5 = var0.j;
        var6_6 = tk0.d;
        var2_2 /* !! */ .b = var0;
        var2_2 /* !! */ .c = var1_1;
        var2_2 /* !! */ .f = 1;
        var5_5 = var5_5.a(var6_6, var2_2 /* !! */ );
        var2_2 /* !! */  = var5_5;
        if (var5_5 == var4_3) {
            var0 = var4_3;
        } else // 2 sources

        {
            var4_3 = (rv1)var2_2 /* !! */ ;
            if (var4_3 instanceof rv1.b) {
                var2_2 /* !! */  = var0.c;
                var4_3 = (rv1.b)var4_3;
                var2_2 /* !! */ .a(var4_3.a());
                var0.c.a(var4_3.b());
                var3_4 = pw1.l;
                var2_2 /* !! */  = pw1.a.a().a(var0.a);
                var2_2 /* !! */  = var2_2 /* !! */  != null ? var2_2 /* !! */ .l() : null;
                if (var2_2 /* !! */  != null) {
                    var0.b.a(o4.g, null);
                    kotlinx.coroutines.i.d(var0.d, null, null, new nj((lj<Object>)var0, var1_1, (qk)var2_2 /* !! */ , null), 3, null);
                } else {
                    var0.a(var1_1);
                }
            } else if (var4_3 instanceof rv1.a) {
                var0.b(((rv1.a)var4_3).a());
            }
            var0 = k0.a;
        }
        return var0;
    }

    public static final /* synthetic */ ik1 b(lj lj2) {
        return lj2.l;
    }

    @NotNull
    protected abstract kj<T> a(@NotNull String var1, @NotNull String var2);

    public void a(@NotNull b8<T> b82) {
        synchronized (this) {
            this.b.a(o4.s);
            this.u = b82;
            return;
        }
    }

    public void a(@NotNull dh1 dh12) {
        Objects.toString(dh12);
        int n10 = op0.b;
    }

    public final void a(@NotNull dj2 dj22) {
        if (dj22 instanceof a3) {
            dj22 = ((a3)dj22).a();
            this.b(h3.a.a((x2)this.c, (g3)dj22));
        }
    }

    protected void a(@NotNull f3 f33) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    c3 c32;
                    try {
                        c32 = this.t;
                        if (c32 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    c32.a(f33);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void a(@Nullable i7 object, @NotNull w82 w822) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            this.a(s4.d);
                            this.c.a(object);
                            object = this.w();
                            if (object != null) break block3;
                            q0 q02 = this.d;
                            object = new p<q0, d<? super k0>, Object>(this, w822, null){
                                int b;
                                final lj<T> c;
                                final w82 d;
                                {
                                    this.c = lj2;
                                    this.d = w822;
                                    super(2, d10);
                                }

                                @NotNull
                                public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
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
                                        return k0.a;
                                    } else {
                                        v.b(object);
                                        lj lj2 = this.c;
                                        object = this.d;
                                        this.b = 1;
                                        if (lj.a(lj2, (w82)object, (d)((Object)this)) != object2) return k0.a;
                                        return object2;
                                    }
                                }
                            };
                            kotlinx.coroutines.i.d(q02, null, null, (p)object, 3, null);
                            break block4;
                        }
        // Removed invalid catch block
                        }
                    }
                    this.b((f3)object);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(@Nullable ii ii3) {
        this.t = ii3;
    }

    public final void a(@Nullable iz1 iz12) {
        this.c.a(iz12);
    }

    public final void a(@NotNull kg1 kg12) {
        this.a(s4.d);
        this.a((w82)kg12);
    }

    protected final void a(@NotNull s4 s42) {
        synchronized (this) {
            Objects.toString(s42);
            int n10 = op0.b;
            this.q = s42;
            return;
        }
    }

    @VisibleForTesting
    public final void a(@NotNull w82 w822) {
        synchronized (this) {
            q0 q02 = this.d;
            p<q0, d<? super k0>, Object> p14 = new p<q0, d<? super k0>, Object>(this, w822, null){
                private Object b;
                final lj<T> c;
                final w82 d;
                {
                    this.c = lj2;
                    this.d = w822;
                    super(2, d10);
                }

                @NotNull
                public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                    d10 = new /* invalid duplicate definition of identical inner class */;
                    d10.b = object;
                    return d10;
                }

                public final Object invoke(Object object, Object object2) {
                    return ((Object)this.create((q0)object, (d)object2)).invokeSuspend(k0.a);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    kotlin.coroutines.intrinsics.b.f();
                    v.b(object);
                    object = (q0)this.b;
                    if (!this.c.a()) {
                        Object object2 = this.d.a(this.c.e());
                        if (object2 != null && object2.length() != 0) {
                            this.c.h().a(o4.r, null);
                            this.c.e().a(this.d.a());
                            Object object3 = this.c.e();
                            xq1 xq12 = this.c.n;
                            Context context = this.c.k();
                            xq12.getClass();
                            object3.a(context.getResources().getConfiguration().orientation);
                            object3 = this.d.a(this.c.k(), this.c.e(), this.c.h);
                            object2 = this.c.a((String)object2, (String)object3);
                            object2.b((Object)ba.a((Object)object));
                            this.c.f().a((kj)((Object)object2));
                        } else {
                            this.c.b(j7.u());
                        }
                    }
                    return k0.a;
                }
            };
            kotlinx.coroutines.i.d(q02, null, null, (p)p14, 3, null);
            return;
        }
    }

    public final void a(@NotNull Object object, @Nullable MediatedAdObjectInfo mediatedAdObjectInfo, @NotNull a<k0> a12, @NotNull l<? super String, k0> l10) {
        kotlinx.coroutines.i.d(this.d, null, null, (p)new p<q0, d<? super k0>, Object>(this, object, mediatedAdObjectInfo, l10, a12, null){
            int b;
            final lj<T> c;
            final Object d;
            final MediatedAdObjectInfo e;
            final l<String, k0> f;
            final a<k0> g;
            {
                this.c = lj2;
                this.d = object;
                this.e = mediatedAdObjectInfo;
                this.f = l10;
                this.g = a12;
                super(2, d10);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            public final Object invoke(Object object, Object object2) {
                return ((Object)this.create((q0)object, (d)object2)).invokeSuspend(k0.a);
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                block9: {
                    Object object2;
                    Object object3;
                    block10: {
                        block7: {
                            block8: {
                                object3 = kotlin.coroutines.intrinsics.b.f();
                                int n10 = this.b;
                                if (n10 == 0) break block7;
                                if (n10 == 1) break block8;
                                if (n10 != 2 && n10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                v.b(object);
                                break block9;
                            }
                            v.b(object);
                            break block10;
                        }
                        v.b(object);
                        object2 = this.c.i();
                        Object object4 = this.d;
                        b8 b82 = this.c.j();
                        object = this.e;
                        this.b = 1;
                        object2 = object2.a(object4, b82, (MediatedAdObjectInfo)object, (d)((Object)this));
                        object = object2;
                        if (object2 == object3) {
                            return object3;
                        }
                    }
                    object2 = (w6)object;
                    if (object2 instanceof v6) {
                        object = g1.c();
                        object2 = new p<q0, d<? super k0>, Object>(this.f, (w6)object2, null){
                            final l<String, k0> b;
                            final w6 c;
                            {
                                this.b = l10;
                                this.c = w62;
                                super(2, d10);
                            }

                            @NotNull
                            public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                                return new /* invalid duplicate definition of identical inner class */;
                            }

                            public final Object invoke(Object object, Object object2) {
                                object = (q0)object;
                                object = (d)object2;
                                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)k0.a);
                            }

                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                kotlin.coroutines.intrinsics.b.f();
                                v.b(object);
                                this.b.invoke((Object)kotlin.collections.t.M0((Collection)((v6)this.c).a().getBlockReasons(), (Iterable)((v6)this.c).a().getReportReasons()).toString());
                                return k0.a;
                            }
                        };
                        this.b = 2;
                        if (kotlinx.coroutines.i.g((g)object, object2, this) == object3) {
                            return object3;
                        }
                    } else if (y.e(object2, x6.a)) {
                        object2 = g1.c();
                        object = new p<q0, d<? super k0>, Object>(this.g, null){
                            final a<k0> b;
                            {
                                this.b = a12;
                                super(2, d10);
                            }

                            @NotNull
                            public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                                return new /* invalid duplicate definition of identical inner class */;
                            }

                            public final Object invoke(Object object, Object object2) {
                                object = (q0)object;
                                object = (d)object2;
                                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)k0.a);
                            }

                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                kotlin.coroutines.intrinsics.b.f();
                                v.b(object);
                                this.b.invoke();
                                return k0.a;
                            }
                        };
                        this.b = 3;
                        if (kotlinx.coroutines.i.g((g)object2, object, this) == object3) {
                            return object3;
                        }
                    }
                }
                return k0.a;
            }
        }, 3, null);
    }

    public void a(@Nullable String string2) {
        this.c.a(string2);
    }

    public final boolean a() {
        synchronized (this) {
            boolean bl2 = this.r;
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected boolean a(@Nullable i7 i73) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block3: {
                    int n10;
                    int n12;
                    block4: {
                        try {
                            b8<T> b82 = this.u;
                            if (this.q == s4.f) break block3;
                            if (b82 == null) return true;
                            if (this.s <= 0L) return true;
                            if (SystemClock.elapsedRealtime() - this.s > (long)b82.h()) return true;
                            if (i73 == null) break block4;
                            if (!y.e(i73, this.c.a())) return true;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    if ((n12 = yr.b((Context)this.a).a()) == (n10 = this.c.n())) return false;
                }
                return true;
            }
            throw throwable2;
        }
    }

    public final void b() {
        this.b.a(o4.r);
        this.b.a(o4.s, null);
    }

    public void b(@NotNull f3 f33) {
        Object object;
        sp1.c c10;
        block3: {
            block2: {
                dp0.c((String)f33.d(), (Object[])new Object[0]);
                this.a(s4.f);
                c10 = sp1.c.d;
                object = this.c.h();
                if (object == null) break block2;
                String string2 = object.e();
                object = string2;
                if (string2 != null) break block3;
            }
            object = sp1.a.a;
        }
        object = new ja(c10, (String)object);
        this.b.a(o4.c, (zg1)object, null);
        this.b.a(o4.e);
        this.m.a(sq0.b, (Object)this);
        this.a(f33);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(@Nullable i7 i73) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block3: {
                    block4: {
                        try {
                            Objects.toString(this.q);
                            int n10 = op0.b;
                            if (this.q == s4.d) break block3;
                            if (!this.a(i73)) break block4;
                            this.b.a();
                            this.b.b(o4.e);
                            this.m.b(sq0.b, (Object)this);
                            this.c(i73);
                            break block3;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.q();
                }
                return;
            }
            throw throwable2;
        }
    }

    public void c() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.a()) break block3;
                        this.r = true;
                        this.v();
                        this.j.a();
                        this.p.b();
                        this.f.removeCallbacksAndMessages(null);
                        this.m.a(sq0.b, (Object)this);
                        this.u = null;
                        this.e.d();
                        r0.f(this.d, null, 1, null);
                        this.getClass().toString();
                        int n10 = op0.b;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    protected final void c(@Nullable i7 i73) {
        synchronized (this) {
            this.a(i73, this.g);
            return;
        }
    }

    public void d() {
        this.c();
        ((Object)this.getClass()).toString();
        int n10 = op0.b;
    }

    @NotNull
    public final x2 e() {
        return this.c;
    }

    @NotNull
    protected final h3 f() {
        return this.p;
    }

    public final boolean g() {
        boolean bl2 = this.q == s4.b;
        return bl2;
    }

    @NotNull
    public final p4 h() {
        return this.b;
    }

    @NotNull
    public final u6 i() {
        return this.e;
    }

    @Nullable
    public final b8<T> j() {
        return this.u;
    }

    @NotNull
    public final Context k() {
        return this.a;
    }

    @NotNull
    protected final Handler l() {
        return this.f;
    }

    @NotNull
    protected final as0 m() {
        return this.i;
    }

    protected final boolean n() {
        return this.o.b() ^ true;
    }

    @NotNull
    protected final uv1 o() {
        return this.j;
    }

    @Nullable
    public final iz1 p() {
        return this.c.q();
    }

    protected void q() {
        this.r();
    }

    protected void r() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    c3 c32;
                    try {
                        int n10 = op0.b;
                        c32 = this.t;
                        if (c32 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    c32.onAdLoaded();
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void s() {
        Object object;
        sp1.c c10;
        block3: {
            block2: {
                c10 = sp1.c.c;
                object = this.c.h();
                if (object == null) break block2;
                String string2 = object.e();
                object = string2;
                if (string2 != null) break block3;
            }
            object = sp1.a.a;
        }
        object = new ja(c10, (String)object);
        this.b.a(o4.c, (zg1)object, null);
        this.b.a(o4.e);
        this.m.a(sq0.b, (Object)this);
        this.a(s4.e);
        this.s = SystemClock.elapsedRealtime();
    }

    public void t() {
        j3.a((String)this.c.b().b());
        this.s();
        this.r();
    }

    public final void u() {
        ((Object)this.getClass()).toString();
        int n10 = op0.b;
        this.o.a((gh1.b)this);
    }

    public final void v() {
        ((Object)this.getClass()).toString();
        int n10 = op0.b;
        this.o.b((gh1.b)this);
    }

    @VisibleForTesting
    @Nullable
    protected f3 w() {
        return this.i.b();
    }
}

