/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.asserts;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lio/appmetrica/analytics/coreutils/internal/asserts/DebugAssert;", "", "value", "", "errorMessage", "Lkotlin/k0;", "assertNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class DebugAssert {
    @NotNull
    public static final DebugAssert INSTANCE = new DebugAssert();

    private DebugAssert() {
    }

    @JvmStatic
    public static final void assertNotNull(@Nullable Object object, @NotNull String string2) {
    }
}

