/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.O;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.Qd;
import io.appmetrica.analytics.impl.W6;
import io.appmetrica.analytics.impl.b4;
import io.appmetrica.analytics.impl.cm;
import io.appmetrica.analytics.impl.lm;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.sa;
import io.appmetrica.analytics.impl.ta;
import io.appmetrica.analytics.impl.va;
import io.appmetrica.analytics.impl.vo;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.r;

public final class fm {
    public final HashSet a;
    public final HashMap b;
    public final cm c;
    public List d;
    public HashMap e;
    public long f;
    public boolean g;
    public long h;
    public final pf i;
    public final O j;
    public final b4 k;
    public final W6 l;
    public final ta m;
    public final sa n;
    public final vo o;

    public fm(Context context, pf pf3) {
        this(pf3, new O(), new b4(), A4.l().a(context), new W6(), new ta(), new sa(), new vo());
    }

    public fm(pf pf3, O object, b4 object2, Qd qd2, W6 w64, ta ta3, sa sa2, vo vo3) {
        HashSet<String> hashSet;
        this.a = hashSet = new HashSet<String>();
        this.b = new HashMap();
        this.c = new cm();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.i = pf3;
        this.j = object;
        this.k = object2;
        this.l = w64;
        this.m = ta3;
        this.n = sa2;
        this.o = vo3;
        this.c(qd2.a());
        this.a("appmetrica_device_id", pf3.j());
        this.a("appmetrica_device_id_hash", pf3.i());
        this.a("appmetrica_get_ad_url", pf3.d());
        this.a("appmetrica_report_ad_url", pf3.e());
        this.b(pf3.o());
        this.a("appmetrica_google_adv_id", pf3.l());
        this.a("appmetrica_huawei_oaid", pf3.m());
        this.a("appmetrica_yandex_adv_id", pf3.r());
        w64.a(pf3.h());
        ta3.a(pf3.k());
        this.d = pf3.g();
        object = null;
        object2 = pf3.i((String)null);
        if (object2 != null) {
            object = Pm.a((String)object2);
        }
        this.e = object;
        this.g = pf3.a(true);
        this.f = pf3.b(0L);
        this.h = pf3.n();
        this.c();
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        boolean bl2 = identifiersResult == null || identifiersResult.id == null;
        return bl2;
    }

    public final void a(String string2, IdentifiersResult identifiersResult) {
        if (identifiersResult != null && !TextUtils.isEmpty((CharSequence)identifiersResult.id)) {
            this.b.put(string2, identifiersResult);
        }
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult)this.b.get("appmetrica_clids");
        if (fm.a(identifiersResult)) {
            return true;
        }
        if (identifiersResult.id.isEmpty()) {
            return ro.a(this.e);
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(Collection object) {
        synchronized (this) {
            boolean bl2;
            Object object2;
            String string2;
            try {
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    string2 = (String)iterator.next();
                    object = object2 = (IdentifiersResult)this.b.get(string2);
                    if (object2 == null) {
                        object = (IdentifiersResult)this.l.c.get(string2);
                    }
                    object2 = object;
                    if (object == null) {
                        object = this.m.b;
                        if (y.e(string2, "appmetrica_lib_ssl_enabled") && (object2 = ((va)object).a) != null) {
                            bl2 = (Boolean)object2;
                            IdentifierStatus identifierStatus = ((va)object).b;
                            String string3 = ((va)object).c;
                            if (bl2) {
                                object = "true";
                            } else {
                                if (bl2) {
                                    object = new r();
                                    throw object;
                                }
                                object = "false";
                            }
                            object2 = new IdentifiersResult((String)object, identifierStatus, string3);
                        } else {
                            object2 = null;
                        }
                    }
                    if (!"appmetrica_clids".equals(string2)) break block14;
                    if (!this.g && !fm.a((IdentifiersResult)object2) && (!((IdentifiersResult)object2).id.isEmpty() || (bl2 = ro.a(this.e)))) continue;
                }
            }
        // Removed invalid catch block
            return true;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(List object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                boolean bl3;
                boolean bl4;
                block5: {
                    try {
                        bl4 = this.a(t.x0((Iterable)object, (Iterable)lm.a));
                        bl3 = true;
                        Iterator iterator = object.iterator();
                        while (iterator.hasNext()) {
                            object = (String)iterator.next();
                            if (!this.a.contains(object)) continue;
                            bl2 = true;
                            break block5;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    bl2 = false;
                }
                long l10 = this.h;
                boolean bl5 = lm.b.currentTimeSeconds() > l10;
                boolean bl6 = bl3;
                if (bl4 ^ true) return bl6;
                bl6 = bl3;
                if (bl2) return bl6;
                bl6 = bl3;
                if (bl5) return bl6;
                bl6 = this.g;
                if (!bl6) return false;
                return bl3;
            }
            throw throwable2;
        }
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (!fm.a(identifiersResult)) {
            this.b.put("appmetrica_clids", identifiersResult);
        }
    }

    public final boolean b() {
        synchronized (this) {
            boolean bl2 = this.a(Arrays.asList("appmetrica_clids", "appmetrica_device_id_hash", "appmetrica_device_id", "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_uuid"));
            return bl2;
        }
    }

    public final void c() {
        pf pf3 = this.i.i((IdentifiersResult)this.b.get("appmetrica_uuid")).e((IdentifiersResult)this.b.get("appmetrica_device_id")).d((IdentifiersResult)this.b.get("appmetrica_device_id_hash")).a((IdentifiersResult)this.b.get("appmetrica_get_ad_url")).b((IdentifiersResult)this.b.get("appmetrica_report_ad_url")).e(this.f).h((IdentifiersResult)this.b.get("appmetrica_clids")).j(Pm.a((Map)this.e)).f((IdentifiersResult)this.b.get("appmetrica_google_adv_id")).g((IdentifiersResult)this.b.get("appmetrica_huawei_oaid")).j((IdentifiersResult)this.b.get("appmetrica_yandex_adv_id")).b(this.g).c(this.l.d).d(this.h);
        ta ta3 = this.m;
        synchronized (ta3) {
            va va4 = ta3.b;
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl6 : MonitorExitStatement: MONITOREXIT : var1_2
            pf3.a(va4).b();
            return;
        }
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            vo vo3 = this.o;
            String string2 = identifiersResult.id;
            vo3.getClass();
            if (vo.a(string2)) {
                this.b.put("appmetrica_uuid", identifiersResult);
            }
        }
    }
}

