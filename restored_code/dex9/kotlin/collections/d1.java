/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.c1
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.collections.c1;
import kotlin.collections.i0;
import kotlin.collections.l;
import kotlin.collections.p;
import kotlin.collections.s0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000\u00a2\u0006\u0004\b\t\u0010\u0007\u001a7\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000\u00a2\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"T", "", "f", "()Ljava/util/Set;", "", "elements", "j", "([Ljava/lang/Object;)Ljava/util/Set;", "", "h", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "g", "([Ljava/lang/Object;)Ljava/util/HashSet;", "i", "(Ljava/util/Set;)Ljava/util/Set;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/SetsKt")
class d1
extends c1 {
    @NotNull
    public static <T> Set<T> f() {
        return i0.c;
    }

    @NotNull
    public static <T> HashSet<T> g(T ... TArray) {
        y.j(TArray, (String)"elements");
        return p.e1(TArray, new HashSet(s0.f(TArray.length)));
    }

    @NotNull
    public static <T> Set<T> h(T ... TArray) {
        y.j(TArray, (String)"elements");
        return p.e1(TArray, new LinkedHashSet(s0.f(TArray.length)));
    }

    @NotNull
    public static final <T> Set<T> i(@NotNull Set<? extends T> set) {
        y.j(set, (String)"<this>");
        int n4 = set.size();
        if (n4 != 0) {
            if (n4 == 1) {
                set = b1.d(set.iterator().next());
            }
        } else {
            set = b1.f();
        }
        return set;
    }

    @NotNull
    public static <T> Set<T> j(T ... TArray) {
        y.j(TArray, (String)"elements");
        return l.m1((Object[])TArray);
    }
}

