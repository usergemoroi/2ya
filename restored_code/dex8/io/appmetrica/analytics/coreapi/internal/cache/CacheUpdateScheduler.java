/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.cache;

import kotlin.Metadata;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0004\u00a8\u0006\u0006"}, d2={"Lio/appmetrica/analytics/coreapi/internal/cache/CacheUpdateScheduler;", "", "Lkotlin/k0;", "onStateUpdated", "()V", "scheduleUpdateIfNeededNow", "core-api_release"}, k=1, mv={1, 6, 0})
public interface CacheUpdateScheduler {
    public void onStateUpdated();

    public void scheduleUpdateIfNeededNow();
}

