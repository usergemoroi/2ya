/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.util.a
 *  io.ktor.util.b
 *  io.ktor.util.b$a
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util;

import io.ktor.util.a;
import io.ktor.util.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\"\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002\u00a2\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00118$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lio/ktor/util/c;", "Lio/ktor/util/b;", "", "T", "Lio/ktor/util/a;", "key", "d", "(Lio/ktor/util/a;)Ljava/lang/Object;", "", "c", "(Lio/ktor/util/a;)Z", "value", "Lkotlin/k0;", "a", "(Lio/ktor/util/a;Ljava/lang/Object;)V", "b", "(Lio/ktor/util/a;)V", "", "g", "()Ljava/util/Map;", "map", "", "getAllKeys", "()Ljava/util/List;", "allKeys", "<init>", "()V", "ktor-utils"}, k=1, mv={1, 8, 0})
abstract class c
implements b {
    public final <T> void a(@NotNull a<T> a4, @NotNull T t3) {
        y.j(a4, (String)"key");
        y.j(t3, (String)"value");
        this.g().put(a4, t3);
    }

    public final <T> void b(@NotNull a<T> a4) {
        y.j(a4, (String)"key");
        this.g().remove(a4);
    }

    public final boolean c(@NotNull a<?> a4) {
        y.j(a4, (String)"key");
        return this.g().containsKey(a4);
    }

    @Nullable
    public final <T> T d(@NotNull a<T> a4) {
        y.j(a4, (String)"key");
        return (T)this.g().get(a4);
    }

    @NotNull
    public <T> T e(@NotNull a<T> a4) {
        return (T)b.a.a((b)this, a4);
    }

    @NotNull
    protected abstract Map<a<?>, Object> g();

    @NotNull
    public final List<a<?>> getAllKeys() {
        return t.e1(this.g().keySet());
    }
}

