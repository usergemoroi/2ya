/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.call.b
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
package io.ktor.client.plugins.observer;

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
@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u001eR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u0006'"}, d2={"Lio/ktor/client/plugins/observer/d;", "Lio/ktor/client/statement/c;", "Lio/ktor/client/call/b;", "c", "Lio/ktor/client/call/b;", "L", "()Lio/ktor/client/call/b;", "call", "Lio/ktor/utils/io/g;", "d", "Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;", "content", "e", "Lio/ktor/client/statement/c;", "origin", "Lkotlin/coroutines/g;", "f", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "Lio/ktor/http/v;", "()Lio/ktor/http/v;", "status", "Lio/ktor/http/u;", "()Lio/ktor/http/u;", "version", "Lio/ktor/util/date/b;", "()Lio/ktor/util/date/b;", "requestTime", "responseTime", "Lio/ktor/http/k;", "a", "()Lio/ktor/http/k;", "headers", "<init>", "(Lio/ktor/client/call/b;Lio/ktor/utils/io/g;Lio/ktor/client/statement/c;)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class d
extends c {
    @NotNull
    private final b c;
    @NotNull
    private final g d;
    @NotNull
    private final c e;
    @NotNull
    private final kotlin.coroutines.g f;

    public d(@NotNull b b4, @NotNull g g4, @NotNull c c4) {
        y.j((Object)b4, (String)"call");
        y.j((Object)g4, (String)"content");
        y.j((Object)c4, (String)"origin");
        this.c = b4;
        this.d = g4;
        this.e = c4;
        this.f = c4.getCoroutineContext();
    }

    @Override
    @NotNull
    public b L() {
        return this.c;
    }

    @NotNull
    public k a() {
        return this.e.a();
    }

    @Override
    @NotNull
    public g b() {
        return this.d;
    }

    @Override
    @NotNull
    public io.ktor.util.date.b c() {
        return this.e.c();
    }

    @Override
    @NotNull
    public io.ktor.util.date.b d() {
        return this.e.d();
    }

    @Override
    @NotNull
    public v e() {
        return this.e.e();
    }

    @Override
    @NotNull
    public u f() {
        return this.e.f();
    }

    @NotNull
    public kotlin.coroutines.g getCoroutineContext() {
        return this.f;
    }
}

