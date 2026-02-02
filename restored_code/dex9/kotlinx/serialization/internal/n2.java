/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.SerialDescriptor$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010&\u001a\u00020!\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010&\u001a\u00020!8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b'\u0010\u001d\u00a8\u0006+"}, d2={"Lkotlinx/serialization/internal/n2;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "a", "()Ljava/lang/Void;", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "i", "(I)Z", "d", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "g", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "h", "serialName", "Lkotlinx/serialization/descriptors/e;", "b", "Lkotlinx/serialization/descriptors/e;", "j", "()Lkotlinx/serialization/descriptors/e;", "kind", "e", "elementsCount", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/e;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
public final class n2
implements SerialDescriptor {
    @NotNull
    private final String a;
    @NotNull
    private final e b;

    public n2(@NotNull String string, @NotNull e e4) {
        y.j((Object)string, (String)"serialName");
        y.j((Object)((Object)e4), (String)"kind");
        this.a = string;
        this.b = e4;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public boolean b() {
        return SerialDescriptor.a.c((SerialDescriptor)this);
    }

    public int c(@NotNull String string) {
        y.j((Object)string, (String)"name");
        this.a();
        throw new j();
    }

    @NotNull
    public SerialDescriptor d(int n4) {
        this.a();
        throw new j();
    }

    public int e() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n2)) {
            return false;
        }
        String string = this.h();
        return y.e((Object)string, (Object)((n2)(object = (n2)object)).h()) && y.e((Object)((Object)this.j()), (Object)((Object)((n2)object).j()));
    }

    @NotNull
    public String f(int n4) {
        this.a();
        throw new j();
    }

    @NotNull
    public List<Annotation> g(int n4) {
        this.a();
        throw new j();
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.a.a((SerialDescriptor)this);
    }

    @NotNull
    public String h() {
        return this.a;
    }

    public int hashCode() {
        return this.h().hashCode() + this.j().hashCode() * 31;
    }

    public boolean i(int n4) {
        this.a();
        throw new j();
    }

    public boolean isInline() {
        return SerialDescriptor.a.b((SerialDescriptor)this);
    }

    @NotNull
    public e j() {
        return this.b;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PrimitiveDescriptor(");
        stringBuilder.append(this.h());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

