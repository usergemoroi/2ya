/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;

public class m6
extends BaseRequestConfig {
    public String a;
    public String b;
    public om c;

    public static /* synthetic */ void a(m6 m63, RetryPolicyConfig retryPolicyConfig) {
        m63.setRetryPolicyConfig(retryPolicyConfig);
    }

    @NonNull
    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoreRequestConfig{mAppDebuggable='");
        stringBuilder.append(this.a);
        stringBuilder.append("', mAppSystem='");
        stringBuilder.append(this.b);
        stringBuilder.append("', startupState=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

