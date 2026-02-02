/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.services.frequency;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000bH&\u00a2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", "", "", "key", "", "value", "Lkotlin/k0;", "putWindowStart", "(Ljava/lang/String;J)V", "getWindowStart", "(Ljava/lang/String;)Ljava/lang/Long;", "", "putWindowOccurrencesCount", "(Ljava/lang/String;I)V", "getWindowOccurrencesCount", "(Ljava/lang/String;)Ljava/lang/Integer;", "core-utils_release"}, k=1, mv={1, 6, 0})
public interface EventFrequencyStorage {
    @Nullable
    public Integer getWindowOccurrencesCount(@NotNull String var1);

    @Nullable
    public Long getWindowStart(@NotNull String var1);

    public void putWindowOccurrencesCount(@NotNull String var1, int var2);

    public void putWindowStart(@NotNull String var1, long var2);
}

