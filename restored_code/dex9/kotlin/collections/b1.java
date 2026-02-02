/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.collections.c1
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.collections.e1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"kotlin/collections/c1", "kotlin/collections/d1", "kotlin/collections/e1"}, d2={}, k=4, mv={1, 9, 0})
public final class b1
extends e1 {
    @PublishedApi
    @SinceKotlin(version="1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ Set a(@NotNull Set set) {
        return c1.a((Set)set);
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ Set b() {
        return c1.b();
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ Set c(int n4) {
        return c1.c((int)n4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set d(Object object) {
        return c1.d((Object)object);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ TreeSet e(Object ... objectArray) {
        return c1.e((Object[])objectArray);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set f() {
        return d1.f();
    }

    @NotNull
    public static /* bridge */ /* synthetic */ HashSet g(Object ... objectArray) {
        return d1.g(objectArray);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set h(Object ... objectArray) {
        return d1.h(objectArray);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set j(Object ... objectArray) {
        return d1.j(objectArray);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set k(@NotNull Set set, @NotNull Iterable iterable) {
        return e1.k(set, iterable);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set l(@NotNull Set set, Object object) {
        return e1.l(set, object);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set m(@NotNull Set set, @NotNull Iterable iterable) {
        return e1.m(set, iterable);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set n(@NotNull Set set, Object object) {
        return e1.n(set, object);
    }
}

