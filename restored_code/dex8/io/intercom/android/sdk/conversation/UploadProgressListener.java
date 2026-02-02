/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.conversation;

public interface UploadProgressListener {
    public void uploadNotice(byte var1);

    public void uploadSmoothEnd();

    public void uploadStarted();

    public void uploadStopped();
}

