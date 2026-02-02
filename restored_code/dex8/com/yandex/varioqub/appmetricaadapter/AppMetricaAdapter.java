/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
 *  com.yandex.varioqub.analyticadapter.data.ConfigData
 *  com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter$Companion
 *  com.yandex.varioqub.appmetricaadapter.impl.d
 *  com.yandex.varioqub.appmetricaadapter.impl.e
 *  com.yandex.varioqub.protobuf.nano.MessageNano
 *  kotlin.collections.b1
 *  kotlin.collections.t
 */
package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.e;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\b\u00a2\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\b8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2={"Lcom/yandex/varioqub/appmetricaadapter/AppMetricaAdapter;", "Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;", "Lcom/yandex/varioqub/analyticadapter/AdapterIdentifiersCallback;", "callback", "Lkotlin/k0;", "requestDeviceId", "(Lcom/yandex/varioqub/analyticadapter/AdapterIdentifiersCallback;)V", "requestUserId", "", "experiments", "setExperiments", "(Ljava/lang/String;)V", "", "", "triggeredTestIds", "setTriggeredTestIds", "(Ljava/util/Set;)V", "Lcom/yandex/varioqub/analyticadapter/data/ConfigData;", "configData", "reportConfigChanged", "(Lcom/yandex/varioqub/analyticadapter/data/ConfigData;)V", "apiKey", "setCustomReporter", "e", "Ljava/lang/String;", "getAdapterName", "()Ljava/lang/String;", "adapterName", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "appmetrica-adapter_release"}, k=1, mv={1, 6, 0})
public final class AppMetricaAdapter
implements VarioqubConfigAdapter {
    @NotNull
    public static final Companion Companion = new /* Unavailable Anonymous Inner Class!! */;
    private final Context a;
    private final d b;
    private String c;
    private Set d;
    private final String e;

    public AppMetricaAdapter(@NotNull Context context) {
        this.a = context;
        this.b = com.yandex.varioqub.appmetricaadapter.impl.e.a();
        this.c = "";
        this.d = b1.f();
        this.e = "AppMetricaAdapter";
    }

    @Override
    @NotNull
    public String getAdapterName() {
        return this.e;
    }

    public void reportConfigChanged(@NotNull ConfigData configData) {
        d d14 = this.b;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", configData.getConfigLoadTimestamp());
        d14.a(linkedHashMap);
    }

    public void requestDeviceId(@NotNull AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.b.a(this.a, adapterIdentifiersCallback);
    }

    public void requestUserId(@NotNull AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.b.b(this.a, adapterIdentifiersCallback);
    }

    public final void setCustomReporter(@NotNull String string2) {
        this.b.a(this.a, string2);
    }

    public void setExperiments(@NotNull String string2) {
        this.c = string2;
        Objects.toString(this.d);
        string2 = this.b;
        k k11 = new k();
        k11.a = this.c;
        k11.b = t.f1((Collection)this.d);
        string2.a(MessageNano.toByteArray((MessageNano)k11));
    }

    public void setTriggeredTestIds(@NotNull Set<Long> object) {
        Objects.toString(object);
        this.d = object = t.j1(object);
        Objects.toString(object);
        d d14 = this.b;
        object = new k();
        ((k)((Object)object)).a = this.c;
        ((k)((Object)object)).b = t.f1((Collection)this.d);
        d14.a(MessageNano.toByteArray((MessageNano)object));
    }
}

