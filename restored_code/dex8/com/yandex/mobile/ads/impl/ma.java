/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.b81
 *  com.yandex.mobile.ads.impl.gh1
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.ma1
 *  com.yandex.mobile.ads.impl.tq1
 *  com.yandex.mobile.ads.impl.u92
 *  com.yandex.mobile.ads.impl.u92$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.b81;
import com.yandex.mobile.ads.impl.gh1;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.ma1;
import com.yandex.mobile.ads.impl.tq1;
import com.yandex.mobile.ads.impl.u92;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ma
implements ma1 {
    @NotNull
    private final b81 a;
    @NotNull
    private final Set<? extends String> b;
    @NotNull
    private final gh1 c;
    @Nullable
    private String d;
    @Nullable
    private i71 e;

    public /* synthetic */ ma(Context context, b81 b812, Set set) {
        this(b812, set, gh1.h.a(context), 0);
    }

    private ma(b81 b812, Set set, gh1 gh12) {
        this.a = b812;
        this.b = set;
        this.c = gh12;
    }

    public /* synthetic */ ma(b81 b812, Set set, gh1 gh12, int n10) {
        this(b812, set, gh12);
    }

    private final u92 a(int n10, Context context, boolean bl2) {
        return this.a(context, n10, this.c.b() ^ true, bl2);
    }

    private final boolean a(View object, int n10) {
        int n13 = gi2.a((View)object);
        object = new StringBuilder();
        ((StringBuilder)object).append("actualPercent: ");
        ((StringBuilder)object).append(n13);
        ((StringBuilder)object).append(", expectedPercent: ");
        ((StringBuilder)object).append(n10);
        this.d = ((StringBuilder)object).toString();
        boolean bl2 = n13 < n10;
        return bl2;
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
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @VisibleForTesting
    @NotNull
    public u92 a(@NotNull Context object, int n10, boolean bl2, boolean bl3) {
        void var2_14;
        void var1_5;
        void var1_13;
        void var4_16;
        void var3_15;
        i71 i712 = this.e;
        if (i712 != null) {
            View view = i712.f();
        } else {
            Object var1_4 = null;
        }
        Object object2 = this.b;
        Object object3 = u92.a.d;
        if (object2.contains(object3.a()) ^ true && var3_15 != false && var4_16 == false) {
            u92 u922 = new u92((u92.a)object3, null, null, 6);
            return var1_13;
        }
        if (var1_5 == null) {
            u92 u923 = new u92(u92.a.n, null, null, 6);
            return var1_13;
        }
        object3 = this.b;
        object2 = u92.a.o;
        if (object3.contains(object2.a()) ^ true && gi2.e((View)var1_5)) {
            u92 u924 = new u92((u92.a)object2, null, null, 6);
            return var1_13;
        }
        object3 = this.b;
        object2 = u92.a.p;
        if (object3.contains(object2.a()) ^ true) {
            int n13 = gi2.b;
            if (var1_5.getWidth() < 10 || var1_5.getHeight() < 10) {
                u92 u925 = new u92((u92.a)object2, null, null, 6);
                return var1_13;
            }
        }
        if ((object3 = this.b).contains((object2 = u92.a.q).a()) ^ true) {
            object3 = gi2.c((View)var1_5);
            this.d = object3.b();
            if (object3.a() < 1) {
                u92 u926 = new u92((u92.a)object2, null, this.d, 2);
                return var1_13;
            }
        }
        if ((object2 = this.b).contains((object3 = u92.a.k).a()) ^ true && this.a((View)var1_5, (int)var2_14) && var4_16 == false) {
            u92 u927 = new u92((u92.a)object3, null, this.d, 2);
            return var1_13;
        }
        u92 u928 = this.a.a((boolean)var4_16);
        return var1_13;
    }

    public final void a(@Nullable i71 i712) {
        this.a.a(i712);
        this.e = i712;
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

