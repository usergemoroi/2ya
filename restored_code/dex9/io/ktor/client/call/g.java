/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.http.u
 *  io.ktor.http.v
 *  io.ktor.util.date.b
 *  io.ktor.utils.io.d
 *  io.ktor.utils.io.g
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.g2
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.call;

import io.ktor.client.call.e;
import io.ktor.client.statement.c;
import io.ktor.http.k;
import io.ktor.http.u;
import io.ktor.http.v;
import io.ktor.util.date.b;
import io.ktor.utils.io.d;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.g2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00102\u001a\u00020\u0001\u00a2\u0006\u0004\b3\u00104R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010/\u001a\u00020(8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,\u00a8\u00065"}, d2={"Lio/ktor/client/call/g;", "Lio/ktor/client/statement/c;", "Lio/ktor/client/call/e;", "c", "Lio/ktor/client/call/e;", "g", "()Lio/ktor/client/call/e;", "call", "Lkotlinx/coroutines/a0;", "d", "Lkotlinx/coroutines/a0;", "context", "Lio/ktor/http/v;", "e", "Lio/ktor/http/v;", "()Lio/ktor/http/v;", "status", "Lio/ktor/http/u;", "f", "Lio/ktor/http/u;", "()Lio/ktor/http/u;", "version", "Lio/ktor/util/date/b;", "Lio/ktor/util/date/b;", "()Lio/ktor/util/date/b;", "requestTime", "h", "responseTime", "Lio/ktor/http/k;", "i", "Lio/ktor/http/k;", "a", "()Lio/ktor/http/k;", "headers", "Lkotlin/coroutines/g;", "j", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "Lio/ktor/utils/io/g;", "k", "Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;", "getContent$annotations", "()V", "content", "", "body", "origin", "<init>", "(Lio/ktor/client/call/e;[BLio/ktor/client/statement/c;)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class g
extends c {
    @NotNull
    private final e c;
    @NotNull
    private final a0 d;
    @NotNull
    private final v e;
    @NotNull
    private final u f;
    @NotNull
    private final b g;
    @NotNull
    private final b h;
    @NotNull
    private final k i;
    @NotNull
    private final kotlin.coroutines.g j;
    @NotNull
    private final io.ktor.utils.io.g k;

    public g(@NotNull e object, @NotNull byte[] byArray, @NotNull c c4) {
        y.j((Object)object, (String)"call");
        y.j((Object)byArray, (String)"body");
        y.j((Object)c4, (String)"origin");
        this.c = object;
        object = g2.b(null, (int)1, null);
        this.d = object;
        this.e = c4.e();
        this.f = c4.f();
        this.g = c4.c();
        this.h = c4.d();
        this.i = c4.a();
        this.j = c4.getCoroutineContext().plus((kotlin.coroutines.g)object);
        this.k = io.ktor.utils.io.d.a((byte[])byArray);
    }

    @NotNull
    public k a() {
        return this.i;
    }

    @Override
    @NotNull
    public io.ktor.utils.io.g b() {
        return this.k;
    }

    @Override
    @NotNull
    public b c() {
        return this.g;
    }

    @Override
    @NotNull
    public b d() {
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
    public e g() {
        return this.c;
    }

    @NotNull
    public kotlin.coroutines.g getCoroutineContext() {
        return this.j;
    }
}

