/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.l
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.y;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0001\u0012\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001e\u00a2\u0006\u0004\b1\u00102J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0097\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010\fR\u0014\u0010(\u001a\u00020%8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00048VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010)R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b,\u0010\tR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b.\u0010/\u00a8\u00063"}, d2={"Lkotlinx/serialization/descriptors/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "i", "(I)Z", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kClass", "Ljava/lang/String;", "h", "serialName", "Lkotlinx/serialization/descriptors/l;", "getKind", "()Lkotlinx/serialization/descriptors/l;", "kind", "()Z", "isNullable", "isInline", "e", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KClass;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
final class c
implements SerialDescriptor {
    @NotNull
    private final SerialDescriptor a;
    @JvmField
    @NotNull
    public final KClass<?> b;
    @NotNull
    private final String c;

    public c(@NotNull SerialDescriptor serialDescriptor, @NotNull KClass<?> kClass) {
        y.j((Object)serialDescriptor, (String)"original");
        y.j(kClass, (String)"kClass");
        this.a = serialDescriptor;
        this.b = kClass;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(serialDescriptor.h());
        stringBuilder.append('<');
        stringBuilder.append(kClass.getSimpleName());
        stringBuilder.append('>');
        this.c = stringBuilder.toString();
    }

    public boolean b() {
        return this.a.b();
    }

    @ExperimentalSerializationApi
    public int c(@NotNull String string) {
        y.j((Object)string, (String)"name");
        return this.a.c(string);
    }

    @ExperimentalSerializationApi
    @NotNull
    public SerialDescriptor d(int n4) {
        return this.a.d(n4);
    }

    public int e() {
        return this.a.e();
    }

    public boolean equals(@Nullable Object object) {
        object = object instanceof c ? (c)object : null;
        boolean bl = false;
        if (object == null) {
            return false;
        }
        boolean bl2 = bl;
        if (y.e((Object)this.a, (Object)((c)object).a)) {
            bl2 = bl;
            if (y.e(((c)object).b, this.b)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    @ExperimentalSerializationApi
    @NotNull
    public String f(int n4) {
        return this.a.f(n4);
    }

    @ExperimentalSerializationApi
    @NotNull
    public List<Annotation> g(int n4) {
        return this.a.g(n4);
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        return this.a.getAnnotations();
    }

    @NotNull
    public l getKind() {
        return this.a.getKind();
    }

    @NotNull
    public String h() {
        return this.c;
    }

    public int hashCode() {
        return this.b.hashCode() * 31 + this.h().hashCode();
    }

    @ExperimentalSerializationApi
    public boolean i(int n4) {
        return this.a.i(n4);
    }

    public boolean isInline() {
        return this.a.isInline();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ContextDescriptor(kClass: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", original: ");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

