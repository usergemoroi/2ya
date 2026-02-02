/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.y
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

public abstract class o0
extends k
implements KProperty {
    private final boolean syntheticJavaProperty;

    public o0() {
        this.syntheticJavaProperty = false;
    }

    @SinceKotlin(version="1.1")
    public o0(Object object) {
        super(object);
        this.syntheticJavaProperty = false;
    }

    @SinceKotlin(version="1.4")
    public o0(Object object, Class clazz, String string, String string2, int n4) {
        boolean bl = false;
        boolean bl2 = (n4 & 1) == 1;
        super(object, clazz, string, string2, bl2);
        bl2 = bl;
        if ((n4 & 2) == 2) {
            bl2 = true;
        }
        this.syntheticJavaProperty = bl2;
    }

    @Override
    public KCallable compute() {
        KCallable kCallable = this.syntheticJavaProperty ? this : super.compute();
        return kCallable;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (object instanceof o0) {
            object = (o0)object;
            if (!(this.getOwner().equals(((k)object).getOwner()) && this.getName().equals(((k)object).getName()) && this.getSignature().equals(((k)object).getSignature()) && y.e((Object)this.getBoundReceiver(), (Object)((k)object).getBoundReceiver()))) {
                bl = false;
            }
            return bl;
        }
        if (object instanceof KProperty) {
            return object.equals(this.compute());
        }
        return false;
    }

    @Override
    @SinceKotlin(version="1.1")
    protected KProperty getReflected() {
        if (!this.syntheticJavaProperty) {
            return (KProperty)super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public int hashCode() {
        return (this.getOwner().hashCode() * 31 + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isConst() {
        return this.getReflected().isConst();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isLateinit() {
        return this.getReflected().isLateinit();
    }

    public String toString() {
        Object object = this.compute();
        if (object != this) {
            return object.toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("property ");
        ((StringBuilder)object).append(this.getName());
        ((StringBuilder)object).append(" (Kotlin reflection is not available)");
        return ((StringBuilder)object).toString();
    }
}

