/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.http.b
 *  io.ktor.http.r0
 *  io.ktor.util.t
 *  io.ktor.util.u
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.http;

import io.ktor.http.a0;
import io.ktor.http.b;
import io.ktor.http.r0;
import io.ktor.http.z;
import io.ktor.util.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\u0001\u00a2\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00120\rH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\"R\u001a\u0010&\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0011\u00a8\u0006)"}, d2={"Lio/ktor/http/q0;", "Lio/ktor/http/a0;", "Lio/ktor/http/z;", "build", "()Lio/ktor/http/z;", "", "name", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "a", "value", "Lkotlin/k0;", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/ktor/util/t;", "stringValues", "e", "(Lio/ktor/util/t;)V", "", "values", "d", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "clear", "()V", "Lio/ktor/http/a0;", "encodedParametersBuilder", "Z", "c", "caseInsensitiveName", "<init>", "(Lio/ktor/http/a0;)V", "ktor-http"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nUrlDecodedParametersBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1549#2:89\n1620#2,3:90\n1549#2:93\n1620#2,3:94\n1549#2:97\n1620#2,3:98\n1549#2:101\n1620#2,3:102\n*S KotlinDebug\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilder\n*L\n18#1:89\n18#1:90,3\n26#1:93\n26#1:94,3\n44#1:97\n44#1:98,3\n50#1:101\n50#1:102,3\n*E\n"})
public final class q0
implements a0 {
    @NotNull
    private final a0 a;
    private final boolean b;

    public q0(@NotNull a0 a02) {
        y.j((Object)a02, (String)"encodedParametersBuilder");
        this.a = a02;
        this.b = a02.c();
    }

    @NotNull
    public Set<Map.Entry<String, List<String>>> a() {
        return r0.d((u)this.a).a();
    }

    @Nullable
    public List<String> b(@NotNull String arrayList) {
        y.j((Object)arrayList, (String)"name");
        Iterator iterator = this.a;
        ArrayList<String> arrayList2 = null;
        iterator = iterator.b(io.ktor.http.b.m((String)((Object)arrayList), (boolean)false, (int)1, null));
        arrayList = arrayList2;
        if (iterator != null) {
            arrayList = (Iterable)((Object)iterator);
            arrayList2 = new ArrayList<String>(t.x(arrayList, 10));
            iterator = arrayList.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!iterator.hasNext()) break;
                arrayList2.add(io.ktor.http.b.k((String)((String)iterator.next()), (int)0, (int)0, (boolean)true, null, (int)11, null));
            }
        }
        return arrayList;
    }

    @Override
    @NotNull
    public z build() {
        return r0.d((u)this.a);
    }

    public boolean c() {
        return this.b;
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(@NotNull String string) {
        y.j((Object)string, (String)"name");
        return this.a.contains(io.ktor.http.b.m((String)string, (boolean)false, (int)1, null));
    }

    public void d(@NotNull String string, @NotNull Iterable<String> object) {
        y.j((Object)string, (String)"name");
        y.j(object, (String)"values");
        a0 a02 = this.a;
        string = io.ktor.http.b.m((String)string, (boolean)false, (int)1, null);
        ArrayList<String> arrayList = new ArrayList<String>(t.x(object, 10));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(io.ktor.http.b.n((String)((String)object.next())));
        }
        a02.d(string, arrayList);
    }

    public void e(@NotNull io.ktor.util.t t3) {
        y.j((Object)t3, (String)"stringValues");
        r0.a((u)this.a, (io.ktor.util.t)t3);
    }

    public void f(@NotNull String string, @NotNull String string2) {
        y.j((Object)string, (String)"name");
        y.j((Object)string2, (String)"value");
        this.a.f(io.ktor.http.b.m((String)string, (boolean)false, (int)1, null), io.ktor.http.b.n((String)string2));
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @NotNull
    public Set<String> names() {
        Object object = this.a.names();
        ArrayList<String> arrayList = new ArrayList<String>(t.x((Iterable)object, 10));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(io.ktor.http.b.k((String)((String)object.next()), (int)0, (int)0, (boolean)false, null, (int)15, null));
        }
        return t.j1(arrayList);
    }
}

