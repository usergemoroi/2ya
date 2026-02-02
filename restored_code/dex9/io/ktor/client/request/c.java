/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.engine.e
 *  io.ktor.client.engine.f
 *  io.ktor.client.request.c$a
 *  io.ktor.client.request.d
 *  io.ktor.client.request.i
 *  io.ktor.http.content.b
 *  io.ktor.http.f0
 *  io.ktor.http.n0
 *  io.ktor.http.p0
 *  io.ktor.http.r
 *  io.ktor.http.t
 *  io.ktor.util.InternalAPI
 *  io.ktor.util.b
 *  io.ktor.util.d
 *  io.ktor.util.e
 *  io.ktor.util.reflect.a
 *  io.ktor.util.u
 *  io.ktor.util.x
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.z2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.client.request;

import io.ktor.client.engine.e;
import io.ktor.client.engine.f;
import io.ktor.client.request.c;
import io.ktor.client.request.d;
import io.ktor.client.request.i;
import io.ktor.http.f0;
import io.ktor.http.k;
import io.ktor.http.l;
import io.ktor.http.n0;
import io.ktor.http.p0;
import io.ktor.http.r;
import io.ktor.http.t;
import io.ktor.util.InternalAPI;
import io.ktor.util.u;
import io.ktor.util.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001\u0014B\u0007\u00a2\u0006\u0004\b>\u0010?J\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000\u00a2\u0006\u0004\b\b\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0014\u0010#R*\u0010+\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t8\u0006@GX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R*\u00103\u001a\u00020,2\u0006\u0010%\u001a\u00020,8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0017\u00107\u001a\u0002048\u0006\u00a2\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b!\u00106R(\u0010=\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088F@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010:\"\u0004\b;\u0010<\u00a8\u0006@"}, d2={"Lio/ktor/client/request/c;", "Lio/ktor/http/r;", "Lio/ktor/client/request/d;", "b", "()Lio/ktor/client/request/d;", "builder", "p", "(Lio/ktor/client/request/c;)Lio/ktor/client/request/c;", "o", "", "T", "Lio/ktor/client/engine/e;", "key", "capability", "Lkotlin/k0;", "l", "(Lio/ktor/client/engine/e;Ljava/lang/Object;)V", "f", "(Lio/ktor/client/engine/e;)Ljava/lang/Object;", "Lio/ktor/http/f0;", "a", "Lio/ktor/http/f0;", "i", "()Lio/ktor/http/f0;", "url", "Lio/ktor/http/t;", "Lio/ktor/http/t;", "h", "()Lio/ktor/http/t;", "n", "(Lio/ktor/http/t;)V", "method", "Lio/ktor/http/l;", "c", "Lio/ktor/http/l;", "()Lio/ktor/http/l;", "headers", "<set-?>", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "body", "Lkotlinx/coroutines/d2;", "e", "Lkotlinx/coroutines/d2;", "g", "()Lkotlinx/coroutines/d2;", "m", "(Lkotlinx/coroutines/d2;)V", "executionContext", "Lio/ktor/util/b;", "Lio/ktor/util/b;", "()Lio/ktor/util/b;", "attributes", "Lio/ktor/util/reflect/a;", "value", "()Lio/ktor/util/reflect/a;", "k", "(Lio/ktor/util/reflect/a;)V", "bodyType", "<init>", "()V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class c
implements r {
    @NotNull
    public static final a g = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final f0 a = new f0(null, null, 0, null, null, null, null, null, false, 511, null);
    @NotNull
    private t b = t.b.a();
    @NotNull
    private final l c = new l(0, 1, null);
    @NotNull
    private Object d = io.ktor.client.utils.c.a;
    @NotNull
    private d2 e = z2.b(null, (int)1, null);
    @NotNull
    private final io.ktor.util.b f = io.ktor.util.d.a((boolean)true);

    @NotNull
    public l a() {
        return this.c;
    }

    @NotNull
    public final d b() {
        p0 p02 = this.a.b();
        t t3 = this.b;
        k k2 = this.a().n();
        Object object = this.d;
        object = object instanceof io.ktor.http.content.b ? (io.ktor.http.content.b)object : null;
        if (object != null) {
            return new d(p02, t3, k2, (io.ktor.http.content.b)object, this.e, this.f);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("No request transformation found: ");
        ((StringBuilder)object).append(this.d);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    @NotNull
    public final io.ktor.util.b c() {
        return this.f;
    }

    @NotNull
    public final Object d() {
        return this.d;
    }

    @Nullable
    public final io.ktor.util.reflect.a e() {
        return (io.ktor.util.reflect.a)this.f.d(i.a());
    }

    @Nullable
    public final <T> T f(@NotNull e<T> object) {
        y.j(object, (String)"key");
        Map map2 = (Map)this.f.d(io.ktor.client.engine.f.a());
        object = map2 != null ? map2.get(object) : null;
        return (T)object;
    }

    @NotNull
    public final d2 g() {
        return this.e;
    }

    @NotNull
    public final t h() {
        return this.b;
    }

    @NotNull
    public final f0 i() {
        return this.a;
    }

    @InternalAPI
    public final void j(@NotNull Object object) {
        y.j((Object)object, (String)"<set-?>");
        this.d = object;
    }

    @InternalAPI
    public final void k(@Nullable io.ktor.util.reflect.a a4) {
        if (a4 != null) {
            this.f.a(i.a(), (Object)a4);
        } else {
            this.f.b(i.a());
        }
    }

    public final <T> void l(@NotNull e<T> e4, @NotNull T t3) {
        y.j(e4, (String)"key");
        y.j(t3, (String)"capability");
        ((Map)this.f.f(io.ktor.client.engine.f.a(), (kotlin.jvm.functions.a)io.ktor.client.request.c$b.g)).put(e4, t3);
    }

    public final void m(@NotNull d2 d22) {
        y.j((Object)d22, (String)"<set-?>");
        this.e = d22;
    }

    public final void n(@NotNull t t3) {
        y.j((Object)t3, (String)"<set-?>");
        this.b = t3;
    }

    @NotNull
    public final c o(@NotNull c c4) {
        y.j((Object)c4, (String)"builder");
        this.b = c4.b;
        this.d = c4.d;
        this.k(c4.e());
        n0.g((f0)this.a, (f0)c4.a);
        f0 f02 = this.a;
        f02.u(f02.g());
        x.c((u)this.a(), (u)c4.a());
        io.ktor.util.e.a((io.ktor.util.b)this.f, (io.ktor.util.b)c4.f);
        return this;
    }

    @InternalAPI
    @NotNull
    public final c p(@NotNull c c4) {
        y.j((Object)c4, (String)"builder");
        this.e = c4.e;
        return this.o(c4);
    }
}

