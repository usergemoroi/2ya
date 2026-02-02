/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.j
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.d
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.a;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.j;
import kotlinx.serialization.internal.m2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2={"Lkotlinx/serialization/internal/k;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/m2;", "", "Lkotlinx/serialization/internal/j;", "", "v", "([B)I", "y", "([B)Lkotlinx/serialization/internal/j;", "w", "()[B", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "Lkotlin/k0;", "x", "(Lkotlinx/serialization/encoding/c;ILkotlinx/serialization/internal/j;Z)V", "Lkotlinx/serialization/encoding/d;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/d;[BI)V", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class k
extends m2<Byte, byte[], j>
implements KSerializer<byte[]> {
    @NotNull
    public static final k c = new k();

    private k() {
        super(a.B((kotlin.jvm.internal.j)kotlin.jvm.internal.j.a));
    }

    protected int v(@NotNull byte[] byArray) {
        y.j((Object)byArray, (String)"<this>");
        return byArray.length;
    }

    @NotNull
    protected byte[] w() {
        return new byte[0];
    }

    protected void x(@NotNull c c4, int n4, @NotNull j j4, boolean bl) {
        y.j((Object)c4, (String)"decoder");
        y.j((Object)((Object)j4), (String)"builder");
        j4.e(c4.B(this.getDescriptor(), n4));
    }

    @NotNull
    protected j y(@NotNull byte[] byArray) {
        y.j((Object)byArray, (String)"<this>");
        return new j(byArray);
    }

    protected void z(@NotNull d d4, @NotNull byte[] byArray, int n4) {
        y.j((Object)d4, (String)"encoder");
        y.j((Object)byArray, (String)"content");
        for (int i4 = 0; i4 < n4; ++i4) {
            d4.j(this.getDescriptor(), i4, byArray[i4]);
        }
    }
}

