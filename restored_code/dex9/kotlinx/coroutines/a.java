/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.c0
 *  kotlinx.coroutines.e0
 *  kotlinx.coroutines.k0
 *  kotlinx.coroutines.k2
 *  kotlinx.coroutines.o0
 *  kotlinx.coroutines.q0
 *  kotlinx.coroutines.s0
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00103\u001a\u00020'\u0012\u0006\u00104\u001a\u00020\f\u0012\u0006\u00105\u001a\u00020\f\u00a2\u0006\u0004\b6\u00107J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004\u00a2\u0006\u0004\b\u0015\u0010\tJ\u001b\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u00a2\u0006\u0004\b\u0018\u0010\tJ\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014\u00a2\u0006\u0004\b\u0019\u0010\tJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0010\u00a2\u0006\u0004\b\u001d\u0010\u0012JL\u0010%\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00028\u00012'\u0010$\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00130\"\u00a2\u0006\u0002\b#\u00a2\u0006\u0004\b%\u0010&R\u001d\u0010.\u001a\u00020'8\u0006\u00a2\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020'8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010+R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u00102\u00a8\u00068"}, d2={"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/j2;", "Lkotlinx/coroutines/d2;", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/q0;", "value", "Lkotlin/k0;", "a1", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "Z0", "(Ljava/lang/Throwable;Z)V", "", "Y", "()Ljava/lang/String;", "", "state", "H0", "Lkotlin/u;", "result", "resumeWith", "Y0", "exception", "r0", "(Ljava/lang/Throwable;)V", "A0", "R", "Lkotlinx/coroutines/s0;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "b1", "(Lkotlinx/coroutines/s0;Ljava/lang/Object;Lkotlin/jvm/functions/p;)V", "Lkotlin/coroutines/g;", "e", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "isActive", "()Z", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;ZZ)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@InternalCoroutinesApi
public abstract class a<T>
extends j2
implements d2,
d<T>,
q0 {
    @NotNull
    private final g e;

    public a(@NotNull g g4, boolean bl, boolean bl2) {
        super(bl2);
        if (bl) {
            this.s0((d2)g4.get((g.c)d2.C8));
        }
        this.e = g4.plus((g)this);
    }

    @Override
    @NotNull
    public String A0() {
        String string = k0.g((g)this.e);
        if (string == null) {
            return super.A0();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\"');
        stringBuilder.append(string);
        stringBuilder.append("\":");
        stringBuilder.append(super.A0());
        return stringBuilder.toString();
    }

    @Override
    protected final void H0(@Nullable Object object) {
        if (object instanceof c0) {
            object = (c0)object;
            this.Z0(((c0)object).a, object.a());
        } else {
            this.a1(object);
        }
    }

    @Override
    @NotNull
    protected String Y() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(u0.a((Object)this));
        stringBuilder.append(" was cancelled");
        return stringBuilder.toString();
    }

    protected void Y0(@Nullable Object object) {
        this.P(object);
    }

    protected void Z0(@NotNull Throwable throwable, boolean bl) {
    }

    protected void a1(T t3) {
    }

    public final <R> void b1(@NotNull s0 s02, R r4, @NotNull p<? super R, ? super d<? super T>, ? extends Object> p4) {
        s02.c(p4, r4, (d)this);
    }

    @NotNull
    public final g getContext() {
        return this.e;
    }

    @NotNull
    public g getCoroutineContext() {
        return this.e;
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }

    @Override
    public final void r0(@NotNull Throwable throwable) {
        o0.a((g)this.e, (Throwable)throwable);
    }

    public final void resumeWith(@NotNull Object object) {
        if ((object = this.z0(e0.b((Object)object))) == k2.b) {
            return;
        }
        this.Y0(object);
    }
}

