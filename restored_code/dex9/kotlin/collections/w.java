/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.t;
import kotlin.collections.v;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"T", "", "", "y", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "default", "x", "(Ljava/lang/Iterable;I)I", "", "z", "(Ljava/lang/Iterable;)Ljava/util/List;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/CollectionsKt")
class w
extends v {
    @PublishedApi
    public static <T> int x(@NotNull Iterable<? extends T> iterable, int n4) {
        y.j(iterable, (String)"<this>");
        if (iterable instanceof Collection) {
            n4 = ((Collection)iterable).size();
        }
        return n4;
    }

    @PublishedApi
    @Nullable
    public static final <T> Integer y(@NotNull Iterable<? extends T> object) {
        y.j(object, (String)"<this>");
        object = object instanceof Collection ? Integer.valueOf(((Collection)object).size()) : null;
        return object;
    }

    @NotNull
    public static <T> List<T> z(@NotNull Iterable<? extends Iterable<? extends T>> object) {
        y.j(object, (String)"<this>");
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            t.E(arrayList, (Iterable)object.next());
        }
        return arrayList;
    }
}

