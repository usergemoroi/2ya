/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.text.p
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Pn;
import io.appmetrica.analytics.impl.T;
import io.appmetrica.analytics.impl.cj;
import io.appmetrica.analytics.impl.i2;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.y;
import kotlin.text.d;
import kotlin.text.p;

public final class k8 {
    public final T a;
    public final i2 b;

    public k8() {
        this(Na.j().b(), Na.j().c());
    }

    public k8(T t13, i2 i23) {
        this.a = t13;
        this.b = i23;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a() {
        Object object = this.a;
        Object object2 = new Pn(5, 500);
        synchronized (object) {
            try {
                object2 = ((T)object).a((cj)object2, true);
                try {
                    ((FutureTask)object2).get();
                }
                catch (InterruptedException | ExecutionException exception) {}
            }
            catch (Throwable throwable) {}
            throw throwable;
            object2 = ((T)object).k;
        }
        object = ((AdvertisingIdsHolder)object2).getYandex();
        if (((AdTrackingInfoResult)object).isValid()) {
            object = ((AdTrackingInfoResult)object).mAdTrackingInfo;
            y.g(object);
            object = ((AdTrackingInfo)object).advId;
            y.g(object);
            object = ((String)object).getBytes(d.b);
            try {
                object = MessageDigest.getInstance("MD5").digest((byte[])object);
                return StringUtils.toHexString((byte[])object);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                object = new byte[0];
            }
            return StringUtils.toHexString((byte[])object);
        }
        object = this.b.getAppSetId().getId();
        if (object == null) return p.I((String)UUID.randomUUID().toString(), (String)"-", (String)"", (boolean)false, (int)4, null).toLowerCase(Locale.US);
        if (((String)object).length() == 0) return p.I((String)UUID.randomUUID().toString(), (String)"-", (String)"", (boolean)false, (int)4, null).toLowerCase(Locale.US);
        try {
            UUID.fromString((String)object);
        }
        catch (Throwable throwable) {
            return p.I((String)UUID.randomUUID().toString(), (String)"-", (String)"", (boolean)false, (int)4, null).toLowerCase(Locale.US);
        }
        if (y.e(object, "00000000-0000-0000-0000-000000000000")) return p.I((String)UUID.randomUUID().toString(), (String)"-", (String)"", (boolean)false, (int)4, null).toLowerCase(Locale.US);
        return p.I((String)object, (String)"-", (String)"", (boolean)false, (int)4, null);
    }
}

