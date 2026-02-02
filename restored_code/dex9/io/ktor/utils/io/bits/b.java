/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.bits.a
 *  io.ktor.utils.io.bits.c
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io.bits;

import io.ktor.utils.io.bits.a;
import io.ktor.utils.io.bits.c;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c1\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\r"}, d2={"Lio/ktor/utils/io/bits/b;", "Lio/ktor/utils/io/bits/a;", "", "size", "Lio/ktor/utils/io/bits/c;", "b", "(I)Ljava/nio/ByteBuffer;", "instance", "Lkotlin/k0;", "a", "(Ljava/nio/ByteBuffer;)V", "<init>", "()V", "ktor-io"}, k=1, mv={1, 8, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nMemoryFactoryJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryFactoryJvm.kt\nio/ktor/utils/io/bits/DefaultAllocator\n+ 2 Numbers.kt\nio/ktor/utils/io/core/internal/NumbersKt\n*L\n1#1,48:1\n6#2,2:49\n*S KotlinDebug\n*F\n+ 1 MemoryFactoryJvm.kt\nio/ktor/utils/io/bits/DefaultAllocator\n*L\n43#1:49,2\n*E\n"})
public final class b
implements a {
    @NotNull
    public static final b a = new b();

    private b() {
    }

    public void a(@NotNull ByteBuffer byteBuffer) {
        y.j((Object)byteBuffer, (String)"instance");
    }

    @NotNull
    public ByteBuffer b(int n4) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(n4);
        y.i((Object)byteBuffer, (String)"allocate(size)");
        return c.b((ByteBuffer)byteBuffer);
    }
}

