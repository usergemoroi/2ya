/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.nexus;

import java.util.AbstractMap;
import java.util.HashMap;

public class EventData
extends HashMap<String, Object> {
    public EventData() {
    }

    public EventData(int n10) {
        super(n10);
    }

    public long optLong(String string2) {
        return this.optLong(string2, -1L);
    }

    public long optLong(String string2, long l10) {
        if ((string2 = ((AbstractMap)this).get(string2)) instanceof Integer) {
            return ((Integer)((Object)string2)).intValue();
        }
        if (string2 instanceof Long) {
            l10 = (Long)((Object)string2);
        }
        return l10;
    }

    public String optString(String string2) {
        return this.optString(string2, "");
    }

    public String optString(String string2, String string3) {
        if ((string2 = ((AbstractMap)this).get(string2)) instanceof String) {
            string3 = string2;
        }
        return string3;
    }
}

