/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.v0;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2={"Lio/appmetrica/analytics/coreutils/internal/toggle/ConjunctiveCompositeThreadSafeToggle;", "Lio/appmetrica/analytics/coreapi/internal/control/Toggle;", "Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;", "toggleObserver", "", "sticky", "Lkotlin/k0;", "registerObserver", "(Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;Z)V", "removeObserver", "(Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;)V", "", "toString", "()Ljava/lang/String;", "e", "Z", "getActualState", "()Z", "setActualState", "(Z)V", "actualState", "", "toggles", "tagPostfix", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class ConjunctiveCompositeThreadSafeToggle
implements Toggle {
    private final ArrayList a;
    private final HashMap b;
    private final String c;
    private final ReentrantLock d;
    private volatile boolean e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConjunctiveCompositeThreadSafeToggle(@NotNull List<? extends Toggle> toggleObserver, @NotNull String object) {
        Throwable throwable2;
        block3: {
            this.a = new ArrayList();
            this.b = new HashMap();
            Object object2 = new StringBuilder("[ConjunctiveCompositeToggle-");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(']');
            this.c = ((StringBuilder)object2).toString();
            this.d = new ReentrantLock();
            try {
                ConjunctiveCompositeThreadSafeToggle.access$acquireLock(this);
                object = toggleObserver.iterator();
                while (object.hasNext()) {
                    object2 = (Toggle)object.next();
                    toggleObserver = new ToggleObserver(this, (Toggle)object2){
                        final ConjunctiveCompositeThreadSafeToggle a;
                        final Toggle b;
                        {
                            this.a = conjunctiveCompositeThreadSafeToggle;
                            this.b = toggle;
                        }

                        public void onStateChanged(boolean bl2) {
                            ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = this.a;
                            Toggle toggle = this.b;
                            try {
                                ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                                ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, bl2, String.valueOf(v0.b(toggle.getClass()).getSimpleName()));
                                return;
                            }
                            finally {
                                ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                            }
                        }
                    };
                    this.b.put(toggleObserver, object2.getActualState());
                    object2.registerObserver(toggleObserver, false);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            this.setActualState(ConjunctiveCompositeThreadSafeToggle.a(this.b.values()));
            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(this);
            return;
        }
        ConjunctiveCompositeThreadSafeToggle.access$releaseLock(this);
        throw throwable2;
    }

    private static boolean a(Collection object) {
        boolean bl2;
        if (!(object instanceof Collection) || !object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (((Boolean)object.next()).booleanValue()) continue;
                bl2 = false;
                break;
            }
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static final void access$acquireLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean bl2 = false;
        while (!bl2) {
            boolean bl3 = bl2;
            u.a a14 = u.d;
            bl3 = bl2;
            bl3 = bl2 = conjunctiveCompositeThreadSafeToggle.d.tryLock(100L, TimeUnit.MILLISECONDS);
            try {
                u.b(k0.a);
                bl3 = bl2;
            }
            catch (Throwable throwable) {
                a14 = u.d;
                u.b(v.a(throwable));
            }
            bl2 = bl3;
            if (bl3) continue;
            try {
                Thread.sleep(100L);
                u.b(k0.a);
                bl2 = bl3;
            }
            catch (Throwable throwable) {
                a14 = u.d;
                u.b(v.a(throwable));
                bl2 = bl3;
            }
        }
    }

    public static final void access$releaseLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.d.unlock();
    }

    public static final void access$updateState(ConjunctiveCompositeThreadSafeToggle object, ToggleObserver toggleObserver, boolean bl2, String string2) {
        ((ConjunctiveCompositeThreadSafeToggle)object).b.put(toggleObserver, bl2);
        bl2 = ConjunctiveCompositeThreadSafeToggle.a(((ConjunctiveCompositeThreadSafeToggle)object).b.values());
        if (bl2 != ((ConjunctiveCompositeThreadSafeToggle)object).getActualState()) {
            ((ConjunctiveCompositeThreadSafeToggle)object).setActualState(bl2);
            object = ((ConjunctiveCompositeThreadSafeToggle)object).a.iterator();
            while (object.hasNext()) {
                ((ToggleObserver)object.next()).onStateChanged(bl2);
            }
        }
    }

    @Override
    public boolean getActualState() {
        return this.e;
    }

    @Override
    public void registerObserver(@NotNull ToggleObserver toggleObserver, boolean bl2) {
        Throwable throwable2;
        block4: {
            block3: {
                try {
                    ConjunctiveCompositeThreadSafeToggle.access$acquireLock(this);
                    this.a.add(toggleObserver);
                    if (!bl2) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                toggleObserver.onStateChanged(this.getActualState());
            }
            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(this);
            return;
        }
        ConjunctiveCompositeThreadSafeToggle.access$releaseLock(this);
        throw throwable2;
    }

    @Override
    public void removeObserver(@NotNull ToggleObserver toggleObserver) {
        try {
            ConjunctiveCompositeThreadSafeToggle.access$acquireLock(this);
            this.a.remove(toggleObserver);
            return;
        }
        finally {
            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(this);
        }
    }

    public void setActualState(boolean bl2) {
        this.e = bl2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConjunctiveCompositeThreadSafeToggle(toggleStates=");
        stringBuilder.append(this.b);
        stringBuilder.append(", tag='");
        stringBuilder.append(this.c);
        stringBuilder.append("', actualState=");
        stringBuilder.append(this.getActualState());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

