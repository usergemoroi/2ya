/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.d0;
import okhttp3.w;

class RetryInterceptor
implements w {
    private static final int MAX_RETRIES = 3;
    private final Sleeper sleeper;

    public RetryInterceptor(Sleeper sleeper) {
        this.sleeper = sleeper;
    }

    static int getRetryTimer(int n10) {
        return (int)Math.pow(2.0, n10);
    }

    @Override
    public d0 intercept(w.a a14) throws IOException {
        int n10 = 0;
        while (n10 <= 3) {
            Object object;
            try {
                object = a14.proceed(a14.request());
                return object;
            }
            catch (IOException iOException) {
                if (n10 != 3) {
                    object = this.sleeper;
                    ((Sleeper)object).sleep(RetryInterceptor.getRetryTimer(++n10));
                    continue;
                }
                throw iOException;
            }
        }
        throw new IOException("request failed due to network errors");
    }

    public static class Sleeper {
        public void sleep(int n10) {
            try {
                TimeUnit.SECONDS.sleep(n10);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

