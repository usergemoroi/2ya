/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.jvm.b
 *  kotlin.jvm.internal.k$a
 *  kotlin.jvm.internal.v0
 *  kotlin.reflect.KDeclarationContainer
 *  kotlin.reflect.KVisibility
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.b;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

public abstract class k
implements KCallable,
Serializable {
    @SinceKotlin(version="1.1")
    public static final Object NO_RECEIVER = a.a();
    @SinceKotlin(version="1.4")
    private final boolean isTopLevel;
    @SinceKotlin(version="1.4")
    private final String name;
    @SinceKotlin(version="1.4")
    private final Class owner;
    @SinceKotlin(version="1.1")
    protected final Object receiver;
    private transient KCallable reflected;
    @SinceKotlin(version="1.4")
    private final String signature;

    public k() {
        this(NO_RECEIVER);
    }

    @SinceKotlin(version="1.1")
    protected k(Object object) {
        this(object, null, null, null, false);
    }

    @SinceKotlin(version="1.4")
    protected k(Object object, Class clazz, String string, String string2, boolean bl) {
        this.receiver = object;
        this.owner = clazz;
        this.name = string;
        this.signature = string2;
        this.isTopLevel = bl;
    }

    public Object call(Object ... objectArray) {
        return this.getReflected().call(objectArray);
    }

    public Object callBy(Map map2) {
        return this.getReflected().callBy(map2);
    }

    @SinceKotlin(version="1.1")
    public KCallable compute() {
        KCallable kCallable;
        KCallable kCallable2 = kCallable = this.reflected;
        if (kCallable == null) {
            this.reflected = kCallable2 = this.computeReflected();
        }
        return kCallable2;
    }

    protected abstract KCallable computeReflected();

    public List<Annotation> getAnnotations() {
        return this.getReflected().getAnnotations();
    }

    @SinceKotlin(version="1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public KDeclarationContainer getOwner() {
        Object object = this.owner;
        object = object == null ? null : (this.isTopLevel ? v0.c((Class)object) : v0.b((Class)object));
        return object;
    }

    @Override
    public List<KParameter> getParameters() {
        return this.getReflected().getParameters();
    }

    @SinceKotlin(version="1.1")
    protected KCallable getReflected() {
        KCallable kCallable = this.compute();
        if (kCallable != this) {
            return kCallable;
        }
        throw new b();
    }

    @Override
    public KType getReturnType() {
        return this.getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override
    @SinceKotlin(version="1.1")
    public List<KTypeParameter> getTypeParameters() {
        return this.getReflected().getTypeParameters();
    }

    @Override
    @SinceKotlin(version="1.1")
    public KVisibility getVisibility() {
        return this.getReflected().getVisibility();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isAbstract() {
        return this.getReflected().isAbstract();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isFinal() {
        return this.getReflected().isFinal();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isOpen() {
        return this.getReflected().isOpen();
    }

    @Override
    @SinceKotlin(version="1.3")
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }
}

