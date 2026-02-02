/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Metadata
 *  kotlin.g0
 *  kotlin.jvm.internal.y
 *  kotlin.m
 *  kotlin.w$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.g0;
import kotlin.i;
import kotlin.jvm.internal.y;
import kotlin.m;
import kotlin.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u001cB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\b@\bX\u0088\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007\u00a8\u0006\u001d"}, d2={"Lkotlin/w;", "T", "Lkotlin/m;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/a;", "initializer", "d", "Ljava/lang/Object;", "_value", "e", "final", "getValue", "value", "<init>", "(Lkotlin/jvm/functions/a;)V", "f", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class w<T>
implements m<T>,
Serializable {
    @NotNull
    public static final a f = new /* Unavailable Anonymous Inner Class!! */;
    private static final AtomicReferenceFieldUpdater<w<?>, Object> g = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "d");
    @Nullable
    private volatile kotlin.jvm.functions.a<? extends T> c;
    @Nullable
    private volatile Object d;
    @NotNull
    private final Object e;

    public w(@NotNull kotlin.jvm.functions.a<? extends T> g02) {
        y.j(g02, (String)"initializer");
        this.c = g02;
        g02 = g0.a;
        this.d = g02;
        this.e = g02;
    }

    private final Object writeReplace() {
        return new i<T>(this.getValue());
    }

    public T getValue() {
        kotlin.jvm.functions.a<T> a4 = this.d;
        g0 g02 = g0.a;
        if (a4 != g02) {
            return (T)a4;
        }
        a4 = this.c;
        if (a4 != null && androidx.concurrent.futures.a.a(g, (Object)this, (Object)g02, a4 = a4.invoke())) {
            this.c = null;
            return (T)a4;
        }
        return (T)this.d;
    }

    public boolean isInitialized() {
        boolean bl = this.d != g0.a;
        return bl;
    }

    @NotNull
    public String toString() {
        String string = this.isInitialized() ? String.valueOf(this.getValue()) : "Lazy value not initialized yet.";
        return string;
    }
}

