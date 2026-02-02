/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SubclassOptInRequired
 *  kotlin.coroutines.d
 *  kotlinx.coroutines.ExperimentalForInheritanceCoroutinesApi
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.d;
import kotlinx.coroutines.ExperimentalForInheritanceCoroutinesApi;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u00a6@\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2={"Lkotlinx/coroutines/flow/g0;", "T", "Lkotlinx/coroutines/flow/h;", "Lkotlinx/coroutines/flow/i;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SubclassOptInRequired(markerClass=ExperimentalForInheritanceCoroutinesApi.class)
public interface g0<T>
extends h<T> {
    @NotNull
    public List<T> a();

    @Nullable
    public Object collect(@NotNull i<? super T> var1, @NotNull d<?> var2);
}

