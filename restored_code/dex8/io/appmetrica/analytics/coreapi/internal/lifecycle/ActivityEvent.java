/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.lifecycle;

import kotlin.Metadata;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityEvent;", "", "CREATED", "RESUMED", "PAUSED", "STARTED", "STOPPED", "DESTROYED", "core-api_release"}, k=1, mv={1, 6, 0})
public final class ActivityEvent
extends Enum<ActivityEvent> {
    public static final /* enum */ ActivityEvent CREATED;
    public static final /* enum */ ActivityEvent DESTROYED;
    public static final /* enum */ ActivityEvent PAUSED;
    public static final /* enum */ ActivityEvent RESUMED;
    public static final /* enum */ ActivityEvent STARTED;
    public static final /* enum */ ActivityEvent STOPPED;
    private static final ActivityEvent[] a;

    static {
        ActivityEvent activityEvent;
        ActivityEvent activityEvent2;
        ActivityEvent activityEvent3;
        ActivityEvent activityEvent4;
        ActivityEvent activityEvent5;
        ActivityEvent activityEvent6;
        CREATED = activityEvent6 = new ActivityEvent();
        RESUMED = activityEvent5 = new ActivityEvent();
        PAUSED = activityEvent4 = new ActivityEvent();
        STARTED = activityEvent3 = new ActivityEvent();
        STOPPED = activityEvent2 = new ActivityEvent();
        DESTROYED = activityEvent = new ActivityEvent();
        a = new ActivityEvent[]{activityEvent6, activityEvent5, activityEvent4, activityEvent3, activityEvent2, activityEvent};
    }

    public static ActivityEvent valueOf(String string2) {
        return Enum.valueOf(ActivityEvent.class, string2);
    }

    public static ActivityEvent[] values() {
        return (ActivityEvent[])a.clone();
    }
}

