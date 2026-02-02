/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a40$a
 *  com.yandex.mobile.ads.impl.cm
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.uu
 *  com.yandex.mobile.ads.impl.z30
 *  com.yandex.mobile.ads.impl.z30$a
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.uu;
import com.yandex.mobile.ads.impl.z30;
import java.util.Map;
import java.util.UUID;

public final class o50
implements z30 {
    private final z30.a a;

    public o50(z30.a a14) {
        this.a = (z30.a)((Object)uf.a((Object)((Object)a14)));
    }

    public final void a(@Nullable a40.a a14) {
    }

    public final void b(@Nullable a40.a a14) {
    }

    @Nullable
    public final uu getCryptoConfig() {
        return null;
    }

    @Nullable
    public final z30.a getError() {
        return this.a;
    }

    public final UUID getSchemeUuid() {
        return cm.a;
    }

    public final int getState() {
        return 1;
    }

    public final boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Nullable
    public final Map<String, String> queryKeyStatus() {
        return null;
    }

    public final boolean requiresSecureDecoder(String string2) {
        return false;
    }
}

