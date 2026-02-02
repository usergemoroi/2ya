/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  okio.a0$a
 *  okio.h
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.jvm.internal.p;
import okio.a0;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0019B!\b\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2={"Lokio/a0;", "Lkotlin/collections/c;", "Lokio/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "d", "(I)Lokio/h;", "", "c", "[Lokio/h;", "e", "()[Lokio/h;", "byteStrings", "", "[I", "getTrie$okio", "()[I", "trie", "getSize", "()I", "size", "<init>", "([Lokio/h;[I)V", "a", "okio"}, k=1, mv={1, 9, 0})
public final class a0
extends c<h>
implements RandomAccess {
    @NotNull
    public static final a e = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final h[] c;
    @NotNull
    private final int[] d;

    private a0(h[] hArray, int[] nArray) {
        this.c = hArray;
        this.d = nArray;
    }

    public /* synthetic */ a0(h[] hArray, int[] nArray, p p4) {
        this(hArray, nArray);
    }

    @NotNull
    public h d(int n4) {
        return this.c[n4];
    }

    @NotNull
    public final h[] e() {
        return this.c;
    }

    @Override
    public int getSize() {
        return this.c.length;
    }

    @NotNull
    public final int[] getTrie$okio() {
        return this.d;
    }
}

