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
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Td;
import io.appmetrica.analytics.impl.hb;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.sf;
import io.appmetrica.analytics.impl.va;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class pf
extends Td {
    public static final sf d = new sf("UUID_RESULT", null);
    public static final sf e = new sf("DEVICE_ID_RESULT", null);
    public static final sf f = new sf("DEVICE_ID_HASH_RESULT", null);
    public static final sf g = new sf("AD_URL_GET_RESULT", null);
    public static final sf h = new sf("AD_URL_REPORT_RESULT", null);
    public static final sf i = new sf("CUSTOM_HOSTS", null);
    public static final sf j = new sf("SERVER_TIME_OFFSET", null);
    public static final sf k = new sf("RESPONSE_CLIDS_RESULT", null);
    public static final sf l = new sf("CUSTOM_SDK_HOSTS", null);
    public static final sf m = new sf("CLIENT_CLIDS", null);
    public static final sf n = new sf("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final sf o = new sf("API_LEVEL", null);
    public static final sf p = new sf("NEXT_STARTUP_TIME", null);
    public static final sf q = new sf("GAID", null);
    public static final sf r = new sf("HOAID", null);
    public static final sf s = new sf("YANDEX_ADV_ID", null);
    public static final sf t = new sf("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
    public static final sf u = new sf("SCREEN_INFO", null);
    public static final sf v = new sf("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
    public static final sf w = new sf("FEATURES", null);
    public static final sf x = new sf("APPMETRICA_CLIENT_CONFIG", null);

    public pf(hb hb4) {
        super(hb4);
    }

    public final long a(long l10) {
        String string2 = pf.o.b;
        return this.a.getLong(string2, l10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public final pf a(@NonNull va va4) {
        String string2 = pf.w.b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", (Object)va4.a).put("STATUS", (Object)va4.b.getValue()).putOpt("ERROR_EXPLANATION", (Object)va4.c);
        }
        catch (Throwable throwable) {
            return (pf)this.b(string2, jSONObject.toString());
        }
        return (pf)this.b(string2, jSONObject.toString());
    }

    @NonNull
    public final pf a(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.g.b, identifiersResult);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final pf a(String string2, IdentifiersResult object) {
        if (object != null) {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject();
            }
            catch (Throwable throwable) {}
            try {
                jSONObject.put("ID", (Object)((IdentifiersResult)object).id).put("STATUS", (Object)((IdentifiersResult)object).status.getValue()).put("ERROR_EXPLANATION", (Object)((IdentifiersResult)object).errorExplanation);
            }
            catch (Throwable throwable) {}
            object = jSONObject.toString();
        }
        object = null;
        if (object != null) {
            this.b(string2, (String)object);
        }
        return this;
    }

    public final pf a(List<String> object) {
        object = ro.a(object) ? null : new JSONArray(object).toString();
        return (pf)this.b(pf.i.b, (String)object);
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        this.b(pf.x.b, appMetricaConfig.toJson());
    }

    public final void a(@Nullable ScreenInfo screenInfo) {
        this.b(pf.u.b, Gb.a(screenInfo));
    }

    public final boolean a(boolean bl2) {
        String string2 = pf.t.b;
        return this.a.getBoolean(string2, bl2);
    }

    public final long b(long l10) {
        String string2 = pf.j.a;
        return this.a.getLong(string2, l10);
    }

    @NonNull
    public final pf b(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.h.b, identifiersResult);
    }

    public final pf b(boolean bl2) {
        return (pf)this.b(pf.t.b, bl2);
    }

    public final pf c(long l10) {
        return (pf)this.b(pf.o.b, l10);
    }

    @NonNull
    public final pf c(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.l.b, identifiersResult);
    }

    @NonNull
    public final pf d(long l10) {
        return (pf)this.b(pf.p.b, l10);
    }

    @NonNull
    public final pf d(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.f.b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return this.h(pf.g.b);
    }

    public final pf e(long l10) {
        return (pf)this.b(pf.j.b, l10);
    }

    @NonNull
    public final pf e(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.e.b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult e() {
        return this.h(pf.h.b);
    }

    @Nullable
    public final AppMetricaConfig f() {
        String string2 = pf.x.b;
        hb hb4 = this.a;
        AppMetricaConfig appMetricaConfig = null;
        if ((string2 = hb4.getString(string2, null)) != null) {
            appMetricaConfig = AppMetricaConfig.fromJson(string2);
        }
        return appMetricaConfig;
    }

    @NonNull
    public final pf f(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.q.b, identifiersResult);
    }

    @Override
    @NonNull
    public final String f(@NonNull String string2) {
        return new sf((String)string2, null).b;
    }

    @NonNull
    public final pf g(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.r.b, identifiersResult);
    }

    public final List<String> g() {
        String string2 = pf.i.b;
        hb hb4 = this.a;
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty((CharSequence)(string2 = hb4.getString(string2, null)))) {
            arrayList = Gb.b(string2);
        }
        return arrayList;
    }

    @NonNull
    public final pf h(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.k.b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return this.h(pf.l.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IdentifiersResult h(String object) {
        Object object2;
        block2: {
            try {
                object = this.a.getString((String)object, null);
                if (object == null) break block2;
                object2 = new JSONObject((String)object);
                object = new IdentifiersResult(JsonUtils.optStringOrNull((JSONObject)object2, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull((JSONObject)object2, "STATUS")), JsonUtils.optStringOrNull((JSONObject)object2, "ERROR_EXPLANATION"));
            }
            catch (Throwable throwable) {}
        }
        object = null;
        object2 = object;
        if (object != null) return object2;
        return new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences");
    }

    @NonNull
    public final pf i(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.d.b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult i() {
        return this.h(pf.f.b);
    }

    @Nullable
    public final String i(@Nullable String string2) {
        String string3 = pf.m.b;
        return this.a.getString(string3, string2);
    }

    @NonNull
    public final pf j(@Nullable IdentifiersResult identifiersResult) {
        return this.a(pf.s.b, identifiersResult);
    }

    public final pf j(@Nullable String string2) {
        return (pf)this.b(pf.m.b, string2);
    }

    @NonNull
    public final IdentifiersResult j() {
        return this.h(pf.e.b);
    }

    @NonNull
    public final pf k(@NonNull String string2) {
        return (pf)this.d(new sf((String)string2, null).b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public final va k() {
        Object object = pf.w.b;
        object = this.a.getString((String)object, null);
        try {
            if (TextUtils.isEmpty((CharSequence)object)) return new va(null, IdentifierStatus.UNKNOWN, null);
            JSONObject jSONObject = new JSONObject((String)object);
            return new va(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
        }
        catch (Throwable throwable) {
            return new va(null, IdentifierStatus.UNKNOWN, null);
        }
    }

    @NonNull
    public final IdentifiersResult l() {
        return this.h(pf.q.b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return this.h(pf.r.b);
    }

    @NonNull
    public final long n() {
        String string2 = pf.p.b;
        return this.a.getLong(string2, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return this.h(pf.k.b);
    }

    @Nullable
    public final ScreenInfo p() {
        String string2 = pf.u.b;
        return Gb.e(this.a.getString(string2, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return this.h(pf.d.b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return this.h(pf.s.b);
    }

    public final boolean s() {
        String string2 = pf.n.b;
        return this.a.getBoolean(string2, false);
    }

    public final boolean t() {
        String string2 = pf.v.b;
        return this.a.getBoolean(string2, false);
    }

    public final pf u() {
        return (pf)this.b(pf.n.b, true);
    }

    public final void v() {
        this.b(pf.v.b, true);
    }
}

