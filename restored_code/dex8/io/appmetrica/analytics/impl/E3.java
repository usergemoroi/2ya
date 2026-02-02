/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.Bk;
import io.appmetrica.analytics.impl.I2;
import io.appmetrica.analytics.impl.d3;
import io.appmetrica.analytics.impl.e6;
import io.appmetrica.analytics.impl.f6;
import java.util.ArrayList;
import java.util.Iterator;

public final class e3
implements Bk {
    public final ArrayList a = new ArrayList();
    public Intent b = null;
    public final Context c;
    public final f6 d;

    public e3(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    public e3(Context context, ICommonExecutor iCommonExecutor, int n10) {
        this.c = context;
        this.d = e6.a(new I2(new d3(this), iCommonExecutor));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Intent a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        f6 f62 = this.d;
        Context context = this.c;
        synchronized (f62) {
            try {
                intentFilter = context.registerReceiver(f62.a, intentFilter);
            }
            catch (Throwable throwable) {
                return null;
            }
            try {}
            catch (Throwable throwable) {
            }
            f62.b = true;
            return intentFilter;
        }
    }

    @Nullable
    public final Intent a(@NonNull Consumer<Intent> intent) {
        synchronized (this) {
            this.a.add(intent);
            intent = this.b;
            return intent;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        this.b = null;
        f6 f62 = this.d;
        Context context = this.c;
        synchronized (f62) {
            boolean bl2 = f62.b;
            if (bl2) {
                try {
                    context.unregisterReceiver(f62.a);
                    f62.b = false;
                }
                catch (Throwable throwable) {}
            }
            return;
        }
    }

    @Override
    public final void onCreate() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    Intent intent;
                    this.b = intent = this.a();
                    Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        ((Consumer)iterator.next()).consume(intent);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public final void onDestroy() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    this.b = null;
                    this.b();
                    Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        ((Consumer)iterator.next()).consume(null);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }
}

