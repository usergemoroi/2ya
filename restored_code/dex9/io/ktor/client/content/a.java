/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.utils.a
 *  io.ktor.http.content.b
 *  io.ktor.utils.io.d
 *  io.ktor.utils.io.g
 *  io.ktor.utils.io.j
 *  io.ktor.utils.io.q
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.r
 *  kotlin.v
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.client.content;

import io.ktor.http.c;
import io.ktor.http.content.b;
import io.ktor.http.k;
import io.ktor.utils.io.d;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import io.ktor.utils.io.q;
import io.ktor.utils.io.w;
import kotlin.Metadata;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.r;
import kotlin.v;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001Bb\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012F\u0010\u0018\u001aB\b\u0001\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r\u00f8\u0001\u0000\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bRW\u0010\u0018\u001aB\b\u0001\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u001eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010 R\u0014\u0010#\u001a\u00020!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2={"Lio/ktor/client/content/a;", "Lio/ktor/http/content/b$c;", "Lio/ktor/utils/io/g;", "d", "()Lio/ktor/utils/io/g;", "Lio/ktor/http/content/b;", "a", "Lio/ktor/http/content/b;", "delegate", "Lkotlin/coroutines/g;", "b", "Lkotlin/coroutines/g;", "callContext", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "bytesSentTotal", "contentLength", "Lkotlin/coroutines/d;", "Lkotlin/k0;", "", "c", "Lkotlin/jvm/functions/q;", "listener", "Lio/ktor/utils/io/g;", "getContent$annotations", "()V", "content", "Lio/ktor/http/c;", "()Lio/ktor/http/c;", "contentType", "()Ljava/lang/Long;", "Lio/ktor/http/k;", "()Lio/ktor/http/k;", "headers", "<init>", "(Lio/ktor/http/content/b;Lkotlin/coroutines/g;Lkotlin/jvm/functions/q;)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class a
extends b.c {
    @NotNull
    private final b a;
    @NotNull
    private final kotlin.coroutines.g b;
    @NotNull
    private final kotlin.jvm.functions.q<Long, Long, kotlin.coroutines.d<? super k0>, Object> c;
    @NotNull
    private final g d;

    public a(@NotNull b b4, @NotNull kotlin.coroutines.g g4, @NotNull kotlin.jvm.functions.q<? super Long, ? super Long, ? super kotlin.coroutines.d<? super k0>, ? extends Object> q4) {
        block6: {
            block3: {
                block5: {
                    block4: {
                        block2: {
                            y.j((Object)b4, (String)"delegate");
                            y.j((Object)g4, (String)"callContext");
                            y.j(q4, (String)"listener");
                            this.a = b4;
                            this.b = g4;
                            this.c = q4;
                            if (!(b4 instanceof b.a)) break block2;
                            b4 = io.ktor.utils.io.d.a((byte[])((b.a)b4).d());
                            break block3;
                        }
                        if (!(b4 instanceof b.b)) break block4;
                        b4 = g.a.a();
                        break block3;
                    }
                    if (!(b4 instanceof b.c)) break block5;
                    b4 = ((b.c)b4).d();
                    break block3;
                }
                if (!(b4 instanceof b.d)) break block6;
                b4 = q.d((q0)w1.c, (kotlin.coroutines.g)g4, (boolean)true, (p)new p<w, kotlin.coroutines.d<? super k0>, Object>(this, null){
                    int l;
                    private Object m;
                    final a n;
                    {
                        this.n = a4;
                        super(2, d4);
                    }

                    @Nullable
                    public final Object a(@NotNull w w3, @Nullable kotlin.coroutines.d<? super k0> d4) {
                        return (this.create(w3, d4)).invokeSuspend(k0.a);
                    }

                    @Override
                    @NotNull
                    public final kotlin.coroutines.d<k0> create(@Nullable Object object, @NotNull kotlin.coroutines.d<?> p4) {
                        p4 = new /* invalid duplicate definition of identical inner class */;
                        p4.m = object;
                        return p4;
                    }

                    /*
                     * Enabled force condition propagation
                     * Lifted jumps to return sites
                     */
                    @Override
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object) {
                        Object object2 = kotlin.coroutines.intrinsics.b.f();
                        int n4 = this.l;
                        if (n4 != 0) {
                            if (n4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            v.b((Object)object);
                            return k0.a;
                        } else {
                            v.b((Object)object);
                            w w3 = (w)this.m;
                            object = (b.d)this.n.a;
                            w3 = w3.getChannel();
                            this.l = 1;
                            if (((b.d)((Object)object)).d((j)w3, this) != object2) return k0.a;
                            return object2;
                        }
                    }
                }).getChannel();
            }
            this.d = b4;
            return;
        }
        throw new r();
    }

    @Nullable
    public Long a() {
        return this.a.a();
    }

    @Nullable
    public c b() {
        return this.a.b();
    }

    @NotNull
    public k c() {
        return this.a.c();
    }

    @Override
    @NotNull
    public g d() {
        return io.ktor.client.utils.a.a((g)this.d, (kotlin.coroutines.g)this.b, (Long)this.a(), this.c);
    }
}

