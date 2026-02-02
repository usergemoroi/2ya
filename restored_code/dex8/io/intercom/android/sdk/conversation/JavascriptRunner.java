/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  androidx.annotation.VisibleForTesting
 */
package io.intercom.android.sdk.conversation;

import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JavascriptRunner {
    private final Collection<Runnable> actionsAfterLoad;
    private boolean hasLoaded = false;
    private final WebView webView;

    public JavascriptRunner(WebView webView) {
        this(webView, new ArrayList<Runnable>());
    }

    @VisibleForTesting
    JavascriptRunner(WebView webView, Collection<Runnable> collection) {
        this.webView = webView;
        this.actionsAfterLoad = collection;
    }

    public void clearPendingScripts() {
        synchronized (this) {
            this.actionsAfterLoad.clear();
            return;
        }
    }

    public void reset() {
        synchronized (this) {
            this.hasLoaded = false;
            this.clearPendingScripts();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    Runnable runnable;
                    block3: {
                        try {
                            runnable = new Runnable(){
                                final JavascriptRunner this$0;
                                final String val$script;
                                {
                                    this.this$0 = javascriptRunner;
                                    this.val$script = string2;
                                }

                                @Override
                                public void run() {
                                    WebView webView = this.this$0.webView;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("javascript:");
                                    stringBuilder.append(this.val$script);
                                    webView.loadUrl(stringBuilder.toString());
                                }
                            };
                            if (!this.hasLoaded) break block3;
                            this.webView.post(runnable);
                            break block4;
                        }
        // Removed invalid catch block
                        }
                    }
                    this.actionsAfterLoad.add(runnable);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void runPendingScripts() {
        synchronized (this) {
            try {
                this.hasLoaded = true;
                Iterator<Runnable> iterator = this.actionsAfterLoad.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.clearPendingScripts();
                        return;
                    }
                    iterator.next().run();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

