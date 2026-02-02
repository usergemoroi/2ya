/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.text.TextUtils
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.X1;
import io.appmetrica.analytics.impl.Y1;
import io.appmetrica.analytics.impl.Y7;
import io.appmetrica.analytics.impl.Z1;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.impl.ve;
import java.util.ArrayList;

public final class a2
implements ActivityLifecycleListener {
    public final ArrayList a = new ArrayList();
    public volatile Y7 b = null;

    public final ArrayList a() {
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NonNull Y7 y74) {
        Object object;
        synchronized (this) {
            this.b = y74;
            object = this.a();
        }
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            ((ve)object.next()).consume(y74);
        }
        return;
    }

    public final void b() {
        A4.l().e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        A4.l().e.unregisterListener(this, ActivityEvent.CREATED);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @MainThread
    public final void onEvent(@NonNull Activity object, @NonNull ActivityEvent object2) {
        object = (object = (Intent)SystemServiceUtils.accessSystemServiceSafely(object, "getting intent", "activity", new Y1())) == null ? null : object.getDataString();
        if (TextUtils.isEmpty((CharSequence)object)) return;
        Z1 z13 = new Z1((String)object);
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            object2 = this.b;
                            if (object2 != null) break block3;
                            this.a.add(z13);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = A4.l().c.a();
                    X1 x14 = new X1(z13, (Y7)object2);
                    ((Z9)object).b.post((Runnable)x14);
                }
                return;
            }
            throw throwable2;
        }
    }
}

