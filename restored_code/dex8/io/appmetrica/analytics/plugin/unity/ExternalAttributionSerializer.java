/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;

final class ExternalAttributionSerializer {
    private ExternalAttributionSerializer() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int getSourceId(@NonNull String string2) {
        int n10;
        string2.hashCode();
        int n13 = -1;
        switch (string2.hashCode()) {
            case 2096405811: {
                if (!string2.equals("Airbridge")) break;
                n13 = 1;
                break;
            }
            case 1956520879: {
                if (!string2.equals("Adjust")) break;
                n13 = 2;
                break;
            }
            case 1115758915: {
                if (!string2.equals("Kochava")) break;
                n13 = 3;
                break;
            }
            case 570897463: {
                if (!string2.equals("Singular")) break;
                n13 = 4;
                break;
            }
            case 82339054: {
                if (!string2.equals("AppsFlyer")) break;
                n13 = 5;
                break;
            }
            case -1793460750: {
                if (!string2.equals("Tenjin")) break;
                n13 = 6;
                break;
            }
        }
        switch (n13) {
            default: {
                n10 = -1;
                break;
            }
            case 1: {
                n10 = 5;
                break;
            }
            case 2: {
                n10 = 4;
                break;
            }
            case 3: {
                n10 = 3;
                break;
            }
            case 4: {
                n10 = 2;
                break;
            }
            case 5: {
                n10 = 1;
                break;
            }
            case 6: {
                n10 = 0;
            }
        }
        switch (n10) {
            default: {
                return -1;
            }
            case 5: {
                return 5;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 6;
            }
            case 1: {
                return 1;
            }
            case 0: 
        }
        return 4;
    }
}

