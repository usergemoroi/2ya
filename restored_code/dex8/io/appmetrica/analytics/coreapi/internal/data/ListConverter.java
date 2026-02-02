/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.data;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.List;

public interface ListConverter<S, P extends MessageNano>
extends Converter<List<S>, P[]> {
}

