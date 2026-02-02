/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  kotlin.Metadata
 *  kotlinx.coroutines.android.g
 *  kotlinx.coroutines.internal.r
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.android.e;
import kotlinx.coroutines.android.g;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.n2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2={"Lkotlinx/coroutines/android/a;", "Lkotlinx/coroutines/internal/r;", "", "allFactories", "Lkotlinx/coroutines/n2;", "c", "(Ljava/util/List;)Lkotlinx/coroutines/n2;", "", "b", "()Ljava/lang/String;", "", "a", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, k=1, mv={2, 0, 0})
public final class a
implements r {
    public int a() {
        return 0x3FFFFFFF;
    }

    @NotNull
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @NotNull
    public n2 c(@NotNull List<? extends r> looper) {
        looper = Looper.getMainLooper();
        if (looper != null) {
            return new e(g.a((Looper)looper, (boolean)true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}

