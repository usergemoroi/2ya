/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.p
 *  kotlin.k0
 *  kotlinx.coroutines.selects.l
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.p;
import kotlin.k0;
import kotlinx.coroutines.selects.f;
import kotlinx.coroutines.selects.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u00b6\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012U\u0010\u0015\u001aQ\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tj\u0002`\u0010\u0012U\u0010\u0018\u001aQ\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tj\u0002`\u0017\u0012w\b\u0002\u0010\u001d\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\t\u0018\u00010\tj\u0004\u0018\u0001`\u001c\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007Ri\u0010\u0015\u001aQ\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tj\u0002`\u00108\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014Ri\u0010\u0018\u001aQ\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tj\u0002`\u00178\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0089\u0001\u0010\u001d\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\t\u0018\u00010\tj\u0004\u0018\u0001`\u001c8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0004\u0010\u0014\u00a8\u0006 "}, d2={"Lkotlinx/coroutines/selects/g;", "Q", "Lkotlinx/coroutines/selects/f;", "", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/l;", "select", "param", "Lkotlin/k0;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "b", "Lkotlin/jvm/functions/q;", "c", "()Lkotlin/jvm/functions/q;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "internalResult", "", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/q;Lkotlin/jvm/functions/q;Lkotlin/jvm/functions/q;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class g<Q>
implements f<Q> {
    @NotNull
    private final Object a;
    @NotNull
    private final q<Object, l<?>, Object, k0> b;
    @NotNull
    private final q<Object, Object, Object, Object> c;
    @Nullable
    private final q<l<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.g, k0>> d;

    public g(@NotNull Object object, @NotNull q<Object, ? super l<?>, Object, k0> q4, @NotNull q<Object, Object, Object, ? extends Object> q5, @Nullable q<? super l<?>, Object, Object, ? extends q<? super Throwable, Object, ? super kotlin.coroutines.g, k0>> q6) {
        this.a = object;
        this.b = q4;
        this.c = q5;
        this.d = q6;
    }

    public /* synthetic */ g(Object object, q q4, q q5, q q6, int n4, p p4) {
        if ((n4 & 8) != 0) {
            q6 = null;
        }
        this(object, q4, q5, q6);
    }

    @Nullable
    public q<l<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.g, k0>> a() {
        return this.d;
    }

    @NotNull
    public q<Object, Object, Object, Object> b() {
        return this.c;
    }

    @NotNull
    public q<Object, l<?>, Object, k0> c() {
        return this.b;
    }

    @NotNull
    public Object d() {
        return this.a;
    }
}

