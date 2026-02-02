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
import kotlinx.serialization.internal.x1;

public final class w1
implements l {
    public final KSerializer c;
    public final KSerializer d;

    public /* synthetic */ w1(KSerializer kSerializer, KSerializer kSerializer2) {
        this.c = kSerializer;
        this.d = kSerializer2;
    }

    public final Object invoke(Object object) {
        return x1.f(this.c, this.d, (a)object);
    }
}

