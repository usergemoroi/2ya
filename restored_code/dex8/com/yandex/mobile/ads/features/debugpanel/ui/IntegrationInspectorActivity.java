/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageButton
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.R$layout
 *  com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
 *  com.yandex.mobile.ads.features.debugpanel.ui.b
 *  com.yandex.mobile.ads.impl.dx
 *  com.yandex.mobile.ads.impl.th2
 *  com.yandex.mobile.ads.impl.vw
 *  com.yandex.mobile.ads.impl.vx
 *  com.yandex.mobile.ads.impl.wx
 *  com.yandex.mobile.ads.impl.xx
 *  com.yandex.mobile.ads.impl.yx
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 *  kotlin.n
 *  kotlinx.coroutines.flow.q0
 */
package com.yandex.mobile.ads.features.debugpanel.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import com.yandex.mobile.ads.features.debugpanel.ui.a;
import com.yandex.mobile.ads.features.debugpanel.ui.b;
import com.yandex.mobile.ads.impl.bp0;
import com.yandex.mobile.ads.impl.dx;
import com.yandex.mobile.ads.impl.iw;
import com.yandex.mobile.ads.impl.th2;
import com.yandex.mobile.ads.impl.ux;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.vx;
import com.yandex.mobile.ads.impl.wx;
import com.yandex.mobile.ads.impl.xx;
import com.yandex.mobile.ads.impl.yx;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.j;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.m;
import kotlin.n;
import kotlin.v;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lcom/yandex/mobile/ads/features/debugpanel/ui/IntegrationInspectorActivity;", "Lcom/yandex/mobile/ads/features/debugpanel/common/BaseActivity;", "Lcom/yandex/mobile/ads/impl/bp0;", "<init>", "()V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
public final class IntegrationInspectorActivity
extends BaseActivity<bp0> {
    @NotNull
    private final m d = n.b((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<vw>(this){
        final IntegrationInspectorActivity b;
        {
            this.b = integrationInspectorActivity;
            super(0);
        }

        public final Object invoke() {
            return new vw(this.b.getApplicationContext());
        }
    });
    @NotNull
    private final m e = n.b((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<yx>(this){
        final IntegrationInspectorActivity b;
        {
            this.b = integrationInspectorActivity;
            super(0);
        }

        public final Object invoke() {
            IntegrationInspectorActivity integrationInspectorActivity = this.b;
            a a12 = new a(IntegrationInspectorActivity.d(this.b));
            dx dx2 = IntegrationInspectorActivity.a(this.b).a();
            return new yx(integrationInspectorActivity, (l)a12, new LinearLayoutManager((Context)integrationInspectorActivity, 1, false), new iw(a12, dx2));
        }
    });
    @NotNull
    private final m f = n.b((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<wx>(this){
        final IntegrationInspectorActivity b;
        {
            this.b = integrationInspectorActivity;
            super(0);
        }

        public final Object invoke() {
            return new wx(this.b);
        }
    });

    public static final vw a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (vw)integrationInspectorActivity.d.getValue();
    }

    private static final void a(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        ((bp0)integrationInspectorActivity.b()).a(ux.g.a);
    }

    public static final wx b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (wx)integrationInspectorActivity.f.getValue();
    }

    public static final yx c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (yx)integrationInspectorActivity.e.getValue();
    }

    public static final /* synthetic */ bp0 d(IntegrationInspectorActivity integrationInspectorActivity) {
        return (bp0)integrationInspectorActivity.b();
    }

    private final void d() {
        ((ImageButton)this.findViewById(R.id.toolbar_share_button)).setOnClickListener((View.OnClickListener)new b(this));
    }

    public static /* synthetic */ void d(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        IntegrationInspectorActivity.a(integrationInspectorActivity, view);
    }

    private final void e() {
        q0 q02 = this.a();
        kotlinx.coroutines.i.d(q02, null, null, (p)new p<q0, d<? super k0>, Object>(this, null){
            int b;
            final IntegrationInspectorActivity c;
            {
                this.c = integrationInspectorActivity;
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
            public final Object invokeSuspend(@NotNull Object h10) {
                Object object = kotlin.coroutines.intrinsics.b.f();
                int n10 = this.b;
                if (n10 != 0) {
                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(h10);
                    return k0.a;
                } else {
                    v.b(h10);
                    h10 = IntegrationInspectorActivity.d(this.c).c();
                    i i11 = new i(this.c){
                        final IntegrationInspectorActivity a;
                        {
                            this.a = integrationInspectorActivity;
                        }

                        public final Object emit(Object object, d d10) {
                            object = (vx)object;
                            IntegrationInspectorActivity.b(this.a).a((vx)object);
                            return k0.a;
                        }
                    };
                    this.b = 1;
                    if (h10.collect(i11, (d<k0>)((Object)this)) != object) return k0.a;
                    return object;
                }
            }
        }, 3, null);
        kotlinx.coroutines.i.d(q02, null, null, (p)new p<q0, d<? super k0>, Object>(this, null){
            int b;
            final IntegrationInspectorActivity c;
            {
                this.c = integrationInspectorActivity;
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
            public final Object invokeSuspend(@NotNull Object i11) {
                Object object = kotlin.coroutines.intrinsics.b.f();
                int n10 = this.b;
                if (n10 != 0) {
                    if (n10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(i11);
                } else {
                    v.b(i11);
                    kotlinx.coroutines.flow.q0<xx> q02 = IntegrationInspectorActivity.d(this.c).d();
                    i11 = new i(this.c){
                        final IntegrationInspectorActivity a;
                        {
                            this.a = integrationInspectorActivity;
                        }

                        public final Object emit(Object object, d d10) {
                            object = (xx)object;
                            IntegrationInspectorActivity.c(this.a).a((xx)object);
                            return k0.a;
                        }
                    };
                    this.b = 1;
                    if (q02.collect(i11, (d)((Object)this)) == object) {
                        return object;
                    }
                }
                throw new j();
            }
        }, 3, null);
    }

    @NotNull
    public final th2<bp0> c() {
        return ((vw)this.d.getValue()).b();
    }

    public final void onBackPressed() {
        ((bp0)this.b()).a(ux.d.a);
    }

    protected final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.activity_debug);
        this.d();
        ((bp0)this.b()).a(ux.a.a);
        this.e();
    }

    protected final void onDestroy() {
        ((vw)this.d.getValue()).a().a();
        super.onDestroy();
    }
}

