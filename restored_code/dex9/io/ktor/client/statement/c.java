/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.call.b
 *  io.ktor.client.statement.e
 *  io.ktor.http.q
 *  io.ktor.http.u
 *  io.ktor.http.v
 *  io.ktor.util.date.b
 *  io.ktor.utils.io.g
 *  kotlin.Metadata
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.statement;

import io.ktor.client.call.b;
import io.ktor.client.statement.e;
import io.ktor.http.q;
import io.ktor.http.u;
import io.ktor.http.v;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u00188&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001f"}, d2={"Lio/ktor/client/statement/c;", "Lio/ktor/http/q;", "Lkotlinx/coroutines/q0;", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/call/b;", "L", "()Lio/ktor/client/call/b;", "call", "Lio/ktor/http/v;", "e", "()Lio/ktor/http/v;", "status", "Lio/ktor/http/u;", "f", "()Lio/ktor/http/u;", "version", "Lio/ktor/util/date/b;", "c", "()Lio/ktor/util/date/b;", "requestTime", "d", "responseTime", "Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;", "getContent$annotations", "()V", "content", "<init>", "ktor-client-core"}, k=1, mv={1, 8, 0})
public abstract class c
implements q,
q0 {
    @NotNull
    public abstract b L();

    @NotNull
    public abstract g b();

    @NotNull
    public abstract io.ktor.util.date.b c();

    @NotNull
    public abstract io.ktor.util.date.b d();

    @NotNull
    public abstract v e();

    @NotNull
    public abstract u f();

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HttpResponse[");
        stringBuilder.append(e.e((c)this).getUrl());
        stringBuilder.append(", ");
        stringBuilder.append(this.e());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

