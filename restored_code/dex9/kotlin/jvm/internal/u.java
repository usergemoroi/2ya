/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

public class u
extends k
implements t,
KFunction {
    private final int arity;
    @SinceKotlin(version="1.4")
    private final int flags;

    public u(int n4) {
        this(n4, k.NO_RECEIVER, null, null, null, 0);
    }

    @SinceKotlin(version="1.1")
    public u(int n4, Object object) {
        this(n4, object, null, null, null, 0);
    }

    @SinceKotlin(version="1.4")
    public u(int n4, Object object, Class clazz, String string, String string2, int n5) {
        boolean bl = (n5 & 1) == 1;
        super(object, clazz, string, string2, bl);
        this.arity = n4;
        this.flags = n5 >> 1;
    }

    @Override
    @SinceKotlin(version="1.1")
    protected KCallable computeReflected() {
        return v0.a((u)this);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (object instanceof u) {
            object = (u)object;
            if (!(this.getName().equals(((k)object).getName()) && this.getSignature().equals(((k)object).getSignature()) && this.flags == ((u)object).flags && this.arity == ((u)object).arity && y.e((Object)this.getBoundReceiver(), (Object)((k)object).getBoundReceiver()) && y.e((Object)this.getOwner(), (Object)((k)object).getOwner()))) {
                bl = false;
            }
            return bl;
        }
        if (object instanceof KFunction) {
            return object.equals(this.compute());
        }
        return false;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    @SinceKotlin(version="1.1")
    protected KFunction getReflected() {
        return (KFunction)super.getReflected();
    }

    public int hashCode() {
        int n4 = this.getOwner() == null ? 0 : this.getOwner().hashCode() * 31;
        return (n4 + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isExternal() {
        return this.getReflected().isExternal();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isInfix() {
        return this.getReflected().isInfix();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isInline() {
        return this.getReflected().isInline();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isOperator() {
        return this.getReflected().isOperator();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }

    public String toString() {
        Object object = this.compute();
        if (object != this) {
            return object.toString();
        }
        if ("<init>".equals(this.getName())) {
            object = "constructor (Kotlin reflection is not available)";
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("function ");
            ((StringBuilder)object).append(this.getName());
            ((StringBuilder)object).append(" (Kotlin reflection is not available)");
            object = ((StringBuilder)object).toString();
        }
        return object;
    }
}

