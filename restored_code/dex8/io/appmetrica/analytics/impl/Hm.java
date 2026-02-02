/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.impl.Am;
import io.appmetrica.analytics.impl.Bm;
import io.appmetrica.analytics.impl.C3;
import io.appmetrica.analytics.impl.Dm;
import io.appmetrica.analytics.impl.Em;
import io.appmetrica.analytics.impl.F3;
import io.appmetrica.analytics.impl.Fb;
import io.appmetrica.analytics.impl.Fm;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Gm;
import io.appmetrica.analytics.impl.H4;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Md;
import io.appmetrica.analytics.impl.Mm;
import io.appmetrica.analytics.impl.Nd;
import io.appmetrica.analytics.impl.Om;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.Qm;
import io.appmetrica.analytics.impl.Re;
import io.appmetrica.analytics.impl.Rm;
import io.appmetrica.analytics.impl.Te;
import io.appmetrica.analytics.impl.Xa;
import io.appmetrica.analytics.impl.ba;
import io.appmetrica.analytics.impl.bj;
import io.appmetrica.analytics.impl.da;
import io.appmetrica.analytics.impl.mm;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.v2;
import io.appmetrica.analytics.impl.wa;
import io.appmetrica.analytics.impl.xm;
import io.appmetrica.analytics.impl.y2;
import io.appmetrica.analytics.impl.yd;
import io.appmetrica.analytics.impl.ym;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class hm {
    public final Xa a;
    public final wa b;
    public final bj c;
    public final Te d;
    public final Rm e;
    public final y2 f;
    public final F3 g;
    public final v2 h;
    public final Hb i;
    public final Om j;
    public final Nd k;
    public final da l;

    public hm() {
        this(new Hb(), new Xa(), new wa(), new bj(), new Te(), new Rm(), new F3(), new y2(), new v2(), new Om(), new Nd(), new da());
    }

    public hm(Hb hb4, Xa xa2, wa wa4, bj bj3, Te te3, Rm rm3, F3 f34, y2 y23, v2 v23, Om om3, Nd nd3, da da3) {
        this.a = xa2;
        this.b = wa4;
        this.c = bj3;
        this.d = te3;
        this.e = rm3;
        this.g = f34;
        this.f = y23;
        this.h = v23;
        this.i = hb4;
        this.j = om3;
        this.k = nd3;
        this.l = da3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(mm mm3, Fb fb2) {
        Object object;
        Object object2;
        Object object3;
        block40: {
            JSONObject jSONObject;
            Object object4;
            block41: {
                JSONObject jSONObject2;
                object3 = fb2.optJSONObject("queries");
                if (object3 != null && (object3 = object3.optJSONObject("list")) != null && (object3 = object3.optJSONObject("host")) != null) {
                    mm3.g = object3.optString("url", null);
                }
                object3 = new JSONObject();
                try {
                    object3 = object2 = fb2.get("distribution_customization");
                }
                catch (Throwable throwable) {}
                if ((jSONObject2 = object3.optJSONObject("clids")) != null) {
                    object = new HashMap<String, String>();
                    object2 = jSONObject2.keys();
                    while (object2.hasNext()) {
                        object4 = (String)object2.next();
                        object3 = jSONObject2.optJSONObject((String)object4);
                        if (object3 == null || !object3.has("value")) continue;
                        ((HashMap)object).put(object4, object3.getString("value"));
                    }
                    mm3.j = Pm.a(object);
                }
                object3 = fb2.optJSONObject("locale");
                object2 = "";
                object3 = object3 != null && (object3 = object3.optJSONObject("country")) != null && object3.optBoolean("reliable", false) ? object3.optString("value", "") : "";
                mm3.m = object3;
                object3 = fb2.optJSONObject("time");
                if (object3 != null) {
                    try {
                        mm3.l = object3.getLong("max_valid_difference_seconds");
                    }
                    catch (Throwable throwable) {}
                }
                object3 = new Fm();
                JSONObject jSONObject3 = fb2.optJSONObject("stat_sending");
                if (jSONObject3 != null) {
                    ((Fm)object3).a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObject3, "disabled_reporting_interval_seconds", ((Fm)object3).a);
                }
                this.e.getClass();
                mm3.p = new Qm(((Fm)object3).a);
                this.b.getClass();
                object = new Bm();
                try {
                    object3 = new JSONObject();
                }
                catch (Throwable throwable) {}
                try {
                    Object object5;
                    object3 = object5 = fb2.get("features");
                }
                catch (Throwable throwable) {}
                object3 = object3.optJSONObject("list");
                if (object3 != null) {
                    H4 h43 = new H4();
                    h43.a = wa.a((JSONObject)object3, "permissions_collecting", ((Bm)object).a);
                    h43.b = wa.a((JSONObject)object3, "features_collecting", ((Bm)object).b);
                    h43.c = wa.a((JSONObject)object3, "google_aid", ((Bm)object).c);
                    h43.d = wa.a((JSONObject)object3, "sim_info", ((Bm)object).d);
                    h43.e = wa.a((JSONObject)object3, "huawei_oaid", ((Bm)object).e);
                    object3 = object3.has("ssl_pinning") ? Boolean.valueOf(object3.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                    h43.f = object3;
                    object3 = new J4(h43);
                    mm3.b = object3;
                }
                this.a.getClass();
                object3 = new JSONObject();
                try {
                    Object object6;
                    object3 = object6 = fb2.get("query_hosts");
                }
                catch (Throwable throwable) {}
                jSONObject = object3.optJSONObject("list");
                if (jSONObject == null) break block40;
                try {
                    object3 = jSONObject.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                }
                catch (Throwable throwable) {
                    object3 = "";
                }
                if (!TextUtils.isEmpty((CharSequence)object3)) {
                    mm3.d = object3;
                }
                if (ro.a((Collection)(object3 = Xa.a(jSONObject, "report")))) break block41;
                mm3.e = object3;
            }
            try {
                object3 = jSONObject.getJSONObject("report_ad").getJSONArray("urls").getString(0);
            }
            catch (Throwable throwable) {
                object3 = object2;
            }
            try {
                if (!TextUtils.isEmpty((CharSequence)object3)) {
                    mm3.f = object3;
                }
                if (!ro.a((Collection)(object3 = Xa.a(jSONObject, "startup")))) {
                    mm3.c = object3;
                }
                if (!ro.a((Collection)(object3 = Xa.a(jSONObject, "diagnostic")))) {
                    mm3.n = object3;
                }
                object4 = new HashMap();
                object2 = jSONObject.keys();
                while (object2.hasNext()) {
                    object3 = (String)object2.next();
                    if (Xa.a.contains(object3) || (object = Xa.a(jSONObject, (String)object3)) == null) continue;
                    ((HashMap)object4).put(object3, object);
                }
                mm3.o = object4;
            }
            catch (Throwable throwable) {}
        }
        this.c.getClass();
        object3 = new Gm();
        object2 = fb2.optJSONObject("retry_policy");
        int n10 = ((Gm)object3).w;
        int n13 = ((Gm)object3).x;
        int n14 = n10;
        if (object2 != null) {
            n14 = object2.optInt("max_interval_seconds", n10);
            n13 = object2.optInt("exponential_multiplier", ((Gm)object3).x);
        }
        mm3.q = new RetryPolicyConfig(n14, n13);
        this.d.getClass();
        if (mm3.b.a) {
            long l10;
            long l11;
            object2 = fb2.optJSONObject("permissions_collecting");
            object3 = new Dm();
            if (object2 != null) {
                l11 = object2.optLong("check_interval_seconds", ((Dm)object3).a);
                l10 = object2.optLong("force_send_interval_seconds", ((Dm)object3).b);
            } else {
                l11 = ((Dm)object3).a;
                l10 = ((Dm)object3).b;
            }
            mm3.k = new Re(l11, l10);
        }
        object2 = this.f.a;
        xm xm3 = new xm();
        object3 = fb2.optJSONObject("auto_inapp_collecting");
        if (object3 != null) {
            xm3.a = object3.optInt("send_frequency_seconds", xm3.a);
            xm3.b = object3.optInt("first_collecting_inapp_max_age_seconds", xm3.b);
        }
        object2.getClass();
        mm3.r = new BillingConfig(xm3.a, xm3.b);
        object3 = this.g;
        object3.getClass();
        object2 = new ym();
        JSONObject jSONObject = fb2.optJSONObject("cache_control");
        if (jSONObject != null) {
            ((ym)object2).a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObject, "last_known_location_ttl", ((ym)object2).a);
        }
        ((F3)object3).a.getClass();
        mm3.s = new C3(((ym)object2).a);
        this.h.getClass();
        v2.a(mm3, fb2);
        object3 = this.j;
        object3.getClass();
        JSONObject jSONObject4 = fb2.optJSONObject("startup_update");
        object2 = new Em();
        Integer n15 = Gb.a(jSONObject4, "interval_seconds", null);
        if (n15 != null) {
            ((Em)object2).a = n15;
        }
        ((Om)object3).a.getClass();
        mm3.u = new Mm(((Em)object2).a);
        Map<String, yd> map2 = this.k.a.c();
        object2 = new Md(fb2);
        object3 = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            object = ((Md)((Object)object2)).invoke(entry);
            if (object == null) continue;
            object3.put(entry.getKey(), object);
        }
        mm3.v = object3;
        object2 = this.l.a;
        object3 = new Am();
        if ((fb2 = fb2.optJSONObject("external_attribution")) != null) {
            ((Am)object3).a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(fb2, "collecting_interval_seconds", ((Am)object3).a);
        }
        object2.getClass();
        mm3.w = new ba(((Am)object3).a);
    }
}

