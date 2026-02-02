/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.intercom.android.nexus;

import androidx.annotation.NonNull;
import io.intercom.android.nexus.NexusEvent;

public interface NexusListener {
    public void notifyEvent(@NonNull NexusEvent var1);

    public void onConnect();

    public void onConnectFailed();

    public void onShutdown();
}

