/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.impl.A7;
import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.E2;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Pa;
import io.appmetrica.analytics.impl.Q5;
import io.appmetrica.analytics.impl.S5;
import io.appmetrica.analytics.impl.Sb;
import io.appmetrica.analytics.impl.Tb;
import io.appmetrica.analytics.impl.V5;
import io.appmetrica.analytics.impl.X6;
import io.appmetrica.analytics.impl.f5;
import io.appmetrica.analytics.impl.hb;
import io.appmetrica.analytics.impl.i5;
import io.appmetrica.analytics.impl.l7;
import io.appmetrica.analytics.impl.m4;
import io.appmetrica.analytics.impl.n4;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.pn;
import io.appmetrica.analytics.impl.qn;
import io.appmetrica.analytics.impl.r3;
import io.appmetrica.analytics.impl.rn;
import io.appmetrica.analytics.impl.s3;
import io.appmetrica.analytics.impl.s7;
import io.appmetrica.analytics.impl.u7;
import io.appmetrica.analytics.impl.v7;
import io.appmetrica.analytics.impl.w7;
import io.appmetrica.analytics.impl.wk;
import io.appmetrica.analytics.impl.x7;
import io.appmetrica.analytics.impl.ya;
import io.appmetrica.analytics.impl.yn;
import io.appmetrica.analytics.impl.z7;
import io.appmetrica.analytics.impl.zc;
import io.appmetrica.analytics.impl.zl;
import io.appmetrica.analytics.impl.zn;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class y7 {
    public static volatile y7 t;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final l7 d;
    public final Context e;
    public x7 f;
    public x7 g;
    public r3 h;
    public s3 i;
    public r3 j;
    public s3 k;
    public Sb l;
    public Tb m;
    public yn n;
    public zn o;
    public Sb p;
    public Tb q;
    public zc r;
    public final A7 s;

    public y7(Context context) {
        this.e = context;
        this.d = V5.a();
        this.s = new A7();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static y7 a(Context context) {
        if (t != null) return t;
        synchronized (y7.class) {
            try {
                y7 y74;
                if (t != null) return t;
                t = y74 = new y7(context.getApplicationContext());
                return t;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final IBinaryDataHelper a(o5 object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                block4: {
                    Object object3;
                    String string2;
                    try {
                        object2 = new f5((o5)object);
                        string2 = ((f5)object2).a;
                        object2 = object3 = (IBinaryDataHelper)this.c.get(string2);
                        if (object3 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object3 = this.c((o5)object);
                    object = new zl((x7)object3);
                    object2 = new r3((zl)object);
                    this.c.put(string2, object2);
                }
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hb a() {
        synchronized (this) {
            try {
                Tb tb3;
                if (this.q != null) return this.q;
                this.q = tb3 = new Tb(this.f());
                return this.q;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final hb b() {
        synchronized (this) {
            hb hb4 = this.f();
            return hb4;
        }
    }

    public final hb b(o5 object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                block4: {
                    Object object3;
                    String string2;
                    try {
                        object2 = new f5((o5)object);
                        string2 = ((f5)object2).a;
                        object2 = object3 = (hb)this.b.get(string2);
                        if (object3 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object3 = this.c((o5)object);
                    object = new zl((x7)object3);
                    object2 = new Sb((X6)object);
                    this.b.put(string2, object2);
                }
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hb c() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Tb tb3;
                block3: {
                    try {
                        if (this.m != null) return this.m;
                        if (this.l != null) break block3;
                        x7 x74 = this.h();
                        zl zl3 = new zl(x74);
                        hb hb4 = new Sb(zl3);
                        this.l = hb4;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.m = tb3 = new Tb(this.l);
                return this.m;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final x7 c(o5 object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                Object object3;
                Object object4;
                Context context;
                x7 x74;
                f5 f54;
                block4: {
                    try {
                        f54 = new f5((o5)object);
                        x74 = (x7)this.a.get(f54.a);
                        if (x74 != null) {
                            return x74;
                        }
                        context = this.e;
                        object4 = this.s;
                        object3 = new z7(((A7)object4).a, ((A7)object4).b, false);
                        object3 = ((z7)object3).a(context, f54);
                        object2 = this.d;
                        object2.getClass();
                        object = object4 = ((o5)object).b;
                        if (object4 != null) break block4;
                        object = "main";
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                String string2 = String.format("component-%s", object);
                pn pn3 = ((l7)object2).c;
                object4 = ((l7)object2).a;
                object = ((v7)object4).a;
                object4 = ((v7)object4).b;
                Pa pa4 = new Pa(false);
                Object object5 = new i5();
                pa4.a(112, object5);
                object5 = new rn(string2, ((l7)object2).b.a);
                pn3.getClass();
                object2 = new qn((DatabaseScript)object, (DatabaseScript)object4, pa4, (rn)object5);
                x74 = new x7(context, (String)object3, (qn)object2, PublicLogger.getAnonymousInstance());
                this.a.put(f54.a, x74);
                return x74;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hb d() {
        synchronized (this) {
            try {
                Sb sb3;
                if (this.l != null) return this.l;
                x7 x74 = this.h();
                Object object = new zl(x74);
                this.l = sb3 = new Sb((X6)object);
                return this.l;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final IBinaryDataHelper e() {
        if (this.j == null) {
            if (this.g == null) {
                Context context = this.e;
                Object object = this.s;
                String string2 = new z7(((A7)object).a, ((A7)object).b, false).a(context, new E2());
                Object object2 = this.d;
                object2.getClass();
                Object object3 = new HashMap<String, List<String>>();
                ((HashMap)object3).put("binary_data", Q5.a);
                object = ((l7)object2).c;
                Object object4 = ((l7)object2).a;
                object2 = ((v7)object4).g;
                object4 = ((v7)object4).h;
                Pa pa4 = new Pa(false);
                object3 = new rn("auto_inapp", (HashMap<String, List<String>>)object3);
                object.getClass();
                this.g = new x7(context, string2, new qn((DatabaseScript)object2, (DatabaseScript)object4, pa4, (rn)object3), PublicLogger.getAnonymousInstance());
            }
            this.j = new r3(new zl(this.g));
        }
        return this.j;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hb f() {
        if (this.p != null) return this.p;
        synchronized (this) {
            try {
                Object object;
                if (this.r == null) {
                    Object object2 = this.s;
                    object = new z7(((A7)object2).a, ((A7)object2).b, true);
                    Object object3 = this.e;
                    object2 = new m4();
                    object3 = ((z7)object).a((Context)object3, (w7)object2);
                    object = this.e;
                    Object object4 = this.d;
                    object4.getClass();
                    HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
                    hashMap.put("preferences", S5.a);
                    Object object5 = ((l7)object4).c;
                    Object object6 = ((l7)object4).a;
                    object4 = ((v7)object6).c;
                    s7 s74 = ((v7)object6).d;
                    object6 = new Pa(false);
                    Object object7 = new n4();
                    ((Pa)object6).a(112, object7);
                    object7 = new rn("service database", hashMap);
                    object5.getClass();
                    object5 = new qn((DatabaseScript)object4, s74, (Pa)object6, (rn)object7);
                    object4 = new ya((String)object3);
                    this.r = object2 = new zc((Context)object, (String)object3, (ya)object4, (qn)object5);
                }
                object = this.r;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl31 : MonitorExitStatement: MONITOREXIT : this
                this.p = new Sb((X6)object);
                return this.p;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final IBinaryDataHelper g() {
        if (this.h == null) {
            this.h = new r3(new zl(this.h()));
        }
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final x7 h() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                x7 x74;
                Object object6;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                x7 x75;
                try {
                    if (this.f != null) return this.f;
                    x75 = this.e;
                    object5 = this.s;
                    object4 = new z7(((A7)object5).a, ((A7)object5).b, true);
                    object5 = new wk();
                    object4 = ((z7)object4).a((Context)x75, (w7)object5);
                    object3 = this.d;
                    object3.getClass();
                    object5 = new HashMap();
                    ((HashMap)object5).put("preferences", S5.a);
                    ((HashMap)object5).put("binary_data", Q5.a);
                    ((HashMap)object5).put("temp_cache", Bn.a);
                    object2 = Na.F.o().b().iterator();
                    while (object2.hasNext()) {
                        for (Object object6 : object2.next().getTables()) {
                            ((HashMap)object5).put(object6.getTableName(), object6.getColumnNames());
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object2 = ((l7)object3).c;
                object6 = ((l7)object3).a;
                object3 = ((v7)object6).e;
                u7 u74 = ((v7)object6).f;
                object6 = new Pa(false);
                Iterator<TableDescription> iterator = new Iterator<TableDescription>();
                ((Pa)object6).a(114, iterator);
                Iterator<ModuleServicesDatabase> iterator2 = Na.F.o().b().iterator();
                while (iterator2.hasNext()) {
                    iterator = iterator2.next().getTables().iterator();
                    while (iterator.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : iterator.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            ((Pa)object6).a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                iterator = new Iterator<TableDescription>("service database", object5);
                object2.getClass();
                object5 = new qn((DatabaseScript)object3, u74, (Pa)object6, (rn)((Object)iterator));
                this.f = x74 = new x7((Context)x75, (String)object4, (qn)object5, PublicLogger.getAnonymousInstance());
                return this.f;
            }
            throw throwable2;
        }
    }
}

