/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.b7;
import io.appmetrica.analytics.impl.c7;
import io.appmetrica.analytics.impl.ro;
import java.util.HashSet;

public final class d7
implements DataSendingRestrictionController {
    public final b7 a;
    public Boolean b;
    public final HashSet c = new HashSet();
    public final HashSet d = new HashSet();

    public d7(@NonNull b7 b74) {
        this.a = b74;
        this.b = ((c7)b74).a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable Boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!ro.a(bl2) && this.b != null) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    boolean bl3 = Boolean.FALSE.equals(bl2);
                    this.b = bl3;
                    ((c7)this.a).a.c(bl3).b();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NonNull String string2, @Nullable Boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        if (!ro.a(bl2) && (this.d.contains(string2) || this.c.contains(string2))) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    if (WrapUtils.getOrDefault(bl2, Boolean.TRUE).booleanValue()) {
                        this.d.add(string2);
                        this.c.remove(string2);
                    } else {
                        this.c.add(string2);
                        this.d.remove(string2);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void b(@Nullable Boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.b != null) break block3;
                        this.a(bl2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean isRestrictedForSdk() {
        synchronized (this) {
            try {
                Boolean bl2 = this.b;
                if (bl2 != null) return bl2;
                return this.d.isEmpty();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

