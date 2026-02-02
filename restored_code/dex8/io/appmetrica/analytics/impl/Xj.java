/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.impl.k;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.impl.wj;
import io.appmetrica.analytics.impl.y7;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xj
implements k {
    public pf a;
    public ScreenInfo b;
    public boolean c;
    public boolean d;
    public final wj e = new wj();
    public WeakReference f = new WeakReference<Object>(null);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    @Nullable
    public final ScreenInfo a(@NotNull Context object) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                pf pf3;
                block7: {
                    block8: {
                        try {
                            if (this.d) break block7;
                            if (this.a != null) break block8;
                            this.a = pf3 = new pf(y7.a((Context)object).a());
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    pf3 = this.a;
                    y.g(pf3);
                    this.b = pf3.p();
                    if (this.a == null) {
                        this.a = pf3 = new pf(y7.a((Context)object).a());
                    }
                    pf3 = this.a;
                    y.g(pf3);
                    this.c = pf3.t();
                    this.d = true;
                }
                this.b((Context)this.f.get());
                if (this.b != null) return this.b;
                if (AndroidUtils.isApiAchieved(30)) {
                    if (this.c) return this.b;
                    this.b((Context)object);
                    this.c = true;
                    if (this.a == null) {
                        this.a = pf3 = new pf(y7.a((Context)object).a());
                    }
                    object = this.a;
                    y.g(object);
                    ((pf)object).v();
                    return this.b;
                } else {
                    this.b((Context)object);
                }
                return this.b;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    public final void a(@NotNull Activity activity) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block5: {
                    Object object;
                    block6: {
                        try {
                            object = new WeakReference(activity);
                            this.f = object;
                            if (this.d) break block5;
                            if (this.a != null) break block6;
                            this.a = object = new pf(y7.a((Context)activity).a());
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object = this.a;
                    y.g(object);
                    this.b = ((pf)object).p();
                    if (this.a == null) {
                        this.a = object = new pf(y7.a((Context)activity).a());
                    }
                    object = this.a;
                    y.g(object);
                    this.c = ((pf)object).t();
                    this.d = true;
                }
                if (this.b == null) {
                    this.b((Context)activity);
                }
                return;
            }
            throw throwable2;
        }
    }

    @VisibleForTesting
    public final void a(@NotNull pf pf3) {
        this.a = pf3;
    }

    public final void b(Context object) {
        if (object != null) {
            this.e.getClass();
            ScreenInfo screenInfo = wj.a((Context)object);
            if (screenInfo != null && !y.e(screenInfo, this.b)) {
                this.b = screenInfo;
                if (this.a == null) {
                    this.a = new pf(y7.a((Context)object).a());
                }
                object = this.a;
                y.g(object);
                ((pf)object).a(this.b);
            }
        }
    }
}

