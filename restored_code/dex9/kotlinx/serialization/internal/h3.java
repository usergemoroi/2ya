/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalUnsignedTypes
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.internal.k2
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.d0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.internal.k2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000\u00a2\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u0010@RX\u0090\u000e\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2={"Lkotlinx/serialization/internal/h3;", "Lkotlinx/serialization/internal/k2;", "Lkotlin/d0;", "", "requiredCapacity", "Lkotlin/k0;", "b", "(I)V", "Lkotlin/c0;", "c", "e", "f", "()[I", "a", "[I", "buffer", "value", "I", "d", "()I", "position", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/p;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
public final class h3
extends k2<d0> {
    @NotNull
    private int[] a;
    private int b;

    private h3(int[] nArray) {
        y.j((Object)nArray, (String)"bufferWithData");
        this.a = nArray;
        this.b = d0.m(nArray);
        this.b(10);
    }

    public /* synthetic */ h3(int[] nArray, p p4) {
        this(nArray);
    }

    public void b(int n4) {
        if (d0.m(this.a) < n4) {
            int[] nArray = this.a;
            nArray = Arrays.copyOf(nArray, j.e(n4, d0.m(nArray) * 2));
            y.i((Object)nArray, (String)"copyOf(...)");
            this.a = d0.e(nArray);
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
        d0.q(nArray, n5, n4);
    }

    @NotNull
    public int[] f() {
        int[] nArray = Arrays.copyOf(this.a, this.d());
        y.i((Object)nArray, (String)"copyOf(...)");
        return d0.e(nArray);
    }
}

