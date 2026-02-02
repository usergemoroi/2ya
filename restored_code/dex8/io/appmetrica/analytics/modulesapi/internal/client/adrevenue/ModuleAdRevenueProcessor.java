/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J%\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdRevenueProcessor;", "", "getDescription", "", "process", "", "values", "", "([Ljava/lang/Object;)Z", "modules-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface ModuleAdRevenueProcessor {
    @NotNull
    public String getDescription();

    public boolean process(Object ... var1);
}

