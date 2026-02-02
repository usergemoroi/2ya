/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.b81
 *  com.yandex.mobile.ads.impl.gh1
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.ma1
 *  com.yandex.mobile.ads.impl.tq1
 *  com.yandex.mobile.ads.impl.u92
 *  com.yandex.mobile.ads.impl.u92$a
 *  com.yandex.mobile.ads.impl.y00
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.b81;
import com.yandex.mobile.ads.impl.gh1;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.ma1;
import com.yandex.mobile.ads.impl.tq1;
import com.yandex.mobile.ads.impl.u92;
import com.yandex.mobile.ads.impl.y00;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class h71
implements ma1 {
    @NotNull
    private final b81 a;
    @NotNull
    private final b8<?> b;
    @NotNull
    private final gh1 c;
    @Nullable
    private String d;
    @Nullable
    private i71 e;

    public /* synthetic */ h71(Context context, b81 b812, b8 b82) {
        this(b812, b82, gh1.h.a(context));
    }

    @JvmOverloads
    public h71(@NotNull b81 b812, @NotNull b8 b82, @NotNull gh1 gh12) {
        this.a = b812;
        this.b = b82;
        this.c = gh12;
    }

    private final u92 a(int n10, Context context, boolean bl2) {
        return this.a(context, n10, this.c.b() ^ true, bl2);
    }

    @NotNull
    public final tq1 a() {
        return this.a.a();
    }

    @NotNull
    public final u92 a(@NotNull Context context, int n10) {
        return this.a(n10, context, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @VisibleForTesting
    @NotNull
    public u92 a(@NotNull Context context, int n10, boolean bl2, boolean bl3) {
        if (bl2 && !bl3) {
            return new u92(u92.a.d, null, null, 6);
        }
        if (this.b()) {
            return new u92(u92.a.o, null, null, 6);
        }
        context = this.e;
        if (context == null) return new u92(u92.a.p, null, null, 6);
        if ((context = context.f()) == null) return new u92(u92.a.p, null, null, 6);
        int n12 = gi2.b;
        if (context.getWidth() < 10) return new u92(u92.a.p, null, null, 6);
        if (context.getHeight() < 10) return new u92(u92.a.p, null, null, 6);
        context = this.e;
        if (context == null) return new u92(u92.a.q, null, this.d, 2);
        if ((context = context.f()) == null) return new u92(u92.a.q, null, this.d, 2);
        context = gi2.c((View)context);
        this.d = context.b();
        if (context.a() < 1) return new u92(u92.a.q, null, this.d, 2);
        if (this.a(n10) && !bl3) {
            return new u92(u92.a.k, null, this.d, 2);
        }
        if (y.e(y00.c.a(), this.b.v())) return new u92(u92.a.c, null, null, 6);
        return this.a.a(bl3);
    }

    public final void a(@Nullable i71 i712) {
        this.a.a(i712);
        this.e = i712;
    }

    @VisibleForTesting
    public final boolean a(int n10) {
        boolean bl2;
        Object object = this.e;
        boolean bl3 = bl2 = true;
        if (object != null) {
            if ((object = object.f()) == null) {
                bl3 = bl2;
            } else {
                int n12 = gi2.a((View)object);
                object = new StringBuilder();
                ((StringBuilder)object).append("actualPercent: ");
                ((StringBuilder)object).append(n12);
                ((StringBuilder)object).append(", expectedPercent: ");
                ((StringBuilder)object).append(n10);
                this.d = ((StringBuilder)object).toString();
                bl3 = n12 < n10 ? bl2 : false;
            }
        }
        return bl3;
    }

    @NotNull
    public final u92 b(@NotNull Context context, int n10) {
        return this.a(n10, context, true);
    }

    public final boolean b() {
        i71 i712 = this.e;
        if (i712 != null && (i712 = i712.f()) != null) {
            return gi2.e((View)i712);
        }
        return true;
    }

    public final boolean c() {
        boolean bl2;
        i71 i712 = this.e;
        boolean bl3 = bl2 = false;
        if (i712 != null) {
            if ((i712 = i712.f()) == null) {
                bl3 = bl2;
            } else {
                bl3 = bl2;
                if (gi2.b((View)i712) >= 1) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }
}

