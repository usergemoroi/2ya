/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.R$attr
 *  com.yandex.mobile.ads.R$style
 *  com.yandex.mobile.ads.impl.ax
 *  com.yandex.mobile.ads.impl.bw
 *  com.yandex.mobile.ads.impl.cw
 *  com.yandex.mobile.ads.impl.cx
 *  com.yandex.mobile.ads.impl.de0
 *  com.yandex.mobile.ads.impl.dy
 *  com.yandex.mobile.ads.impl.ee0
 *  com.yandex.mobile.ads.impl.ew
 *  com.yandex.mobile.ads.impl.ew$a
 *  com.yandex.mobile.ads.impl.fe0
 *  com.yandex.mobile.ads.impl.he0
 *  com.yandex.mobile.ads.impl.hw
 *  com.yandex.mobile.ads.impl.jw
 *  com.yandex.mobile.ads.impl.kw
 *  com.yandex.mobile.ads.impl.rw
 *  com.yandex.mobile.ads.impl.s9
 *  com.yandex.mobile.ads.impl.tx
 *  com.yandex.mobile.ads.impl.xw
 *  com.yandex.mobile.ads.impl.xx
 *  com.yandex.mobile.ads.impl.y9
 *  com.yandex.mobile.ads.impl.zx$c$a
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ax;
import com.yandex.mobile.ads.impl.bp0;
import com.yandex.mobile.ads.impl.bw;
import com.yandex.mobile.ads.impl.cw;
import com.yandex.mobile.ads.impl.cx;
import com.yandex.mobile.ads.impl.de0;
import com.yandex.mobile.ads.impl.dy;
import com.yandex.mobile.ads.impl.ee0;
import com.yandex.mobile.ads.impl.ew;
import com.yandex.mobile.ads.impl.fe0;
import com.yandex.mobile.ads.impl.he0;
import com.yandex.mobile.ads.impl.hw;
import com.yandex.mobile.ads.impl.jw;
import com.yandex.mobile.ads.impl.kw;
import com.yandex.mobile.ads.impl.rw;
import com.yandex.mobile.ads.impl.s9;
import com.yandex.mobile.ads.impl.tx;
import com.yandex.mobile.ads.impl.xw;
import com.yandex.mobile.ads.impl.xx;
import com.yandex.mobile.ads.impl.y9;
import com.yandex.mobile.ads.impl.zx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.r;
import kotlin.v;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.yandex.mobile.ads.features.debugpanel.ui.viewmodel.IntegrationInspectorViewModel$updateData$1", f="IntegrationInspectorViewModel.kt", i={0, 1, 2, 3}, l={108, 109, 111, 115}, m="invokeSuspend", n={"currentDestination", "currentDestination", "currentDestination", "currentDestination"}, s={"L$0", "L$0", "L$0", "L$0"})
final class cp0
extends k
implements p<q0, d<? super k0>, Object> {
    xw b;
    Object c;
    int d;
    final bp0 e;
    final boolean f;

    cp0(bp0 bp02, boolean bl2, d<? super cp0> d10) {
        this.e = bp02;
        this.f = bl2;
        super(2, d10);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
        return new cp0(this.e, this.f, d10);
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object = (d)object2;
        return new cp0(this.e, this.f, (d<? super cp0>)object).invokeSuspend(k0.a);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        void var4_29;
        block19: {
            void var5_53;
            block32: {
                Iterator iterator;
                void var4_23;
                Object object2;
                ew ew2;
                block33: {
                    void var4_28;
                    void var5_56;
                    block24: {
                        block31: {
                            block25: {
                                block30: {
                                    block29: {
                                        void var4_15;
                                        block26: {
                                            block28: {
                                                void var5_35;
                                                block27: {
                                                    block20: {
                                                        block21: {
                                                            block22: {
                                                                block23: {
                                                                    ew2 = kotlin.coroutines.intrinsics.b.f();
                                                                    int n10 = this.d;
                                                                    object2 = null;
                                                                    if (n10 == 0) break block20;
                                                                    if (n10 == 1) break block21;
                                                                    if (n10 == 2) break block22;
                                                                    if (n10 == 3) break block23;
                                                                    if (n10 != 4) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    xw xw3 = this.b;
                                                                    v.b(object);
                                                                    Object object3 = object;
                                                                    break block24;
                                                                }
                                                                xw xw4 = this.b;
                                                                v.b(object);
                                                                break block25;
                                                            }
                                                            object2 = (y9)this.c;
                                                            xw xw5 = this.b;
                                                            v.b(object);
                                                            Object object4 = object;
                                                            object = object2;
                                                            break block26;
                                                        }
                                                        cx cx3 = (cx)this.c;
                                                        object2 = this.b;
                                                        v.b(object);
                                                        Object object5 = object;
                                                        object = object2;
                                                        object2 = object5;
                                                        break block27;
                                                    }
                                                    v.b(object);
                                                    object = ((xx)bp0.l(this.e).getValue()).a();
                                                    if (((xx)bp0.l(this.e).getValue()).c().isEmpty() || this.f) {
                                                        bp0 bp02 = this.e;
                                                        bp0.a(bp02, xx.a((xx)((xx)bp0.l(bp02).getValue()), null, null, (boolean)true, null, (int)11));
                                                    }
                                                    if (!(object instanceof xw.d)) break block28;
                                                    cx cx4 = bp0.d(this.e);
                                                    fe0 fe02 = bp0.g(this.e);
                                                    boolean bl2 = this.f;
                                                    this.b = object;
                                                    this.c = cx4;
                                                    this.d = 1;
                                                    object2 = fe02.a(bl2, (d)((Object)this));
                                                    if (object2 == ew2) {
                                                        return ew2;
                                                    }
                                                    cx cx5 = cx4;
                                                }
                                                List list = var5_35.a((ax)object2);
                                                Object object6 = object;
                                                object = list;
                                                break block19;
                                            }
                                            if (!(object instanceof xw.c)) break block29;
                                            object2 = bp0.c(this.e);
                                            ee0 ee02 = bp0.f(this.e);
                                            boolean bl3 = this.f;
                                            this.b = object;
                                            this.c = object2;
                                            this.d = 2;
                                            Object object7 = ee02.a(bl3, (d)((Object)this));
                                            if (object7 == ew2) {
                                                return ew2;
                                            }
                                            Object object8 = object;
                                            object = object2;
                                        }
                                        hw hw2 = (hw)var4_15;
                                        object.getClass();
                                        object = hw2.a();
                                        object2 = new ArrayList(t.x((Iterable)object, (int)10));
                                        ew2 = object.iterator();
                                        while (true) {
                                            void var5_38;
                                            void var4_18 = var5_38;
                                            object = object2;
                                            if (ew2.hasNext()) {
                                                object = (bw)ew2.next();
                                                ((ArrayList)object2).add(new zx.a(object.c(), object.b(), object.a()));
                                                continue;
                                            }
                                            break block19;
                                            break;
                                        }
                                    }
                                    if (!(object instanceof xw.b)) break block30;
                                    s9 s92 = bp0.a(this.e);
                                    zx.g g10 = ((xw.b)((Object)object)).b();
                                    s92.getClass();
                                    List list = s9.a((zx.g)g10);
                                    Object object9 = object;
                                    object = list;
                                    break block19;
                                }
                                if (!(object instanceof xw.a)) break block31;
                                de0 de02 = bp0.e(this.e);
                                String string2 = ((xw.a)((Object)object)).b();
                                boolean bl4 = this.f;
                                this.b = object;
                                this.d = 3;
                                Object object10 = de02.a(string2, bl4, (d)((Object)this));
                                if (object10 == ew2) {
                                    return ew2;
                                }
                                Object object11 = object;
                                object = object10;
                            }
                            ew2 = (cw)object;
                            void var5_43 = var4_23;
                            object = object2;
                            if (ew2 == null) break block32;
                            bp0.b(this.e).getClass();
                            object2 = t.c();
                            object2.add(zx.d.a);
                            object2.add(new zx.e(ew2.d()));
                            object2.add(new zx.f("Format", ew2.b()));
                            object2.add(new zx.f("ID", ew2.a()));
                            iterator = ew2.c().a().iterator();
                            break block33;
                        }
                        if (!(object instanceof xw.e)) throw new r();
                        he0 he02 = bp0.i(this.e);
                        String string3 = ((xw.e)((Object)object)).b();
                        boolean bl5 = this.f;
                        this.b = object;
                        this.d = 4;
                        Object object12 = he02.a(string3, bl5, (d)((Object)this));
                        if (object12 == ew2) {
                            return ew2;
                        }
                        Object object13 = object;
                    }
                    ew2 = (jw)var5_56;
                    void var5_57 = var4_28;
                    object = object2;
                    if (ew2 != null) {
                        String string4;
                        bp0.j(this.e).getClass();
                        object = t.c();
                        object.add(zx.d.a);
                        object.add(new zx.e("Integration"));
                        String string5 = ew2.b();
                        if (string5 != null) {
                            object.add(new zx.f("Adapter Version", string5));
                        }
                        if ((string4 = ew2.c()) != null) {
                            object.add(new zx.f("Latest Adapter Version", string4));
                        }
                        zx.c.a a12 = zx.c.a.b;
                        object.add(new zx.c());
                        object = t.a((List)object);
                        void var5_61 = var4_28;
                    }
                    break block32;
                }
                while (iterator.hasNext()) {
                    void var5_51;
                    void var5_48;
                    ew2 = (ew)iterator.next();
                    object = ew2.f();
                    if (object instanceof ew.a.a) {
                        object = kw.c;
                    } else {
                        if (!(object instanceof ew.a.b)) throw new r();
                        object = kw.d;
                    }
                    ew.a a13 = ew2.f();
                    if (a13 instanceof ew.a.b) {
                        ew.a.b b10 = (ew.a.b)a13;
                    } else {
                        Object var5_47 = null;
                    }
                    if (var5_48 != null) {
                        List<dy> list = var5_48.a();
                    } else {
                        Object var5_50 = null;
                    }
                    String string6 = ew2.b();
                    String string7 = ew2.c();
                    tx tx2 = new tx("Mediation", R.attr.debug_panel_label_secondary, null, R.style.DebugPanelText_Body2, 4);
                    String string8 = object.a();
                    object2.add(new zx.g(string6, string7, tx2, new rw(R.attr.debug_panel_label_primary, R.style.DebugPanelText_Body1, string8), null, ew2.a(), ew2.d(), ew2.e(), (List)var5_51, (kw)object, null, 1024));
                }
                object = t.a((List)object2);
                void var5_52 = var4_23;
            }
            void var4_25 = var5_53;
        }
        if (object == null) {
            bp0.m(this.e);
            return k0.a;
        }
        if (!y.e(var4_29, ((xx)bp0.l(this.e).getValue()).a())) return k0.a;
        object = xx.a((xx)((xx)bp0.l(this.e).getValue()), null, null, (boolean)false, (List)object, (int)3);
        bp0.a(this.e, (xx)object);
        return k0.a;
    }
}

