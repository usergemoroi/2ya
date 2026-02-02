/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.data;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

public interface ProtobufStateSerializer<T extends MessageNano>
extends StateSerializer<T> {
}

