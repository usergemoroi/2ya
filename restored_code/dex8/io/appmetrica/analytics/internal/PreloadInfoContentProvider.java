/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.UriMatcher
 *  android.database.Cursor
 *  android.net.Uri
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Af;
import io.appmetrica.analytics.impl.Bf;
import io.appmetrica.analytics.impl.Bj;
import io.appmetrica.analytics.impl.Ea;
import io.appmetrica.analytics.impl.O3;
import io.appmetrica.analytics.impl.P3;
import io.appmetrica.analytics.impl.Z5;
import io.appmetrica.analytics.impl.a6;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseImportantLogger;
import java.util.concurrent.CountDownLatch;

public class PreloadInfoContentProvider
extends ContentProvider {
    private boolean a = false;
    private final UriMatcher b = new UriMatcher(-1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(a6 object, ContentValues object2) {
        Throwable throwable2;
        Object object3;
        block3: {
            object3 = this.getContext();
            object3 = object3 == null ? null : object3.getApplicationContext();
            if (object3 == null) return;
            try {
                object2 = ((a6)object).a.invoke(object2);
                if (object2 == null) return;
                ((a6)object).c.b((Context)object3);
                if (((Boolean)((a6)object).b.invoke(object2)).booleanValue()) {
                    object2 = new StringBuilder("Successfully saved ");
                    ((StringBuilder)object2).append(((a6)object).d);
                    Bj.a(((StringBuilder)object2).toString(), new Object[0]);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object2 = new StringBuilder("Did not save ");
            ((StringBuilder)object2).append(((a6)object).d);
            ((StringBuilder)object2).append(" because data is already present");
            Bj.a(((StringBuilder)object2).toString(), new Object[0]);
            return;
        }
        object3 = ImportantLogger.INSTANCE;
        object = new StringBuilder();
        ((StringBuilder)object).append(String.format("Unexpected error occurred", new Object[0]));
        ((StringBuilder)object).append("\n");
        ((StringBuilder)object).append(StringUtils.throwableToString(throwable2));
        ((BaseImportantLogger)object3).info("AppMetrica-Attribution", ((StringBuilder)object).toString(), new Object[0]);
    }

    public int delete(@NonNull Uri uri, @Nullable String string2, @Nullable String[] stringArray) {
        Bj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public void disable() {
        synchronized (this) {
            this.a = true;
            return;
        }
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Nullable
    public Uri insert(@NonNull Uri object, @Nullable ContentValues contentValues) {
        // MONITORENTER : this
        if (this.a) {
            // MONITOREXIT : this
            return null;
        }
        if (contentValues != null) {
            int n10 = this.b.match((Uri)object);
            if (n10 != 1) {
                if (n10 != 2) {
                    Bj.a("Bad content provider uri.", new Object[0]);
                } else {
                    this.a(new a6(new O3(), new P3(), Ea.d, "clids"), contentValues);
                }
            } else {
                this.a(new a6(new Af(), new Bf(), Ea.d, "preload info"), contentValues);
            }
        }
        if ((object = Z5.a) == null) return null;
        ((CountDownLatch)object).countDown();
        return null;
    }

    public boolean onCreate() {
        Object object = this.getContext();
        object = object == null ? null : object.getApplicationContext();
        object = object != null ? object.getPackageName() : "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(".appmetrica.preloadinfo.retail");
        object = stringBuilder.toString();
        this.b.addURI((String)object, "preloadinfo", 1);
        this.b.addURI((String)object, "clids", 2);
        Z5.a = new CountDownLatch(1);
        Z5.b = this;
        return true;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] stringArray, @Nullable String string2, @Nullable String[] stringArray2, @Nullable String string3) {
        Bj.a("Query is not supported", new Object[0]);
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String string2, @Nullable String[] stringArray) {
        Bj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}

