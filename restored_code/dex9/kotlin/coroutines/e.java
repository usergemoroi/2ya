/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g$c
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2={"Lkotlin/coroutines/e;", "Lkotlin/coroutines/g$b;", "T", "Lkotlin/coroutines/d;", "continuation", "interceptContinuation", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "Lkotlin/k0;", "releaseInterceptedContinuation", "(Lkotlin/coroutines/d;)V", "A8", "b", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.3")
public interface e
extends g.b {
    @NotNull
    public static final b A8 = b.c;

    @NotNull
    public <T> d<T> interceptContinuation(@NotNull d<? super T> var1);

    public void releaseInterceptedContinuation(@NotNull d<?> var1);

    @Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lkotlin/coroutines/e$b;", "Lkotlin/coroutines/g$c;", "Lkotlin/coroutines/e;", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    public static final class b
    implements g.c<e> {
        static final b c = new b();

        private b() {
        }
    }
}

