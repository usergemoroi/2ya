/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.jvm.internal.z0
 *  kotlin.k0
 *  kotlin.m
 *  kotlin.q
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.b
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.descriptors.l
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z0;
import kotlin.k0;
import kotlin.m;
import kotlin.n;
import kotlin.q;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.e;
import kotlinx.serialization.f;
import kotlinx.serialization.internal.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2={"Lkotlinx/serialization/g;", "", "T", "Lkotlinx/serialization/internal/b;", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/m;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/KClass;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
public final class g<T>
extends b<T> {
    @NotNull
    private final KClass<T> a;
    @NotNull
    private List<? extends Annotation> b;
    @NotNull
    private final m c;

    public g(@NotNull KClass<T> kClass) {
        y.j(kClass, (String)"baseClass");
        this.a = kClass;
        this.b = t.m();
        this.c = n.a(q.d, new e(this));
    }

    public static /* synthetic */ SerialDescriptor f(g g4) {
        return g.h(g4);
    }

    public static /* synthetic */ k0 g(g g4, a a4) {
        return g.i(g4, a4);
    }

    private static final SerialDescriptor h(g g4) {
        d.a a4 = d.a.a;
        f f4 = new f(g4);
        return kotlinx.serialization.descriptors.b.c((SerialDescriptor)k.d((String)"kotlinx.serialization.Polymorphic", (l)a4, (SerialDescriptor[])new SerialDescriptor[0], (kotlin.jvm.functions.l)f4), g4.e());
    }

    private static final k0 i(g g4, a a4) {
        y.j((Object)a4, (String)"$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.a.b((a)a4, (String)"type", (SerialDescriptor)kotlinx.serialization.builtins.a.I((z0)z0.a).getDescriptor(), null, (boolean)false, (int)12, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("kotlinx.serialization.Polymorphic<");
        stringBuilder.append(g4.e().getSimpleName());
        stringBuilder.append('>');
        kotlinx.serialization.descriptors.a.b((a)a4, (String)"value", (SerialDescriptor)k.e((String)stringBuilder.toString(), (l)l.a.a, (SerialDescriptor[])new SerialDescriptor[0], null, (int)8, null), null, (boolean)false, (int)12, null);
        a4.h(g4.b);
        return k0.a;
    }

    @Override
    @NotNull
    public KClass<T> e() {
        return this.a;
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        stringBuilder.append(this.e());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

