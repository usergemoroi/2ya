/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.e
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.e;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.d2;
import org.jetbrains.annotations.NotNull;

@Deprecated(level=e.d, message="This is internal API and may be removed in the future releases")
@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lkotlinx/coroutines/s2;", "Lkotlinx/coroutines/d2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "z", "()Ljava/util/concurrent/CancellationException;", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@InternalCoroutinesApi
public interface s2
extends d2 {
    @InternalCoroutinesApi
    @NotNull
    public CancellationException z();
}

