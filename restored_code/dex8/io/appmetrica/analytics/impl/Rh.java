/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.FeatureInfo
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.K9;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.oa;
import io.appmetrica.analytics.impl.pa;
import io.appmetrica.analytics.impl.qa;
import io.appmetrica.analytics.impl.qf;
import io.appmetrica.analytics.impl.ra;
import io.appmetrica.analytics.impl.v5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class rh
extends nh {
    public final SafePackageManager b;

    public rh(v5 v54) {
        this(v54, new SafePackageManager());
    }

    @VisibleForTesting
    public rh(v5 v54, @NonNull SafePackageManager safePackageManager) {
        super(v54);
        this.b = safePackageManager;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(@NonNull o6 object) {
        int n10;
        Object object2;
        Object object3;
        v5 v54 = this.a;
        if (!v54.t.c()) return false;
        if (!v54.y()) return false;
        qf qf3 = v54.c;
        Object object4 = this.a.c.e();
        if (!TextUtils.isEmpty((CharSequence)object4)) {
            try {
                object3 = new HashSet();
                object2 = new JSONArray((String)object4);
                n10 = 0;
                while (true) {
                    object4 = object3;
                    if (n10 < object2.length()) {
                        object4 = new ra(object2.getJSONObject(n10));
                        ((HashSet)object3).add(object4);
                        ++n10;
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable) {}
        }
        object4 = null;
        try {
            object3 = this.b();
            if (CollectionUtils.areCollectionsEqual((Collection<? extends Object>)object4, object3)) {
                object = v54.n;
                ((K9)object).m = n10 = ((K9)object).k;
                ((K9)object).a.a(n10).b();
                return false;
            }
            object4 = new JSONArray();
            object2 = ((ArrayList)object3).iterator();
            while (object2.hasNext()) {
                object3 = (ra)object2.next();
                object3.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject = jSONObject.put("name", (Object)((ra)object3).a).put("required", ((ra)object3).c);
                n10 = ((ra)object3).b;
                if (n10 != -1) {
                    jSONObject.put("version", n10);
                }
                object4.put((Object)jSONObject);
            }
            object3 = new JSONObject();
            object = o6.a((o6)object, object3.put("features", object4).toString());
            object3 = v54.n;
            ((K9)object3).a((o6)object, bl.a(((K9)object3).c.b((o6)object), ((o6)object).i));
            ((K9)object3).m = n10 = ((K9)object3).k;
            ((K9)object3).a.a(n10).b();
            qf3.i(object4.toString());
            return false;
        }
        // Removed invalid catch block
        }
    }

    public final ArrayList b() {
        ArrayList<ra> arrayList;
        block6: {
            int n10;
            arrayList = this.a;
            Object object = this.b;
            arrayList = ((v5)((Object)arrayList)).a;
            FeatureInfo[] featureInfoArray = ((SafePackageManager)object).getPackageInfo((Context)arrayList, arrayList.getPackageName(), 16384);
            arrayList = new ArrayList<ra>();
            object = AndroidUtils.isApiAchieved(24) ? new oa() : new pa();
            if (featureInfoArray == null) break block6;
            featureInfoArray = featureInfoArray.reqFeatures;
            if (featureInfoArray == null) break block6;
            try {
                n10 = featureInfoArray.length;
            }
            catch (Throwable throwable) {
                return null;
            }
            for (int i14 = 0; i14 < n10; ++i14) {
                arrayList.add(((qa)object).a(featureInfoArray[i14]));
                continue;
            }
        }
        return arrayList;
    }
}

