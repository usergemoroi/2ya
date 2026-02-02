/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.rl;
import io.appmetrica.analytics.impl.sl;
import io.appmetrica.analytics.impl.tl;
import io.appmetrica.analytics.impl.ul;
import io.appmetrica.analytics.impl.vl;
import io.appmetrica.analytics.impl.xl;
import io.appmetrica.analytics.impl.xn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class wl
implements xn {
    public static final long d = TimeUnit.SECONDS.toMillis(20L);
    public final Context a;
    public final PermissionExtractor b;
    public final CachedDataProvider.CachedData c;

    public wl(Context context) {
        long l10 = d;
        this.c = new CachedDataProvider.CachedData(l10, l10, "sim-info");
        this.a = context;
        this.b = Na.j().i();
    }

    public final rl b() {
        return new rl((Integer)SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimMcc", "TelephonyManager", new sl()), (Integer)SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimMnc", "TelephonyManager", new tl()), SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new vl(this)), (String)SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimOperatorName", "TelephonyManager", new ul()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final List<rl> c() {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                ArrayList<rl> arrayList;
                block9: {
                    block8: {
                        try {
                            ArrayList<rl> arrayList2 = (ArrayList<rl>)this.c.getData();
                            if (arrayList2 == null) break block8;
                            arrayList = arrayList2;
                            if (!arrayList2.isEmpty()) break block9;
                            arrayList = arrayList2;
                            if (!this.c.shouldUpdateData()) break block9;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    arrayList = new ArrayList<rl>();
                    if (Na.F.u.b().n.d) {
                        if (AndroidUtils.isApiAchieved(23)) {
                            if (this.b.hasPermission(this.a, "android.permission.READ_PHONE_STATE")) {
                                arrayList.addAll(xl.a(this.a));
                            }
                            if (arrayList.size() == 0) {
                                arrayList.add(this.b());
                            }
                        } else {
                            arrayList.add(this.b());
                        }
                    }
                    this.c.setData(arrayList);
                }
                return arrayList;
            }
            throw throwable2;
        }
    }
}

