/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.flow.h
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.flow.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlinx/coroutines/flow/internal/q;", "T", "Lkotlinx/coroutines/flow/h;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "b", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/h;", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@InternalCoroutinesApi
public interface q<T>
extends h<T> {
    @NotNull
    public h<T> b(@NotNull g var1, int var2, @NotNull a var3);
}

