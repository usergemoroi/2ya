/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.nexus;

import java.util.ArrayList;
import java.util.List;

public class NexusConfig {
    private final int connectionTimeout;
    private final List<String> endpoints;
    private final int presenceHeartbeatInterval;

    public NexusConfig() {
        this(new Builder());
    }

    public NexusConfig(Builder builder) {
        List<String> list;
        List<String> list2 = list = builder.endpoints;
        if (list == null) {
            list2 = new ArrayList<String>();
        }
        this.endpoints = list2;
        this.presenceHeartbeatInterval = builder.presence_heartbeat_interval;
        this.connectionTimeout = builder.connection_timeout;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (NexusConfig)object;
            if (this.connectionTimeout != ((NexusConfig)object).connectionTimeout || this.presenceHeartbeatInterval != ((NexusConfig)object).presenceHeartbeatInterval || !this.endpoints.equals(((NexusConfig)object).endpoints)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public List<String> getEndpoints() {
        return this.endpoints;
    }

    public int getPresenceHeartbeatInterval() {
        return this.presenceHeartbeatInterval;
    }

    public int hashCode() {
        return (this.endpoints.hashCode() * 31 + this.presenceHeartbeatInterval) * 31 + this.connectionTimeout;
    }

    public static class Builder {
        int connection_timeout;
        List<String> endpoints;
        int presence_heartbeat_interval;

        public NexusConfig build() {
            return new NexusConfig(this);
        }

        public Builder withConnectionTimeout(int n10) {
            this.connection_timeout = n10;
            return this;
        }

        public Builder withEndpoints(List<String> list) {
            this.endpoints = list;
            return this;
        }

        public Builder withPresenceHeartbeatInterval(int n10) {
            this.presence_heartbeat_interval = n10;
            return this;
        }
    }
}

