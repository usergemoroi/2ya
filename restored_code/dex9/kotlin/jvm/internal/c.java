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
import kotlin.collections.j0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lkotlin/jvm/internal/c;", "Lkotlin/collections/j0;", "", "hasNext", "()Z", "", "a", "()F", "", "c", "[F", "array", "", "d", "I", "index", "<init>", "([F)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class c
extends j0 {
    @NotNull
    private final float[] c;
    private int d;

    public c(@NotNull float[] fArray) {
        y.j((Object)fArray, (String)"array");
        this.c = fArray;
    }

    @Override
    public float a() {
        int n4;
        float[] fArray;
        try {
            fArray = this.c;
            n4 = this.d;
            this.d = n4 + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.d;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        float f4 = fArray[n4];
        return f4;
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.d < this.c.length;
        return bl;
    }
}

