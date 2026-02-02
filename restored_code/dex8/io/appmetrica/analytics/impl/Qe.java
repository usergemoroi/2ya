/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.impl.N5;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Qh;
import io.appmetrica.analytics.impl.Yb;
import io.appmetrica.analytics.impl.oe;
import io.appmetrica.analytics.impl.qo;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.vh;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;
import kotlin.collections.t;

public final class qe {
    public static final qe a = new qe();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final String c = UserAgent.getFor("io.appmetrica.analytics", "7.12.0", "50139596");

    public static final NetworkTask a(v5 v54) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        vh vh3 = new vh(aESRSARequestBodyEncrypter);
        Yb yb3 = new Yb(v54);
        return new NetworkTask(new BlockingExecutor(), new N5(v54.a), new AllHostsExponentialBackoffPolicy(a.a(oe.a)), new Qh(v54, vh3, yb3, new FullUrlFormer(vh3, yb3), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), v54.i(), v54.p(), v54.u(), aESRSARequestBodyEncrypter), t.e((Object)new qo()), c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ExponentialBackoffDataHolder a(oe object) {
        synchronized (this) {
            try {
                Object object2;
                LinkedHashMap linkedHashMap = b;
                Object object3 = object2 = linkedHashMap.get(object);
                if (object2 != null) return (ExponentialBackoffDataHolder)object3;
                object2 = new Object(Na.F.x(), (oe)((Object)object));
                object3 = new Object((HostRetryInfoProvider)object2, ((Enum)object).name());
                linkedHashMap.put(object, object3);
                return (ExponentialBackoffDataHolder)object3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

