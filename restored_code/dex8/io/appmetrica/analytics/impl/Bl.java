/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Fb;
import io.appmetrica.analytics.impl.Ha;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Nk;
import io.appmetrica.analytics.impl.O2;
import io.appmetrica.analytics.impl.Ok;
import io.appmetrica.analytics.impl.al;
import io.appmetrica.analytics.impl.dl;
import io.appmetrica.analytics.impl.el;
import io.appmetrica.analytics.impl.g;
import io.appmetrica.analytics.impl.i8;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.u5;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.concurrent.TimeUnit;

public final class bl {
    public final v5 a;
    public final al b;
    public final u5 c;
    public final g d;
    public final g e;
    public Nk f;
    public int g = 0;

    public bl(v5 v54, al al2, u5 u54, Ha ha3, O2 o23) {
        this.a = v54;
        this.c = u54;
        this.d = ha3;
        this.e = o23;
        this.b = al2;
    }

    public static dl a(Nk nk3, long l10) {
        dl dl2 = new dl();
        dl2.a = nk3.d;
        long l11 = nk3.f.getAndIncrement();
        el el3 = nk3.b;
        el3.a("SESSION_COUNTER_ID", nk3.f.get());
        el3.b();
        dl2.b = l11;
        el3 = nk3.b;
        nk3.j = l10 -= nk3.e;
        el3.a("SESSION_LAST_EVENT_OFFSET", l10);
        dl2.c = TimeUnit.MILLISECONDS.toSeconds(nk3.j);
        dl2.d = nk3.c.a;
        return dl2;
    }

    public final long a() {
        synchronized (this) {
            long l10;
            block5: {
                Nk nk3;
                block4: {
                    nk3 = this.f;
                    if (nk3 != null) break block4;
                    l10 = 10000000000L;
                    break block5;
                }
                l10 = nk3.d;
                --l10;
            }
            return l10;
        }
    }

    public final Nk a(o6 object) {
        this.a.m.info("Start foreground session", new Object[0]);
        long l10 = ((o6)object).i;
        Object object2 = this.d;
        Object object3 = new Ok(l10, ((o6)object).j);
        object2.getClass();
        object3 = ((g)object2).a((Ok)object3);
        this.g = 3;
        ((I5)this.a.p).e();
        object2 = this.c;
        o6 o63 = o6.a((o6)object, Na.F.h());
        object = bl.a((Nk)object3, l10);
        ((u5)object2).a.n.a(o63, (dl)object);
        return object3;
    }

