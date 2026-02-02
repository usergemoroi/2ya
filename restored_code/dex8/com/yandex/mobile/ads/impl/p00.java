/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.n12
 *  com.yandex.mobile.ads.impl.p00$a
 *  com.yandex.mobile.ads.impl.qm1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n12;
import com.yandex.mobile.ads.impl.p00;
import com.yandex.mobile.ads.impl.pd;
import com.yandex.mobile.ads.impl.qm1;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class p00
implements n12 {
    @NotNull
    private final a a;
    @Nullable
    private n12 b;

    public p00(@NotNull pd pd3) {
        this.a = pd3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(@NotNull SSLSocket sSLSocket, @Nullable String string2, @NotNull List<? extends qm1> list) {
        // MONITORENTER : this
        if (this.b == null && this.a.a(sSLSocket)) {
            this.b = this.a.b(sSLSocket);
        }
        n12 n122 = this.b;
        // MONITOREXIT : this
        if (n122 == null) return;
        n122.a(sSLSocket, string2, list);
    }

    public final boolean a() {
        return true;
    }

    public final boolean a(@NotNull SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final String b(@NotNull SSLSocket object) {
        synchronized (this) {
            try {
                if (this.b == null && this.a.a((SSLSocket)object)) {
                    this.b = this.a.b((SSLSocket)object);
                }
                n12 n122 = this.b;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl6 : MonitorExitStatement: MONITOREXIT : this
                if (n122 == null) return null;
                return n122.b((SSLSocket)object);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

