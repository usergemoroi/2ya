/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.internal.p0
 */
package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.internal.p0;

public final class o0
implements a {
    public final SerialDescriptor c;
    public final b d;

    public /* synthetic */ o0(SerialDescriptor serialDescriptor, b b4) {
        this.c = serialDescriptor;
        this.d = b4;
    }

    public final Object invoke() {
        return p0.a((SerialDescriptor)this.c, (b)this.d);
    }
}

