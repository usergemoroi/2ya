/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.b0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.d
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.a;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.f1;
import kotlinx.serialization.internal.m2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2={"Lkotlinx/serialization/internal/g1;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/m2;", "", "Lkotlinx/serialization/internal/f1;", "", "v", "([J)I", "y", "([J)Lkotlinx/serialization/internal/f1;", "w", "()[J", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "Lkotlin/k0;", "x", "(Lkotlinx/serialization/encoding/c;ILkotlinx/serialization/internal/f1;Z)V", "Lkotlinx/serialization/encoding/d;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/d;[JI)V", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class g1
extends m2<Long, long[], f1>
implements KSerializer<long[]> {
    @NotNull
    public static final g1 c = new g1();

    private g1() {
        super(a.G((b0)b0.a));
    }

    protected int v(@NotNull long[] lArray) {
        y.j((Object)lArray, (String)"<this>");
        return lArray.length;
    }

    @NotNull
    protected long[] w() {
        return new long[0];
    }

    protected void x(@NotNull c c4, int n4, @NotNull f1 f12, boolean bl) {
        y.j((Object)c4, (String)"decoder");
        y.j((Object)((Object)f12), (String)"builder");
        f12.e(c4.e(this.getDescriptor(), n4));
    }

    @NotNull
    protected f1 y(@NotNull long[] lArray) {
        y.j((Object)lArray, (String)"<this>");
        return new f1(lArray);
    }

    protected void z(@NotNull d d4, @NotNull long[] lArray, int n4) {
        y.j((Object)d4, (String)"encoder");
        y.j((Object)lArray, (String)"content");
        for (int i4 = 0; i4 < n4; ++i4) {
            d4.u(this.getDescriptor(), i4, lArray[i4]);
        }
    }
}

