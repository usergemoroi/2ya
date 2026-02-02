/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.k9;
import io.appmetrica.analytics.impl.m9;
import io.appmetrica.analytics.impl.n9;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.p9;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.s2;
import io.appmetrica.analytics.impl.t2;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;
import org.json.JSONObject;

public final class kh
extends nh {
    public kh(v5 v54) {
        super(v54);
    }

    public static boolean a(String string2, String string3, t2 object) {
        if ("reattribution".equals(string2) && "1".equals(string3)) {
            return true;
        }
        if (object != null) {
            for (Object object2 : ((t2)object).a) {
                if (!ro.a(object2.first, string2) || (object2 = object2.second) != null && !((s2)object2).a.equals(string3)) continue;
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(@NonNull o6 o63) {
        Object object = o63.getValue();
        if (TextUtils.isEmpty((CharSequence)object)) return false;
        try {
            JSONObject jSONObject = new JSONObject((String)object);
            if (!"open".equals(jSONObject.optString("type"))) return false;
            object = this.a.t;
            synchronized (object) {
                ((Do)object).c(((Do)object).b() + 1);
            }
            if (!this.a(jSONObject.optString("link"))) return false;
            o63.n = Boolean.TRUE;
            this.b();
        }
        finally {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(String object) {
        if (TextUtils.isEmpty((CharSequence)object)) return false;
        try {
            String[] stringArray = Uri.parse((String)object).getQueryParameter("referrer");
            if (TextUtils.isEmpty((CharSequence)stringArray)) return false;
            object = this.a.t().z;
            stringArray = Uri.decode((String)stringArray).split("&");
            int n10 = stringArray.length;
            int i14 = 0;
            while (i14 < n10) {
                boolean bl2;
                String string2 = Uri.decode((String)stringArray[i14]);
                int n13 = string2.indexOf("=");
                if (n13 >= 0 && (bl2 = kh.a(Uri.decode((String)string2.substring(0, n13)), Uri.decode((String)string2.substring(n13 + 1)), (t2)object))) {
                    return true;
                }
                ++i14;
            }
            return false;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object2 = this.a.t;
        synchronized (object2) {
            ((Do)object2).a(((Do)object2).a() + 1);
        }
        this.a.z();
        object2 = this.a.l;
        if (((k9)object2).c == null) {
            ((k9)object2).a();
        }
        Object object = ((k9)object2).c;
        object.getClass();
        ((m9)object).b = new HashSet();
        ((m9)object).d = 0;
        object = ((k9)object2).c;
        ((m9)object).a = true;
        p9 p92 = ((k9)object2).b;
        IBinaryDataHelper iBinaryDataHelper = p92.c;
        object2 = p92.b;
        p92.a.getClass();
        object = n9.a((m9)object);
        object2.getClass();
        iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray((MessageNano)object));
    }
}

