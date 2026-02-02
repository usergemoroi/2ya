/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.i$a
 *  kotlin.coroutines.intrinsics.a
 *  kotlin.coroutines.jvm.internal.e
 *  kotlin.jvm.internal.y
 *  kotlin.u$b
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.y;
import kotlin.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\nB!\b\u0000\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u001b\u0010\u001cB\u0017\b\u0011\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001dJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001f"}, d2={"Lkotlin/coroutines/i;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlin/u;", "result", "Lkotlin/k0;", "resumeWith", "(Ljava/lang/Object;)V", "", "a", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "c", "Lkotlin/coroutines/d;", "delegate", "Ljava/lang/Object;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "initialResult", "<init>", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "(Lkotlin/coroutines/d;)V", "d", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@PublishedApi
@SinceKotlin(version="1.3")
public final class i<T>
implements d<T>,
e {
    @NotNull
    private static final a d = new /* Unavailable Anonymous Inner Class!! */;
    private static final AtomicReferenceFieldUpdater<i<?>, Object> e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");
    @NotNull
    private final d<T> c;
    @Nullable
    private volatile Object result;

    @PublishedApi
    public i(@NotNull d<? super T> d4) {
        y.j(d4, (String)"delegate");
        this(d4, kotlin.coroutines.intrinsics.a.d);
    }

    public i(@NotNull d<? super T> d4, @Nullable Object object) {
        y.j(d4, (String)"delegate");
        this.c = d4;
        this.result = object;
    }

    @PublishedApi
    @Nullable
    public final Object a() {
        Object object;
        block7: {
            block6: {
                block5: {
                    Object object2 = this.result;
                    kotlin.coroutines.intrinsics.a a4 = kotlin.coroutines.intrinsics.a.d;
                    object = object2;
                    if (object2 == a4) {
                        if (androidx.concurrent.futures.a.a(e, (Object)this, (Object)a4, (Object)b.f())) {
                            return b.f();
                        }
                        object = this.result;
                    }
                    if (object != kotlin.coroutines.intrinsics.a.e) break block5;
                    object = b.f();
                    break block6;
                }
                if (object instanceof u.b) break block7;
            }
            return object;
        }
        throw ((u.b)object).c;
    }

    @Nullable
    public e getCallerFrame() {
        Object object = this.c;
        object = object instanceof e ? (e)object : null;
        return object;
    }

    @NotNull
    public g getContext() {
        return this.c.getContext();
    }

    public void resumeWith(@NotNull Object object) {
        block2: {
            while (true) {
                kotlin.coroutines.intrinsics.a a4;
                Object object2;
                if ((object2 = this.result) == (a4 = kotlin.coroutines.intrinsics.a.d)) {
                    if (!androidx.concurrent.futures.a.a(e, (Object)this, (Object)a4, (Object)object)) continue;
                    return;
                }
                if (object2 != b.f()) break block2;
                if (androidx.concurrent.futures.a.a(e, (Object)this, (Object)b.f(), (Object)kotlin.coroutines.intrinsics.a.e)) break;
            }
            this.c.resumeWith(object);
            return;
        }
        throw new IllegalStateException("Already resumed");
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SafeContinuation for ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

