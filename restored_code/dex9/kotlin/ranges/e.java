/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.ranges.f
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.ranges;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\n\u0010\f\u00a8\u0006\r"}, d2={"Lkotlin/ranges/e;", "", "T", "Lkotlin/ranges/f;", "value", "", "contains", "(Ljava/lang/Comparable;)Z", "isEmpty", "()Z", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.1")
public interface e<T extends Comparable<? super T>>
extends f<T> {
    public boolean a(@NotNull T var1, @NotNull T var2);

    public boolean contains(@NotNull T var1);

    public boolean isEmpty();
}

