/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SubclassOptInRequired
 *  kotlin.coroutines.d
 *  kotlinx.coroutines.ExperimentalCoroutinesApi
 *  kotlinx.coroutines.InternalForInheritanceCoroutinesApi
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.d;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalForInheritanceCoroutinesApi;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.selects.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H\u00a6@\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2={"Lkotlinx/coroutines/x0;", "T", "Lkotlinx/coroutines/d2;", "l", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "A", "()Lkotlinx/coroutines/selects/f;", "onAwait", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SubclassOptInRequired(markerClass=InternalForInheritanceCoroutinesApi.class)
public interface x0<T>
extends d2 {
    @NotNull
    public f<T> A();

    @ExperimentalCoroutinesApi
    public T k();

    @Nullable
    public Object l(@NotNull d<? super T> var1);
}

