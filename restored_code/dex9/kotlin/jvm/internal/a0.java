/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2={"Lkotlin/jvm/internal/a0;", "R", "Lkotlin/jvm/internal/t;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public abstract class a0<R>
implements t<R>,
Serializable {
    private final int arity;

    public a0(int n4) {
        this.arity = n4;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String string = v0.l((a0)this);
        y.i((Object)string, (String)"renderLambdaToString(...)");
        return string;
    }
}

