/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.iz1$a
 *  com.yandex.mobile.ads.impl.kf1
 *  com.yandex.mobile.ads.impl.yr
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.kb0;
import com.yandex.mobile.ads.impl.kf1;
import com.yandex.mobile.ads.impl.yr;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pf1
implements iz1 {
    @NotNull
    private final Context a;
    @NotNull
    private final iz1 b;
    @NotNull
    private final iz1 c;

    public pf1(@NotNull Context context, @NotNull kb0 kb02, @NotNull kb0 kb03) {
        this.a = context;
        this.b = kb02;
        this.c = kb03;
    }

    public final int a(@NotNull Context context) {
        int n10 = yr.b((Context)context) == kf1.c ? this.c.a(context) : this.b.a(context);
        return n10;
    }

    @NotNull
    public final iz1.a a() {
        iz1.a a14 = yr.b((Context)this.a) == kf1.c ? this.c.a() : this.b.a();
        return a14;
    }

    public final int b(@NotNull Context context) {
        int n10 = yr.b((Context)context) == kf1.c ? this.c.b(context) : this.b.b(context);
        return n10;
    }

    public final int c(@NotNull Context context) {
        int n10 = yr.b((Context)context) == kf1.c ? this.c.c(context) : this.b.c(context);
        return n10;
    }

    public final int d(@NotNull Context context) {
        int n10 = yr.b((Context)context) == kf1.c ? this.c.d(context) : this.b.d(context);
        return n10;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof pf1)) {
            return false;
        }
        object = (pf1)object;
        if (!y.e(this.a, ((pf1)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((pf1)object).b)) {
            return false;
        }
        return y.e(this.c, ((pf1)object).c);
    }

    public final int getHeight() {
        int n10 = yr.b((Context)this.a) == kf1.c ? this.c.getHeight() : this.b.getHeight();
        return n10;
    }

    public final int getWidth() {
        int n10 = yr.b((Context)this.a) == kf1.c ? this.c.getWidth() : this.b.getWidth();
        return n10;
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        int n13 = this.b.hashCode();
        return this.c.hashCode() + (n13 + n10 * 31) * 31;
    }

    @NotNull
    public final String toString() {
        String string2 = yr.b((Context)this.a) == kf1.c ? this.c.toString() : this.b.toString();
        return string2;
    }
}

