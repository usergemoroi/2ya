/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.InternalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.y;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.e;
import kotlinx.serialization.internal.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014\u00a2\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0015\u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006 "}, d2={"Lkotlinx/serialization/internal/f;", "E", "Lkotlinx/serialization/internal/x;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "q", "()Ljava/util/ArrayList;", "", "r", "(Ljava/util/ArrayList;)I", "v", "(Ljava/util/ArrayList;)Ljava/util/List;", "u", "(Ljava/util/List;)Ljava/util/ArrayList;", "size", "Lkotlin/k0;", "s", "(Ljava/util/ArrayList;I)V", "index", "element", "t", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
@PublishedApi
public final class f<E>
extends x<E, List<? extends E>, ArrayList<E>> {
    @NotNull
    private final SerialDescriptor b;

    public f(@NotNull KSerializer<E> kSerializer) {
        y.j(kSerializer, (String)"element");
        super(kSerializer);
        this.b = new e(kSerializer.getDescriptor());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    @NotNull
    protected ArrayList<E> q() {
        return new ArrayList();
    }

    protected int r(@NotNull ArrayList<E> arrayList) {
        y.j(arrayList, (String)"<this>");
        return arrayList.size();
    }

    protected void s(@NotNull ArrayList<E> arrayList, int n4) {
        y.j(arrayList, (String)"<this>");
        arrayList.ensureCapacity(n4);
    }

    protected void t(@NotNull ArrayList<E> arrayList, int n4, E e4) {
        y.j(arrayList, (String)"<this>");
        arrayList.add(n4, e4);
    }

    @NotNull
    protected ArrayList<E> u(@NotNull List<? extends E> list) {
        y.j(list, (String)"<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList)list : null;
        ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = new ArrayList(list);
        }
        return arrayList2;
    }

    @NotNull
    protected List<E> v(@NotNull ArrayList<E> arrayList) {
        y.j(arrayList, (String)"<this>");
        return arrayList;
    }
}

