/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.call.b
 *  io.ktor.client.request.g
 *  io.ktor.http.u
 *  io.ktor.http.v
 *  io.ktor.util.InternalAPI
 *  io.ktor.util.date.b
 *  io.ktor.utils.io.g
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.statement;

import io.ktor.client.call.b;
import io.ktor.client.statement.c;
import io.ktor.http.k;
import io.ktor.http.u;
import io.ktor.http.v;
import io.ktor.util.InternalAPI;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@InternalAPI
@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u00a8\u0006/"}, d2={"Lio/ktor/client/statement/a;", "Lio/ktor/client/statement/c;", "Lio/ktor/client/call/b;", "c", "Lio/ktor/client/call/b;", "L", "()Lio/ktor/client/call/b;", "call", "Lkotlin/coroutines/g;", "d", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "Lio/ktor/http/v;", "e", "Lio/ktor/http/v;", "()Lio/ktor/http/v;", "status", "Lio/ktor/http/u;", "f", "Lio/ktor/http/u;", "()Lio/ktor/http/u;", "version", "Lio/ktor/util/date/b;", "g", "Lio/ktor/util/date/b;", "()Lio/ktor/util/date/b;", "requestTime", "h", "responseTime", "Lio/ktor/utils/io/g;", "i", "Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;", "content", "Lio/ktor/http/k;", "j", "Lio/ktor/http/k;", "a", "()Lio/ktor/http/k;", "headers", "Lio/ktor/client/request/g;", "responseData", "<init>", "(Lio/ktor/client/call/b;Lio/ktor/client/request/g;)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class a
extends c {
    @NotNull
    private final b c;
    @NotNull
    private final kotlin.coroutines.g d;
    @NotNull
    private final v e;
    @NotNull
    private final u f;
    @NotNull
    private final io.ktor.util.date.b g;
    @NotNull
    private final io.ktor.util.date.b h;
    @NotNull
    private final g i;
    @NotNull
    private final k j;

    public a(@NotNull b object, @NotNull io.ktor.client.request.g g4) {
        y.j((Object)object, (String)"call");
        y.j((Object)g4, (String)"responseData");
        this.c = object;
        this.d = g4.b();
        this.e = g4.f();
        this.f = g4.g();
        this.g = g4.d();
        this.h = g4.e();
        object = g4.a();
        object = object instanceof g ? (g)object : null;
        Object object2 = object;
        if (object == null) {
            object2 = io.ktor.utils.io.g.a.a();
        }
        this.i = object2;
        this.j = g4.c();
    }

    @Override
    @NotNull
    public b L() {
        return this.c;
    }

    @NotNull
    public k a() {
        return this.j;
    }

    @Override
    @NotNull
    public g b() {
        return this.i;
    }

    @Override
    @NotNull
    public io.ktor.util.date.b c() {
        return this.g;
    }

    @Override
    @NotNull
    public io.ktor.util.date.b d() {
        return this.h;
    }

    @Override
    @NotNull
    public v e() {
        return this.e;
    }

    @Override
    @NotNull
    public u f() {
        return this.f;
    }

    @NotNull
    public kotlin.coroutines.g getCoroutineContext() {
        return this.d;
    }
}

