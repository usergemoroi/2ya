/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.intercom.android.nexus;

import androidx.annotation.NonNull;
import java.util.List;

interface NexusTopicProvider {
    @NonNull
    public List<String> getTopics();
}

