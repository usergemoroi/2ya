/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.chromium.net.RequestFinishedInfo$Listener
 *  org.chromium.net.UploadDataProvider
 *  org.chromium.net.UrlRequest
 *  org.chromium.net.UrlRequest$Builder
 */
package org.chromium.net;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

public abstract class ExperimentalUrlRequest
extends UrlRequest {

    public static abstract class Builder
    extends UrlRequest.Builder {
        public abstract Builder addHeader(String var1, String var2);

        public Builder addRequestAnnotation(Object object) {
            return this;
        }

        public abstract Builder allowDirectExecutor();

        public abstract ExperimentalUrlRequest build();

        public abstract Builder disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        public abstract Builder setHttpMethod(String var1);

        public abstract Builder setPriority(int var1);

        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        public Builder setTrafficStatsTag(int n4) {
            return this;
        }

        public Builder setTrafficStatsUid(int n4) {
            return this;
        }

        public abstract Builder setUploadDataProvider(UploadDataProvider var1, Executor var2);
    }
}

