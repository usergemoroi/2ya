/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.o33
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.p33
 *  com.yandex.mobile.ads.impl.q33
 *  com.yandex.mobile.ads.impl.r33
 *  com.yandex.mobile.ads.impl.sp1
 *  com.yandex.mobile.ads.impl.y92
 *  com.yandex.mobile.ads.impl.z92
 *  kotlin.collections.l
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o33;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.p33;
import com.yandex.mobile.ads.impl.q33;
import com.yandex.mobile.ads.impl.r33;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.y92;
import com.yandex.mobile.ads.impl.z92;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.collections.l;
import kotlin.collections.s0;
import kotlin.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class s01
implements wp1 {
    @NotNull
    private static final Object e = new Object();
    @Nullable
    private final wp1 a;
    private final boolean b;
    @NotNull
    private final Executor c;
    @NotNull
    private final m d;

    public s01(@Nullable wp1 wp12, @NotNull m<? extends y92> m12, boolean bl2, @NotNull Executor executor) {
        this.a = wp12;
        this.b = bl2;
        this.c = executor;
        this.d = m12;
    }

    public static final /* synthetic */ Object a() {
        return e;
    }

    private static final void a(s01 s012, sp1 sp12) {
        try {
            z92.a((y92)((y92)s012.d.getValue()), (sp1)sp12);
            s01.a(sp12.c(), sp12.b());
            s012.a.a(sp12);
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
        }
    }

    private static final void a(s01 s012, String string2, Throwable throwable) {
        try {
            s012.getClass();
            s01.a(string2, throwable);
            s012.a.reportError(string2, throwable);
        }
        catch (Throwable throwable2) {
            int n10 = op0.b;
        }
    }

    private static final void a(s01 s012, Throwable throwable) {
        try {
            s012.getClass();
            s01.a(throwable);
            s012.a.reportUnhandledException(throwable);
        }
        catch (Throwable throwable2) {
            int n10 = op0.b;
        }
    }

    private static final void a(s01 s012, Map map2) {
        try {
            s012.getClass();
            s01.a(map2);
            s012.a.reportAnr(map2);
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
        }
    }

    private static void a(String string2, Throwable throwable) {
        Objects.toString(throwable);
        int n10 = op0.b;
    }

    private static void a(String object, Map object22) {
        object = new LinkedHashMap(s0.f((int)object22.size()));
        for (Map.Entry entry : object22.entrySet()) {
            object.put(entry.getKey(), l.c((Object[])new Object[]{entry.getValue()}));
        }
        ((Object)object).toString();
        int n10 = op0.b;
    }

    private static void a(Throwable throwable) {
        Objects.toString(throwable);
        int n10 = op0.b;
    }

    private static void a(Map object2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(s0.f((int)object2.size()));
        for (Map.Entry entry : object2.entrySet()) {
            linkedHashMap.put(entry.getKey(), l.i1((Object[])((Object[])entry.getValue())));
        }
        ((Object)linkedHashMap).toString();
        int n10 = op0.b;
    }

    public static /* synthetic */ void b(s01 s012, String string2, Throwable throwable) {
        s01.a(s012, string2, throwable);
    }

    public static /* synthetic */ void c(s01 s012, Map map2) {
        s01.a(s012, map2);
    }

    public static /* synthetic */ void d(s01 s012, Throwable throwable) {
        s01.a(s012, throwable);
    }

    public static /* synthetic */ void e(s01 s012, sp1 sp12) {
        s01.a(s012, sp12);
    }

    @Override
    public final void a(@NotNull sp1 sp12) {
        if (this.a != null) {
            this.c.execute((Runnable)new q33(this, sp12));
        } else {
            int n10 = op0.b;
        }
    }

    @Override
    public final void reportAnr(@NotNull Map<Thread, StackTraceElement[]> map2) {
        if (this.a != null) {
            this.c.execute((Runnable)new r33(this, map2));
        } else {
            int n10 = op0.b;
        }
    }

    public final void reportError(@NotNull String string2, @NotNull Throwable throwable) {
        if (this.b) {
            if (this.a != null) {
                this.c.execute((Runnable)new o33(this, string2, throwable));
            } else {
                int n10 = op0.b;
            }
        }
    }

    @Override
    public final void reportUnhandledException(@NotNull Throwable throwable) {
        if (this.a != null) {
            this.c.execute((Runnable)new p33(this, throwable));
        } else {
            int n10 = op0.b;
        }
    }
}

