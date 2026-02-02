/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okio.l0
 *  org.jetbrains.annotations.NotNull
 */
package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okio.e;
import okio.l0;
import okio.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\r\u00a8\u0006\u0019"}, d2={"Lokio/internal/g;", "Lokio/o;", "Lokio/e;", "", "newSize", "Lkotlin/k0;", "a", "(Lokio/e;J)V", "sink", "byteCount", "read", "(Lokio/e;J)J", "g", "J", "size", "", "h", "Z", "truncate", "i", "bytesReceived", "Lokio/l0;", "delegate", "<init>", "(Lokio/l0;JZ)V", "okio"}, k=1, mv={1, 9, 0})
public final class g
extends o {
    private final long g;
    private final boolean h;
    private long i;

    public g(@NotNull l0 l02, long l4, boolean bl) {
        y.j((Object)l02, (String)"delegate");
        super(l02);
        this.g = l4;
        this.h = bl;
    }

    private final void a(e e4, long l4) {
        e e5 = new e();
        e5.G(e4);
        e4.write(e5, l4);
        e5.k();
    }

    @Override
    public long read(@NotNull e object, long l4) {
        long l5;
        y.j((Object)object, (String)"sink");
        long l6 = this.i;
        long l7 = this.g;
        if (l6 > l7) {
            l5 = 0L;
        } else {
            l5 = l4;
            if (this.h) {
                l5 = l7 - l6;
                if (l5 == 0L) {
                    return -1L;
                }
                l5 = Math.min(l4, l5);
            }
        }
        l5 = super.read((e)object, l5);
        long l8 = l5 - -1L;
        long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (l9 != false) {
            this.i += l5;
        }
        if ((l4 = this.i) < (l6 = this.g) && l9 == false || l4 > l6) {
            if (l5 > 0L && l4 > l6) {
                this.a((e)object, ((e)object).size() - (this.i - this.g));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("expected ");
            ((StringBuilder)object).append(this.g);
            ((StringBuilder)object).append(" bytes but got ");
            ((StringBuilder)object).append(this.i);
            throw new IOException(((StringBuilder)object).toString());
        }
        return l5;
    }
}

