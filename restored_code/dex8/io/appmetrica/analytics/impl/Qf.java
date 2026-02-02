/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Ho;
import io.appmetrica.analytics.impl.Td;
import io.appmetrica.analytics.impl.h0;
import io.appmetrica.analytics.impl.hb;
import io.appmetrica.analytics.impl.sf;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class qf
extends Td
implements Ho {
    public static final long d = 0L;
    public static final int e = -1;
    public static final String f = "";
    public static final String g = "";
    public static final sf h = new sf("PERMISSIONS_CHECK_TIME", null);
    public static final sf i = new sf("PROFILE_ID", null);
    public static final sf j = new sf("APP_ENVIRONMENT", null);
    public static final sf k = new sf("APP_ENVIRONMENT_REVISION", null);
    public static final sf l = new sf("LAST_APP_VERSION_WITH_FEATURES", null);
    public static final sf m = new sf("APPLICATION_FEATURES", null);
    public static final sf n = new sf("CERTIFICATES_SHA1_FINGERPRINTS", null);
    public static final sf o = new sf("VITAL_DATA", null);
    public static final sf p = new sf("SENT_EXTERNAL_ATTRIBUTIONS", null);
    public static final sf q = new sf("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);
    public static final String r = "SESSION_";
    public static final sf s = new sf("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public qf(hb hb4) {
        super(hb4);
    }

    public final qf a(int n10) {
        return (qf)this.b(qf.l.b, n10);
    }

    public final qf a(long l10) {
        return (qf)this.b(qf.h.b, l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final qf a(h0 h03) {
        synchronized (this) {
            this.b(qf.j.b, h03.a);
            this.b(qf.k.b, h03.b);
            return this;
        }
    }

    public final qf a(List<String> list) {
        return (qf)this.a(qf.n.b, list);
    }

    @Override
    @Nullable
    public final String a() {
        String string2 = qf.o.b;
        return this.a.getString(string2, null);
    }

    @Override
    public final void a(@NonNull String string2) {
        this.b(qf.o.b, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NonNull Map<String, Long> object) {
        JSONObject jSONObject = new JSONObject();
        object = object.entrySet().iterator();
        while (true) {
            if (!object.hasNext()) {
                this.b(qf.q.b, jSONObject.toString());
                return;
            }
            Map.Entry entry = object.next();
            try {
                jSONObject.put((String)entry.getKey(), entry.getValue());
            }
            catch (Throwable throwable) {
            }
        }
    }

    public final boolean a(boolean bl2) {
        String string2 = qf.s.b;
        return this.a.getBoolean(string2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(@NonNull Map<Integer, String> object) {
        JSONObject jSONObject = new JSONObject();
        object = object.entrySet().iterator();
        while (true) {
            if (!object.hasNext()) {
                this.b(qf.p.b, jSONObject.toString());
                return;
            }
            Map.Entry entry = object.next();
            try {
                jSONObject.put(((Integer)entry.getKey()).toString(), entry.getValue());
            }
            catch (Throwable throwable) {
            }
        }
    }

    public final void b(boolean bl2) {
        this.b(qf.s.b, bl2);
    }

    @Override
    @NonNull
    public final Set<String> c() {
        return this.a.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h0 d() {
        synchronized (this) {
            String string2 = qf.j.b;
            String string3 = this.a.getString(string2, "{}");
            string2 = qf.k.b;
            return new h0(string3, this.a.getLong(string2, 0L));
        }
    }

    public final qf e(String string2, String string3) {
        return (qf)this.b(new sf((String)r, (String)string2).b, string3);
    }

    public final String e() {
        String string2 = qf.m.b;
        return this.a.getString(string2, "");
    }

    @Override
    @NonNull
    public final String f(@NonNull String string2) {
        return new sf((String)string2, null).b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Map<String, Long> f() {
        HashMap<String, Long> hashMap = new HashMap<String, Long>();
        try {
            String string2 = qf.q.b;
            Object object = this.a.getString(string2, null);
            if (!TextUtils.isEmpty((CharSequence)object)) {
                string2 = new JSONObject((String)object);
                object = string2.keys();
                while (object.hasNext()) {
                    String string3 = (String)object.next();
                    hashMap.put(string3, string2.getLong(string3));
                }
            }
            return hashMap;
        }
        catch (Throwable throwable) {
            return hashMap;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public final List<String> g() {
        void var2_10;
        void var2_5;
        String[] stringArray = qf.n.b;
        List<String> list = Collections.emptyList();
        Object var5_12 = null;
        if (list == null) {
            Object var2_3 = null;
        } else {
            String[] stringArray2 = list.toArray(new String[list.size()]);
        }
        String string2 = this.a.getString((String)stringArray, null);
        String[] stringArray3 = var2_5;
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            stringArray = var2_5;
            try {
                stringArray = var2_5;
                JSONArray jSONArray = new JSONArray(string2);
                stringArray = var2_5;
                String[] stringArray4 = new String[jSONArray.length()];
                int n10 = 0;
                while (true) {
                    stringArray3 = stringArray4;
                    stringArray = stringArray4;
                    if (n10 < jSONArray.length()) {
                        stringArray = stringArray4;
                        stringArray4[n10] = jSONArray.optString(n10);
                        ++n10;
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable) {
                stringArray3 = stringArray;
            }
        }
        if (stringArray3 == null) {
            Object var2_8 = var5_12;
            return var2_10;
        }
        List list2 = Arrays.asList(stringArray3);
        return var2_10;
    }

    public final int h() {
        String string2 = qf.l.b;
        return this.a.getInt(string2, -1);
    }

    public final String h(String string2) {
        string2 = new sf((String)r, (String)string2).b;
        return this.a.getString(string2, "");
    }

    public final long i() {
        String string2 = qf.h.b;
        return this.a.getLong(string2, 0L);
    }

    public final qf i(String string2) {
        return (qf)this.b(qf.m.b, string2);
    }

    public final qf j(@Nullable String string2) {
        return (qf)this.b(qf.i.b, string2);
    }

    @Nullable
    public final String j() {
        String string2 = qf.i.b;
        return this.a.getString(string2, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public final Map<Integer, String> k() {
        HashMap<Integer, String> hashMap;
        block5: {
            hashMap = new HashMap<Integer, String>();
            String string2 = qf.p.b;
            String string3 = this.a.getString(string2, null);
            if (string3 == null) break block5;
            try {
                string2 = new JSONObject(string3);
                Iterator iterator = string2.keys();
                while (iterator.hasNext()) {
                    string3 = (String)iterator.next();
                    hashMap.put(Integer.parseInt(string3), string2.getString(string3));
                }
            }
            catch (Throwable throwable) {
                return hashMap;
            }
        }
        return hashMap;
    }
}

