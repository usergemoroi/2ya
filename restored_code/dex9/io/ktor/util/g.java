/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.util.h
 *  io.ktor.util.y
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util;

import io.ktor.util.h;
import io.ktor.util.n;
import io.ktor.util.y;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007\u00a2\u0006\u0004\b0\u0010\u0012J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00102\u0014\u0010\u0016\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0015H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0019\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010'R&\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000)0%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010'R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000,8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010.\u00a8\u00061"}, d2={"Lio/ktor/util/g;", "", "Value", "", "", "key", "", "a", "(Ljava/lang/String;)Z", "value", "containsValue", "(Ljava/lang/Object;)Z", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "isEmpty", "()Z", "Lkotlin/k0;", "clear", "()V", "h", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "i", "other", "equals", "", "hashCode", "()I", "Lio/ktor/util/h;", "c", "Ljava/util/Map;", "delegate", "f", "size", "", "e", "()Ljava/util/Set;", "keys", "", "d", "entries", "", "g", "()Ljava/util/Collection;", "values", "<init>", "ktor-utils"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nCaseInsensitiveMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaseInsensitiveMap.kt\nio/ktor/util/CaseInsensitiveMap\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,78:1\n215#2,2:79\n*S KotlinDebug\n*F\n+ 1 CaseInsensitiveMap.kt\nio/ktor/util/CaseInsensitiveMap\n*L\n30#1:79,2\n*E\n"})
public final class g<Value>
implements Map<String, Value>,
e {
    @NotNull
    private final Map<h, Value> c = new LinkedHashMap<h, Value>();

    public boolean a(@NotNull String string) {
        kotlin.jvm.internal.y.j((Object)string, (String)"key");
        return this.c.containsKey(new h(string));
    }

    @Nullable
    public Value b(@NotNull String string) {
        kotlin.jvm.internal.y.j((Object)string, (String)"key");
        return this.c.get(y.a((String)string));
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public boolean containsValue(@Nullable Object object) {
        if (object == null) {
            return false;
        }
        return this.c.containsValue(object);
    }

    @NotNull
    public Set<Map.Entry<String, Value>> d() {
        return new n(this.c.entrySet(), a.g, b.g);
    }

    @NotNull
    public Set<String> e() {
        return new n<h, String>(this.c.keySet(), io.ktor.util.g$c.g, d.g);
    }

    @Override
    public boolean equals(@Nullable Object object) {
        if (object != null && object instanceof g) {
            return kotlin.jvm.internal.y.e(((g)object).c, this.c);
        }
        return false;
    }

    public int f() {
        return this.c.size();
    }

    @NotNull
    public Collection<Value> g() {
        return this.c.values();
    }

    @Nullable
    public Value h(@NotNull String string, @NotNull Value Value) {
        kotlin.jvm.internal.y.j((Object)string, (String)"key");
        kotlin.jvm.internal.y.j(Value, (String)"value");
        return this.c.put(y.a((String)string), Value);
    }

    @Override
    public int hashCode() {
        return ((Object)this.c).hashCode();
    }

    @Nullable
    public Value i(@NotNull String string) {
        kotlin.jvm.internal.y.j((Object)string, (String)"key");
        return this.c.remove(y.a((String)string));
    }

    @Override
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override
    public void putAll(@NotNull Map<? extends String, ? extends Value> object) {
        kotlin.jvm.internal.y.j((Object)object, (String)"from");
        for (Map.Entry entry : object.entrySet()) {
            this.h((String)entry.getKey(), entry.getValue());
        }
    }
}

