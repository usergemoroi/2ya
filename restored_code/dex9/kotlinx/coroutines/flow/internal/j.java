/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.channels.t
 *  kotlinx.coroutines.channels.x
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.i
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.channels.t;
import kotlinx.coroutines.channels.x;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.internal.e;
import kotlinx.coroutines.flow.internal.z;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0094@\u00a2\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lkotlinx/coroutines/flow/internal/j;", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "j", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/internal/e;", "Lkotlinx/coroutines/q0;", "scope", "Lkotlinx/coroutines/channels/x;", "n", "(Lkotlinx/coroutines/q0;)Lkotlinx/coroutines/channels/x;", "Lkotlinx/coroutines/channels/v;", "Lkotlin/k0;", "i", "(Lkotlinx/coroutines/channels/v;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/flow/h;", "f", "Ljava/lang/Iterable;", "flows", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n91#1:97,2\n*E\n"})
public final class j<T>
extends e<T> {
    @NotNull
    private final Iterable<h<T>> f;

    public j(@NotNull Iterable<? extends h<? extends T>> iterable, @NotNull g g4, int n4, @NotNull a a4) {
        super(g4, n4, a4);
        this.f = iterable;
    }

    public /* synthetic */ j(Iterable iterable, g g4, int n4, a a4, int n5, p p4) {
        if ((n5 & 2) != 0) {
            g4 = kotlin.coroutines.h.c;
        }
        if ((n5 & 4) != 0) {
            n4 = -2;
        }
        if ((n5 & 8) != 0) {
            a4 = a.c;
        }
        this(iterable, g4, n4, a4);
    }

    @Override
    @Nullable
    protected Object i(@NotNull kotlinx.coroutines.channels.v<? super T> v3, @NotNull d<? super k0> object) {
        object = new z<T>(v3);
        Iterator<h<T>> iterator = this.f.iterator();
        while (iterator.hasNext()) {
            i.d(v3, null, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(iterator.next(), object, null){
                int l;
                final h<T> m;
                final z<T> n;
                {
                    this.m = h4;
                    this.n = z3;
                    super(2, d4);
                }

                @Override
                public final d<k0> create(Object object, d<?> d4) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                @Override
                public final Object invoke(q0 q02, d<? super k0> d4) {
                    return (this.create(q02, d4)).invokeSuspend(k0.a);
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object invokeSuspend(Object h4) {
                    Object object = b.f();
                    int n4 = this.l;
                    if (n4 != 0) {
                        if (n4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        v.b(h4);
                        return k0.a;
                    } else {
                        v.b(h4);
                        h4 = this.m;
                        z z3 = this.n;
                        this.l = 1;
                        if (h4.collect(z3, (d)this) != object) return k0.a;
                        return object;
                    }
                }
            }, (int)3, null);
        }
        return k0.a;
    }

    @Override
    @NotNull
    protected e<T> j(@NotNull g g4, int n4, @NotNull a a4) {
        return new j<T>(this.f, g4, n4, a4);
    }

    @Override
    @NotNull
    public x<T> n(@NotNull q0 q02) {
        return t.e((q0)q02, (g)this.c, (int)this.d, this.l());
    }
}

