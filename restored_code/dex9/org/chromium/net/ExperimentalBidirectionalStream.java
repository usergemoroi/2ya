/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.chromium.net.BidirectionalStream
 *  org.chromium.net.BidirectionalStream$Builder
 */
package org.chromium.net;

import org.chromium.net.BidirectionalStream;

public abstract class ExperimentalBidirectionalStream
extends BidirectionalStream {

    public static abstract class Builder
    extends BidirectionalStream.Builder {
        public abstract Builder addHeader(String var1, String var2);

        public Builder addRequestAnnotation(Object object) {
            return this;
        }

        public abstract ExperimentalBidirectionalStream build();

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean var1);

        public abstract Builder setHttpMethod(String var1);

        public abstract Builder setPriority(int var1);

        public Builder setTrafficStatsTag(int n4) {
            return this;
        }

        public Builder setTrafficStatsUid(int n4) {
            return this;
        }
    }
}

