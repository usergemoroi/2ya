/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.webview;

import java.util.Map;

public class HelpCenterWebViewAction {
    private final String type;
    private final Map<String, Object> value;

    public HelpCenterWebViewAction(String string2, Map<String, Object> map2) {
        this.type = string2;
        this.value = map2;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getValue() {
        return this.value;
    }
}

