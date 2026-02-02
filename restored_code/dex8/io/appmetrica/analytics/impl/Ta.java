/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.cm;
import io.appmetrica.analytics.impl.va;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.y;
import kotlin.r;

public final class ta {
    public final cm a = new cm();
    public va b = new va();

    public final void a(va va4) {
        synchronized (this) {
            this.b = va4;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(List object, HashMap hashMap) {
        synchronized (this) {
            Iterator iterator;
            try {
                iterator = object.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (iterator.hasNext()) {
                if (!y.e((String)iterator.next(), "appmetrica_lib_ssl_enabled") || (object = this.b.a) == null) continue;
                boolean bl2 = (Boolean)object;
                object = this.b;
                IdentifierStatus identifierStatus = ((va)object).b;
                String string2 = ((va)object).c;
                if (bl2) {
                    object = "true";
                } else {
                    if (bl2) {
                        object = new r();
                        throw object;
                    }
                    object = "false";
                }
                IdentifiersResult identifiersResult = new IdentifiersResult((String)object, identifierStatus, string2);
                hashMap.put("appmetrica_lib_ssl_enabled", this.a.a(identifiersResult));
            }
            return;
        }
    }
}

