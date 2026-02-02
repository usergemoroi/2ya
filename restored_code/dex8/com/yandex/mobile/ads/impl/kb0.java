/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.iz1$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.iz1;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class kb0
implements iz1 {
    @NotNull
    private final iz1.a a;
    private final int b;
    private final int c;
    @NotNull
    private final String d;

    public kb0(int n10, int n13, @NotNull iz1.a object) {
        this.a = object;
        int n14 = n10 < 0 && -1 != n10 ? 0 : n10;
        this.b = n14;
        n14 = n13 < 0 && -2 != n13 ? 0 : n13;
        this.c = n14;
        object = z0.a;
        object = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{n10, n13}, 2));
        y.i(object, "format(...)");
        this.d = object;
    }

    public final int a(@NotNull Context context) {
        int n10;
        int n13 = n10 = this.c;
        if (-2 == n10) {
            n13 = gi2.b((Context)context);
        }
        return n13;
    }

    @NotNull
    public final iz1.a a() {
        return this.a;
    }

    public final int b(@NotNull Context context) {
        int n10 = this.c;
        n10 = -2 == n10 ? gi2.c((Context)context) : gi2.a((Context)context, (float)n10);
        return n10;
    }

    public final int c(@NotNull Context context) {
        int n10;
        int n13 = n10 = this.b;
        if (-1 == n10) {
            n13 = gi2.d((Context)context);
        }
        return n13;
    }

    public final int d(@NotNull Context context) {
        int n10 = this.b;
        if (-1 == n10) {
            n10 = gi2.b;
            n10 = context.getResources().getDisplayMetrics().widthPixels;
        } else {
            n10 = gi2.a((Context)context, (float)n10);
        }
        return n10;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && y.e(kb0.class, object.getClass())) {
            object = (kb0)object;
            if (this.b != ((kb0)object).b) {
                return false;
            }
            if (this.c != ((kb0)object).c || this.a != ((kb0)object).a) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getWidth() {
        return this.b;
    }

    public final int hashCode() {
        int n10 = this.b;
        int n13 = this.c;
        n10 = e3.a((String)this.d, (int)((n10 * 31 + n13) * 31), (int)31);
        return this.a.hashCode() + n10;
    }

    @NotNull
    public final String toString() {
        return this.d;
    }
}

