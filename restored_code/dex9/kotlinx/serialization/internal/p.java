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

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2={"Lkotlinx/serialization/internal/p;", "Lkotlinx/serialization/internal/k2;", "", "", "requiredCapacity", "Lkotlin/k0;", "b", "(I)V", "", "c", "e", "(C)V", "f", "()[C", "a", "[C", "buffer", "value", "I", "d", "()I", "position", "bufferWithData", "<init>", "([C)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class p
extends k2<char[]> {
    @NotNull
    private char[] a;
    private int b;

    public p(@NotNull char[] cArray) {
        y.j((Object)cArray, (String)"bufferWithData");
        this.a = cArray;
        this.b = cArray.length;
        this.b(10);
    }

    public void b(int n4) {
        char[] cArray = this.a;
        if (cArray.length < n4) {
            cArray = Arrays.copyOf(cArray, j.e(n4, cArray.length * 2));
            y.i((Object)cArray, (String)"copyOf(...)");
            this.a = cArray;
        }
    }

    public int d() {
        return this.b;
    }

    public final void e(char c4) {
        k2.c((k2)this, (int)0, (int)1, null);
        char[] cArray = this.a;
        int n4 = this.d();
        this.b = n4 + 1;
        cArray[n4] = c4;
    }

    @NotNull
    public char[] f() {
        char[] cArray = Arrays.copyOf(this.a, this.d());
        y.i((Object)cArray, (String)"copyOf(...)");
        return cArray;
    }
}

