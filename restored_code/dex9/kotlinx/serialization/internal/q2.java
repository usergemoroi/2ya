/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.internal.b2
 *  kotlinx.serialization.internal.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010 \u001a\u00020\u0001\u00a2\u0006\u0004\b5\u00106J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0097\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH\u0097\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000e\u001a\u00020\u000bH\u0097\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000bH\u0097\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bH\u0097\u0001\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u00018\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\nR \u0010(\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b\u001c\u0010'R\u0014\u0010*\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010)R\u0014\u0010.\u001a\u00020+8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00058VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b/\u0010)R\u0014\u00101\u001a\u00020\u000b8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b0\u0010\rR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b2\u00103\u00a8\u00067"}, d2={"Lkotlinx/serialization/internal/q2;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/n;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "i", "(I)Z", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "j", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "b", "Ljava/lang/String;", "h", "serialName", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "()Z", "isNullable", "Lkotlinx/serialization/descriptors/l;", "getKind", "()Lkotlinx/serialization/descriptors/l;", "kind", "isInline", "e", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
public final class q2
implements SerialDescriptor,
n {
    @NotNull
    private final SerialDescriptor a;
    @NotNull
    private final String b;
    @NotNull
    private final Set<String> c;

    public q2(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"original");
        this.a = serialDescriptor;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(serialDescriptor.h());
        stringBuilder.append('?');
        this.b = stringBuilder.toString();
        this.c = b2.a((SerialDescriptor)serialDescriptor);
    }

    @NotNull
    public Set<String> a() {
        return this.c;
    }

    public boolean b() {
        return true;
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
        if (this == object) {
            return true;
        }
        if (!(object instanceof q2)) {
            return false;
        }
        return y.e((Object)this.a, (Object)((q2)object).a);
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
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    @ExperimentalSerializationApi
    public boolean i(int n4) {
        return this.a.i(n4);
    }

    public boolean isInline() {
        return this.a.isInline();
    }

    @NotNull
    public final SerialDescriptor j() {
        return this.a;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('?');
        return stringBuilder.toString();
    }
}

