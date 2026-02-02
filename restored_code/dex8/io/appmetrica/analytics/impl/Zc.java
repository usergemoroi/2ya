/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.impl.X6;
import io.appmetrica.analytics.impl.qn;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.x7;
import io.appmetrica.analytics.impl.ya;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class zc
implements X6 {
    public final Context a;
    public final String b;
    public final qn c;
    public final ya d;
    public x7 e;

    public zc(Context context, String string2, @NonNull qn qn3) {
        this(context, string2, new ya(string2), qn3);
    }

    @VisibleForTesting
    public zc(@NonNull Context context, @NonNull String string2, @NonNull ya ya2, @NonNull qn qn3) {
        this.a = context;
        this.b = string2;
        this.d = ya2;
        this.c = qn3;
    }

    @Override
    @Nullable
    @WorkerThread
    public final SQLiteDatabase a() {
        synchronized (this) {
            try {
                x7 x74;
                this.d.a();
                this.e = x74 = new x7(this.a, this.b, this.c, PublicLogger.getAnonymousInstance());
                x74 = x74.getWritableDatabase();
                return x74;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @WorkerThread
    public final void a(@Nullable SQLiteDatabase sQLiteDatabase) {
        synchronized (this) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.close();
                }
                catch (Throwable throwable) {}
            }
            ro.a(this.e);
            this.d.b();
            this.e = null;
            return;
        }
    }
}

