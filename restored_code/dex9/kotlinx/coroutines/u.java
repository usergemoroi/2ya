/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.e
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.e;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level=e.d, message="This is internal API and may be removed in the future releases")
@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2={"Lkotlinx/coroutines/u;", "Lkotlinx/coroutines/i1;", "", "cause", "", "c", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/d2;", "getParent", "()Lkotlinx/coroutines/d2;", "getParent$annotations", "()V", "parent", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@InternalCoroutinesApi
public interface u
extends i1 {
    @InternalCoroutinesApi
    public boolean c(@NotNull Throwable var1);

    @Nullable
    public d2 getParent();
}

