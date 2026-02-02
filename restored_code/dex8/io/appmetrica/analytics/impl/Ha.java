/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.impl.aa;
import io.appmetrica.analytics.impl.ia;
import io.appmetrica.analytics.impl.ka;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class ha
extends nh {
    public final ia b;

    public ha(@NotNull v5 v54, @NotNull TimeProvider timeProvider) {
        super(v54);
        this.b = new ia(v54, timeProvider);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean a(@NotNull o6 var1_1) {
        block9: {
            var9_3 = this.b;
            var8_4 = var9_3.a.t().C;
            var8_4 = var8_4 != null ? Long.valueOf(var8_4.a) : null;
            if (var8_4 != null) {
                block10: {
                    var10_6 = var9_3.a.t;
                    synchronized (var10_6) {
                        var5_7 = var10_6.a.a().optLong("external_attribution_window_start", -1L);
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 8] lbl9 : MonitorExitStatement: MONITOREXIT : var10_6
                        var3_8 = var5_7;
                        if (var5_7 < 0L) {
                            var3_8 = var9_3.b.currentTimeMillis();
                            var9_3.a.t.a(var3_8);
                        }
                        if (var9_3.b.currentTimeMillis() - var3_8 > var8_4.longValue()) break block9;
                    }
                    var1_1 = var1_1.getValueBytes();
                    var1_1 = MessageNano.mergeFrom(new aa(), (byte[])var1_1);
                    var2_9 = var1_1.a;
                    var1_1 = new String(var1_1.b, d.b);
                    var10_6 = this.b.a.c.k().get(var2_9);
                    if (var10_6 != null) {
                        var8_4 = new JSONObject((String)var1_1);
                        var9_3 = new JSONObject((String)var10_6);
                        var7_10 = JsonUtils.isEqualTo((JSONObject)var8_4, (JSONObject)var9_3);
                        if (var7_10 ^ true) break block10;
                        var8_4 = this.a.m;
                        var9_3 = new StringBuilder("Ignoring attribution of type `");
                        var9_3.append(ka.a(var2_9));
                        var9_3.append("` with value `");
                        var9_3.append((String)var1_1);
                        var9_3.append("` since it is not new");
                        var8_4.info(var9_3.toString(), new Object[0]);
                        return true;
                    }
                }
lbl39:
                // 2 sources

                while (true) {
                    var8_4 = this.b;
                    var9_3 = var8_4.a.c.k();
                    var9_3.put(var2_9, var1_1);
                    var8_4.a.c.b((Map<Integer, String>)var9_3);
                    var1_1 = this.a.m;
                    var8_4 = new StringBuilder("Handling attribution of type `");
                    var8_4.append(ka.a(var2_9));
                    var8_4.append('`');
                    var1_1.info(var8_4.toString(), new Object[0]);
                    return false;
                }
                {
                    catch (Throwable var1_2) {
                        throw var1_2;
                    }
                }
            }
        }
        this.a.m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
        catch (Throwable var8_5) {
            ** continue;
        }
    }
}

