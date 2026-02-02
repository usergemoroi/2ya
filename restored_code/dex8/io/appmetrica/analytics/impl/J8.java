/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.h8;
import io.appmetrica.analytics.impl.ro;
import java.util.Map;

public final class j8 {
    public final boolean a;
    public DeferredDeeplinkListener b;
    public DeferredDeeplinkParametersListener c;
    public h8 d;

    public j8(boolean bl2) {
        this.a = bl2;
    }

    public final void a() {
        Object object = this.d;
        if (object != null) {
            Object object2 = ((h8)object).b;
            if (object2 != null) {
                object = this.b;
                if (object != null) {
                    object.onDeeplinkLoaded((String)object2);
                    this.b = null;
                }
                if (!ro.a(this.d.a)) {
                    object = this.d.a;
                    object2 = this.c;
                    if (object2 != null) {
                        object2.onParametersLoaded((Map<String, String>)object);
                        this.c = null;
                    }
                } else {
                    object = this.d.c;
                    object2 = this.c;
                    if (object2 != null) {
                        object2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, WrapUtils.getOrDefault(object, ""));
                        this.c = null;
                    }
                }
            } else if (((h8)object).c != null) {
                this.a(2);
            } else {
                this.a(3);
            }
        }
    }

    public final void a(int n10) {
        Object object = this.d;
        String string2 = object == null ? null : object.c;
        Object object2 = this.b;
        if (object2 != null) {
            if (n10 != 0) {
                int n13 = n10 - 1;
                object = n13 != 0 ? (n13 != 1 ? (n13 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER) : DeferredDeeplinkListener.Error.PARSE_ERROR) : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
                object2.onError((DeferredDeeplinkListener.Error)((Object)object), WrapUtils.getOrDefault(string2, ""));
                this.b = null;
            } else {
                throw null;
            }
        }
        if ((object2 = this.c) != null) {
            if (n10 != 0) {
                object = --n10 != 0 ? (n10 != 1 ? (n10 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER) : DeferredDeeplinkParametersListener.Error.PARSE_ERROR) : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
                object2.onError((DeferredDeeplinkParametersListener.Error)((Object)object), WrapUtils.getOrDefault(string2, ""));
                this.c = null;
            } else {
                throw null;
            }
        }
    }
}

