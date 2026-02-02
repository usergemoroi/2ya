/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.JvmField
 *  kotlinx.coroutines.a1
 *  kotlinx.coroutines.g3
 *  kotlinx.coroutines.z0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.g3;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.z0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2={"Lkotlinx/coroutines/f3;", "U", "T", "Lkotlinx/coroutines/internal/z;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/k0;", "run", "()V", "", "A0", "()Ljava/lang/String;", "", "g", "J", "time", "Lkotlin/coroutines/d;", "uCont", "<init>", "(JLkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class f3<U, T extends U>
extends z<T>
implements Runnable {
    @JvmField
    public final long g;

    public f3(long l4, @NotNull d<? super U> d4) {
        super(d4.getContext(), d4);
        this.g = l4;
    }

    @Override
    @NotNull
    public String A0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.A0());
        stringBuilder.append("(timeMillis=");
        stringBuilder.append(this.g);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public void run() {
        this.T(g3.a((long)this.g, (z0)a1.d((g)this.getContext()), (d2)this));
    }
}

