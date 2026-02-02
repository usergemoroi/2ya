/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.impl.s8;

public abstract class j2 {
    public static final IAppSetIdRetriever a() {
        IAppSetIdRetriever iAppSetIdRetriever = ReflectionUtils.detectClassExists("com.google.android.gms.appset.AppSet") ? new AppSetIdRetriever() : new s8();
        return iAppSetIdRetriever;
    }
}

