/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0013J\u0015\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2={"Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "intercepted", "()Lkotlin/coroutines/d;", "Lkotlin/k0;", "releaseIntercepted", "()V", "Lkotlin/coroutines/g;", "_context", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/g;", "context", "completion", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;)V", "(Lkotlin/coroutines/d;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.3")
@SourceDebugExtension(value={"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class d
extends a {
    @Nullable
    private final g _context;
    @Nullable
    private transient kotlin.coroutines.d<Object> intercepted;

    public d(@Nullable kotlin.coroutines.d<Object> d4) {
        g g4 = d4 != null ? d4.getContext() : null;
        this(d4, g4);
    }

    public d(@Nullable kotlin.coroutines.d<Object> d4, @Nullable g g4) {
        super(d4);
        this._context = g4;
    }

    @NotNull
    public g getContext() {
        g g4 = this._context;
        y.g((Object)g4);
        return g4;
    }

    @NotNull
    public final kotlin.coroutines.d<Object> intercepted() {
        Object object;
        block2: {
            block4: {
                block3: {
                    kotlin.coroutines.d<Object> d4;
                    object = d4 = this.intercepted;
                    if (d4 != null) break block2;
                    object = (e)this.getContext().get((g.c)e.A8);
                    if (object == null) break block3;
                    object = d4 = object.interceptContinuation(this);
                    if (d4 != null) break block4;
                }
                object = this;
            }
            this.intercepted = object;
        }
        return object;
    }

    @Override
    protected void releaseIntercepted() {
        kotlin.coroutines.d<Object> d4 = this.intercepted;
        if (d4 != null && d4 != this) {
            g.b b4 = this.getContext().get((g.c)e.A8);
            y.g((Object)b4);
            ((e)b4).releaseInterceptedContinuation(d4);
        }
        this.intercepted = c.c;
    }
}

