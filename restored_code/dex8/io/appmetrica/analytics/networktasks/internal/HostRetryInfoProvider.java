/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.networktasks.internal;

public interface HostRetryInfoProvider {
    public long getLastAttemptTimeSeconds();

    public int getNextSendAttemptNumber();

    public void saveLastAttemptTimeSeconds(long var1);

    public void saveNextSendAttemptNumber(int var1);
}

