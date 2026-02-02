/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.v0
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

public abstract class e0
extends g0
implements KMutableProperty1 {
    public e0() {
    }

    @SinceKotlin(version="1.1")
    public e0(Object object) {
        super(object);
    }

    @SinceKotlin(version="1.4")
    public e0(Object object, Class clazz, String string, String string2, int n4) {
        super(object, clazz, string, string2, n4);
    }

    @Override
    protected KCallable computeReflected() {
        return v0.f((e0)this);
    }

    @Override
    @SinceKotlin(version="1.1")
    public Object getDelegate(Object object) {
        return ((KMutableProperty1)this.getReflected()).getDelegate(object);
    }

    @Override
    public KProperty1.Getter getGetter() {
        return ((KMutableProperty1)this.getReflected()).getGetter();
    }

    public KMutableProperty1.Setter getSetter() {
        return ((KMutableProperty1)this.getReflected()).getSetter();
    }

    @Override
    public Object invoke(Object object) {
        return this.get(object);
    }
}

