/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.webkit.WebView
 *  org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
 */
package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface WebMessageListenerBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    public void onPostMessage(WebView var1, InvocationHandler var2, Uri var3, boolean var4, InvocationHandler var5);
}

