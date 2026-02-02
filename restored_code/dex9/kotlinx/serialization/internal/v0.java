/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.x
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.d
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.a;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.m2;
import kotlinx.serialization.internal.u0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2={"Lkotlinx/serialization/internal/v0;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/m2;", "", "Lkotlinx/serialization/internal/u0;", "v", "([I)I", "y", "([I)Lkotlinx/serialization/internal/u0;", "w", "()[I", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "Lkotlin/k0;", "x", "(Lkotlinx/serialization/encoding/c;ILkotlinx/serialization/internal/u0;Z)V", "Lkotlinx/serialization/encoding/d;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/d;[II)V", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class v0
extends m2<Integer, int[], u0>
implements KSerializer<int[]> {
    @NotNull
    public static final v0 c = new v0();

    private v0() {
        super(a.F((x)x.a));
    }

    protected int v(@NotNull int[] nArray) {
        y.j((Object)nArray, (String)"<this>");
        return nArray.length;
    }

    @NotNull
    protected int[] w() {
        return new int[0];
    }

    protected void x(@NotNull c c4, int n4, @NotNull u0 u02, boolean bl) {
        y.j((Object)c4, (String)"decoder");
        y.j((Object)((Object)u02), (String)"builder");
        u02.e(c4.f(this.getDescriptor(), n4));
    }

    @NotNull
    protected u0 y(@NotNull int[] nArray) {
        y.j((Object)nArray, (String)"<this>");
        return new u0(nArray);
    }

    protected void z(@NotNull d d4, @NotNull int[] nArray, int n4) {
        y.j((Object)d4, (String)"encoder");
        y.j((Object)nArray, (String)"content");
        for (int i4 = 0; i4 < n4; ++i4) {
            d4.n(this.getDescriptor(), i4, nArray[i4]);
        }
    }
}

