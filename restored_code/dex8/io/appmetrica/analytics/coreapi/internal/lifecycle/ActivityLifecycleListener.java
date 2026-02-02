/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.MainThread
 */
package io.appmetrica.analytics.coreapi.internal.lifecycle;

import android.app.Activity;
import androidx.annotation.MainThread;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityLifecycleListener;", "", "Landroid/app/Activity;", "activity", "Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityEvent;", "event", "Lkotlin/k0;", "onEvent", "(Landroid/app/Activity;Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityEvent;)V", "core-api_release"}, k=1, mv={1, 6, 0})
public interface ActivityLifecycleListener {
    @MainThread
    public void onEvent(@NotNull Activity var1, @NotNull ActivityEvent var2);
}

