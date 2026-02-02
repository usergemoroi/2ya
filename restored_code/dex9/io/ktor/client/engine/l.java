/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.client.engine;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.a0;
import kotlin.k0;
import kotlinx.coroutines.d2;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2={"", "cause", "Lkotlin/k0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k=3, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nio/ktor/client/engine/UtilsKt$attachToUserJob$cleanupHandler$1\n*L\n1#1,107:1\n*E\n"})
public final class l
extends a0
implements kotlin.jvm.functions.l<Throwable, k0> {
    final d2 g;

    public l(d2 d22) {
        this.g = d22;
        super(1);
    }

    @Override
    public final void invoke(@Nullable Throwable throwable) {
        if (throwable == null) {
            return;
        }
        this.g.cancel(new CancellationException(throwable.getMessage()));
    }
}

