/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.View
 *  com.yandex.mobile.ads.impl.ap2
 *  com.yandex.mobile.ads.impl.bp2
 *  com.yandex.mobile.ads.impl.gp2
 *  com.yandex.mobile.ads.impl.n72$a
 *  com.yandex.mobile.ads.impl.n72$b
 *  com.yandex.mobile.ads.impl.n72$c
 *  com.yandex.mobile.ads.impl.n72$e
 *  com.yandex.mobile.ads.impl.po2
 *  com.yandex.mobile.ads.impl.qo2
 *  com.yandex.mobile.ads.impl.qo2$a
 *  com.yandex.mobile.ads.impl.tp2
 *  com.yandex.mobile.ads.impl.uo2
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.yandex.mobile.ads.impl.ap2;
import com.yandex.mobile.ads.impl.bp2;
import com.yandex.mobile.ads.impl.dp2;
import com.yandex.mobile.ads.impl.gp2;
import com.yandex.mobile.ads.impl.hp2;
import com.yandex.mobile.ads.impl.ip2;
import com.yandex.mobile.ads.impl.lp2;
import com.yandex.mobile.ads.impl.n72;
import com.yandex.mobile.ads.impl.oo2;
import com.yandex.mobile.ads.impl.po2;
import com.yandex.mobile.ads.impl.qo2;
import com.yandex.mobile.ads.impl.tp2;
import com.yandex.mobile.ads.impl.uo2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n72
implements qo2.a {
    private static n72 h = new n72();
    private static Handler i = new Handler(Looper.getMainLooper());
    private static Handler j = null;
    private static final Runnable k = new b();
    private static final Runnable l = new c();
    private ArrayList a = new ArrayList();
    private int b;
    private final ArrayList c = new ArrayList();
    private ap2 d;
    private uo2 e = new uo2();
    private dp2 f;
    private long g;

    n72() {
        this.d = new ap2();
        this.f = new dp2(new ip2());
    }

    static /* synthetic */ dp2 a(n72 n722) {
        return n722.f;
    }

    public static void a() {
        if (j == null) {
            Handler handler;
            j = handler = new Handler(Looper.getMainLooper());
            handler.post(k);
            j.postDelayed(l, 200L);
        }
    }

    static void b(n72 object) {
        JSONObject jSONObject;
        ((n72)object).b = 0;
        ((n72)object).c.clear();
        Object object22 = po2.a().c().iterator();
        while (object22.hasNext()) {
            ((Object)((Object)((oo2)((Object)object22.next())))).getClass();
        }
        ((n72)object).g = System.nanoTime();
        ((n72)object).e.c();
        long l10 = System.nanoTime();
        object22 = ((n72)object).d.a();
        if (((n72)object).e.b().size() > 0) {
            for (String string2 : ((n72)object).e.b()) {
                jSONObject = ((hp2)object22).a(null);
                View view = ((n72)object).e.b(string2);
                lp2 lp22 = ((n72)object).d.b();
                Object object3 = ((n72)object).e.a(string2);
                if (object3 != null) {
                    view = lp22.a(view);
                    try {
                        view.put("adSessionId", (Object)string2);
                    }
                    catch (JSONException jSONException) {
                        Log.e((String)"OMIDLIB", (String)"Error with setting ad session id", (Throwable)jSONException);
                    }
                    try {
                        view.put("notVisibleReason", object3);
                    }
                    catch (JSONException jSONException) {
                        Log.e((String)"OMIDLIB", (String)"Error with setting not visible reason", (Throwable)jSONException);
                    }
                    bp2.a((JSONObject)jSONObject, (JSONObject)view);
                }
                bp2.a((JSONObject)jSONObject);
                object3 = new HashSet();
                ((HashSet)object3).add(string2);
                ((n72)object).f.b(jSONObject, (HashSet<String>)object3, l10);
            }
        }
        if (((n72)object).e.a().size() > 0) {
            jSONObject = ((hp2)object22).a(null);
            ((hp2)object22).a(null, jSONObject, (qo2.a)object, true, false);
            bp2.a((JSONObject)jSONObject);
            ((n72)object).f.a(jSONObject, ((n72)object).e.a(), l10);
        } else {
            ((n72)object).f.a();
        }
        ((n72)object).e.d();
        l10 = System.nanoTime();
        long l11 = ((n72)object).g;
        if (((n72)object).a.size() > 0) {
            for (Object object22 : ((n72)object).a) {
                TimeUnit.NANOSECONDS.toMillis(l10 - l11);
                object22.b();
                if (!(object22 instanceof d)) continue;
                ((d)object22).a();
            }
        }
    }

    public static void c() {
        Handler handler = j;
        if (handler != null) {
            handler.removeCallbacks(l);
            j = null;
        }
    }

    static /* synthetic */ Handler d() {
        return j;
    }

    static /* synthetic */ Runnable e() {
        return k;
    }

    static /* synthetic */ Runnable f() {
        return l;
    }

    public static n72 g() {
        return h;
    }

    public final void a(View view, qo2 qo22, JSONObject object, boolean bl2) {
        if (tp2.c((View)view) == null) {
            int n10 = this.e.c(view);
            if (n10 == 3) {
                return;
            }
            JSONObject jSONObject = qo22.a(view);
            bp2.a((JSONObject)object, (JSONObject)jSONObject);
            object = this.e.a(view);
            if (object != null) {
                try {
                    jSONObject.put("adSessionId", object);
                }
                catch (JSONException jSONException) {
                    Log.e((String)"OMIDLIB", (String)"Error with setting ad session id", (Throwable)jSONException);
                }
                bl2 = this.e.d(view);
                try {
                    jSONObject.put("hasWindowFocus", (Object)bl2);
                }
                catch (JSONException jSONException) {
                    Log.e((String)"OMIDLIB", (String)"Error with setting not visible reason", (Throwable)jSONException);
                }
                this.e.e();
            } else {
                boolean bl3;
                Object object2 = this.e.b(view);
                if (object2 != null) {
                    gp2 gp22 = object2.a();
                    object = new JSONArray();
                    object2 = object2.b().iterator();
                    while (object2.hasNext()) {
                        object.put((Object)((String)object2.next()));
                    }
                    try {
                        jSONObject.put("isFriendlyObstructionFor", object);
                        jSONObject.put("friendlyObstructionClass", (Object)gp22.b());
                        jSONObject.put("friendlyObstructionPurpose", (Object)gp22.c());
                        jSONObject.put("friendlyObstructionReason", (Object)gp22.d());
                    }
                    catch (JSONException jSONException) {
                        Log.e((String)"OMIDLIB", (String)"Error with setting friendly obstruction", (Throwable)jSONException);
                    }
                    bl3 = true;
                } else {
                    bl3 = false;
                }
                bl2 = bl2 || bl3;
                boolean bl4 = n10 == 1;
                qo22.a(view, jSONObject, (qo2.a)this, bl4, bl2);
            }
            ++this.b;
        }
    }

    public final void b() {
        n72.c();
        this.a.clear();
        i.post((Runnable)new a(this));
    }

    public static interface d
    extends e {
        public void a();
    }
}