    /*
     * Exception decompiling
     */
    public final boolean a(Nk var1_1, o6 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3 : 120->122)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Nk b(o6 object) {
        synchronized (this) {
            Throwable throwable2;
            block13: {
                int n10;
                Object object2;
                block11: {
                    block12: {
                        try {
                            if (this.g != 0) break block11;
                            object2 = this.d.b();
                            if (!this.a((Nk)object2, (o6)object)) break block12;
                            this.f = object2;
                            this.g = 3;
                            break block11;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                    }
                    object2 = this.e.b();
                    if (this.a((Nk)object2, (o6)object)) {
                        this.f = object2;
                        this.g = 2;
                    } else {
                        this.f = null;
                        this.g = 1;
                    }
                }
                if (this.g != 1 && !this.a(this.f, (o6)object)) {
                    this.g = 1;
                    this.f = null;
                }
                if ((n10 = i8.a(this.g)) == 1) {
                    long l10;
                    object2 = this.f;
                    ((Nk)object2).i = l10 = ((o6)object).i;
                    object = ((Nk)object2).b;
                    ((el)object).a("SESSION_SLEEP_START", l10);
                    ((el)object).b();
                    return this.f;
                }
                if (n10 == 2) {
                    return this.f;
                }
                this.a.m.info("Start background session", new Object[0]);
                this.g = 2;
                long l11 = ((o6)object).i;
                object2 = this.e;
                Object object3 = new Ok(l11, ((o6)object).j);
                object2.getClass();
                object2 = ((g)object2).a((Ok)object3);
                if (this.a.t.c()) {
                    object3 = this.c;
                    o6 o63 = o6.a((o6)object, Na.F.h());
                    object = bl.a((Nk)object2, ((o6)object).i);
                    ((u5)object3).a.n.a(o63, (dl)object);
                } else {
                    n10 = ((o6)object).d;
                    object3 = Bb.c;
                    if (n10 == 6145) {
                        object3 = this.c;
                        dl dl2 = bl.a((Nk)object2, l11);
                        ((u5)object3).a.n.a((o6)object, dl2);
                        object3 = this.c;
                        object = o6.a((o6)object, Na.F.h());
                        dl2 = bl.a((Nk)object2, l11);
                        ((u5)object3).a.n.a((o6)object, dl2);
                    }
                }
                this.f = object2;
                return object2;
            }
            throw throwable2;
        }
    }

    public final void b(Nk nk3, o6 object) {
        Object object2;
        if (nk3.g && nk3.d > 0L) {
            object2 = this.c;
            o6 o63 = o6.a((o6)object, Bb.g);
            object = new dl();
            ((dl)object).a = nk3.d;
            ((dl)object).d = nk3.c.a;
            long l10 = nk3.f.getAndIncrement();
            el el3 = nk3.b;
            el3.a("SESSION_COUNTER_ID", nk3.f.get());
            el3.b();
            ((dl)object).b = l10;
            ((dl)object).c = TimeUnit.MILLISECONDS.toSeconds(Math.max(nk3.i - nk3.e, nk3.j));
            object2.a.n.a(o63, (dl)object);
            if (nk3.g) {
                nk3.g = false;
                object = nk3.b;
                ((el)object).a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.FALSE);
                ((el)object).b();
            }
        }
        object = this.a.m;
        int n10 = nk3.c.a.ordinal();
        if (n10 != 0) {
            if (n10 == 1) {
                ((BaseReleaseLogger)object).info("Finish background session", new Object[0]);
            }
        } else {
            ((BaseReleaseLogger)object).info("Finish foreground session", new Object[0]);
        }
        synchronized (nk3) {
            object = nk3.b;
            object.getClass();
            object2 = new Fb();
            ((el)object).c = object2;
            ((el)object).b();
            nk3.h = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(o6 object) {
        synchronized (this) {
            Throwable throwable2;
            block12: {
                block13: {
                    block14: {
                        int n10;
                        Nk nk3;
                        block10: {
                            block11: {
                                try {
                                    if (this.g != 0) break block10;
                                    nk3 = this.d.b();
                                    if (!this.a(nk3, (o6)object)) break block11;
                                    this.f = nk3;
                                    this.g = 3;
                                    break block10;
                                }
                                catch (Throwable throwable2) {
                                    break block12;
                                }
                            }
                            nk3 = this.e.b();
                            if (this.a(nk3, (o6)object)) {
                                this.f = nk3;
                                this.g = 2;
                            } else {
                                this.f = null;
                                this.g = 1;
                            }
                        }
                        if ((n10 = i8.a(this.g)) == 0) break block14;
                        if (n10 != 1) {
                            if (n10 == 2) {
                                if (this.a(this.f, (o6)object)) {
                                    long l10;
                                    nk3 = this.f;
                                    nk3.i = l10 = ((o6)object).i;
                                    object = nk3.b;
                                    ((el)object).a("SESSION_SLEEP_START", l10);
                                    ((el)object).b();
                                    break block13;
                                } else {
                                    this.f = this.a((o6)object);
                                }
                            }
                            break block13;
                        } else {
                            this.b(this.f, (o6)object);
                            this.f = this.a((o6)object);
                        }
                        break block13;
                    }
                    this.f = this.a((o6)object);
                }
                return;
            }
            throw throwable2;
        }
    }
}

