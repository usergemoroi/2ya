/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.impl.Bj;
import io.appmetrica.analytics.impl.Sm;
import io.appmetrica.analytics.impl.Y6;
import io.appmetrica.analytics.impl.ho;
import io.appmetrica.analytics.impl.o8;
import io.appmetrica.analytics.impl.oj;
import io.appmetrica.analytics.impl.p8;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.qj;
import io.appmetrica.analytics.impl.r8;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public abstract class n8 {
    public final Context a;
    public final ProtobufStateStorage b;
    public final p8 c;
    public final ho d;
    public final Sm e;
    public final qj f;
    public final oj g;
    public final Y6 h;
    public o8 i;

    public n8(Context context, ProtobufStateStorage protobufStateStorage, p8 p84, ho ho3, Sm sm3, qj qj3, oj oj3, Y6 y64, o8 o84) {
        this.a = context;
        this.b = protobufStateStorage;
        this.c = p84;
        this.d = ho3;
        this.e = sm3;
        this.f = qj3;
        this.g = oj3;
        this.h = y64;
        this.i = o84;
    }

    @NotNull
    public final o8 a() {
        synchronized (this) {
            o8 o84 = this.i;
            return o84;
        }
    }

    @NotNull
    public final r8 a(@NotNull r8 r84) {
        this.h.a(this.a);
        synchronized (this) {
            this.b(r84);
            r84 = this.c();
            return r84;
        }
    }

    @NotNull
    public final r8 b() {
        this.h.a(this.a);
        return this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(@NotNull r8 object) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                boolean bl2;
                boolean bl3;
                Object object2;
                Object object3;
                block10: {
                    block9: {
                        block8: {
                            try {
                                object3 = object.a();
                                object2 = q8.b;
                                if (object3 != object2) break block8;
                            }
                            catch (Throwable throwable2) {}
                            return false;
                        }
                        bl3 = y.e(object, this.i.b());
                        if (!bl3) break block9;
                        return false;
                    }
                    object3 = (List)this.d.invoke(this.i.a(), object);
                    bl2 = object3 != null;
                    object2 = object3;
                    if (object3 != null) break block10;
                    object2 = this.i.a();
                    break block11;
                }
                if (this.c.a(object, this.i.b())) {
                    bl3 = true;
                } else {
                    object = (r8)this.i.b();
                    bl3 = false;
                }
                if (bl3 || bl2) {
                    object3 = this.i;
                    this.i = object = (o8)this.e.invoke(object, object2);
                    this.b.save(object);
                    Bj.a("Update distribution data: %s -> %s", object3, this.i);
                }
                return bl3;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final r8 c() {
        synchronized (this) {
            try {
                if (this.g.a()) return (r8)this.i.b();
                r8 r84 = (r8)this.f.invoke();
                this.g.b();
                if (r84 == null) return (r8)this.i.b();
                this.b(r84);
                return (r8)this.i.b();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

