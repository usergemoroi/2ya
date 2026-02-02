/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.selects.l
 */
package kotlinx.coroutines.channels;

import kotlin.coroutines.g;
import kotlin.jvm.functions.q;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.selects.l;

public final class d
implements q {
    public final Object c;
    public final e d;
    public final l e;

    public /* synthetic */ d(Object object, e e4, l l4) {
        this.c = object;
        this.d = e4;
        this.e = l4;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        return kotlinx.coroutines.channels.e.a(this.c, this.d, this.e, (Throwable)object, object2, (g)object3);
    }
}

