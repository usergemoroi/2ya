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
import kotlin.coroutines.g;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.p;
import kotlin.k0;
import kotlinx.coroutines.selects.h;
import kotlinx.coroutines.selects.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u00b6\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012U\u0010\u0016\u001aQ\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u0011\u0012U\u0010\u001b\u001aQ\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nj\u0002`\u0018\u0012w\b\u0002\u0010\"\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001c\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\n\u0018\u00010\nj\u0004\u0018\u0001`\u001f\u00a2\u0006\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bRi\u0010\u0016\u001aQ\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015Ri\u0010\u001b\u001aQ\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nj\u0002`\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0089\u0001\u0010\"\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001c\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\n\u0018\u00010\nj\u0004\u0018\u0001`\u001f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015\u00a8\u0006%"}, d2={"Lkotlinx/coroutines/selects/i;", "P", "Q", "Lkotlinx/coroutines/selects/h;", "", "a", "Ljava/lang/Object;", "getClauseObject", "()Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/l;", "select", "param", "Lkotlin/k0;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "b", "Lkotlin/jvm/functions/q;", "getRegFunc", "()Lkotlin/jvm/functions/q;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "c", "getProcessResFunc", "processResFunc", "internalResult", "", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "d", "getOnCancellationConstructor", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/q;Lkotlin/jvm/functions/q;Lkotlin/jvm/functions/q;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class i<P, Q>
implements h<P, Q> {
    @NotNull
    private final Object a;
    @NotNull
    private final q<Object, l<?>, Object, k0> b;
    @NotNull
    private final q<Object, Object, Object, Object> c;
    @Nullable
    private final q<l<?>, Object, Object, q<Throwable, Object, g, k0>> d;

    public i(@NotNull Object object, @NotNull q<Object, ? super l<?>, Object, k0> q4, @NotNull q<Object, Object, Object, ? extends Object> q5, @Nullable q<? super l<?>, Object, Object, ? extends q<? super Throwable, Object, ? super g, k0>> q6) {
        this.a = object;
        this.b = q4;
        this.c = q5;
        this.d = q6;
    }

    public /* synthetic */ i(Object object, q q4, q q5, q q6, int n4, p p4) {
        if ((n4 & 8) != 0) {
            q6 = null;
        }
        this(object, q4, q5, q6);
    }
}

