/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.text.d
 *  kotlinx.serialization.json.internal.f0
 *  kotlinx.serialization.json.internal.r
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.text.d;
import kotlinx.serialization.json.internal.f0;
import kotlinx.serialization.json.internal.r;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\r\u00a8\u0006\u0013"}, d2={"Lkotlinx/serialization/json/internal/h0;", "Lkotlinx/serialization/json/internal/f0;", "", "buffer", "", "bufferOffset", "count", "a", "([CII)I", "Lkotlin/k0;", "b", "()V", "Lkotlinx/serialization/json/internal/r;", "Lkotlinx/serialization/json/internal/r;", "reader", "Ljava/io/InputStream;", "stream", "<init>", "(Ljava/io/InputStream;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
public final class h0
implements f0 {
    @NotNull
    private final r a;

    public h0(@NotNull InputStream inputStream) {
        y.j((Object)inputStream, (String)"stream");
        this.a = new r(inputStream, d.b);
    }

    public int a(@NotNull char[] cArray, int n4, int n5) {
        y.j((Object)cArray, (String)"buffer");
        return this.a.d(cArray, n4, n5);
    }

    public final void b() {
        this.a.e();
    }
}

