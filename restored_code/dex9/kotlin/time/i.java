/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.time.e
 *  kotlin.time.h
 *  kotlin.time.l
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.time.e;
import kotlin.time.h;
import kotlin.time.k;
import kotlin.time.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c1\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u00020\bH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\u0004J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0012\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0016"}, d2={"Lkotlin/time/i;", "Lkotlin/time/l;", "", "e", "()J", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/k$a;", "d", "timeMark", "Lkotlin/time/b;", "c", "(J)J", "one", "another", "b", "(JJ)J", "J", "zero", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.3")
public final class i
implements l {
    @NotNull
    public static final i a = new i();
    private static final long b = System.nanoTime();

    private i() {
    }

    private final long e() {
        return System.nanoTime() - b;
    }

    public final long b(long l4, long l5) {
        return h.d((long)l4, (long)l5, (e)e.d);
    }

    public final long c(long l4) {
        return h.b((long)this.e(), (long)l4, (e)e.d);
    }

    public long d() {
        return k.a.e(this.e());
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}

