/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.o0;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\t\u00a8\u0006\u0016"}, d2={"Lkotlin/ranges/h;", "Lkotlin/collections/o0;", "", "hasNext", "()Z", "", "nextInt", "()I", "c", "I", "getStep", "step", "d", "finalElement", "e", "Z", "f", "next", "first", "last", "<init>", "(III)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class h
extends o0 {
    private final int c;
    private final int d;
    private boolean e;
    private int f;

    public h(int n4, int n5, int n6) {
        this.c = n6;
        this.d = n5;
        boolean bl = true;
        if (!(n6 > 0 ? n4 <= n5 : n4 >= n5)) {
            bl = false;
        }
        this.e = bl;
        if (!bl) {
            n4 = n5;
        }
        this.f = n4;
    }

    @Override
    public boolean hasNext() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int nextInt() {
        int n4 = this.f;
        if (n4 == this.d) {
            if (!this.e) throw new NoSuchElementException();
            this.e = false;
            return n4;
        } else {
            this.f = this.c + n4;
        }
        return n4;
    }
}

