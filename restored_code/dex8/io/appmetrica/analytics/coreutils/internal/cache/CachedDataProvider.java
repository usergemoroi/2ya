/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

public interface CachedDataProvider {

    public static class CachedData<T> {
        private final String a;
        private volatile long b;
        private volatile long c;
        private long d = 0L;
        private Object e = null;

        public CachedData(long l10, long l11, @NonNull String string2) {
            this.a = String.format("[CachedData-%s]", string2);
            this.b = l10;
            this.c = l11;
        }

        @Nullable
        public T getData() {
            return (T)this.e;
        }

        @VisibleForTesting
        public long getExpiryTime() {
            return this.c;
        }

        @VisibleForTesting
        public long getRefreshTime() {
            return this.b;
        }

        public final boolean isEmpty() {
            boolean bl2 = this.e == null;
            return bl2;
        }

        public void setData(@Nullable T t13) {
            this.e = t13;
            this.d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long l10, long l11) {
            this.b = l10;
            this.c = l11;
        }

        public final boolean shouldClearData() {
            long l10 = this.d;
            boolean bl2 = false;
            if (l10 == 0L) {
                return false;
            }
            l10 = System.currentTimeMillis() - this.d;
            if (l10 > this.c || l10 < 0L) {
                bl2 = true;
            }
            return bl2;
        }

        public final boolean shouldUpdateData() {
            long l10 = System.currentTimeMillis() - this.d;
            boolean bl2 = l10 > this.b || l10 < 0L;
            return bl2;
        }

        @NonNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("CachedData{tag='");
            stringBuilder.append(this.a);
            stringBuilder.append("', refreshTime=");
            stringBuilder.append(this.b);
            stringBuilder.append(", expiryTime=");
            stringBuilder.append(this.c);
            stringBuilder.append(", mCachedTime=");
            stringBuilder.append(this.d);
            stringBuilder.append(", mCachedData=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }
}

