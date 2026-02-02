/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.random.c
 *  kotlin.random.d
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.c;
import kotlin.random.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2={"Lkotlin/random/a;", "Lkotlin/random/c;", "", "bitCount", "b", "(I)I", "c", "()I", "until", "d", "", "f", "()J", "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public abstract class a
extends c {
    public int b(int n4) {
        return d.f((int)this.i().nextInt(), (int)n4);
    }

    public int c() {
        return this.i().nextInt();
    }

    public int d(int n4) {
        return this.i().nextInt(n4);
    }

    public long f() {
        return this.i().nextLong();
    }

    @NotNull
    public abstract Random i();
}

