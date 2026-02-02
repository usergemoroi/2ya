/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.internal.LowPriorityInOverloadResolution
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.y;
import kotlin.sequences.a;
import kotlin.sequences.d;
import kotlin.sequences.f;
import kotlin.sequences.g;
import kotlin.sequences.i;
import kotlin.sequences.l;
import kotlin.sequences.n;
import kotlin.sequences.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000*\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\u00028\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000\u00a2\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002\u00a2\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u000eH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0012\u0010\f\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"T", "", "Lkotlin/sequences/i;", "c", "(Ljava/util/Iterator;)Lkotlin/sequences/i;", "", "elements", "j", "([Ljava/lang/Object;)Lkotlin/sequences/i;", "e", "()Lkotlin/sequences/i;", "f", "(Lkotlin/sequences/i;)Lkotlin/sequences/i;", "R", "Lkotlin/Function1;", "iterator", "g", "(Lkotlin/sequences/i;Lkotlin/jvm/functions/l;)Lkotlin/sequences/i;", "d", "", "Lkotlin/Function0;", "nextFunction", "i", "(Lkotlin/jvm/functions/a;)Lkotlin/sequences/i;", "seed", "h", "(Ljava/lang/Object;Lkotlin/jvm/functions/l;)Lkotlin/sequences/i;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/sequences/SequencesKt")
class o
extends n {
    @NotNull
    public static <T> i<T> c(@NotNull Iterator<? extends T> iterator) {
        y.j(iterator, (String)"<this>");
        return l.d(new i<T>(iterator){
            final Iterator a;
            {
                this.a = iterator;
            }

            public Iterator<T> iterator() {
                return this.a;
            }
        });
    }

    @NotNull
    public static <T> i<T> d(@NotNull i<? extends T> i4) {
        y.j(i4, (String)"<this>");
        if (!(i4 instanceof a)) {
            i4 = new a<T>(i4);
        }
        return i4;
    }

    @NotNull
    public static <T> i<T> e() {
        return d.a;
    }

    @NotNull
    public static final <T> i<T> f(@NotNull i<? extends i<? extends T>> i4) {
        y.j(i4, (String)"<this>");
        return o.g(i4, b.g);
    }

    private static final <T, R> i<R> g(i<? extends T> i4, kotlin.jvm.functions.l<? super T, ? extends Iterator<? extends R>> l4) {
        if (i4 instanceof u) {
            return ((u)i4).e(l4);
        }
        return new f(i4, c.g, l4);
    }

    @LowPriorityInOverloadResolution
    @NotNull
    public static <T> i<T> h(@Nullable T object, @NotNull kotlin.jvm.functions.l<? super T, ? extends T> l4) {
        y.j(l4, (String)"nextFunction");
        object = object == null ? d.a : new g<T>(new kotlin.jvm.functions.a<T>(object){
            final T g;
            {
                this.g = t3;
                super(0);
            }

            @Override
            public final T invoke() {
                return this.g;
            }
        }, l4);
        return object;
    }

    @NotNull
    public static <T> i<T> i(@NotNull kotlin.jvm.functions.a<? extends T> a4) {
        y.j(a4, (String)"nextFunction");
        return l.d(new g<T>(a4, new kotlin.jvm.functions.l<T, T>(a4){
            final kotlin.jvm.functions.a<T> g;
            {
                this.g = a4;
                super(1);
            }

            @Override
            public final T invoke(T t3) {
                y.j(t3, (String)"it");
                return this.g.invoke();
            }
        }));
    }

    @NotNull
    public static <T> i<T> j(T ... TArray) {
        y.j(TArray, (String)"elements");
        return kotlin.collections.l.X((Object[])TArray);
    }
}

