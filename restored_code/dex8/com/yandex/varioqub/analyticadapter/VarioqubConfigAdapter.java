/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
 *  com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
 */
package com.yandex.varioqub.analyticadapter;

import com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider;
import com.yandex.varioqub.analyticadapter.VarioqubConfigReporter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;", "Lcom/yandex/varioqub/analyticadapter/VarioqubConfigReporter;", "Lcom/yandex/varioqub/analyticadapter/VarioqubConfigClientIdentifiersProvider;", "adapterName", "", "getAdapterName", "()Ljava/lang/String;", "analytic-adapter_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface VarioqubConfigAdapter
extends VarioqubConfigReporter,
VarioqubConfigClientIdentifiersProvider {
    @NotNull
    public String getAdapterName();
}

