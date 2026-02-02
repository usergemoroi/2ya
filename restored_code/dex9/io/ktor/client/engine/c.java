/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.a
 *  io.ktor.client.engine.b
 *  io.ktor.client.engine.b$a
 *  io.ktor.client.engine.d
 *  io.ktor.client.engine.e
 *  io.ktor.util.InternalAPI
 *  io.ktor.util.m
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.y
 *  kotlin.m
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.engine;

import io.ktor.client.a;
import io.ktor.client.engine.b;
import io.ktor.client.engine.d;
import io.ktor.client.engine.e;
import io.ktor.util.InternalAPI;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.y;
import kotlin.m;
import kotlin.n;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.p0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2={"Lio/ktor/client/engine/c;", "Lio/ktor/client/engine/b;", "Lkotlin/k0;", "close", "()V", "", "c", "Ljava/lang/String;", "engineName", "Lkotlinx/coroutines/m0;", "d", "Lkotlinx/coroutines/m0;", "()Lkotlinx/coroutines/m0;", "dispatcher", "Lkotlin/coroutines/g;", "e", "Lkotlin/m;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "<init>", "(Ljava/lang/String;)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public abstract class c
implements b {
    private static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");
    @NotNull
    private final String c;
    @NotNull
    private volatile int closed;
    @NotNull
    private final m0 d;
    @NotNull
    private final m e;

    public c(@NotNull String string) {
        y.j((Object)string, (String)"engineName");
        this.c = string;
        this.closed = 0;
        this.d = io.ktor.client.engine.d.a();
        this.e = n.b(new kotlin.jvm.functions.a<g>(this){
            final c g;
            {
                this.g = c4;
                super(0);
            }

            @Override
            @NotNull
            public final g invoke() {
                g g4 = io.ktor.util.m.b(null, (int)1, null).plus((g)this.g.d());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.g.c);
                stringBuilder.append("-context");
                return g4.plus((g)new p0(stringBuilder.toString()));
            }
        });
    }

    @InternalAPI
    public void B(@NotNull a a4) {
        b.a.h((b)this, (a)a4);
    }

    public void close() {
        if (!f.compareAndSet(this, 0, 1)) {
            return;
        }
        g.b b4 = this.getCoroutineContext().get((g.c)d2.C8);
        b4 = b4 instanceof a0 ? (a0)b4 : null;
        if (b4 == null) {
            return;
        }
        b4.complete();
    }

    @NotNull
    public m0 d() {
        return this.d;
    }

    @NotNull
    public g getCoroutineContext() {
        return (g)this.e.getValue();
    }

    @NotNull
    public Set<e<?>> v() {
        return b.a.g((b)this);
    }
}

