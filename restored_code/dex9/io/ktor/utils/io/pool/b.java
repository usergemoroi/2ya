/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io.pool;

import io.ktor.utils.io.pool.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2={"Lio/ktor/utils/io/pool/b;", "Lio/ktor/utils/io/pool/d;", "Ljava/nio/ByteBuffer;", "s", "()Ljava/nio/ByteBuffer;", "instance", "r", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "Lkotlin/k0;", "w", "(Ljava/nio/ByteBuffer;)V", "", "j", "I", "getBufferSize", "()I", "bufferSize", "capacity", "<init>", "(II)V", "ktor-io"}, k=1, mv={1, 8, 0})
public final class b
extends d<ByteBuffer> {
    private final int j;

    public b(int n4, int n5) {
        super(n4);
        this.j = n5;
    }

    @NotNull
    protected ByteBuffer r(@NotNull ByteBuffer byteBuffer) {
        y.j((Object)byteBuffer, (String)"instance");
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @NotNull
    protected ByteBuffer s() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(this.j);
        y.g((Object)byteBuffer);
        return byteBuffer;
    }

    protected void w(@NotNull ByteBuffer byteBuffer) {
        y.j((Object)byteBuffer, (String)"instance");
        if (byteBuffer.capacity() == this.j) {
            if (byteBuffer.isDirect() ^ true) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

