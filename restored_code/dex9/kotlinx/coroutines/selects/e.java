/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.p
 *  kotlin.k0
 *  kotlinx.coroutines.selects.l
 *  kotlinx.coroutines.selects.m
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.p;
import kotlin.k0;
import kotlinx.coroutines.selects.d;
import kotlinx.coroutines.selects.l;
import kotlinx.coroutines.selects.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u00df\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012U\u0010\u0014\u001aQ\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bj\u0002`\u000f\u0012w\b\u0002\u0010\u0019\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\b\u0018\u00010\bj\u0004\u0018\u0001`\u0018\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006Ri\u0010\u0014\u001aQ\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bj\u0002`\u000f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0089\u0001\u0010\u0019\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\b\u0018\u00010\bj\u0004\u0018\u0001`\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0003\u0010\u0013Ri\u0010\u001c\u001aQ\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bj\u0002`\u001b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013\u00a8\u0006\u001f"}, d2={"Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/selects/d;", "", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/l;", "select", "param", "Lkotlin/k0;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "b", "Lkotlin/jvm/functions/q;", "c", "()Lkotlin/jvm/functions/q;", "regFunc", "internalResult", "", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/q;Lkotlin/jvm/functions/q;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class e
implements d {
    @NotNull
    private final Object a;
    @NotNull
    private final q<Object, l<?>, Object, k0> b;
    @Nullable
    private final q<l<?>, Object, Object, q<Throwable, Object, g, k0>> c;
    @NotNull
    private final q<Object, Object, Object, Object> d;

    public e(@NotNull Object object, @NotNull q<Object, ? super l<?>, Object, k0> q4, @Nullable q<? super l<?>, Object, Object, ? extends q<? super Throwable, Object, ? super g, k0>> q5) {
        this.a = object;
        this.b = q4;
        this.c = q5;
        this.d = m.c();
    }

    public /* synthetic */ e(Object object, q q4, q q5, int n4, p p4) {
        if ((n4 & 4) != 0) {
            q5 = null;
        }
        this(object, q4, q5);
    }

    @Nullable
    public q<l<?>, Object, Object, q<Throwable, Object, g, k0>> a() {
        return this.c;
    }

    @NotNull
    public q<Object, Object, Object, Object> b() {
        return this.d;
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

