/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.q0;
import kotlinx.serialization.internal.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014\u00a2\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0015\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006!"}, d2={"Lkotlinx/serialization/internal/r0;", "E", "Lkotlinx/serialization/internal/x;", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "q", "()Ljava/util/HashSet;", "", "r", "(Ljava/util/HashSet;)I", "v", "(Ljava/util/HashSet;)Ljava/util/Set;", "u", "(Ljava/util/Set;)Ljava/util/HashSet;", "size", "Lkotlin/k0;", "s", "(Ljava/util/HashSet;I)V", "index", "element", "t", "(Ljava/util/HashSet;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class r0<E>
extends x<E, Set<? extends E>, HashSet<E>> {
    @NotNull
    private final SerialDescriptor b;

    public r0(@NotNull KSerializer<E> kSerializer) {
        y.j(kSerializer, (String)"eSerializer");
        super(kSerializer);
        this.b = new q0(kSerializer.getDescriptor());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    @NotNull
    protected HashSet<E> q() {
        return new HashSet();
    }

    protected int r(@NotNull HashSet<E> hashSet) {
        y.j(hashSet, (String)"<this>");
        return hashSet.size();
    }

    protected void s(@NotNull HashSet<E> hashSet, int n4) {
        y.j(hashSet, (String)"<this>");
    }

    protected void t(@NotNull HashSet<E> hashSet, int n4, E e4) {
        y.j(hashSet, (String)"<this>");
        hashSet.add(e4);
    }

    @NotNull
    protected HashSet<E> u(@NotNull Set<? extends E> set) {
        y.j(set, (String)"<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet)set : null;
        HashSet hashSet2 = hashSet;
        if (hashSet == null) {
            hashSet2 = new HashSet(set);
        }
        return hashSet2;
    }

    @NotNull
    protected Set<E> v(@NotNull HashSet<E> hashSet) {
        y.j(hashSet, (String)"<this>");
        return hashSet;
    }
}

