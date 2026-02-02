/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;

public class DefaultNetworkResponseHandler
implements NetworkResponseHandler<DefaultResponseParser.Response> {
    private final DefaultResponseParser a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.a = defaultResponseParser;
    }

    @Override
    @Nullable
    public DefaultResponseParser.Response handle(@NonNull ResponseDataHolder object) {
        object = 200 == ((ResponseDataHolder)object).getResponseCode() ? this.a.parse(((ResponseDataHolder)object).getResponseData()) : null;
        return object;
    }
}

