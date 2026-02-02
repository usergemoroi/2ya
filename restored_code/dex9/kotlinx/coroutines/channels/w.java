/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlinx.coroutines.channels.k
 *  kotlinx.coroutines.k3
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n\u00a2\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001\u00a2\u0006\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\f\u00a8\u0006\u0010"}, d2={"Lkotlinx/coroutines/channels/w;", "E", "Lkotlinx/coroutines/k3;", "Lkotlinx/coroutines/internal/a0;", "segment", "", "index", "Lkotlin/k0;", "c", "(Lkotlinx/coroutines/internal/a0;I)V", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/channels/k;", "Lkotlinx/coroutines/p;", "cont", "<init>", "(Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class w<E>
implements k3 {
    @JvmField
    @NotNull
    public final p<k<? extends E>> c;

    public w(@NotNull p<? super k<? extends E>> p4) {
        this.c = p4;
    }

    public void c(@NotNull a0<?> a02, int n4) {
        this.c.c(a02, n4);
    }
}

