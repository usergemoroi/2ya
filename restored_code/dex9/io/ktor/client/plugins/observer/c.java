/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.call.b
 *  io.ktor.http.p0
 *  io.ktor.http.t
 *  io.ktor.util.b
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.plugins.observer;

import io.ktor.client.call.b;
import io.ktor.http.k;
import io.ktor.http.p0;
import io.ktor.http.t;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001f"}, d2={"Lio/ktor/client/plugins/observer/c;", "Lio/ktor/client/request/b;", "Lio/ktor/client/call/b;", "c", "Lio/ktor/client/call/b;", "L", "()Lio/ktor/client/call/b;", "call", "Lio/ktor/util/b;", "q", "()Lio/ktor/util/b;", "attributes", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "Lio/ktor/http/k;", "a", "()Lio/ktor/http/k;", "headers", "Lio/ktor/http/t;", "H", "()Lio/ktor/http/t;", "method", "Lio/ktor/http/p0;", "getUrl", "()Lio/ktor/http/p0;", "url", "origin", "<init>", "(Lio/ktor/client/call/b;Lio/ktor/client/request/b;)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class c
implements io.ktor.client.request.b {
    @NotNull
    private final b c;
    private final io.ktor.client.request.b d;

    public c(@NotNull b b4, @NotNull io.ktor.client.request.b b5) {
        y.j((Object)b4, (String)"call");
        y.j((Object)b5, (String)"origin");
        this.c = b4;
        this.d = b5;
    }

    @Override
    @NotNull
    public t H() {
        return this.d.H();
    }

    @Override
    @NotNull
    public b L() {
        return this.c;
    }

    @NotNull
    public k a() {
        return this.d.a();
    }

    @Override
    @NotNull
    public g getCoroutineContext() {
        return this.d.getCoroutineContext();
    }

    @Override
    @NotNull
    public p0 getUrl() {
        return this.d.getUrl();
    }

    @Override
    @NotNull
    public io.ktor.util.b q() {
        return this.d.q();
    }
}

