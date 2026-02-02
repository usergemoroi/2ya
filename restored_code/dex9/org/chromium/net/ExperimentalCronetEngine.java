/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  org.chromium.net.BidirectionalStream$Callback
 *  org.chromium.net.CronetEngine
 *  org.chromium.net.CronetEngine$Builder
 *  org.chromium.net.CronetEngine$Builder$LibraryLoader
 *  org.chromium.net.ICronetEngineBuilder
 *  org.chromium.net.NetworkQualityRttListener
 *  org.chromium.net.NetworkQualityThroughputListener
 *  org.chromium.net.RequestFinishedInfo$Listener
 *  org.chromium.net.UrlRequest$Callback
 */
package org.chromium.net;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

public abstract class ExperimentalCronetEngine
extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean bl, boolean bl2, boolean bl3) {
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String var1, BidirectionalStream.Callback var2, Executor var3);

    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String var1, UrlRequest.Callback var2, Executor var3);

    public URLConnection openConnection(URL uRL, Proxy proxy) throws IOException {
        return uRL.openConnection(proxy);
    }

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void startNetLogToDisk(String string, boolean bl, int n4) {
    }

    public static class Builder
    extends CronetEngine.Builder {
        public Builder(Context context) {
            super(context);
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        public Builder addPublicKeyPins(String string, Set<byte[]> set, boolean bl, Date date) {
            super.addPublicKeyPins(string, set, bl, date);
            return this;
        }

        public Builder addQuicHint(String string, int n4, int n5) {
            super.addQuicHint(string, n4, n5);
            return this;
        }

        public ExperimentalCronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder enableHttp2(boolean bl) {
            super.enableHttp2(bl);
            return this;
        }

        public Builder enableHttpCache(int n4, long l4) {
            super.enableHttpCache(n4, l4);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean bl) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(bl);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean bl) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(bl);
            return this;
        }

        public Builder enableQuic(boolean bl) {
            super.enableQuic(bl);
            return this;
        }

        public Builder enableSdch(boolean bl) {
            return this;
        }

        @VisibleForTesting
        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String string) {
            this.mBuilderDelegate.setExperimentalOptions(string);
            return this;
        }

        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setStoragePath(String string) {
            super.setStoragePath(string);
            return this;
        }

        public Builder setThreadPriority(int n4) {
            this.mBuilderDelegate.setThreadPriority(n4);
            return this;
        }

        public Builder setUserAgent(String string) {
            super.setUserAgent(string);
            return this;
        }
    }
}

