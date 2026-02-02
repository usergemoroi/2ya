/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.collections.t;
import kotlin.collections.z0;
import kotlin.jvm.internal.y;
import kotlin.ranges.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"", "", "index", "Z", "(Ljava/util/List;I)I", "b0", "a0", "T", "Y", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/CollectionsKt")
class b0
extends a0 {
    public static final /* synthetic */ int V(List list, int n4) {
        return b0.Z(list, n4);
    }

    public static final /* synthetic */ int W(List list, int n4) {
        return b0.a0(list, n4);
    }

    public static final /* synthetic */ int X(List list, int n4) {
        return b0.b0(list, n4);
    }

    @NotNull
    public static <T> List<T> Y(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        return new z0<T>(list);
    }

    private static final int Z(List<?> list, int n4) {
        if (n4 >= 0 && n4 <= t.o(list)) {
            return t.o(list) - n4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Element index ");
        stringBuilder.append(n4);
        stringBuilder.append(" must be in range [");
        stringBuilder.append(new i(0, t.o(list)));
        stringBuilder.append("].");
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    private static final int a0(List<?> list, int n4) {
        return t.o(list) - n4;
    }

    private static final int b0(List<?> list, int n4) {
        if (n4 >= 0 && n4 <= list.size()) {
            return list.size() - n4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Position index ");
        stringBuilder.append(n4);
        stringBuilder.append(" must be in range [");
        stringBuilder.append(new i(0, list.size()));
        stringBuilder.append("].");
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
}

