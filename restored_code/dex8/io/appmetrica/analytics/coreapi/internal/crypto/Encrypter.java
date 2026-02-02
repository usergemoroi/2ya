/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.crypto;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2={"Lio/appmetrica/analytics/coreapi/internal/crypto/Encrypter;", "", "encrypt", "", "input", "core-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface Encrypter {
    @Nullable
    public byte[] encrypt(@NotNull byte[] var1);
}

