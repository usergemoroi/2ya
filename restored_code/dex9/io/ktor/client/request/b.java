/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.call.b
 *  io.ktor.http.p0
 *  io.ktor.http.q
 *  io.ktor.http.t
 *  io.ktor.util.b
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.request;

import io.ktor.http.p0;
import io.ktor.http.q;
import io.ktor.http.t;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, d2={"Lio/ktor/client/request/b;", "Lio/ktor/http/q;", "Lkotlinx/coroutines/q0;", "Lio/ktor/client/call/b;", "L", "()Lio/ktor/client/call/b;", "call", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "Lio/ktor/http/t;", "H", "()Lio/ktor/http/t;", "method", "Lio/ktor/http/p0;", "getUrl", "()Lio/ktor/http/p0;", "url", "Lio/ktor/util/b;", "q", "()Lio/ktor/util/b;", "attributes", "ktor-client-core"}, k=1, mv={1, 8, 0})
public interface b
extends q,
q0 {
    @NotNull
    public t H();

    @NotNull
    public io.ktor.client.call.b L();

    @NotNull
    public g getCoroutineContext();

    @NotNull
    public p0 getUrl();

    @NotNull
    public io.ktor.util.b q();
}

