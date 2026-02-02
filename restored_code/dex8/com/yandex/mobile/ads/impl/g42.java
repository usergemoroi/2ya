/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  com.yandex.mobile.ads.impl.i92
 *  com.yandex.mobile.ads.impl.op0
 */
package com.yandex.mobile.ads.impl;

import android.os.Build;
import com.yandex.mobile.ads.impl.i92;
import com.yandex.mobile.ads.impl.op0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class g42
implements i92 {
    @NotNull
    public final String a() {
        String string2;
        block11: {
            StringBuilder stringBuilder;
            String string3;
            block13: {
                block12: {
                    int n10;
                    Object var4_1;
                    block10: {
                        var4_1 = null;
                        try {
                            string3 = System.getProperty("http.agent");
                        }
                        catch (Exception exception) {
                            n10 = op0.b;
                            string3 = null;
                        }
                        if (string3 == null) break block10;
                        string2 = string3;
                        if (string3.length() != 0) break block11;
                    }
                    stringBuilder = new StringBuilder(64);
                    stringBuilder.append("Dalvik/");
                    try {
                        string3 = System.getProperty("java.vm.version");
                    }
                    catch (Exception exception) {
                        n10 = op0.b;
                        string3 = var4_1;
                    }
                    if (string3 == null) break block12;
                    string2 = string3;
                    if (string3.length() != 0) break block13;
                }
                string2 = "1.0.0";
            }
            stringBuilder.append(string2);
            stringBuilder.append(" (Linux; U; Android ");
            string3 = string2 = Build.VERSION.RELEASE;
            if (string2.length() == 0) {
                string3 = "1.0";
            }
            stringBuilder.append(string3);
            if (y.e("REL", Build.VERSION.CODENAME) && (string3 = Build.MODEL).length() > 0) {
                stringBuilder.append("; ");
                stringBuilder.append(string3);
            }
            if ((string3 = Build.ID).length() > 0) {
                stringBuilder.append(" Build/");
                stringBuilder.append(string3);
            }
            stringBuilder.append(")");
            string2 = stringBuilder.toString();
        }
        return string2;
    }
}

