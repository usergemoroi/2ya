/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.http.k$b
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.e
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.http;

import io.ktor.http.k;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.b1;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level=kotlin.e.d, message="Empty headers is internal", replaceWith=@ReplaceWith(expression="Headers.Empty", imports={}))
@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\n0\u0007H\u0016\u00a2\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2={"Lio/ktor/http/e;", "Lio/ktor/http/k;", "", "name", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "a", "toString", "()Ljava/lang/String;", "", "c", "()Z", "caseInsensitiveName", "<init>", "()V", "ktor-http"}, k=1, mv={1, 8, 0})
public final class e
implements k {
    @NotNull
    public static final e c = new e();

    private e() {
    }

    @NotNull
    public Set<Map.Entry<String, List<String>>> a() {
        return b1.f();
    }

    @Nullable
    public List<String> b(@NotNull String string) {
        y.j((Object)string, (String)"name");
        return null;
    }

    public boolean c() {
        return true;
    }

    public void d(@NotNull p<? super String, ? super List<String>, k0> p4) {
        k.b.a((k)this, p4);
    }

    @Nullable
    public String get(@NotNull String string) {
        return k.b.b((k)this, (String)string);
    }

    @NotNull
    public Set<String> names() {
        return b1.f();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Headers ");
        stringBuilder.append(this.a());
        return stringBuilder.toString();
    }
}

