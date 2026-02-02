/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 */
package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.s;
import kotlin.jvm.internal.y;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\n\u00a8\u0006\u0018"}, d2={"Lkotlin/ranges/b;", "Lkotlin/collections/s;", "", "hasNext", "()Z", "", "a", "()C", "", "c", "I", "getStep", "()I", "step", "d", "finalElement", "e", "Z", "f", "next", "first", "last", "<init>", "(CCI)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class b
extends s {
    private final int c;
    private final int d;
    private boolean e;
    private int f;

    public b(char c4, char c5, int n4) {
        this.c = n4;
        this.d = c5;
        boolean bl = true;
        if (!(n4 > 0 ? y.l((int)c4, (int)c5) <= 0 : y.l((int)c4, (int)c5) >= 0)) {
            bl = false;
        }
        this.e = bl;
        if (!bl) {
            c4 = c5;
        }
        this.f = c4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public char a() {
        int n4 = this.f;
        if (n4 == this.d) {
            if (!this.e) throw new NoSuchElementException();
            this.e = false;
            return (char)n4;
        } else {
            this.f = this.c + n4;
        }
        return (char)n4;
    }

    @Override
    public boolean hasNext() {
        return this.e;
    }
}

