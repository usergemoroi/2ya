/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.UUID;

public final class vo {
    public static boolean a(String object) {
        if (object != null && ((String)object).length() == 32) {
            try {
                object = UUID.fromString(vo.b((String)object));
            }
            catch (Throwable throwable) {
                object = null;
            }
            return object != null;
        }
        return false;
    }

    public static String b(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2.substring(0, 8));
        stringBuilder.append("-");
        stringBuilder.append(string2.substring(8, 12));
        stringBuilder.append("-");
        stringBuilder.append(string2.substring(12, 16));
        stringBuilder.append("-");
        stringBuilder.append(string2.substring(16, 20));
        stringBuilder.append("-");
        stringBuilder.append(string2.substring(20, 32));
        return stringBuilder.toString();
    }
}

