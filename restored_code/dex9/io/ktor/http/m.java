/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.http;

import io.ktor.http.k;
import io.ktor.util.w;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000b"}, d2={"Lio/ktor/http/m;", "Lio/ktor/http/k;", "Lio/ktor/util/w;", "", "toString", "()Ljava/lang/String;", "", "", "values", "<init>", "(Ljava/util/Map;)V", "ktor-http"}, k=1, mv={1, 8, 0})
public final class m
extends w
implements k {
    public m(@NotNull Map<String, ? extends List<String>> map2) {
        y.j(map2, (String)"values");
        super(true, map2);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Headers ");
        stringBuilder.append(this.a());
        return stringBuilder.toString();
    }
}

