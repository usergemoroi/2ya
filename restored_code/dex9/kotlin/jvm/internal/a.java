/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlin.reflect.KDeclarationContainer
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.reflect.KDeclarationContainer;

@SinceKotlin(version="1.4")
public class a
implements t,
Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int n4, Class clazz, String string, String string2, int n5) {
        this(n4, k.NO_RECEIVER, clazz, string, string2, n5);
    }

    public a(int n4, Object object, Class clazz, String string, String string2, int n5) {
        this.receiver = object;
        this.owner = clazz;
        this.name = string;
        this.signature = string2;
        boolean bl = (n5 & 1) == 1;
        this.isTopLevel = bl;
        this.arity = n4;
        this.flags = n5 >> 1;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        if (!(this.isTopLevel == ((a)object).isTopLevel && this.arity == ((a)object).arity && this.flags == ((a)object).flags && y.e((Object)this.receiver, (Object)((a)object).receiver) && y.e((Object)this.owner, (Object)((a)object).owner) && this.name.equals(((a)object).name) && this.signature.equals(((a)object).signature))) {
            bl = false;
        }
        return bl;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    public KDeclarationContainer getOwner() {
        Object object = this.owner;
        object = object == null ? null : (this.isTopLevel ? v0.c((Class)object) : v0.b((Class)object));
        return object;
    }

    public int hashCode() {
        Object object = this.receiver;
        int n4 = 0;
        int n5 = object != null ? object.hashCode() : 0;
        object = this.owner;
        if (object != null) {
            n4 = object.hashCode();
        }
        int n6 = this.name.hashCode();
        int n7 = this.signature.hashCode();
        int n8 = this.isTopLevel ? 1231 : 1237;
        return (((((n5 * 31 + n4) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + this.arity) * 31 + this.flags;
    }

    public String toString() {
        return v0.k((t)this);
    }
}

