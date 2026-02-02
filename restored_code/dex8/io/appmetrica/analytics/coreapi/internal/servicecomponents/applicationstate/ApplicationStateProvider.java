/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationStateProvider;", "", "currentState", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationState;", "getCurrentState", "()Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationState;", "registerStickyObserver", "observer", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationStateObserver;", "core-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface ApplicationStateProvider {
    @NotNull
    public ApplicationState getCurrentState();

    @NotNull
    public ApplicationState registerStickyObserver(@NotNull ApplicationStateObserver var1);
}

