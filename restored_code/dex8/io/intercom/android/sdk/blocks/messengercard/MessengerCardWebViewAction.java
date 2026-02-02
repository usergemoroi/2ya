/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks.messengercard;

import java.util.Map;

public class MessengerCardWebViewAction {
    private final Map<String, Object> payload;
    private final String type;

    public MessengerCardWebViewAction(String string2, Map<String, Object> map2) {
        this.type = string2;
        this.payload = map2;
    }

    public Map<String, Object> getPayload() {
        return this.payload;
    }

    public String getType() {
        return this.type;
    }
}

