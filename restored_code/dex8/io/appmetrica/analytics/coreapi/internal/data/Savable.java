/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.data;

import kotlin.Metadata;

@Metadata(d1={"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\u00028\u0000X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lio/appmetrica/analytics/coreapi/internal/data/Savable;", "T", "", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "core-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface Savable<T> {
    public T getValue();

    public void setValue(T var1);
}

