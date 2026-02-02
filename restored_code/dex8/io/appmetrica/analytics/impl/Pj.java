/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.impl.Bj;
import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.qj;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pj
implements qj {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;

    public pj(@NotNull Context object) {
        this.a = object;
        object = new StringBuilder("content://");
        ((StringBuilder)object).append(this.a());
        ((StringBuilder)object).append("/clids");
        this.b = ((StringBuilder)object).toString();
        this.c = "clid_key";
        this.d = "clid_value";
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Q3 b() {
        block13: {
            block14: {
                block12: {
                    if (!PackageManagerUtils.hasContentProvider(this.a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
                        Bj.a("Satellite content provider with clids was not found.", new Object[0]);
                        return null;
                    }
                    var2_1 = this.a.getContentResolver().query(Uri.parse((String)this.b), null, null, null, null);
                    if (var2_1 == null) ** GOTO lbl-1000
                    try {
                        var3_2 = new LinkedHashMap();
lbl9:

                        ** while (var1_7 = var2_1.moveToNext())
                    }
                    catch (Throwable var3_3) {}

                    {
                        ** try [egrp 2[TRYBLOCK] [3 : 68->156)] { 
lbl12:

                        break block12;
lbl13:

                        catch (Throwable var4_9) {
lbl15:

                        }
                    }
                    break block13;
                }
                var5_10 = var2_1.getString(var2_1.getColumnIndexOrThrow(this.c));
                var4_8 /* !! */  = var2_1.getString(var2_1.getColumnIndexOrThrow(this.d));
                if (TextUtils.isEmpty((CharSequence)var5_10) || TextUtils.isEmpty((CharSequence)var4_8 /* !! */ )) break block14;
                var3_2.put(var5_10, var4_8 /* !! */ );

            }
            Bj.a("Invalid clid {%s : %s}", new Object[]{var5_10, var4_8 /* !! */ });

            {
                Bj.a("Clids from satellite: %s", new Object[]{var3_2});
                var3_2 = new Q3((Map<String, String>)var3_2, q8.d);
            }
            ro.a(var2_1);
            return var3_2;
        // Removed invalid catch block
                break block13;
            }

            {
                Bj.a("No Satellite content provider found", new Object[0]);
            }
            ro.a(var2_1);
            return null;
        }
        try {
            var5_10 = ImportantLogger.INSTANCE;
            var4_8 /* !! */  = new StringBuilder();
            var4_8 /* !! */ .append(String.format("Error while getting satellite clids", new Object[0]));
            var4_8 /* !! */ .append("\n");
            var4_8 /* !! */ .append(StringUtils.throwableToString((Throwable)var3_5));
            var5_10.info("AppMetrica-Attribution", var4_8 /* !! */ .toString(), new Object[0]);
        }
        catch (Throwable var3_6) {
            ro.a(var2_1);
            throw var3_6;
        }
        ro.a(var2_1);
        return null;
    }
}

