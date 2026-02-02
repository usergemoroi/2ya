/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.l
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Xd;
import io.appmetrica.analytics.impl.ae;
import io.appmetrica.analytics.impl.bq;
import io.appmetrica.analytics.impl.ce;
import io.appmetrica.analytics.impl.ge;
import io.appmetrica.analytics.impl.he;
import io.appmetrica.analytics.impl.me;
import io.appmetrica.analytics.impl.oh;
import io.appmetrica.analytics.impl.pg;
import io.appmetrica.analytics.impl.za;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class ee
implements NativeCrashHandler {
    public final l a;
    public final IHandlerExecutor b;
    public final he c;

    public ee(@NotNull Context context, @NotNull oh oh3, @NotNull l<? super String, k0> l10, @NotNull me me2, @NotNull Bb bb4, @NotNull String string2) {
        this.a = l10;
        this.b = Na.j().w().e();
        this.c = new he(context, oh3, me2, bb4);
    }

    public static final void a(ee ee3, NativeCrash nativeCrash, File file) {
        ee3.a.invoke((Object)nativeCrash.getUuid());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void newCrash(@NotNull NativeCrash object) {
        Object object2;
        D0 d03;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        block10: {
            try {
                object7 = ((NativeCrash)object).getSource();
                object6 = ((NativeCrash)object).getHandlerVersion();
                object5 = ((NativeCrash)object).getUuid();
                object4 = ((NativeCrash)object).getDumpFile();
                long l10 = ((NativeCrash)object).getCreationTime();
                object3 = F0.a(((NativeCrash)object).getMetadata());
                y.g(object3);
                d03 = new D0((NativeCrashSource)((Object)object7), (String)object6, (String)object5, (String)object4, l10, (E0)object3);
            }
            catch (Throwable throwable) {
                d03 = null;
            }
            if (d03 == null) {
                this.a.invoke((Object)((NativeCrash)object).getUuid());
                return;
            }
            object4 = LoggerStorage.getOrCreatePublicLogger(d03.f.a);
            object7 = new StringBuilder("Detected native crash with uuid = ");
            ((StringBuilder)object7).append(d03.c);
            ((BaseReleaseLogger)object4).info(((StringBuilder)object7).toString(), new Object[0]);
            object4 = this.b;
            object7 = this.c;
            object6 = new bq(this, (NativeCrash)object);
            object7.getClass();
            object5 = new ae(new ce(d03.a, d03.b), ((he)object7).f);
            object = new ge(d03, ((he)object7).d);
            object3 = new Xd(((he)object7).b, d03.f, (ge)object);
            object2 = ((he)object7).e;
            object = d03.d;
            object2.getClass();
            object2 = new File((String)object);
            Object object8 = ((he)object7).a;
            if (za.c == null) {
                object = v0.b(za.class);
                synchronized (object) {
                    Throwable throwable2;
                    block9: {
                        block8: {
                            try {
                                za za4;
                                if (za.c != null) break block8;
                                za.c = za4 = new za((Context)object8);
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        object8 = k0.a;
                        break block10;
                    }
                    throw throwable2;
                }
            }
        }
        if ((object = za.c) == null) {
            y.B("INSTANCE");
            object = null;
        }
        object4.execute(new pg((File)object2, (Function)object5, (Consumer)object6, (Consumer)object3, (za)object, ((he)object7).c.a(d03)));
    }
}

