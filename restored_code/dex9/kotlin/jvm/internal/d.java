/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lkotlin/jvm/internal/d;", "Lkotlin/collections/o0;", "", "hasNext", "()Z", "", "nextInt", "()I", "", "c", "[I", "array", "d", "I", "index", "<init>", "([I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class d
extends o0 {
    @NotNull
    private final int[] c;
    private int d;

    public d(@NotNull int[] nArray) {
        y.j((Object)nArray, (String)"array");
        this.c = nArray;
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.d < this.c.length;
        return bl;
    }

    @Override
    public int nextInt() {
        int n4;
        int[] nArray;
        try {
            nArray = this.c;
            n4 = this.d;
            this.d = n4 + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.d;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        n4 = nArray[n4];
        return n4;
    }
}

