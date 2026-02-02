/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class yd
implements JsonParser,
Converter {
    public final RemoteConfigExtensionConfiguration a;
    public final JsonParser b;
    public final Converter c;

    public yd(@NotNull RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration2) {
        this.a = remoteConfigExtensionConfiguration2;
        this.b = remoteConfigExtensionConfiguration2.getJsonParser();
        this.c = remoteConfigExtensionConfiguration2.getProtobufConverter();
    }

    @NotNull
    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.a;
    }

    @NotNull
    public final Object a(@NotNull JSONObject jSONObject) {
        return this.b.parse(jSONObject);
    }

    @NotNull
    public final Object a(@NotNull byte[] byArray) {
        return this.c.toModel(byArray);
    }

    @NotNull
    public final byte[] a(@NotNull Object object) {
        return (byte[])this.c.fromModel(object);
    }

    @Nullable
    public final Object b(@NotNull JSONObject jSONObject) {
        return this.b.parseOrNull(jSONObject);
    }

    public final Object fromModel(Object object) {
        return (byte[])this.c.fromModel(object);
    }

    @Override
    public final Object parse(Object object) {
        object = (JSONObject)object;
        return this.b.parse(object);
    }

    @Override
    public final Object parseOrNull(Object object) {
        object = (JSONObject)object;
        return this.b.parseOrNull(object);
    }

    public final Object toModel(Object object) {
        object = (byte[])object;
        return this.c.toModel(object);
    }
}

