/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.a
 *  io.ktor.client.call.b
 *  io.ktor.utils.io.d
 *  io.ktor.utils.io.g
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.client.call;

import io.ktor.client.a;
import io.ktor.client.call.b;
import io.ktor.client.call.f;
import io.ktor.client.call.g;
import io.ktor.client.statement.c;
import io.ktor.utils.io.d;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0003\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0014X\u0094D\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2={"Lio/ktor/client/call/e;", "Lio/ktor/client/call/b;", "Lio/ktor/utils/io/g;", "f", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "j", "[B", "responseBody", "", "k", "Z", "b", "()Z", "allowDoubleReceive", "Lio/ktor/client/a;", "client", "Lio/ktor/client/request/b;", "request", "Lio/ktor/client/statement/c;", "response", "<init>", "(Lio/ktor/client/a;Lio/ktor/client/request/b;Lio/ktor/client/statement/c;[B)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class e
extends b {
    @NotNull
    private final byte[] j;
    private final boolean k;

    public e(@NotNull a a4, @NotNull io.ktor.client.request.b b4, @NotNull c c4, @NotNull byte[] byArray) {
        y.j((Object)a4, (String)"client");
        y.j((Object)b4, (String)"request");
        y.j((Object)c4, (String)"response");
        y.j((Object)byArray, (String)"responseBody");
        super(a4);
        this.j = byArray;
        this.h(new f(this, b4));
        this.i(new g(this, byArray, c4));
        this.k = true;
    }

    protected boolean b() {
        return this.k;
    }

    @Nullable
    protected Object f(@NotNull kotlin.coroutines.d<? super io.ktor.utils.io.g> d4) {
        return d.a((byte[])this.j);
    }
}

