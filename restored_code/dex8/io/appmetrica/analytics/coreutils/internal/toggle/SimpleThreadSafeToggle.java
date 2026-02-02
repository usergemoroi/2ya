/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0004\u00a2\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2={"Lio/appmetrica/analytics/coreutils/internal/toggle/SimpleThreadSafeToggle;", "Lio/appmetrica/analytics/coreapi/internal/control/Toggle;", "Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;", "toggleObserver", "", "sticky", "Lkotlin/k0;", "registerObserver", "(Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;Z)V", "removeObserver", "(Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;)V", "value", "updateState", "(Z)V", "", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "getActualState", "()Z", "actualState", "initialState", "<init>", "(ZLjava/lang/String;)V", "core-utils_release"}, k=1, mv={1, 6, 0})
public abstract class SimpleThreadSafeToggle
implements Toggle {
    private final String a;
    private boolean b;
    private final ArrayList c;

    public SimpleThreadSafeToggle(boolean bl2, @NotNull String string2) {
        this.a = string2;
        this.b = bl2;
        this.c = new ArrayList();
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean bl2, String string2, int n10, p p14) {
        if ((n10 & 1) != 0) {
            bl2 = false;
        }
        this(bl2, string2);
    }

    @Override
    public boolean getActualState() {
        synchronized (this) {
            boolean bl2 = this.b;
            return bl2;
        }
    }

    @NotNull
    protected final String getTag() {
        return this.a;
    }

    @Override
    public void registerObserver(@NotNull ToggleObserver toggleObserver, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.c.add(toggleObserver);
                        if (!bl2) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    toggleObserver.onStateChanged(this.getActualState());
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void removeObserver(@NotNull ToggleObserver toggleObserver) {
        synchronized (this) {
            this.c.remove(toggleObserver);
            return;
        }
    }

    protected final void updateState(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (bl2 == this.getActualState()) break block4;
                        this.b = bl2;
                        Iterator iterator = this.c.iterator();
                        while (iterator.hasNext()) {
                            ((ToggleObserver)iterator.next()).onStateChanged(bl2);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

