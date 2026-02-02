/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.webview;

import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import java.util.Map;

public final class b
implements Runnable {
    public final HelpCenterWebViewInterface c;
    public final Map d;

    public /* synthetic */ b(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map2) {
        this.c = helpCenterWebViewInterface;
        this.d = map2;
    }

    @Override
    public final void run() {
        HelpCenterWebViewInterface.a(this.c, this.d);
    }
}

