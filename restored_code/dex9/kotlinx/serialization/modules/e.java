/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.serialization.modules.f$a
 */
package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.f;

public final class e
implements l {
    public final KSerializer c;

    public /* synthetic */ e(KSerializer kSerializer) {
        this.c = kSerializer;
    }

    public final Object invoke(Object object) {
        return f.a.a((KSerializer)this.c, (List)((List)object));
    }
}

