/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlinx/coroutines/a3;", "S", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "context", "updateThreadContext", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/k0;", "restoreThreadContext", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public interface a3<S>
extends g.b {
    public void restoreThreadContext(@NotNull g var1, S var2);

    public S updateThreadContext(@NotNull g var1);
}

