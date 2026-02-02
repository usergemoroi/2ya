/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.Serializable
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.JsonObject$Companion
 *  kotlinx.serialization.json.internal.o1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.markers.a;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.a0;
import kotlinx.serialization.json.internal.o1;
import kotlinx.serialization.json.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001*B\u001b\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002\u00a2\u0006\u0004\b(\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006H\u0096\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001c0\u001b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\t8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u000bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010$8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006+"}, d2={"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "key", "b", "(Ljava/lang/String;)Z", "value", "d", "(Lkotlinx/serialization/json/JsonElement;)Z", "e", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "isEmpty", "()Z", "c", "Ljava/util/Map;", "content", "", "", "f", "()Ljava/util/Set;", "entries", "g", "keys", "h", "size", "", "i", "()Ljava/util/Collection;", "values", "<init>", "(Ljava/util/Map;)V", "Companion", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@Serializable(with=a0.class)
public final class JsonObject
extends JsonElement
implements Map<String, JsonElement>,
a {
    @NotNull
    public static final Companion Companion = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final Map<String, JsonElement> c;

    public JsonObject(@NotNull Map<String, ? extends JsonElement> map2) {
        kotlin.jvm.internal.y.j(map2, (String)"content");
        super(null);
        this.c = map2;
    }

    public static /* synthetic */ CharSequence a(Map.Entry entry) {
        return JsonObject.l(entry);
    }

    private static final CharSequence l(Map.Entry object) {
        kotlin.jvm.internal.y.j((Object)object, (String)"<destruct>");
        String string = (String)object.getKey();
        JsonElement jsonElement = (JsonElement)object.getValue();
        object = new StringBuilder();
        o1.c((StringBuilder)object, (String)string);
        ((StringBuilder)object).append(':');
        ((StringBuilder)object).append(jsonElement);
        object = ((StringBuilder)object).toString();
        kotlin.jvm.internal.y.i((Object)object, (String)"toString(...)");
        return object;
    }

    public boolean b(@NotNull String string) {
        kotlin.jvm.internal.y.j((Object)string, (String)"key");
        return this.c.containsKey(string);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean d(@NotNull JsonElement jsonElement) {
        kotlin.jvm.internal.y.j((Object)jsonElement, (String)"value");
        return this.c.containsValue(jsonElement);
    }

    @Nullable
    public JsonElement e(@NotNull String string) {
        kotlin.jvm.internal.y.j((Object)string, (String)"key");
        return this.c.get(string);
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return kotlin.jvm.internal.y.e(this.c, (Object)object);
    }

    @NotNull
    public Set<Map.Entry<String, JsonElement>> f() {
        return this.c.entrySet();
    }

    @NotNull
    public Set<String> g() {
        return this.c.keySet();
    }

    public int h() {
        return this.c.size();
    }

    @Override
    public int hashCode() {
        return ((Object)this.c).hashCode();
    }

    @NotNull
    public Collection<JsonElement> i() {
        return this.c.values();
    }

    @Override
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public JsonElement k(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map<? extends String, ? extends JsonElement> map2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public String toString() {
        return t.B0(this.c.entrySet(), ",", "{", "}", 0, null, new y(), 24, null);
    }
}

