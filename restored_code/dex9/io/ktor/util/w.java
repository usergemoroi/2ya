/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.a
 *  io.ktor.util.j
 *  io.ktor.util.k
 *  io.ktor.util.t
 *  io.ktor.util.x
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util;

import androidx.compose.animation.a;
import io.ktor.util.j;
import io.ktor.util.k;
import io.ktor.util.t;
import io.ktor.util.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010 \u001a\u00020\r\u0012\u001a\b\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040!\u00a2\u0006\u0004\b&\u0010'J\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00100\nH\u0016\u00a2\u0006\u0004\b\u0011\u0010\fJ/\u0010\u0015\u001a\u00020\u00132\u001e\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u000fR,\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040!8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$\u00a8\u0006("}, d2={"Lio/ktor/util/w;", "Lio/ktor/util/t;", "", "name", "", "e", "(Ljava/lang/String;)Ljava/util/List;", "get", "(Ljava/lang/String;)Ljava/lang/String;", "b", "", "names", "()Ljava/util/Set;", "", "isEmpty", "()Z", "", "a", "Lkotlin/Function2;", "Lkotlin/k0;", "body", "d", "(Lkotlin/jvm/functions/p;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Z", "caseInsensitiveName", "", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "values", "<init>", "(ZLjava/util/Map;)V", "ktor-utils"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n215#2:423\n216#2:425\n1#3:424\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesImpl\n*L\n163#1:423\n163#1:425\n*E\n"})
public class w
implements t {
    private final boolean c;
    @NotNull
    private final Map<String, List<String>> d;

    public w(boolean bl, @NotNull Map<String, ? extends List<String>> object) {
        y.j((Object)object, (String)"values");
        this.c = bl;
        LinkedHashMap<String, List<String>> linkedHashMap = bl ? k.a() : new LinkedHashMap<String, List<String>>();
        for (Map.Entry entry : object.entrySet()) {
            object = (String)entry.getKey();
            List object2 = (List)entry.getValue();
            int n4 = object2.size();
            ArrayList<String> arrayList = new ArrayList<String>(n4);
            for (int i4 = 0; i4 < n4; ++i4) {
                arrayList.add((String)object2.get(i4));
            }
            linkedHashMap.put((String)object, arrayList);
        }
        this.d = linkedHashMap;
    }

    private final List<String> e(String string) {
        return this.d.get(string);
    }

    @NotNull
    public Set<Map.Entry<String, List<String>>> a() {
        return j.a(this.d.entrySet());
    }

    @Nullable
    public List<String> b(@NotNull String string) {
        y.j((Object)string, (String)"name");
        return this.e(string);
    }

    public final boolean c() {
        return this.c;
    }

    public void d(@NotNull p<? super String, ? super List<String>, k0> p4) {
        y.j(p4, (String)"body");
        for (Map.Entry<String, List<String>> entry : this.d.entrySet()) {
            p4.invoke(entry.getKey(), entry.getValue());
        }
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof t)) {
            return false;
        }
        boolean bl = this.c;
        if (bl != (object = (t)object).c()) {
            return false;
        }
        return x.a(this.a(), (Set)object.a());
    }

    @Nullable
    public String get(@NotNull String object) {
        y.j((Object)object, (String)"name");
        object = this.e((String)object);
        object = object != null ? (String)kotlin.collections.t.t0((List)object) : null;
        return object;
    }

    public int hashCode() {
        return x.b(this.a(), (int)(a.a((boolean)this.c) * 31));
    }

    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    @NotNull
    public Set<String> names() {
        return j.a(this.d.keySet());
    }
}

