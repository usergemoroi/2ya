/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okio.j
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okio.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0003\u0010\u0004J/\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014\u00a2\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2={"Lokio/u;", "Lokio/j;", "", "p", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "m", "(J[BII)I", "Lkotlin/k0;", "q", "(J[BII)V", "l", "()V", "k", "Ljava/io/RandomAccessFile;", "g", "Ljava/io/RandomAccessFile;", "randomAccessFile", "", "readWrite", "<init>", "(ZLjava/io/RandomAccessFile;)V", "okio"}, k=1, mv={1, 9, 0})
public final class u
extends j {
    @NotNull
    private final RandomAccessFile g;

    public u(boolean bl, @NotNull RandomAccessFile randomAccessFile) {
        y.j((Object)randomAccessFile, (String)"randomAccessFile");
        super(bl);
        this.g = randomAccessFile;
    }

    protected void k() {
        synchronized (this) {
            this.g.close();
            return;
        }
    }

    protected void l() {
        synchronized (this) {
            this.g.getFD().sync();
            return;
        }
    }

    protected int m(long l4, @NotNull byte[] byArray, int n4, int n5) {
        synchronized (this) {
            Throwable throwable2;
            int n6;
            int n7;
            y.j((Object)byArray, (String)"array");
            this.g.seek(l4);
            for (n6 = 0; n6 < n5; n6 += n7) {
                try {
                    n7 = this.g.read(byArray, n4, n5 - n6);
                    if (n7 != -1) continue;
                    if (n6 != 0) break;
                }
                catch (Throwable throwable2) {
                }
                return -1;
            }
            return n6;
            throw throwable2;
        }
    }

    protected long p() {
        synchronized (this) {
            long l4 = this.g.length();
            return l4;
        }
    }

    protected void q(long l4, @NotNull byte[] byArray, int n4, int n5) {
        synchronized (this) {
            y.j((Object)byArray, (String)"array");
            this.g.seek(l4);
            this.g.write(byArray, n4, n5);
            return;
        }
    }
}

