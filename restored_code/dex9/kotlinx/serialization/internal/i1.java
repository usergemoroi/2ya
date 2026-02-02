/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.serialization.descriptors.a
 */
package kotlinx.serialization.internal;

import kotlin.jvm.functions.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.j1;

public final class i1
implements l {
    public final KSerializer c;
    public final KSerializer d;

    public /* synthetic */ i1(KSerializer kSerializer, KSerializer kSerializer2) {
        this.c = kSerializer;
        this.d = kSerializer2;
    }

    public final Object invoke(Object object) {
        return j1.f(this.c, this.d, (a)object);
    }
}

