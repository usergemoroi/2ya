/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Do;

public final class al {
    public final Do a;

    public al(Do do_) {
        this.a = do_;
    }

    public final long a() {
        Do do_ = this.a;
        synchronized (do_) {
            long l10 = do_.a.a().optLong("session_id", -1L);
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl5 : MonitorExitStatement: MONITOREXIT : var6_1
            long l11 = 10000000000L;
            if (l10 >= 10000000000L) {
                l11 = 1L + l10;
            }
            this.a.c(l11);
            return l11;
        }
    }
}

