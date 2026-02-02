/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.k0
 *  kotlinx.coroutines.r2
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.k0;
import kotlinx.coroutines.r2;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2={"Lkotlinx/coroutines/m;", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/k0;", "b", "(Ljava/lang/Throwable;)V", "a", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public interface m
extends r2 {
    public void b(@Nullable Throwable var1);

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B,\u0012#\u0010\u000f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tR1\u0010\u000f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lkotlinx/coroutines/m$a;", "Lkotlinx/coroutines/m;", "", "cause", "Lkotlin/k0;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "c", "Lkotlin/jvm/functions/l;", "handler", "<init>", "(Lkotlin/jvm/functions/l;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    public static final class a
    implements m {
        @NotNull
        private final l<Throwable, k0> c;

        public a(@NotNull l<? super Throwable, k0> l4) {
            this.c = l4;
        }

        @Override
        public void b(@Nullable Throwable throwable) {
            this.c.invoke(throwable);
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CancelHandler.UserSupplied[");
            stringBuilder.append(u0.a(this.c));
            stringBuilder.append('@');
            stringBuilder.append(u0.b((Object)this));
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }
}

