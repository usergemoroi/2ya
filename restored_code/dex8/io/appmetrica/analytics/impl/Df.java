/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.t;

public final class df {
    public final ma a;

    public df(ma ma2) {
        this.a = ma2;
    }

    public final Wn a(PluginErrorDetails object) {
        String string2 = ((PluginErrorDetails)object).getExceptionClass();
        String string3 = ((PluginErrorDetails)object).getMessage();
        Object object2 = ((PluginErrorDetails)object).getStacktrace();
        String string4 = ((PluginErrorDetails)object).getPlatform();
        String string5 = ((PluginErrorDetails)object).getVirtualMachineVersion();
        Map<String, String> map2 = ((PluginErrorDetails)object).getPluginEnvironment();
        String string6 = (String)this.a.b.a();
        Boolean bl2 = (Boolean)this.a.c.a();
        if (object2 != null) {
            ArrayList<Ml> arrayList = new ArrayList<Ml>(t.x(object2, (int)10));
            object2 = object2.iterator();
            while (true) {
                object = arrayList;
                if (object2.hasNext()) {
                    object = (StackTraceItem)object2.next();
                    arrayList.add(new Ml(((StackTraceItem)object).getClassName(), ((StackTraceItem)object).getFileName(), ((StackTraceItem)object).getLine(), ((StackTraceItem)object).getColumn(), ((StackTraceItem)object).getMethodName(), null));
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        return new Wn(new Mn(string2, string3, (ArrayList)object, null, null), null, null, string4, string5, map2, string6, bl2);
    }
}

