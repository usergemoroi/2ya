/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.data.Savable;
import io.appmetrica.analytics.coreapi.internal.data.Updatable;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2={"Lio/appmetrica/analytics/coreutils/internal/toggle/SavableToggle;", "Lio/appmetrica/analytics/coreutils/internal/toggle/SimpleThreadSafeToggle;", "Lio/appmetrica/analytics/coreapi/internal/data/Updatable;", "", "value", "Lkotlin/k0;", "update", "(Z)V", "", "subTag", "Lio/appmetrica/analytics/coreapi/internal/data/Savable;", "savable", "<init>", "(Ljava/lang/String;Lio/appmetrica/analytics/coreapi/internal/data/Savable;)V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class SavableToggle
extends SimpleThreadSafeToggle
implements Updatable<Boolean> {
    private final Savable d;

    public SavableToggle(@NotNull String string2, @NotNull Savable<Boolean> savable) {
        boolean bl2 = savable.getValue();
        StringBuilder stringBuilder = new StringBuilder("[SavableToggle - ");
        stringBuilder.append(string2);
        stringBuilder.append(']');
        super(bl2, stringBuilder.toString());
        this.d = savable;
    }

    @Override
    public void update(boolean bl2) {
        this.updateState(bl2);
        this.d.setValue(this.getActualState());
    }
}

