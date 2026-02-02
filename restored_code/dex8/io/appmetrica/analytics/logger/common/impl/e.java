/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e {
    public final Pattern a = Pattern.compile("[\\p{Space},;]");

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(Matcher matcher, int n10, int n13) {
        int n14;
        int n15 = n14 = -1;
        if (n13 < n10) return n15;
        int n16 = (n13 - n10) / 2 + n10;
        matcher.region(n16, n13);
        if (matcher.find()) {
            n15 = matcher.start();
            n10 = n13 = e.a(matcher, n15 + 1, n13);
            if (n13 != -1) return n10;
            n10 = n15;
            return n10;
        }
        matcher.region(n10, n16);
        n15 = n14;
        if (!matcher.find()) return n15;
        n13 = matcher.start();
        n10 = n15 = e.a(matcher, n13 + 1, n16);
        if (n15 != -1) return n10;
        return n13;
    }
}

