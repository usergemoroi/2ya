/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.android;

import kotlin.jvm.functions.l;
import kotlinx.coroutines.android.e;

public final class d
implements l {
    public final e c;
    public final Runnable d;

    public /* synthetic */ d(e e4, Runnable runnable) {
        this.c = e4;
        this.d = runnable;
    }

    public final Object invoke(Object object) {
        return e.T(this.c, this.d, (Throwable)object);
    }
}

