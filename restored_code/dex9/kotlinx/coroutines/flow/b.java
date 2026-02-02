/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.p
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.channels.a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.jvm.internal.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u00a2\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@\u00a2\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014\u00a2\u0006\u0004\b\u000f\u0010\u0010R;\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u00a2\u0006\u0002\b\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2={"Lkotlinx/coroutines/flow/b;", "T", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/v;", "scope", "Lkotlin/k0;", "i", "(Lkotlinx/coroutines/channels/v;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/e;", "j", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/internal/e;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/ExtensionFunctionType;", "g", "Lkotlin/jvm/functions/p;", "block", "<init>", "(Lkotlin/jvm/functions/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class b<T>
extends f<T> {
    @NotNull
    private final kotlin.jvm.functions.p<kotlinx.coroutines.channels.v<? super T>, d<? super k0>, Object> g;

    public b(@NotNull kotlin.jvm.functions.p<? super kotlinx.coroutines.channels.v<? super T>, ? super d<? super k0>, ? extends Object> p4, @NotNull g g4, int n4, @NotNull kotlinx.coroutines.channels.a a4) {
        super(p4, g4, n4, a4);
        this.g = p4;
    }

    public /* synthetic */ b(kotlin.jvm.functions.p p4, g g4, int n4, kotlinx.coroutines.channels.a a4, int n5, p p5) {
        if ((n5 & 2) != 0) {
            g4 = h.c;
        }
        if ((n5 & 4) != 0) {
            n4 = -2;
        }
        if ((n5 & 8) != 0) {
            a4 = kotlinx.coroutines.channels.a.c;
        }
        this(p4, g4, n4, a4);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    @Nullable
    protected Object i(@NotNull kotlinx.coroutines.channels.v<? super T> var1_1, @NotNull d<? super k0> var2_2) {
        if (!(var2_2 instanceof a)) ** GOTO lbl-1000
        var4_3 = var2_2;
        var3_4 = var4_3.o;
        if ((var3_4 & -2147483648) != 0) {
            var4_3.o = var3_4 + -2147483648;
            var2_2 = var4_3;
        } else // 2 sources

        {
            var2_2 = new kotlin.coroutines.jvm.internal.d(this, var2_2){
                Object l;
                Object m;
                final b<T> n;
                int o;
                {
                    this.n = b4;
                    super(d4);
                }

                @Override
                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.m = object;
                    this.o |= Integer.MIN_VALUE;
                    return this.n.i(null, this);
                }
            };
        }
        var6_5 = var2_2.m;
        var5_6 = kotlin.coroutines.intrinsics.b.f();
        var3_4 = var2_2.o;
        if (var3_4 == 0) ** GOTO lbl18
        if (var3_4 == 1) {
            var4_3 = (kotlinx.coroutines.channels.v)var2_2.l;
            v.b((Object)var6_5);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:

            v.b((Object)var6_5);
            var2_2.l = var1_1;
            var2_2.o = 1;
            var4_3 = var1_1;
            if (super.i(var1_1, var2_2) == var5_6) {
                return var5_6;
            }
        }
        if (var4_3.isClosedForSend()) {
            return k0.a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override
    @NotNull
    protected e<T> j(@NotNull g g4, int n4, @NotNull kotlinx.coroutines.channels.a a4) {
        return new b<T>(this.g, g4, n4, a4);
    }
}

