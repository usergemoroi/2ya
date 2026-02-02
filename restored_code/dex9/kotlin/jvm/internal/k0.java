/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.v0
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

public abstract class k0
extends o0
implements KProperty1 {
    public k0() {
    }

    @SinceKotlin(version="1.1")
    public k0(Object object) {
        super(object);
    }

    @SinceKotlin(version="1.4")
    public k0(Object object, Class clazz, String string, String string2, int n4) {
        super(object, clazz, string, string2, n4);
    }

    @Override
    protected KCallable computeReflected() {
        return v0.i((k0)this);
    }

    @SinceKotlin(version="1.1")
    public Object getDelegate(Object object) {
        return ((KProperty1)this.getReflected()).getDelegate(object);
    }

    public KProperty1.Getter getGetter() {
        return ((KProperty1)this.getReflected()).getGetter();
    }

    @Override
    public Object invoke(Object object) {
        return this.get(object);
    }
}

