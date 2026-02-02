/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.U9;
import io.appmetrica.analytics.impl.m9;
import io.appmetrica.analytics.impl.n9;
import io.appmetrica.analytics.impl.p9;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

public final class k9 {
    public final int a;
    public final p9 b;
    public m9 c;

    public k9(p9 p92, int n10) {
        this.a = n10;
        this.b = p92;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object;
        Object object2;
        Object object3 = this.b;
        object3.getClass();
        try {
            object2 = ((p9)object3).c.get("event_hashes");
            if (object2 != null && ((byte[])object2).length != 0) {
                object = ((p9)object3).a;
                object2 = ((p9)object3).b.a((byte[])object2);
                object.getClass();
                object = new m9(((U9)object2).a, ((U9)object2).b, ((U9)object2).c, CollectionUtils.hashSetFromIntArray(((U9)object2).d));
            } else {
                object = ((p9)object3).a;
                ((p9)object3).b.getClass();
                object2 = new U9;
                ((U9)object2)();
                object.getClass();
                object = new m9(((U9)object2).a, ((U9)object2).b, ((U9)object2).c, CollectionUtils.hashSetFromIntArray(((U9)object2).d));
            }
        }
        catch (Throwable throwable) {
            object = ((p9)object3).a;
            ((p9)object3).b.getClass();
            object3 = new U9();
            object.getClass();
            object = new m9(((U9)object3).a, ((U9)object3).b, ((U9)object3).c, CollectionUtils.hashSetFromIntArray(((U9)object3).d));
        }
        this.c = object;
        int n10 = ((m9)object).c;
        int n13 = this.a;
        if (n10 != n13) {
            ((m9)object).c = n13;
            ((m9)object).d = 0;
            p9 p92 = this.b;
            object3 = p92.c;
            object2 = p92.b;
            p92.a.getClass();
            object = n9.a((m9)object);
            object2.getClass();
            object3.insert("event_hashes", MessageNano.toByteArray((MessageNano)object));
        }
    }
}

