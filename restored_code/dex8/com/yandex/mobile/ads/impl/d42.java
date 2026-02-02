/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 *  androidx.annotation.GuardedBy
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bf0
 *  com.yandex.mobile.ads.impl.bf0$a
 *  com.yandex.mobile.ads.impl.bs2
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bf0;
import com.yandex.mobile.ads.impl.bs2;
import java.util.ArrayList;

final class d42
implements bf0 {
    @GuardedBy(value="messagePool")
    private static final ArrayList b = new ArrayList(50);
    private final Handler a;

    public d42(Handler handler) {
        this.a = handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static a d() {
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (!arrayList.isEmpty()) return (a)arrayList.remove(arrayList.size() - 1);
                return new a(null);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final bf0.a a(int n10, int n12) {
        a a12 = d42.d();
        a12.a = this.a.obtainMessage(1, n10, n12);
        return a12;
    }

    public final bf0.a a(int n10, @Nullable Object object) {
        a a12 = d42.d();
        a12.a = this.a.obtainMessage(n10, object);
        return a12;
    }

    public final void a() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final boolean a(int n10) {
        return this.a.sendEmptyMessage(n10);
    }

    public final boolean a(long l10) {
        return this.a.sendEmptyMessageAtTime(2, l10);
    }

    public final boolean a(bf0.a a12) {
        a12 = (a)a12;
        Handler handler = this.a;
        Message message = ((a)a12).a;
        message.getClass();
        boolean bl2 = handler.sendMessageAtFrontOfQueue(message);
        ((a)a12).b();
        return bl2;
    }

    public final boolean a(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final bf0.a b(int n10) {
        a a12 = d42.d();
        a12.a = this.a.obtainMessage(n10);
        return a12;
    }

    public final boolean b() {
        return this.a.hasMessages(0);
    }

    public final void c() {
        this.a.removeMessages(2);
    }

    private static final class a
    implements bf0.a {
        @Nullable
        private Message a;

        private a() {
        }

        /* synthetic */ a(bs2 bs22) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void b() {
            this.a = null;
            ArrayList arrayList = b;
            synchronized (arrayList) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            if (arrayList.size() >= 50) break block3;
                            arrayList.add(this);
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }

        public final void a() {
            Message message = this.a;
            message.getClass();
            message.sendToTarget();
            this.b();
        }
    }
}

