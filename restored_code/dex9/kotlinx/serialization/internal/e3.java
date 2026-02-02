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
import kotlin.b0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.internal.k2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2={"Lkotlinx/serialization/internal/e3;", "Lkotlinx/serialization/internal/k2;", "Lkotlin/b0;", "", "requiredCapacity", "Lkotlin/k0;", "b", "(I)V", "Lkotlin/a0;", "c", "e", "(B)V", "f", "()[B", "a", "[B", "buffer", "value", "I", "d", "()I", "position", "bufferWithData", "<init>", "([BLkotlin/jvm/internal/p;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
public final class e3
extends k2<b0> {
    @NotNull
    private byte[] a;
    private int b;

    private e3(byte[] byArray) {
        y.j((Object)byArray, (String)"bufferWithData");
        this.a = byArray;
        this.b = b0.m(byArray);
        this.b(10);
    }

    public /* synthetic */ e3(byte[] byArray, p p4) {
        this(byArray);
    }

    public void b(int n4) {
        if (b0.m(this.a) < n4) {
            byte[] byArray = this.a;
            byArray = Arrays.copyOf(byArray, j.e(n4, b0.m(byArray) * 2));
            y.i((Object)byArray, (String)"copyOf(...)");
            this.a = b0.e(byArray);
        }
    }

    public int d() {
        return this.b;
    }

    public final void e(byte by) {
        k2.c((k2)this, (int)0, (int)1, null);
        byte[] byArray = this.a;
        int n4 = this.d();
        this.b = n4 + 1;
        b0.q(byArray, n4, by);
    }

    @NotNull
    public byte[] f() {
        byte[] byArray = Arrays.copyOf(this.a, this.d());
        y.i((Object)byArray, (String)"copyOf(...)");
        return b0.e(byArray);
    }
}

