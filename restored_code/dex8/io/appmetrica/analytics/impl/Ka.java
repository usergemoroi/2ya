/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public abstract class ka {
    public static final String a(int n10) {
        String string2;
        switch (n10) {
            default: {
                string2 = "UNKNOWN";
                break;
            }
            case 6: {
                string2 = "SINGULAR";
                break;
            }
            case 5: {
                string2 = "AIRBRIDGE";
                break;
            }
            case 4: {
                string2 = "TENJIN";
                break;
            }
            case 3: {
                string2 = "KOCHAVA";
                break;
            }
            case 2: {
                string2 = "ADJUST";
                break;
            }
            case 1: {
                string2 = "APPSFLYER";
            }
        }
        return string2;
    }
}

