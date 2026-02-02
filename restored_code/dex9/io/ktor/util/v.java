/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.util.j
 *  io.ktor.util.k
 *  io.ktor.util.t
 *  io.ktor.util.u
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util;

import io.ktor.util.j;
import io.ktor.util.k;
import io.ktor.util.t;
import io.ktor.util.u;
import java.util.ArrayList;
import java.util.Iterator;
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

@Metadata(d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u00100\u001a\u00020/\u00a2\u0006\u0004\b1\u00102J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00110\fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u000eJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016\u00a2\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b&\u0010#J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b'\u0010#R\u0017\u0010*\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010\u0010R,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040+8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.\u00a8\u00063"}, d2={"Lio/ktor/util/v;", "Lio/ktor/util/u;", "", "name", "", "g", "(Ljava/lang/String;)Ljava/util/List;", "", "b", "", "contains", "(Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "a", "value", "Lkotlin/k0;", "k", "(Ljava/lang/String;Ljava/lang/String;)V", "h", "(Ljava/lang/String;)Ljava/lang/String;", "f", "Lio/ktor/util/t;", "stringValues", "e", "(Lio/ktor/util/t;)V", "", "values", "d", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "j", "(Ljava/lang/String;)V", "clear", "()V", "l", "m", "Z", "c", "caseInsensitiveName", "", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "", "size", "<init>", "(ZI)V", "ktor-utils"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesBuilderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1855#2,2:423\n766#2:425\n857#2,2:426\n515#3:428\n500#3,6:429\n1#4:435\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesBuilderImpl\n*L\n248#1:423,2\n258#1:425\n258#1:426,2\n266#1:428\n266#1:429,6\n*E\n"})
public class v
implements u {
    private final boolean a;
    @NotNull
    private final Map<String, List<String>> b;

    public v(boolean bl, int n4) {
        this.a = bl;
        LinkedHashMap<String, List<String>> linkedHashMap = bl ? k.a() : new LinkedHashMap<String, List<String>>(n4);
        this.b = linkedHashMap;
    }

    private final List<String> g(String string) {
        List<String> list;
        List<String> list2 = list = this.b.get(string);
        if (list == null) {
            list2 = new ArrayList<String>();
            this.l(string);
            this.b.put(string, list2);
        }
        return list2;
    }

    @NotNull
    public Set<Map.Entry<String, List<String>>> a() {
        return j.a(this.b.entrySet());
    }

    @Nullable
    public List<String> b(@NotNull String string) {
        y.j((Object)string, (String)"name");
        return this.b.get(string);
    }

    public final boolean c() {
        return this.a;
    }

    public void clear() {
        this.b.clear();
    }

    public boolean contains(@NotNull String string) {
        y.j((Object)string, (String)"name");
        return this.b.containsKey(string);
    }

    public void d(@NotNull String object, @NotNull Iterable<String> object2) {
        y.j((Object)object, (String)"name");
        y.j(object2, (String)"values");
        object = this.g((String)object);
        Iterator<String> iterator = object2.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            this.m((String)object2);
            object.add(object2);
        }
    }

    public void e(@NotNull t t3) {
        y.j((Object)t3, (String)"stringValues");
        t3.d((p)new p<String, List<? extends String>, k0>(this){
            final v g;
            {
                this.g = v3;
                super(2);
            }

            public final void a(@NotNull String string, @NotNull List<String> list) {
                y.j((Object)string, (String)"name");
                y.j(list, (String)"values");
                this.g.d(string, (Iterable<String>)list);
            }
        });
    }

    public void f(@NotNull String string, @NotNull String string2) {
        y.j((Object)string, (String)"name");
        y.j((Object)string2, (String)"value");
        this.m(string2);
        this.g(string).add(string2);
    }

    @Nullable
    public String h(@NotNull String object) {
        y.j((Object)object, (String)"name");
        object = this.b((String)object);
        object = object != null ? (String)kotlin.collections.t.t0((List)object) : null;
        return object;
    }

    @NotNull
    protected final Map<String, List<String>> i() {
        return this.b;
    }

    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    public void j(@NotNull String string) {
        y.j((Object)string, (String)"name");
        this.b.remove(string);
    }

    public void k(@NotNull String object, @NotNull String string) {
        y.j((Object)object, (String)"name");
        y.j((Object)string, (String)"value");
        this.m(string);
        object = this.g((String)object);
        object.clear();
        object.add(string);
    }

    protected void l(@NotNull String string) {
        y.j((Object)string, (String)"name");
    }

    protected void m(@NotNull String string) {
        y.j((Object)string, (String)"value");
    }

    @NotNull
    public Set<String> names() {
        return this.b.keySet();
    }
}

