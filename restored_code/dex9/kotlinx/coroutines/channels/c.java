/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.coroutines.g
 */
package kotlinx.coroutines.channels;

import kotlin.coroutines.g;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlinx.coroutines.channels.e;

public final class c
implements q {
    public final l c;
    public final Object d;

    public /* synthetic */ c(l l4, Object object) {
        this.c = l4;
        this.d = object;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        return e.c(this.c, this.d, (Throwable)object, object2, (g)object3);
    }
}

