/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.internal.k2
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlinx.serialization.internal.k2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0010@RX\u0090\u000e\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lkotlinx/serialization/internal/u0;", "Lkotlinx/serialization/internal/k2;", "", "", "requiredCapacity", "Lkotlin/k0;", "b", "(I)V", "c", "e", "f", "()[I", "a", "[I", "buffer", "value", "I", "d", "()I", "position", "bufferWithData", "<init>", "([I)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class u0
extends k2<int[]> {
    @NotNull
    private int[] a;
    private int b;

    public u0(@NotNull int[] nArray) {
        y.j((Object)nArray, (String)"bufferWithData");
        this.a = nArray;
        this.b = nArray.length;
        this.b(10);
    }

    public void b(int n4) {
        int[] nArray = this.a;
        if (nArray.length < n4) {
            nArray = Arrays.copyOf(nArray, j.e(n4, nArray.length * 2));
            y.i((Object)nArray, (String)"copyOf(...)");
            this.a = nArray;
        }
    }

    public int d() {
        return this.b;
    }

    public final void e(int n4) {
        k2.c((k2)this, (int)0, (int)1, null);
        int[] nArray = this.a;
        int n5 = this.d();
        this.b = n5 + 1;
        nArray[n5] = n4;
    }

    @NotNull
    public int[] f() {
        int[] nArray = Arrays.copyOf(this.a, this.d());
        y.i((Object)nArray, (String)"copyOf(...)");
        return nArray;
    }
}

