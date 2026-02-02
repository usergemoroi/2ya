/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.c0
 *  com.yandex.mobile.ads.impl.e0$a
 *  com.yandex.mobile.ads.impl.n0
 *  com.yandex.mobile.ads.impl.op0
 */
package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.c0;
import com.yandex.mobile.ads.impl.e0;
import com.yandex.mobile.ads.impl.h0;
import com.yandex.mobile.ads.impl.n0;
import com.yandex.mobile.ads.impl.op0;
import java.util.WeakHashMap;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class e0
implements c0 {
    @NotNull
    private static final Object f = new Object();
    @Nullable
    private static volatile e0 g;
    @NotNull
    private final Object a = new Object();
    @NotNull
    private final WeakHashMap b = new WeakHashMap();
    @NotNull
    private final WeakHashMap c = new WeakHashMap();
    @NotNull
    private final a d = new a(this);
    private boolean e;

    public static final /* synthetic */ e0 a() {
        return g;
    }

    public static final /* synthetic */ WeakHashMap a(e0 e03) {
        return e03.b;
    }

    public static final /* synthetic */ void a(e0 e03, Context context) {
        e03.b(context);
    }

    public static final /* synthetic */ Object b() {
        return f;
    }

    public static final /* synthetic */ Object b(e0 e03) {
        return e03.a;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b(Context object) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block7: {
                    boolean bl2;
                    if (!this.b.isEmpty() || !(bl2 = this.c.isEmpty())) break block7;
                    {
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    try {
                        if (!this.c()) break block7;
                        object = object.getApplicationContext();
                        y.h(object, "null cannot be cast to non-null type android.app.Application");
                        ((Application)object).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.d);
                        this.e = false;
                    }
                    catch (Throwable throwable3) {
                        int n10 = op0.b;
                    }
                }
                object = k0.a;
                return;
            }
            throw throwable2;
        }
    }

    public static final /* synthetic */ WeakHashMap c(e0 e03) {
        return e03.c;
    }

    public static final /* synthetic */ void d(e0 e03) {
        g = e03;
    }

    @VisibleForTesting
    public final void a(@NotNull Context context) {
        try {
            context = context.getApplicationContext();
            y.h(context, "null cannot be cast to non-null type android.app.Application");
            ((Application)context).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.d);
            this.e = true;
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
        }
    }

    public final void a(@NotNull Context object, @NotNull h0.a a12) {
        Object object2 = this.a;
        synchronized (object2) {
            this.c.remove(a12);
            this.b((Context)object);
            object = k0.a;
            return;
        }
    }

    public final void a(@NotNull Context object, @NotNull n0 n03) {
        Object object2 = this.a;
        synchronized (object2) {
            this.b.remove(n03);
            this.b((Context)object);
            object = k0.a;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(@NotNull Context object, @NotNull h0.a a12) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.c.put(a12, null);
                        if (this.c()) break block3;
                        this.a((Context)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = k0.a;
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
    public final void b(@NotNull Context object, @NotNull n0 n03) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.b.put(n03, null);
                        if (this.c()) break block3;
                        this.a((Context)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = k0.a;
                return;
            }
            throw throwable2;
        }
    }

    public final boolean c() {
        Object object = this.a;
        synchronized (object) {
            boolean bl2 = this.e;
            return bl2;
        }
    }
}

