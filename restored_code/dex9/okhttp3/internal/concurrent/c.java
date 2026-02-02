/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  okhttp3.internal.concurrent.a
 */
package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import okhttp3.internal.concurrent.a;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n*L\n1#1,218:1\n*E\n"})
public final class c
extends a {
    final kotlin.jvm.functions.a<k0> e;

    public c(String string, boolean bl, kotlin.jvm.functions.a<k0> a4) {
        this.e = a4;
        super(string, bl);
    }

    public long f() {
        this.e.invoke();
        return -1L;
    }
}

