/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.io.IOException;

public class SendingDataTaskHelper {
    private final RequestBodyEncrypter a;
    private final Compressor b;
    private final TimeProvider c;
    private final RequestDataHolder d;
    private final ResponseDataHolder e;
    private final NetworkResponseHandler f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.a = requestBodyEncrypter;
        this.b = compressor;
        this.c = timeProvider;
        this.d = requestDataHolder;
        this.e = responseDataHolder;
        this.f = networkResponseHandler;
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response)this.f.handle(this.e);
        boolean bl2 = response != null && "accepted".equals(response.mStatus);
        return bl2;
    }

    public void onPerformRequest() {
        this.d.applySendTime(this.c.currentTimeMillis());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean prepareAndSetPostData(@NonNull byte[] byArray) {
        boolean bl2;
        boolean bl3 = false;
        try {
            byArray = this.b.compress(byArray);
            bl2 = bl3;
            if (byArray == null) return bl2;
        }
        catch (IOException iOException) {
            return bl3;
        }
        byArray = this.a.encrypt(byArray);
        bl2 = bl3;
        if (byArray == null) return bl2;
        this.d.setPostData(byArray);
        return true;
    }
}

