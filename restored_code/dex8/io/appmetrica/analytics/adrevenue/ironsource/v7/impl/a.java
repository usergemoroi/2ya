/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.adrevenue.ironsource.v7.impl;

import java.util.AbstractMap;
import java.util.HashMap;

public final class a
extends HashMap {
    public a(String string2) {
        ((AbstractMap)this).put("original_source", "ad-revenue-ironsource-v7");
        String string3 = string2;
        if (string2 == null) {
            string3 = "null";
        }
        ((AbstractMap)this).put("original_ad_type", string3);
        ((AbstractMap)this).put("source", "ironsource");
    }
}

