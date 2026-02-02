/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package io.appmetrica.analytics.logger.common.impl;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

public final class a {
    public static String a(String charSequence, String string2, Object ... objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(" ");
        if (string2 == null) {
            charSequence = "";
        } else {
            charSequence = string2;
            if (objectArray != null) {
                if (objectArray.length == 0) {
                    charSequence = string2;
                } else {
                    try {
                        charSequence = String.format(Locale.US, string2, objectArray);
                    }
                    catch (Throwable throwable) {
                        charSequence = new StringBuilder("Attention!!! Invalid log format. See exception details above. Message: ");
                        ((StringBuilder)charSequence).append(string2);
                        ((StringBuilder)charSequence).append("; arguments: ");
                        ((StringBuilder)charSequence).append(Arrays.toString(objectArray));
                        charSequence = ((StringBuilder)charSequence).toString();
                        Log.e((String)"[LogMessageConstructor]", (String)charSequence, (Throwable)throwable);
                    }
                }
            }
        }
        stringBuilder.append(String.format(Locale.US, "[%d-%s] %s", Thread.currentThread().getId(), Thread.currentThread().getName(), charSequence));
        return stringBuilder.toString();
    }
}

