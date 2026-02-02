/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SubclassOptInRequired
 *  kotlinx.coroutines.ExperimentalForInheritanceCoroutinesApi
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlinx.coroutines.ExperimentalForInheritanceCoroutinesApi;
import kotlinx.coroutines.flow.b0;
import kotlinx.coroutines.flow.q0;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\u00028\u00008&@&X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2={"Lkotlinx/coroutines/flow/c0;", "T", "Lkotlinx/coroutines/flow/q0;", "Lkotlinx/coroutines/flow/b0;", "expect", "update", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SubclassOptInRequired(markerClass=ExperimentalForInheritanceCoroutinesApi.class)
public interface c0<T>
extends q0<T>,
b0<T> {
    public boolean c(T var1, T var2);

    @Override
    public T getValue();

    public void setValue(T var1);
}

