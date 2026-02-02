/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.core.internal.a$d
 *  io.ktor.utils.io.core.j$a
 *  io.ktor.utils.io.core.m
 *  io.ktor.utils.io.pool.g
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.a;
import io.ktor.utils.io.core.j;
import io.ktor.utils.io.core.m;
import io.ktor.utils.io.pool.g;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0019B'\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0004\u00a2\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2={"Lio/ktor/utils/io/core/j;", "Lio/ktor/utils/io/core/m;", "Lio/ktor/utils/io/core/internal/a;", "y", "()Lio/ktor/utils/io/core/internal/a;", "Lio/ktor/utils/io/bits/c;", "destination", "", "offset", "length", "z", "(Ljava/nio/ByteBuffer;II)I", "Lkotlin/k0;", "k", "()V", "", "toString", "()Ljava/lang/String;", "head", "", "remaining", "Lio/ktor/utils/io/pool/g;", "pool", "<init>", "(Lio/ktor/utils/io/core/internal/a;JLio/ktor/utils/io/pool/g;)V", "a", "ktor-io"}, k=1, mv={1, 8, 0})
public final class j
extends m {
    @NotNull
    public static final a k = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final j l;

    static {
        a.d d4 = io.ktor.utils.io.core.internal.a.j;
        l = new j(d4.a(), 0L, (g<io.ktor.utils.io.core.internal.a>)d4.b());
    }

    public j(@NotNull io.ktor.utils.io.core.internal.a a4, long l4, @NotNull g<io.ktor.utils.io.core.internal.a> g4) {
        y.j((Object)((Object)a4), (String)"head");
        y.j(g4, (String)"pool");
        super(a4, l4, g4);
        this.X();
    }

    public static final /* synthetic */ j p0() {
        return l;
    }

    protected final void k() {
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ByteReadPacket[");
        stringBuilder.append(((Object)((Object)this)).hashCode());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Nullable
    protected final io.ktor.utils.io.core.internal.a y() {
        return null;
    }

    protected final int z(@NotNull ByteBuffer byteBuffer, int n4, int n5) {
        y.j((Object)byteBuffer, (String)"destination");
        return 0;
    }
}

