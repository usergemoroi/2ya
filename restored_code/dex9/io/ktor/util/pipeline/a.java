/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.util.KtorDsl
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util.pipeline;

import io.ktor.util.KtorDsl;
import io.ktor.util.pipeline.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KtorDsl
@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bi\u0012\u0006\u0010$\u001a\u00028\u0001\u0012H\u0010\u0015\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00130\u0010\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u00a2\u0006\u0004\b%\u0010&J\u0013\u0010\u0005\u001a\u00028\u0000H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u0006J\u001b\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\fRV\u0010\u0015\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00130\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006'"}, d2={"Lio/ktor/util/pipeline/a;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/e;", "h", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/k0;", "f", "()V", "subject", "d", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "initial", "a", "", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "Ljava/util/List;", "interceptors", "Lkotlin/coroutines/g;", "e", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "i", "(Ljava/lang/Object;)V", "", "I", "index", "context", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lkotlin/coroutines/g;)V", "ktor-utils"}, k=1, mv={1, 8, 0})
public final class a<TSubject, TContext>
extends e<TSubject, TContext> {
    @NotNull
    private final List<q<e<TSubject, TContext>, TSubject, d<? super k0>, Object>> d;
    @NotNull
    private final g e;
    @NotNull
    private TSubject f;
    private int g;

    public a(@NotNull TContext TContext, @NotNull List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super d<? super k0>, ? extends Object>> list, @NotNull TSubject TSubject, @NotNull g g4) {
        y.j(TContext, (String)"context");
        y.j(list, (String)"interceptors");
        y.j(TSubject, (String)"subject");
        y.j((Object)g4, (String)"coroutineContext");
        super(TContext);
        this.d = list;
        this.e = g4;
        this.f = TSubject;
    }

    /*
     * Unable to fully structure code
     */
    private final Object h(d<? super TSubject> var1_1) {
        if (!(var1_1 instanceof a)) ** GOTO lbl-1000
        var3_2 = var1_1;
        var2_3 = var3_2.o;
        if ((var2_3 & -2147483648) != 0) {
            var3_2.o = var2_3 + -2147483648;
            var1_1 = var3_2;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = new kotlin.coroutines.jvm.internal.d(this, var1_1){
                Object l;
                Object m;
                final a<TSubject, TContext> n;
                int o;
                {
                    this.n = a4;
                    super(d4);
                }

                @Override
                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.m = object;
                    this.o |= Integer.MIN_VALUE;
                    return this.n.h(this);
                }
            };
        }
        var5_4 = var1_1.m;
        var4_5 = b.f();
        var2_3 = var1_1.o;
        if (var2_3 == 0) ** GOTO lbl18
        if (var2_3 == 1) {
            var3_2 = (a)var1_1.l;
            v.b((Object)var5_4);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
            // 1 sources

            v.b((Object)var5_4);
            var3_2 = this;
        }
        do {
            block9: {
                block8: {
                    if ((var2_3 = var3_2.g) == -1) break block8;
                    var5_4 = var3_2.d;
                    if (var2_3 < var5_4.size()) break block9;
                    var3_2.f();
                }
                return var3_2.g();
            }
            var5_4 = var5_4.get(var2_3);
            var3_2.g = var2_3 + 1;
            y.h((Object)var5_4, (String)"null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
            var6_6 = var3_2.g();
            var1_1.l = var3_2;
            var1_1.o = 1;
        } while (var5_4.invoke(var3_2, var6_6, var1_1) != var4_5);
        return var4_5;
    }

    @Override
    @Nullable
    public Object a(@NotNull TSubject TSubject, @NotNull d<? super TSubject> d4) {
        this.g = 0;
        this.i(TSubject);
        return this.c(d4);
    }

    @Override
    @Nullable
    public Object c(@NotNull d<? super TSubject> d4) {
        int n4 = this.g;
        if (n4 < 0) {
            return this.g();
        }
        if (n4 >= this.d.size()) {
            this.f();
            return this.g();
        }
        return this.h(d4);
    }

    @Override
    @Nullable
    public Object d(@NotNull TSubject TSubject, @NotNull d<? super TSubject> d4) {
        this.i(TSubject);
        return this.c(d4);
    }

    public void f() {
        this.g = -1;
    }

    @NotNull
    public TSubject g() {
        return this.f;
    }

    @NotNull
    public g getCoroutineContext() {
        return this.e;
    }

    public void i(@NotNull TSubject TSubject) {
        y.j(TSubject, (String)"<set-?>");
        this.f = TSubject;
    }
}

