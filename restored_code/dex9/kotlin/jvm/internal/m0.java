/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.v0
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

public abstract class m0
extends o0
implements KProperty2 {
    @SinceKotlin(version="1.4")
    public m0(Class clazz, String string, String string2, int n4) {
        super(k.NO_RECEIVER, clazz, string, string2, n4);
    }

    @Override
    protected KCallable computeReflected() {
        return v0.j((m0)this);
    }

    @SinceKotlin(version="1.1")
    public Object getDelegate(Object object, Object object2) {
        return ((KProperty2)this.getReflected()).getDelegate(object, object2);
    }

    public KProperty2.Getter getGetter() {
        return ((KProperty2)this.getReflected()).getGetter();
    }

    @Override
    public Object invoke(Object object, Object object2) {
        return this.get(object, object2);
    }
}

