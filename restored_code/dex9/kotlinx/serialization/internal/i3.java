/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalUnsignedTypes
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.c0
 *  kotlin.c0$a
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.d
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.c0;
import kotlin.d0;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.a;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.h3;
import kotlinx.serialization.internal.m2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2={"Lkotlinx/serialization/internal/i3;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/d0;", "Lkotlinx/serialization/internal/m2;", "Lkotlin/c0;", "Lkotlinx/serialization/internal/h3;", "", "v", "([I)I", "y", "([I)Lkotlinx/serialization/internal/h3;", "w", "()[I", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "Lkotlin/k0;", "x", "(Lkotlinx/serialization/encoding/c;ILkotlinx/serialization/internal/h3;Z)V", "Lkotlinx/serialization/encoding/d;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/d;[II)V", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
public final class i3
extends m2<c0, d0, h3>
implements KSerializer<d0> {
    @NotNull
    public static final i3 c = new i3();

    private i3() {
        super(a.w((c0.a)c0.d));
    }

    protected int v(@NotNull int[] nArray) {
        y.j((Object)nArray, (String)"$this$collectionSize");
        return d0.m(nArray);
    }

    @NotNull
    protected int[] w() {
        return d0.d(0);
    }

    protected void x(@NotNull c c4, int n4, @NotNull h3 h32, boolean bl) {
        y.j((Object)c4, (String)"decoder");
        y.j((Object)((Object)h32), (String)"builder");
        h32.e(c0.c((int)c4.l(this.getDescriptor(), n4).u()));
    }

    @NotNull
    protected h3 y(@NotNull int[] nArray) {
        y.j((Object)nArray, (String)"$this$toBuilder");
        return new h3(nArray, null);
    }

    protected void z(@NotNull d d4, @NotNull int[] nArray, int n4) {
        y.j((Object)d4, (String)"encoder");
        y.j((Object)nArray, (String)"content");
        for (int i4 = 0; i4 < n4; ++i4) {
            d4.w(this.getDescriptor(), i4).s(d0.k(nArray, i4));
        }
    }
}

