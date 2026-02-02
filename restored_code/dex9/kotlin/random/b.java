/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.random.b$a
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.random.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2={"Lkotlin/random/b;", "Lkotlin/random/a;", "kotlin/random/b$a", "e", "Lkotlin/random/b$a;", "implStorage", "Ljava/util/Random;", "i", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class b
extends kotlin.random.a {
    @NotNull
    private final a e = new a();

    @Override
    @NotNull
    public Random i() {
        Object t3 = this.e.get();
        y.i(t3, (String)"get(...)");
        return (Random)t3;
    }
}

