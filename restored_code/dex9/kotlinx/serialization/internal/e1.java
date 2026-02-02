/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.SerialDescriptor$a
 *  kotlinx.serialization.descriptors.l
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u00a2\u0006\u0004\b(\u0010)J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u00018\u0006\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00028\u0016X\u0096D\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0001\u0005*+,-.\u00a8\u0006/"}, d2={"Lkotlinx/serialization/internal/e1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "i", "(I)Z", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "b", "I", "e", "elementsCount", "Lkotlinx/serialization/descriptors/l;", "getKind", "()Lkotlinx/serialization/descriptors/l;", "kind", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/internal/d;", "Lkotlinx/serialization/internal/e;", "Lkotlinx/serialization/internal/q0;", "Lkotlinx/serialization/internal/c1;", "Lkotlinx/serialization/internal/l2;", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
@SourceDebugExtension(value={"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public abstract class e1
implements SerialDescriptor {
    @NotNull
    private final SerialDescriptor a;
    private final int b;

    private e1(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
        this.b = 1;
    }

    public /* synthetic */ e1(SerialDescriptor serialDescriptor, p p4) {
        this(serialDescriptor);
    }

    public boolean b() {
        return SerialDescriptor.a.c((SerialDescriptor)this);
    }

    public int c(@NotNull String string) {
        y.j((Object)string, (String)"name");
        Comparable<Integer> comparable = kotlin.text.p.m(string);
        if (comparable != null) {
            return (Integer)comparable;
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append(string);
        ((StringBuilder)comparable).append(" is not a valid list index");
        throw new IllegalArgumentException(((StringBuilder)comparable).toString());
    }

    @NotNull
    public SerialDescriptor d(int n4) {
        if (n4 >= 0) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal index ");
        stringBuilder.append(n4);
        stringBuilder.append(", ");
        stringBuilder.append(this.h());
        stringBuilder.append(" expects only non-negative indices");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public int e() {
        return this.b;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e1)) {
            return false;
        }
        SerialDescriptor serialDescriptor = this.a;
        object = (e1)object;
        return y.e((Object)serialDescriptor, (Object)((e1)object).a) && y.e((Object)this.h(), (Object)object.h());
    }

    @NotNull
    public String f(int n4) {
        return String.valueOf(n4);
    }

    @NotNull
    public List<Annotation> g(int n4) {
        if (n4 >= 0) {
            return t.m();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal index ");
        stringBuilder.append(n4);
        stringBuilder.append(", ");
        stringBuilder.append(this.h());
        stringBuilder.append(" expects only non-negative indices");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.a.a((SerialDescriptor)this);
    }

    @NotNull
    public l getKind() {
        return m.b.a;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.h().hashCode();
    }

    public boolean i(int n4) {
        if (n4 >= 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal index ");
        stringBuilder.append(n4);
        stringBuilder.append(", ");
        stringBuilder.append(this.h());
        stringBuilder.append(" expects only non-negative indices");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public boolean isInline() {
        return SerialDescriptor.a.b((SerialDescriptor)this);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h());
        stringBuilder.append('(');
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

