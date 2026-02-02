/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.sheets;

import java.util.Map;

public interface SheetListener {
    public void onCloseSheetAction();

    public void onSheetTitleAction(String var1);

    public void onSubmitSheetAction(Map<String, Object> var1);

    public void onWebViewFinishedLoad();
}

