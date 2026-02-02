/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.w6
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.w6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class x6
implements w6 {
    @NotNull
    public static final x6 a = new x6();

    private x6() {
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x6)) {
            return false;
        }
        object = (x6)object;
        return true;
    }

    public final int hashCode() {
        return 354153816;
    }

    @NotNull
    public final String toString() {
        return "AdQualityVerifierControllerVerifiedResult";
    }
}

