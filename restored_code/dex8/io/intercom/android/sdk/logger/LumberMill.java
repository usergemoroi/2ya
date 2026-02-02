/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.logger;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.Intercom;

public class LumberMill {
    private static final Twig BLOCK_TWIG;
    private static final Twig MESSENGER_TWIG;
    private static final Twig NEXUS_TWIG;

    static {
        MESSENGER_TWIG = new Twig(5, "Intercom", false);
        NEXUS_TWIG = new Twig(5, "Intercom realtime", false);
        BLOCK_TWIG = new Twig(5, "Intercom", false);
    }

    public static Twig getBlocksTwig() {
        return BLOCK_TWIG;
    }

    public static Twig getLogger() {
        return MESSENGER_TWIG;
    }

    public static Twig getNexusTwig() {
        return NEXUS_TWIG;
    }

    public static void setLogLevel(@Intercom.LogLevel int n10) {
        MESSENGER_TWIG.setLogLevel(n10);
        NEXUS_TWIG.setLogLevel(n10);
        BLOCK_TWIG.setLogLevel(n10);
    }
}

