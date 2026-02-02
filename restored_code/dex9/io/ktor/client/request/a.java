/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.call.b
 *  io.ktor.client.request.d
 *  io.ktor.http.content.b
 *  io.ktor.http.p0
 *  io.ktor.http.t
 *  io.ktor.util.InternalAPI
 *  io.ktor.util.b
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.request;

import io.ktor.client.request.b;
import io.ktor.client.request.d;
import io.ktor.http.k;
import io.ktor.http.p0;
import io.ktor.http.t;
import io.ktor.util.InternalAPI;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@InternalAPI
@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020*\u00a2\u0006\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b'\u0010(\u00a8\u0006."}, d2={"Lio/ktor/client/request/a;", "Lio/ktor/client/request/b;", "Lio/ktor/client/call/b;", "c", "Lio/ktor/client/call/b;", "L", "()Lio/ktor/client/call/b;", "call", "Lio/ktor/http/t;", "d", "Lio/ktor/http/t;", "H", "()Lio/ktor/http/t;", "method", "Lio/ktor/http/p0;", "e", "Lio/ktor/http/p0;", "getUrl", "()Lio/ktor/http/p0;", "url", "Lio/ktor/http/content/b;", "f", "Lio/ktor/http/content/b;", "getContent", "()Lio/ktor/http/content/b;", "content", "Lio/ktor/http/k;", "g", "Lio/ktor/http/k;", "a", "()Lio/ktor/http/k;", "headers", "Lio/ktor/util/b;", "h", "Lio/ktor/util/b;", "q", "()Lio/ktor/util/b;", "attributes", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "Lio/ktor/client/request/d;", "data", "<init>", "(Lio/ktor/client/call/b;Lio/ktor/client/request/d;)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public class a
implements b {
    @NotNull
    private final io.ktor.client.call.b c;
    @NotNull
    private final t d;
    @NotNull
    private final p0 e;
    @NotNull
    private final io.ktor.http.content.b f;
    @NotNull
    private final k g;
    @NotNull
    private final io.ktor.util.b h;

    public a(@NotNull io.ktor.client.call.b b4, @NotNull d d4) {
        y.j((Object)b4, (String)"call");
        y.j((Object)d4, (String)"data");
        this.c = b4;
        this.d = d4.f();
        this.e = d4.h();
        this.f = d4.b();
        this.g = d4.e();
        this.h = d4.a();
    }

    @Override
    @NotNull
    public t H() {
        return this.d;
    }

    @Override
    @NotNull
    public io.ktor.client.call.b L() {
        return this.c;
    }

    @NotNull
    public k a() {
        return this.g;
    }

    @Override
    @NotNull
    public g getCoroutineContext() {
        return this.L().getCoroutineContext();
    }

    @Override
    @NotNull
    public p0 getUrl() {
        return this.e;
    }

    @Override
    @NotNull
    public io.ktor.util.b q() {
        return this.h;
    }
}

