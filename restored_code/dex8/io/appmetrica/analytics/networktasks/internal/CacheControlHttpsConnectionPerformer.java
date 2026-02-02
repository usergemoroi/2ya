/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.a;
import javax.net.ssl.SSLSocketFactory;

public class CacheControlHttpsConnectionPerformer {
    private final a a;
    private final SSLSocketFactory b;

    CacheControlHttpsConnectionPerformer(a a14, SSLSocketFactory sSLSocketFactory) {
        this.a = a14;
        this.b = sSLSocketFactory;
    }

    public CacheControlHttpsConnectionPerformer(@Nullable SSLSocketFactory sSLSocketFactory) {
        this(new a(), sSLSocketFactory);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void performConnection(@NonNull String list, @NonNull Client client) {
        block9: {
            try {
                Object object;
                block11: {
                    block10: {
                        Object object2 = this.a;
                        String string2 = client.getOldETag();
                        object = this.b;
                        object2.getClass();
                        object = io.appmetrica.analytics.networktasks.impl.a.a(string2, list, (SSLSocketFactory)object);
                        int n10 = ((Response)object).getCode();
                        if (n10 != 200) {
                            if (n10 == 304) {
                                client.onNotModified();
                                return;
                            }
                            break block9;
                        }
                        list = CollectionUtils.getFromMapIgnoreCase(((Response)object).getHeaders(), "ETag");
                        if (list == null || list.size() <= 0) break block10;
                        list = object2 = (String)list.get(0);
                        if (object2 != null) break block11;
                    }
                    list = "";
                }
                client.onResponse((String)((Object)list), ((Response)object).getResponseData());
                return;
            }
        // Removed invalid catch block
        client.onError();
    }

    public static interface Client {
        @Nullable
        public String getOldETag();

        public void onError();

        public void onNotModified();

        public void onResponse(@NonNull String var1, @NonNull byte[] var2);
    }
}

