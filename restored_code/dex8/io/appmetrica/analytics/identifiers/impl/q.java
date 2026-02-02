/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcel
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.identifiers.impl.a;
import io.appmetrica.analytics.identifiers.impl.b;
import io.appmetrica.analytics.identifiers.impl.c;
import io.appmetrica.analytics.identifiers.impl.f;
import io.appmetrica.analytics.identifiers.impl.g;
import io.appmetrica.analytics.identifiers.impl.l;
import io.appmetrica.analytics.identifiers.impl.p;
import io.appmetrica.analytics.identifiers.impl.r;
import io.appmetrica.analytics.identifiers.impl.s;
import io.appmetrica.analytics.identifiers.impl.u;
import org.jetbrains.annotations.NotNull;

public final class q
implements b {
    public final f a;

    public q() {
        this(new f(r.a(), p.a, "yandex"));
    }

    @VisibleForTesting
    public q(@NotNull f f11) {
        this.a = f11;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final c a(@NotNull Context object) {
        c c11 = this.b((Context)object);
        this.a.b((Context)object);
        catch (Throwable throwable) {
            IdentifierStatus identifierStatus = IdentifierStatus.UNKNOWN;
            Object object2 = new StringBuilder("exception while fetching yandex adv_id: ");
            ((StringBuilder)object2).append(throwable.getMessage());
            object2 = new c(identifierStatus, null, ((StringBuilder)object2).toString(), 2);
            try {
                this.a.b((Context)object);
                return object2;
                catch (g g11) {
                    Object object3;
                    Object object4 = object3 = g11.getMessage();
                    if (object3 == null) {
                        object4 = "unknown exception while binding yandex adv_id service";
                    }
                    object4 = object3 = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, (String)object4, 2);
                    this.a.b((Context)object);
                    return object3;
                    {
                        catch (Throwable throwable2) {
                            return object4;
                        }
                    }
                    catch (l l10) {
                        Throwable throwable3222;
                        block22: {
                            Object object5;
                            try {
                                object4 = object5 = l10.getMessage();
                                if (object5 == null) {
                                    object4 = "No yandex adv_id service";
                                }
                                object4 = object5 = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, (String)object4, 2);
                            }
                            catch (Throwable throwable3222) {
                                break block22;
                            }
                            this.a.b((Context)object);
                            return object5;
                        }
                        try {
                            this.a.b((Context)object);
                        }
                        finally {
                            throw throwable3222;
                        }
                    }
                }
            }
            catch (Throwable throwable4) {
                return object2;
            }
        }
    }

    public final c b(Context object) {
        boolean bl2;
        Object object2;
        Parcel parcel;
        Parcel parcel2;
        block6: {
            object = (s)((u)this.a.a((Context)object));
            object.getClass();
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            parcel2.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            object2 = ((s)object).a;
            bl2 = true;
            object2.transact(1, parcel2, parcel, 0);
            parcel.readException();
            object2 = parcel.readString();
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                parcel2.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                ((s)object).a.transact(2, parcel2, parcel, 0);
                parcel.readException();
                int n10 = parcel.readInt();
                if (n10 != 0) break block6;
                bl2 = false;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
        }
        parcel.recycle();
        parcel2.recycle();
        return new c(IdentifierStatus.OK, new a("yandex", (String)object2, bl2), null, 4);
        finally {
            parcel.recycle();
            parcel2.recycle();
        }
    }
}

