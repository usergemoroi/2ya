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
import kotlin.reflect.KProperty0;

public abstract class i0
extends o0
implements KProperty0 {
    public i0() {
    }

    @SinceKotlin(version="1.1")
    public i0(Object object) {
        super(object);
    }

    @SinceKotlin(version="1.4")
    public i0(Object object, Class clazz, String string, String string2, int n4) {
        super(object, clazz, string, string2, n4);
    }

    @Override
    protected KCallable computeReflected() {
        return v0.h((i0)this);
    }

    @Override
    @SinceKotlin(version="1.1")
    public Object getDelegate() {
        return ((KProperty0)this.getReflected()).getDelegate();
    }

    public KProperty0.Getter getGetter() {
        return ((KProperty0)this.getReflected()).getGetter();
    }

    @Override
    public Object invoke() {
        return this.get();
    }
}

