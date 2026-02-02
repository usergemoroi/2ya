/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.l0
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.l0;
import kotlin.collections.n0;
import kotlin.jvm.internal.markers.a;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2={"Lkotlin/collections/m0;", "T", "", "Lkotlin/collections/l0;", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/a;", "iteratorFactory", "<init>", "(Lkotlin/jvm/functions/a;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class m0<T>
implements Iterable<l0<? extends T>>,
a {
    @NotNull
    private final kotlin.jvm.functions.a<Iterator<T>> c;

    public m0(@NotNull kotlin.jvm.functions.a<? extends Iterator<? extends T>> a4) {
        y.j(a4, (String)"iteratorFactory");
        this.c = a4;
    }

    @Override
    @NotNull
    public Iterator<l0<T>> iterator() {
        return new n0<T>(this.c.invoke());
    }
}

