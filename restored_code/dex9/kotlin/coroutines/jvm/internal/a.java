/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.d
 *  kotlin.coroutines.jvm.internal.e
 *  kotlin.coroutines.jvm.internal.f
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.u
 *  kotlin.u$a
 *  kotlin.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001\u00a2\u0006\u0004\b\u001f\u0010 J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018R!\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006!"}, d2={"Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/io/Serializable;", "Lkotlin/u;", "result", "Lkotlin/k0;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "completion", "create", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "value", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/d;", "getCompletion", "()Lkotlin/coroutines/d;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.3")
public abstract class a
implements d<Object>,
e,
Serializable {
    @Nullable
    private final d<Object> completion;

    public a(@Nullable d<Object> d4) {
        this.completion = d4;
    }

    @NotNull
    public d<k0> create(@Nullable Object object, @NotNull d<?> d4) {
        y.j(d4, (String)"completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @NotNull
    public d<k0> create(@NotNull d<?> d4) {
        y.j(d4, (String)"completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public e getCallerFrame() {
        Object object = this.completion;
        object = object instanceof e ? (e)object : null;
        return object;
    }

    @Nullable
    public final d<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return f.d((a)this);
    }

    @Nullable
    protected abstract Object invokeSuspend(@NotNull Object var1);

    protected void releaseIntercepted() {
    }

    public final void resumeWith(@NotNull Object object) {
        d<Object> d4 = this;
        do {
            g.b((d)d4);
            d<Object> d5 = d4;
            d4 = d5.completion;
            y.g(d4);
            try {
                object = d5.invokeSuspend(object);
                if (object == b.f()) {
                    return;
                }
                object = u.b((Object)object);
            }
            catch (Throwable throwable) {
                u.a a4 = u.d;
                object = u.b((Object)v.a((Throwable)throwable));
            }
            d5.releaseIntercepted();
        } while (d4 instanceof a);
        d4.resumeWith(object);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Continuation at ");
        Object object = this.getStackTraceElement();
        if (object == null) {
            object = this.getClass().getName();
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

