/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.g0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2={"Lkotlinx/coroutines/e2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/g0;", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "b", "()Lkotlinx/coroutines/e2;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/coroutines/d2;", "c", "Lkotlinx/coroutines/d2;", "job", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class e2
extends CancellationException
implements g0<e2> {
    @JvmField
    @NotNull
    public final transient d2 c;

    public e2(@NotNull String string, @Nullable Throwable throwable, @NotNull d2 d22) {
        super(string);
        this.c = d22;
        if (throwable != null) {
            this.initCause(throwable);
        }
    }

    @Nullable
    public e2 b() {
        return null;
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = object == this || object instanceof e2 && y.e((Object)((Throwable)(object = (e2)object)).getMessage(), (Object)this.getMessage()) && y.e((Object)((e2)object).c, (Object)this.c) && y.e((Object)((Throwable)object).getCause(), (Object)this.getCause());
        return bl;
    }

    @Override
    @NotNull
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        Object object = this.getMessage();
        y.g((Object)object);
        int n4 = ((String)object).hashCode();
        int n5 = this.c.hashCode();
        object = this.getCause();
        int n6 = object != null ? object.hashCode() : 0;
        return (n4 * 31 + n5) * 31 + n6;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("; job=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

