/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.util.pipeline.k
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.e
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.u
 *  kotlin.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util.pipeline;

import io.ktor.util.pipeline.e;
import io.ktor.util.pipeline.k;
import io.ktor.util.pipeline.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Ba\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u00106\u001a\u00028\u0001\u0012H\u0010\u001f\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001d0\u001b\u00a2\u0006\u0004\b7\u00108J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0016\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aRV\u0010\u001f\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001d0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u001eR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0012\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\rR\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00170)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u00020-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010/R\u0014\u00105\u001a\u0002028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2={"Lio/ktor/util/pipeline/n;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/e;", "", "direct", "l", "(Z)Z", "Lkotlin/u;", "result", "Lkotlin/k0;", "m", "(Ljava/lang/Object;)V", "j", "()V", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "subject", "d", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "initial", "a", "Lkotlin/coroutines/d;", "continuation", "i", "(Lkotlin/coroutines/d;)V", "", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "Ljava/util/List;", "blocks", "e", "Lkotlin/coroutines/d;", "getContinuation$ktor_utils", "()Lkotlin/coroutines/d;", "f", "Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "n", "", "g", "[Lkotlin/coroutines/d;", "suspensions", "", "h", "I", "lastSuspensionIndex", "index", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "context", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "ktor-utils"}, k=1, mv={1, 8, 0})
public final class n<TSubject, TContext>
extends e<TSubject, TContext> {
    @NotNull
    private final List<q<e<TSubject, TContext>, TSubject, d<? super k0>, Object>> d;
    @NotNull
    private final d<k0> e;
    @NotNull
    private TSubject f;
    @NotNull
    private final d<TSubject>[] g;
    private int h;
    private int i;

    public n(@NotNull TSubject TSubject, @NotNull TContext TContext, @NotNull List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super d<? super k0>, ? extends Object>> list) {
        y.j(TSubject, (String)"initial");
        y.j(TContext, (String)"context");
        y.j(list, (String)"blocks");
        super(TContext);
        this.d = list;
        this.e = new d<k0>(this){
            private int c;
            final n<TSubject, TContext> d;
            {
                this.d = n4;
                this.c = Integer.MIN_VALUE;
            }

            /*
             * WARNING - combined exceptions agressively - possible behaviour change.
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            private final d<?> a() {
                if (this.c == Integer.MIN_VALUE) {
                    this.c = this.d.h;
                }
                if (this.c < 0) {
                    this.c = Integer.MIN_VALUE;
                    return null;
                }
                try {
                    d d4 = this.d.g;
                    int n4 = this.c;
                    d4 = d4[n4];
                    if (d4 == null) {
                        return m.c;
                    }
                    this.c = n4 - 1;
                    return d4;
                }
                catch (Throwable throwable) {
                    return m.c;
                }
            }

            @Nullable
            public kotlin.coroutines.jvm.internal.e getCallerFrame() {
                Object object = this.a();
                object = object instanceof kotlin.coroutines.jvm.internal.e ? (kotlin.coroutines.jvm.internal.e)object : null;
                return object;
            }

            @NotNull
            public g getContext() {
                d d4 = this.d.g[this.d.h];
                if (d4 != this && d4 != null) {
                    return d4.getContext();
                }
                for (int i4 = this.d.h - 1; i4 >= 0; --i4) {
                    d4 = this.d.g[i4];
                    if (d4 == this || d4 == null) continue;
                    return d4.getContext();
                }
                throw new IllegalStateException("Not started".toString());
            }

            public void resumeWith(@NotNull Object object) {
                if (u.g((Object)object)) {
                    n n4 = this.d;
                    object = u.e((Object)object);
                    y.g((Object)object);
                    n4.m(u.b((Object)v.a((Throwable)object)));
                    return;
                }
                this.d.l(false);
            }
        };
        this.f = TSubject;
        this.g = new d[list.size()];
        this.h = -1;
    }

    private final void j() {
        int n4 = this.h;
        if (n4 >= 0) {
            d<TSubject>[] dArray = this.g;
            this.h = n4 - 1;
            dArray[n4] = null;
            return;
        }
        throw new IllegalStateException("No more continuations to resume");
    }

    /*
     * Exception decompiling
     */
    private final boolean l(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final void m(Object object) {
        int n4 = this.h;
        if (n4 >= 0) {
            d<TSubject> d4 = this.g[n4];
            y.g(d4);
            d<TSubject>[] dArray = this.g;
            n4 = this.h;
            this.h = n4 - 1;
            dArray[n4] = null;
            if (!u.g((Object)object)) {
                d4.resumeWith(object);
            } else {
                object = u.e((Object)object);
                y.g((Object)object);
                d4.resumeWith(u.b((Object)v.a((Throwable)k.a((Throwable)object, d4))));
            }
            return;
        }
        throw new IllegalStateException("No more continuations to resume".toString());
    }

    @Override
    @Nullable
    public Object a(@NotNull TSubject TSubject, @NotNull d<? super TSubject> d4) {
        this.i = 0;
        if (this.d.size() == 0) {
            return TSubject;
        }
        this.n(TSubject);
        if (this.h < 0) {
            return this.c(d4);
        }
        throw new IllegalStateException("Already started");
    }

    @Override
    @Nullable
    public Object c(@NotNull d<? super TSubject> d4) {
        Object object;
        if (this.i == this.d.size()) {
            object = this.k();
        } else {
            this.i(b.c(d4));
            if (this.l(true)) {
                this.j();
                object = this.k();
            } else {
                object = b.f();
            }
        }
        if (object == b.f()) {
            kotlin.coroutines.jvm.internal.g.c(d4);
        }
        return object;
    }

    @Override
    @Nullable
    public Object d(@NotNull TSubject TSubject, @NotNull d<? super TSubject> d4) {
        this.n(TSubject);
        return this.c(d4);
    }

    @NotNull
    public g getCoroutineContext() {
        return this.e.getContext();
    }

    public final void i(@NotNull d<? super TSubject> d4) {
        int n4;
        y.j(d4, (String)"continuation");
        d<TSubject>[] dArray = this.g;
        this.h = n4 = this.h + 1;
        dArray[n4] = d4;
    }

    @NotNull
    public TSubject k() {
        return this.f;
    }

    public void n(@NotNull TSubject TSubject) {
        y.j(TSubject, (String)"<set-?>");
        this.f = TSubject;
    }
}

