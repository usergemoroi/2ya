/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.core.p
 *  io.ktor.utils.io.pool.g
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.a;
import io.ktor.utils.io.core.j;
import io.ktor.utils.io.core.p;
import io.ktor.utils.io.pool.g;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$\u00a2\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010#\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006)"}, d2={"Lio/ktor/utils/io/core/i;", "Lio/ktor/utils/io/core/p;", "Lkotlin/k0;", "w", "()V", "Lio/ktor/utils/io/bits/c;", "source", "", "offset", "length", "y", "(Ljava/nio/ByteBuffer;II)V", "", "value", "Z", "(C)Lio/ktor/utils/io/core/i;", "", "a0", "(Ljava/lang/CharSequence;)Lio/ktor/utils/io/core/i;", "startIndex", "endIndex", "b0", "(Ljava/lang/CharSequence;II)Lio/ktor/utils/io/core/i;", "Lio/ktor/utils/io/core/j;", "c0", "()Lio/ktor/utils/io/core/j;", "", "toString", "()Ljava/lang/String;", "d0", "()I", "size", "", "e0", "()Z", "isEmpty", "Lio/ktor/utils/io/pool/g;", "Lio/ktor/utils/io/core/internal/a;", "pool", "<init>", "(Lio/ktor/utils/io/pool/g;)V", "ktor-io"}, k=1, mv={1, 8, 0})
public final class i
extends p {
    public i() {
        this(null, 1, null);
    }

    public i(@NotNull g<a> g4) {
        y.j(g4, (String)"pool");
        super(g4);
    }

    public /* synthetic */ i(g g4, int n4, kotlin.jvm.internal.p p4) {
        if ((n4 & 1) != 0) {
            g4 = a.j.c();
        }
        this((g<a>)g4);
    }

    @NotNull
    public i Z(char c4) {
        p p4 = super.i(c4);
        y.h((Object)p4, (String)"null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (i)p4;
    }

    @NotNull
    public i a0(@Nullable CharSequence charSequence) {
        charSequence = super.k(charSequence);
        y.h((Object)charSequence, (String)"null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (i)((Object)charSequence);
    }

    @NotNull
    public i b0(@Nullable CharSequence charSequence, int n4, int n5) {
        charSequence = super.l(charSequence, n4, n5);
        y.h((Object)charSequence, (String)"null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (i)((Object)charSequence);
    }

    @NotNull
    public final j c0() {
        int n4 = this.d0();
        Object object = this.T();
        object = object == null ? j.k.a() : new j((a)((Object)object), n4, (g<a>)this.C());
        return object;
    }

    public final int d0() {
        return this.M();
    }

    public final boolean e0() {
        boolean bl = this.M() == 0;
        return bl;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BytePacketBuilder[0x");
        stringBuilder.append(((Object)((Object)this)).hashCode());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    protected final void w() {
    }

    protected final void y(@NotNull ByteBuffer byteBuffer, int n4, int n5) {
        y.j((Object)byteBuffer, (String)"source");
    }
}

