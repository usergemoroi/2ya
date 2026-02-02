/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\u001a&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"T", "Ljava/util/Enumeration;", "", "A", "(Ljava/util/Enumeration;)Ljava/util/Iterator;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/CollectionsKt")
class x
extends w {
    @NotNull
    public static <T> Iterator<T> A(@NotNull Enumeration<T> enumeration) {
        y.j(enumeration, (String)"<this>");
        return new Iterator<T>(enumeration){
            final Enumeration<T> c;
            {
                this.c = enumeration;
            }

            @Override
            public boolean hasNext() {
                return this.c.hasMoreElements();
            }

            @Override
            public T next() {
                return this.c.nextElement();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

