/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.i
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.d
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.a;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.g;
import kotlinx.serialization.internal.m2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2={"Lkotlinx/serialization/internal/h;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/m2;", "", "Lkotlinx/serialization/internal/g;", "", "v", "([Z)I", "y", "([Z)Lkotlinx/serialization/internal/g;", "w", "()[Z", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "checkIndex", "Lkotlin/k0;", "x", "(Lkotlinx/serialization/encoding/c;ILkotlinx/serialization/internal/g;Z)V", "Lkotlinx/serialization/encoding/d;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/d;[ZI)V", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class h
extends m2<Boolean, boolean[], g>
implements KSerializer<boolean[]> {
    @NotNull
    public static final h c = new h();

    private h() {
        super(a.A((i)i.a));
    }

    protected int v(@NotNull boolean[] blArray) {
        y.j((Object)blArray, (String)"<this>");
        return blArray.length;
    }

    @NotNull
    protected boolean[] w() {
        return new boolean[0];
    }

    protected void x(@NotNull c c4, int n4, @NotNull g g4, boolean bl) {
        y.j((Object)c4, (String)"decoder");
        y.j((Object)((Object)g4), (String)"builder");
        g4.e(c4.C(this.getDescriptor(), n4));
    }

    @NotNull
    protected g y(@NotNull boolean[] blArray) {
        y.j((Object)blArray, (String)"<this>");
        return new g(blArray);
    }

    protected void z(@NotNull d d4, @NotNull boolean[] blArray, int n4) {
        y.j((Object)d4, (String)"encoder");
        y.j((Object)blArray, (String)"content");
        for (int i4 = 0; i4 < n4; ++i4) {
            d4.o(this.getDescriptor(), i4, blArray[i4]);
        }
    }
}

