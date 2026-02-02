/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.b1
 *  kotlin.jvm.functions.a
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.Y3;
import io.appmetrica.analytics.impl.b4;
import io.appmetrica.analytics.impl.om;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b1;
import kotlin.jvm.functions.a;

public abstract class lm {
    public static final Set a = b1.j((Object[])new String[]{"appmetrica_clids", "appmetrica_device_id_hash", "appmetrica_device_id", "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_uuid"});
    public static final SystemTimeProvider b = new SystemTimeProvider();
    public static final b4 c = new b4();

    public static final boolean a(om om3, Collection object, Map map2, a a14) {
        boolean bl2;
        block9: {
            boolean bl3;
            block11: {
                block10: {
                    bl2 = bl3 = true;
                    if (object == null) break block9;
                    if (!object.isEmpty()) break block10;
                    bl2 = bl3;
                    break block9;
                }
                if (!object.isEmpty()) break block11;
                bl2 = bl3;
                break block9;
            }
            object = object.iterator();
            while (true) {
                block12: {
                    block13: {
                        bl2 = bl3;
                        if (!object.hasNext()) break block9;
                        Object object2 = (String)object.next();
                        switch (((String)object2).hashCode()) {
                            default: {
                                break;
                            }
                            case 1117383061: {
                                if (!((String)object2).equals("appmetrica_device_id")) break;
                                bl2 = lm.a(om3.a);
                                break block12;
                            }
                            case 703740463: {
                                if (!((String)object2).equals("appmetrica_report_ad_url")) break;
                                bl2 = lm.a(om3.j);
                                break block12;
                            }
                            case 530949152: {
                                if (!((String)object2).equals("appmetrica_clids")) break;
                                object2 = c;
                                Y3 y34 = (Y3)a14.invoke();
                                object2.getClass();
                                bl2 = b4.a(map2, om3, y34);
                                break block12;
                            }
                            case 299713912: {
                                if (!((String)object2).equals("appmetrica_device_id_hash")) break;
                                bl2 = lm.a(om3.b);
                                break block12;
                            }
                            case 155670667: {
                                if (!((String)object2).equals("appmetrica_get_ad_url")) break;
                                bl2 = lm.a(om3.i);
                                break block12;
                            }
                            case -1367801046: {
                                if (((String)object2).equals("appmetrica_uuid")) break block13;
                            }
                        }
                        if (om3.w) break;
                        long l10 = om3.o;
                        long l11 = om3.A.a;
                        if (b.currentTimeSeconds() <= l10 + l11) continue;
                        break;
                    }
                    bl2 = lm.a(om3.d);
                }
                if (!bl2) break;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static final boolean a(String string2) {
        boolean bl2 = string2 == null || string2.length() == 0;
        return bl2 ^ true;
    }
}

