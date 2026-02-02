/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.SparseArray
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.t30
 *  com.yandex.mobile.ads.impl.u30
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.v30
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.SparseArray;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.gm1;
import com.yandex.mobile.ads.impl.hm;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.t30;
import com.yandex.mobile.ads.impl.u30;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.v30;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class iz
implements v30 {
    private static final SparseArray<Constructor<? extends u30>> c;
    private final hm.a a;
    private final Executor b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, iz.a(Class.forName("com.monetization.ads.exo.source.dash.offline.DashDownloader")));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            sparseArray.put(2, iz.a(Class.forName("com.monetization.ads.exo.source.hls.offline.HlsDownloader")));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            sparseArray.put(1, iz.a(Class.forName("com.monetization.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        }
        catch (ClassNotFoundException classNotFoundException) {}
        c = sparseArray;
    }

    public iz(hm.a a13, ExecutorService executorService) {
        this.a = (hm.a)uf.a((Object)a13);
        this.b = (Executor)uf.a((Object)executorService);
    }

    private static Constructor<? extends u30> a(Class<?> genericDeclaration) {
        try {
            genericDeclaration = genericDeclaration.asSubclass(u30.class).getConstructor(ew0.class, hm.a.class, Executor.class);
            return genericDeclaration;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new IllegalStateException("Downloader constructor missing", noSuchMethodException);
        }
    }

    public final u30 a(t30 object) {
        int n10 = m92.a((Uri)object.c, (String)object.d);
        if (n10 != 0 && n10 != 1 && n10 != 2) {
            if (n10 == 4) {
                return new gm1(new /* Unavailable Anonymous Inner Class!! */.a(object.c).a(object.g).a(), this.a, this.b);
            }
            throw new IllegalArgumentException(fe.a((String)"Unsupported type: ", (int)n10));
        }
        Constructor constructor = (Constructor)c.get(n10);
        if (constructor != null) {
            object = new /* Unavailable Anonymous Inner Class!! */.a(object.c).a(object.e).a(object.g).a();
            try {
                object = (u30)constructor.newInstance(object, this.a, this.b);
                return object;
            }
            catch (Exception exception) {
                throw new IllegalStateException(fe.a((String)"Failed to instantiate downloader for content type ", (int)n10));
            }
        }
        throw new IllegalStateException(fe.a((String)"Module missing for content type ", (int)n10));
    }
}

