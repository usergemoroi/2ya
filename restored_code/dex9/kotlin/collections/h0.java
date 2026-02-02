/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.collections.i0;
import kotlin.jvm.internal.markers.a;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u00c2\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002\u00a2\u0006\u0004\b(\u0010)J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u001e0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010 R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006*"}, d2={"Lkotlin/collections/h0;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "readResolve", "()Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "key", "containsKey", "value", "a", "(Ljava/lang/Void;)Z", "b", "(Ljava/lang/Object;)Ljava/lang/Void;", "f", "size", "", "", "d", "()Ljava/util/Set;", "entries", "e", "keys", "", "g", "()Ljava/util/Collection;", "values", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class h0
implements Map,
Serializable,
a {
    @NotNull
    public static final h0 c = new h0();

    private h0() {
    }

    private final Object readResolve() {
        return c;
    }

    public boolean a(@NotNull Void void_) {
        y.j((Object)void_, (String)"value");
        return false;
    }

    @Nullable
    public Void b(@Nullable Object object) {
        return null;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(@Nullable Object object) {
        return false;
    }

    @NotNull
    public Set<Map.Entry> d() {
        return i0.c;
    }

    @NotNull
    public Set<Object> e() {
        return i0.c;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        boolean bl = object instanceof Map && ((Map)object).isEmpty();
        return bl;
    }

    public int f() {
        return 0;
    }

    @NotNull
    public Collection g() {
        return g0.c;
    }

    public Void h(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public void putAll(Map map2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public String toString() {
        return "{}";
    }
}

