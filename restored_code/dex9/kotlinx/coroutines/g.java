/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.c
 *  kotlinx.coroutines.c0
 *  kotlinx.coroutines.k2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.a;
import kotlinx.coroutines.c;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001a"}, d2={"Lkotlinx/coroutines/g;", "T", "Lkotlinx/coroutines/a;", "", "state", "Lkotlin/k0;", "P", "(Ljava/lang/Object;)V", "c1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "f", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/m1;", "g", "Lkotlinx/coroutines/m1;", "eventLoop", "", "u0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/g;", "parentContext", "<init>", "(Lkotlin/coroutines/g;Ljava/lang/Thread;Lkotlinx/coroutines/m1;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
final class g<T>
extends a<T> {
    @NotNull
    private final Thread f;
    @Nullable
    private final m1 g;

    public g(@NotNull kotlin.coroutines.g g4, @NotNull Thread thread, @Nullable m1 m12) {
        super(g4, true, true);
        this.f = thread;
        this.g = m12;
    }

    @Override
    protected void P(@Nullable Object object) {
        if (!y.e((Object)Thread.currentThread(), (Object)this.f)) {
            object = this.f;
            c.a();
            LockSupport.unpark((Thread)object);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final T c1() {
        block12: {
            block14: {
                block13: {
                    block11: {
                        c.a();
                        try {
                            var4_1 = this.g;
                            var3_2 = null;
                            if (var4_1 == null) break block11;
                            m1.V((m1)var4_1, false, 1, null);
                        }
                        catch (Throwable var3_3) {
                            break block12;
                        }
                    }
                    try // 2 sources

                    {
                        while (!Thread.interrupted()) {
                            var4_1 = this.g;
                            var1_5 = var4_1 != null ? var4_1.Y() : 0x7FFFFFFFFFFFFFFFL;
                            break block13;
                        }

                    }
                    catch (Throwable var3_4) {

                    }
                }
                if (this.h()) ** GOTO lbl-1000
                c.a();
                LockSupport.parkNanos(this, var1_5);

                {
                    var4_1 = this.g;
                    if (var4_1 == null) break block14;
                    m1.L((m1)var4_1, false, 1, null);
                }
            }
            c.a();
            var4_1 = k2.h((Object)this.n0());
            if (var4_1 instanceof c0) {
                var3_2 = (c0)var4_1;
            }
            if (var3_2 == null) {
                return (T)var4_1;
            }
            throw var3_2.a;

            {
                var3_2 = new InterruptedException();
                this.T(var3_2);
                throw var3_2;
            }

            {
                var4_1 = this.g;
                if (var4_1 != null) {
                    m1.L((m1)var4_1, false, 1, null);
                }
                throw var3_4;
            }
        }
        c.a();
        throw var3_3;
    }

    @Override
    protected boolean u0() {
        return true;
    }
}

