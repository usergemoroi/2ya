/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Fb;
import io.appmetrica.analytics.impl.hm;
import io.appmetrica.analytics.impl.mm;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.u3;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.List;
import java.util.Map;

public final class am
implements NetworkResponseHandler {
    public final hm a;
    public final u3 b;

    public am() {
        this(new hm(), new u3());
    }

    public am(hm hm3, u3 u33) {
        this.a = hm3;
        this.b = u33;
    }

    @Nullable
    public final mm a(@NonNull ResponseDataHolder object) {
        block10: {
            int n10;
            hm hm3;
            List<String> list;
            Map<String, List<String>> map2;
            Object object2;
            block9: {
                block8: {
                    if (200 != ((ResponseDataHolder)object).getResponseCode()) break block10;
                    object2 = ((ResponseDataHolder)object).getResponseData();
                    map2 = ((ResponseDataHolder)object).getResponseHeaders();
                    list = map2 != null ? CollectionUtils.getFromMapIgnoreCase(map2, "Content-Encoding") : null;
                    map2 = (Map<String, List<String>>)object2;
                    if (!ro.a(list)) {
                        map2 = (Map<String, List<String>>)object2;
                        if ("encrypted".equals(list.get(0))) {
                            map2 = (Map<String, List<String>>)this.b.a(((ResponseDataHolder)object).getResponseData());
                        }
                    }
                    if (map2 == null) break block10;
                    hm3 = this.a;
                    hm3.getClass();
                    list = new mm();
                    n10 = 1;
                    hm3.i.getClass();
                    object2 = (Object)new Fb;
                    object = new String((byte[])map2, "UTF-8");
                    object2((String)object);
                    object = object2.optJSONObject("device_id");
                    if (object == null) break block8;
                    map2 = object.optString("hash");
                    object = object.optString("value");
                    break block9;
                }
                map2 = "";
                object = "";
            }
            try {
                ((mm)((Object)list)).h = object;
                ((mm)((Object)list)).i = map2;
                hm3.a((mm)((Object)list), (Fb)((Object)object2));
            }
            catch (Throwable throwable) {
                object = new mm();
                ((mm)object).a = 1;
            }
            if (!TextUtils.isEmpty((CharSequence)((mm)((Object)list)).i)) {
                n10 = 2;
            }
            ((mm)((Object)list)).a = n10;
            object = list;
            if (2 == ((mm)object).a) {
                return object;
            }
        }
        return null;
    }
}

