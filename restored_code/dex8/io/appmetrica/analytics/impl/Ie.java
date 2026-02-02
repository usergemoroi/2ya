/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.k
 *  kotlin.jvm.internal.v
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.je;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;
import kotlin.k0;

public final class ie
extends v
implements l {
    public ie(Object object) {
        super(1, object, je.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        je je3 = (je)((k)this).receiver;
        je3.a.markCrashCompleted((String)object);
        je3.a.deleteCompletedCrashes();
        return k0.a;
    }
}

