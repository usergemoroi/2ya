/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.nn;
import java.util.HashMap;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class mn
extends a0
implements a {
    public final nn a;

    public mn(nn nn3) {
        this.a = nn3;
        super(0);
    }

    public final Object invoke() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object = this.a;
        String string2 = ((nn)object).a.a();
        if (string2 != null) {
            string2 = hashMap.put("native_supported_sources", string2);
        }
        if ((object = ((nn)object).b.a()) != null) {
            hashMap.put("plugin_supported_sources", object);
        }
        return hashMap;
    }
}

