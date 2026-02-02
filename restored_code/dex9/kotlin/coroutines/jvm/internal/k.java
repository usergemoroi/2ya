/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.d
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.d;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f\u00a2\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2={"Lkotlin/coroutines/jvm/internal/k;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/jvm/internal/t;", "", "", "toString", "()Ljava/lang/String;", "", "arity", "I", "getArity", "()I", "Lkotlin/coroutines/d;", "completion", "<init>", "(ILkotlin/coroutines/d;)V", "(I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.3")
public abstract class k
extends kotlin.coroutines.jvm.internal.d
implements t<Object> {
    private final int arity;

    public k(int n4) {
        this(n4, null);
    }

    public k(int n4, @Nullable d<Object> d4) {
        super(d4);
        this.arity = n4;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    @NotNull
    public String toString() {
        String string;
        if (this.getCompletion() == null) {
            string = v0.k((t)this);
            y.i((Object)string, (String)"renderLambdaToString(...)");
        } else {
            string = super.toString();
        }
        return string;
    }
}

