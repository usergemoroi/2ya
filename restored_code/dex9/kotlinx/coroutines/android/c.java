/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.coroutines.i1
 */
package kotlinx.coroutines.android;

import kotlinx.coroutines.android.e;
import kotlinx.coroutines.i1;

public final class c
implements i1 {
    public final e c;
    public final Runnable d;

    public /* synthetic */ c(e e4, Runnable runnable) {
        this.c = e4;
        this.d = runnable;
    }

    public final void dispose() {
        e.S(this.c, this.d);
    }
}

