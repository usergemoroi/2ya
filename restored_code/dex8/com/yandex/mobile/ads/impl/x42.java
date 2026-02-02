/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.fs2
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.t32
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.w42
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.ck;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.fs2;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.ky;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.r32;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.t32;
import com.yandex.mobile.ads.impl.u32;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.v32;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.w42;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.yu;
import com.yandex.mobile.ads.impl.zs0;
import java.util.Collections;
import java.util.List;

public final class x42
extends ck
implements Handler.Callback {
    private int A;
    private long B;
    @Nullable
    private final Handler n;
    private final w42 o;
    private final t32 p;
    private final dc0 q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    @Nullable
    private cc0 v;
    @Nullable
    private r32 w;
    @Nullable
    private u32 x;
    @Nullable
    private v32 y;
    @Nullable
    private v32 z;

    public x42(w42 object, @Nullable Looper looper) {
        t32 t322 = t32.a;
        super(3);
        this.o = (w42)uf.a((Object)object);
        object = looper == null ? null : m92.a((Looper)looper, (Handler.Callback)this);
        this.n = object;
        this.p = t322;
        this.q = new dc0();
        this.B = -9223372036854775807L;
    }

    private void A() {
        this.x = null;
        this.A = -1;
        v32 v322 = this.y;
        if (v322 != null) {
            v322.h();
            this.y = null;
        }
        if ((v322 = this.z) != null) {
            v322.h();
            this.z = null;
        }
    }

    private void B() {
        this.A();
        r32 r322 = this.w;
        r322.getClass();
        r322.release();
        this.w = null;
        this.u = 0;
    }

    private long y() {
        int n10 = this.A;
        long l10 = Long.MAX_VALUE;
        if (n10 == -1) {
            return Long.MAX_VALUE;
        }
        ((Object)((Object)this.y)).getClass();
        if (this.A < this.y.a()) {
            l10 = this.y.a(this.A);
        }
        return l10;
    }

    private void z() {
        this.t = true;
        t32 t322 = this.p;
        cc0 cc02 = this.v;
        cc02.getClass();
        this.w = (t322).a(cc02);
    }

    public final int a(cc0 cc02) {
        if ((this.p).b(cc02)) {
            int n10 = cc02.F == 0 ? 4 : 2;
            return fs2.b((int)n10, (int)0, (int)0);
        }
        if (w01.e((String)cc02.m)) {
            return fs2.b((int)1, (int)0, (int)0);
        }
        return fs2.b((int)0, (int)0, (int)0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(long l10, long l11) {
        Object object;
        int n10;
        Object object2;
        block37: {
            block36: {
                block34: {
                    block35: {
                        if (this.k() && (l11 = this.B) != -9223372036854775807L && l10 >= l11) {
                            this.A();
                            this.s = true;
                        }
                        if (this.s) {
                            return;
                        }
                        if (this.z == null) {
                            object2 = this.w;
                            object2.getClass();
                            object2.a(l10);
                            try {
                                object2 = this.w;
                                object2.getClass();
                                this.z = (v32)((Object)object2.a());
                            }
                            catch (s32 s322) {
                                Object object3 = new StringBuilder("Subtitle decoding failed. streamFormat=");
                                ((StringBuilder)object3).append(this.v);
                                zs0.a((String)"TextRenderer", (String)((StringBuilder)object3).toString(), (Throwable)((Object)s322));
                                object3 = Collections.emptyList();
                                Handler handler = this.n;
                                if (handler != null) {
                                    handler.obtainMessage(0, object3).sendToTarget();
                                } else {
                                    this.o.onCues((List)object3);
                                    this.o.a(new yu((List<wu>)object3));
                                }
                                this.B();
                                this.z();
                                return;
                            }
                        }
                        if (this.getState() != 2) {
                            return;
                        }
                        if (this.y != null) {
                            l11 = this.y();
                            n10 = 0;
                            while (l11 <= l10) {
                                ++this.A;
                                l11 = this.y();
                                n10 = 1;
                            }
                        } else {
                            n10 = 0;
                        }
                        if ((object2 = this.z) == null) break block34;
                        if (!object2.f()) break block35;
                        if (n10 == 0 && this.y() == Long.MAX_VALUE) {
                            if (this.u == 2) {
                                this.B();
                                this.z();
                                break block34;
                            } else {
                                this.A();
                                this.s = true;
                            }
                        }
                        break block34;
                    }
                    if (((ky)((Object)object2)).c > l10) break block34;
                    object = this.y;
                    if (object != null) {
                        object.h();
                    }
                    this.A = ((v32)((Object)object2)).a(l10);
                    this.y = object2;
                    this.z = null;
                    break block36;
                }
                if (n10 == 0) break block37;
            }
            ((Object)((Object)this.y)).getClass();
            object = this.y.b(l10);
            object2 = this.n;
            if (object2 != null) {
                object2.obtainMessage(0, object).sendToTarget();
            } else {
                this.o.onCues((List)object);
                this.o.a(new yu((List<wu>)object));
            }
        }
        if (this.u == 2) {
            return;
        }
        try {
            while (!this.r) {
                object2 = object = this.x;
                if (object == null) {
                    object2 = this.w;
                    object2.getClass();
                    object2 = (u32)((Object)object2.b());
                    if (object2 == null) {
                        return;
                    }
                    this.x = object2;
                }
                if (this.u == 1) {
                    object2.d(4);
                    object = this.w;
                    ((Object)object).getClass();
                    object.a((u32)((Object)object2));
                    this.x = null;
                    this.u = 2;
                    return;
                }
                n10 = this.a(this.q, (jy)((Object)object2), 0);
                if (n10 == -4) {
                    if (object2.f()) {
                        this.r = true;
                        this.t = false;
                    } else {
                        object = this.q.b;
                        if (object == null) {
                            return;
                        }
                        ((u32)((Object)object2)).j = ((cc0)object).q;
                        ((jy)((Object)object2)).h();
                        this.t &= object2.g() ^ true;
                    }
                    if (this.t) continue;
                    object = this.w;
                    ((Object)object).getClass();
                    object.a((u32)((Object)object2));
                    this.x = null;
                    continue;
                }
                if (n10 != -3) continue;
                return;
            }
            return;
        }
        catch (s32 s323) {}
        object2 = new StringBuilder("Subtitle decoding failed. streamFormat=");
        ((StringBuilder)object2).append(this.v);
        zs0.a((String)"TextRenderer", (String)((StringBuilder)object2).toString(), (Throwable)((Object)s323));
        List<wu> list = Collections.emptyList();
        object2 = this.n;
        if (object2 != null) {
            object2.obtainMessage(0, list).sendToTarget();
        } else {
            this.o.onCues(list);
            this.o.a(new yu(list));
        }
        this.B();
        this.z();
    }

    @Override
    protected final void a(long l10, boolean bl2) {
        List<wu> list = Collections.emptyList();
        Object object = this.n;
        if (object != null) {
            object.obtainMessage(0, list).sendToTarget();
        } else {
            this.o.onCues(list);
            this.o.a(new yu(list));
        }
        this.r = false;
        this.s = false;
        this.B = -9223372036854775807L;
        if (this.u != 0) {
            this.B();
            this.z();
        } else {
            this.A();
            object = this.w;
            object.getClass();
            object.flush();
        }
    }

    @Override
    protected final void a(cc0[] cc0Array, long l10, long l11) {
        this.v = cc0Array[0];
        if (this.w != null) {
            this.u = 1;
        } else {
            this.z();
        }
    }

    @Override
    public final boolean a() {
        return this.s;
    }

    public final void c(long l10) {
        if (this.k()) {
            this.B = l10;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final String getName() {
        return "TextRenderer";
    }

    public final boolean handleMessage(Message object) {
        if (object.what == 0) {
            object = (List)object.obj;
            this.o.onCues((List)object);
            this.o.a(new yu((List<wu>)object));
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    protected final void u() {
        this.v = null;
        this.B = -9223372036854775807L;
        List<wu> list = Collections.emptyList();
        Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.o.onCues(list);
            this.o.a(new yu(list));
        }
        this.B();
    }
}

