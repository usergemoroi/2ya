/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.WorkerThread
 *  com.monetization.ads.mediation.base.model.MediatedAdObjectInfo
 *  com.monetization.ads.quality.base.AdQualityVerificationStateFlow
 *  com.monetization.ads.quality.base.AdQualityVerifierAdapter
 *  com.monetization.ads.quality.base.model.AdQualityVerificationError
 *  com.monetization.ads.quality.base.model.AdQualityVerificationError$InternalError
 *  com.monetization.ads.quality.base.model.AdQualityVerificationError$TimeoutError
 *  com.monetization.ads.quality.base.model.AdQualityVerificationError$UnknownError
 *  com.monetization.ads.quality.base.model.AdQualityVerificationMode
 *  com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork
 *  com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration
 *  com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType
 *  com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration
 *  com.monetization.ads.quality.base.result.AdQualityVerificationResult
 *  com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified
 *  com.monetization.ads.quality.base.result.AdQualityVerificationResult$Verified
 *  com.yandex.mobile.ads.impl.b7
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.i6
 *  com.yandex.mobile.ads.impl.i6$a
 *  com.yandex.mobile.ads.impl.q6
 *  com.yandex.mobile.ads.impl.r6
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.z6
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.d
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.yandex.mobile.ads.impl.b7;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.i6;
import com.yandex.mobile.ads.impl.p6;
import com.yandex.mobile.ads.impl.q6;
import com.yandex.mobile.ads.impl.r6;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.z6;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.g3;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class h6
implements b7 {
    @NotNull
    private final AdQualityVerifierAdapter a;
    @NotNull
    private final AdQualityVerifierAdapterConfiguration b;
    private final long c;
    @NotNull
    private final z6 d;
    @NotNull
    private final q6 e;
    @NotNull
    private final r6 f;

    public /* synthetic */ h6(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long l10, z6 z63, q6 q62) {
        this(adQualityVerifierAdapter, adQualityVerifierAdapterConfiguration, l10, z63, q62, new r6());
    }

    public h6(@NotNull AdQualityVerifierAdapter adQualityVerifierAdapter, @NotNull AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long l10, @NotNull z6 z63, @NotNull q6 q62, @NotNull r6 r64) {
        this.a = adQualityVerifierAdapter;
        this.b = adQualityVerifierAdapterConfiguration;
        this.c = l10;
        this.d = z63;
        this.e = q62;
        this.f = r64;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object a(Context var1_1, AdQualityVerificationAdConfiguration var2_3, d<? super AdQualityVerificationResult> var3_4) {
        block8: {
            block7: {
                block9: {
                    if (!(var3_4 /* !! */  instanceof a)) ** GOTO lbl-1000
                    var5_5 /* !! */  = var3_4 /* !! */ ;
                    var4_6 = var5_5 /* !! */ .d;
                    if ((var4_6 & -2147483648) != 0) {
                        var5_5 /* !! */ .d = var4_6 + -2147483648;
                        var3_4 /* !! */  = var5_5 /* !! */ ;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_4 /* !! */  = new kotlin.coroutines.jvm.internal.d(this, var3_4 /* !! */ ){
                            Object b;
                            final h6 c;
                            int d;
                            {
                                this.c = h63;
                                super(d10);
                            }

                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                this.b = object;
                                this.d |= Integer.MIN_VALUE;
                                return this.c.a(null, null, (d)((Object)this));
                            }
                        };
                    }
                    var5_5 /* !! */  = var3_4 /* !! */ .b;
                    var7_7 = kotlin.coroutines.intrinsics.b.f();
                    var4_6 = var3_4 /* !! */ .d;
                    if (var4_6 == 0) break block9;
                    if (var4_6 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    try {
                        v.b((Object)var5_5 /* !! */ );
                        var1_1 /* !! */  = var5_5 /* !! */ ;
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_2) {
                        break block7;
                    }
                }
                v.b((Object)var5_5 /* !! */ );
                {
                    var5_5 /* !! */  = u.d;
                    var6_8 = this.d.a((AdQualityVerificationAdConfiguration)var2_3);
                    var5_5 /* !! */  = var6_8;
                    if (var6_8 != null) ** GOTO lbl32
                    var3_4 /* !! */ .d = 1;
                    var2_3 = this.b(var1_1 /* !! */ , (AdQualityVerificationAdConfiguration)var2_3, var3_4 /* !! */ );
                    var1_1 /* !! */  = var2_3;
                    if (var2_3 != var7_7) ** GOTO lbl-1000
                    return var7_7;
                }
lbl-1000:
                // 2 sources

                {
                    var5_5 /* !! */  = (AdQualityVerificationResult)var1_1 /* !! */ ;
lbl32:
                    // 2 sources

                    var1_1 /* !! */  = u.b((Object)var5_5 /* !! */ );
                    break block8;
                }
            }
            var2_3 = u.d;
            var1_1 /* !! */  = u.b(v.a(var1_2));
        }
        var2_3 = u.e(var1_1 /* !! */ );
        if (var2_3 == null) {
            return var1_1 /* !! */ ;
        }
        var2_3 = var2_3.getMessage();
        var1_1 /* !! */  = var2_3;
        if (var2_3 != null) return new AdQualityVerificationResult.NotVerified((AdQualityVerificationError)new AdQualityVerificationError.UnknownError((String)var1_1 /* !! */ ));
        var1_1 /* !! */  = "Unknown error with empty description";
        return new AdQualityVerificationResult.NotVerified((AdQualityVerificationError)new AdQualityVerificationError.UnknownError((String)var1_1 /* !! */ ));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final Object b(Context var1_1, AdQualityVerificationAdConfiguration var2_2, d<? super AdQualityVerificationResult> var3_3) {
        if (!(var3_3 instanceof b)) ** GOTO lbl-1000
        var7_4 /* !! */  = var3_3;
        var4_5 = var7_4 /* !! */ .e;
        if ((var4_5 & -2147483648) != 0) {
            var7_4 /* !! */ .e = var4_5 + -2147483648;
            var3_3 = var7_4 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new kotlin.coroutines.jvm.internal.d(this, (d<? super b>)var3_3){
                h6 b;
                Object c;
                final h6 d;
                int e;
                {
                    this.d = h63;
                    super(d10);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.c = object;
                    this.e |= Integer.MIN_VALUE;
                    return this.d.b(null, null, (d)((Object)this));
                }
            };
        }
        var7_4 /* !! */  = var3_3.c;
        var8_6 = kotlin.coroutines.intrinsics.b.f();
        var4_5 = var3_3.e;
        if (var4_5 == 0) ** GOTO lbl19
        if (var4_5 == 1) {
            var1_1 = var3_3.b;
            v.b((Object)var7_4 /* !! */ );
            var2_2 /* !! */  = var7_4 /* !! */ ;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl19:
            // 1 sources

            v.b((Object)var7_4 /* !! */ );
            var5_7 = TimeUnit.SECONDS.toMillis(this.c);
            var1_1 = new p<q0, d<? super AdQualityVerificationResult>, Object>(this, (Context)var1_1, var2_2 /* !! */ , null){
                q6 b;
                int c;
                final h6 d;
                final Context e;
                final AdQualityVerificationAdConfiguration f;
                {
                    this.d = h63;
                    this.e = context;
                    this.f = adQualityVerificationAdConfiguration;
                    super(2, d10);
                }

                @NotNull
                public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                public final Object invoke(Object object, Object object2) {
                    return ((Object)this.create((q0)object, (d)object2)).invokeSuspend(k0.a);
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    Object object2;
                    Object object3 = kotlin.coroutines.intrinsics.b.f();
                    int n10 = this.c;
                    if (n10 != 0) {
                        if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        object3 = this.b;
                        v.b(object);
                        object2 = object;
                        return object3.a((AdQualityVerificationResult)object2);
                    } else {
                        v.b(object);
                        object = this.d.e;
                        AdQualityVerifierAdapter adQualityVerifierAdapter = this.d.a;
                        object2 = this.e;
                        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = this.d.b;
                        AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = this.f;
                        this.b = object;
                        this.c = 1;
                        object2 = adQualityVerifierAdapter.verifyAd((Context)object2, adQualityVerifierAdapterConfiguration, adQualityVerificationAdConfiguration, (d)((Object)this));
                        if (object2 == object3) {
                            return object3;
                        }
                        object3 = object;
                    }
                    return object3.a((AdQualityVerificationResult)object2);
                }
            };
            var3_3.b = this;
            var3_3.e = 1;
            var2_2 /* !! */  = g3.e(var5_7, var1_1, var3_3);
            if (var2_2 /* !! */  == var8_6) {
                return var8_6;
            }
            var1_1 = this;
        }
        var3_3 = (AdQualityVerificationResult)var2_2 /* !! */ ;
        var2_2 /* !! */  = var3_3;
        if (var3_3 == null) {
            var1_1.getClass();
            var2_2 /* !! */  = new AdQualityVerificationResult.Verified((AdQualityVerificationStateFlow)new p6(AdQualityVerificationMode.LONG_VERIFICATION, (AdQualityVerificationError)new AdQualityVerificationError.TimeoutError(var1_1.c)));
        }
        return var2_2 /* !! */ ;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    @Nullable
    public final Object a(@NotNull Context context, @NotNull Object object, @Nullable b8<?> object2, @NotNull x2 object3, @Nullable MediatedAdObjectInfo object4, @NotNull d<? super AdQualityVerificationResult> d10) {
        block14: {
            Throwable throwable2;
            Object var11_10;
            block12: {
                String string22;
                String string3;
                u.a a13;
                String string4;
                block13: {
                    block11: {
                        block8: {
                            block9: {
                                block10: {
                                    this.f.getClass();
                                    string4 = null;
                                    var11_10 = null;
                                    try {
                                        a13 = u.d;
                                        int n10 = object3.b().ordinal();
                                        if (n10 == 0) break block8;
                                        if (n10 == 1) break block9;
                                        if (n10 == 2) break block10;
                                        a13 = n10 != 3 ? null : AdQualityVerifierAdType.NATIVE;
                                        break block11;
                                    }
                                    catch (Throwable throwable2) {
                                        break block12;
                                    }
                                }
                                a13 = AdQualityVerifierAdType.REWARDED;
                                break block11;
                            }
                            a13 = AdQualityVerifierAdType.INTERSTITIAL;
                            break block11;
                        }
                        a13 = AdQualityVerifierAdType.BANNER;
                    }
                    string3 = object3.c();
                    string22 = object3.i();
                    object3 = string22;
                    if (string22 == null) {
                        object3 = "yandex";
                    }
                    i6.c.getClass();
                    for (String string22 : i6.a()) {
                        if (!y.e(((i6)string22).b(), object3)) continue;
                        object3 = string22;
                        break block13;
                    }
                    object3 = null;
                }
                AdQualityVerifiableNetwork adQualityVerifiableNetwork = i6.a.a((i6)((i6)object3));
                object3 = string4;
                if (a13 == null) break block14;
                object3 = string4;
                if (string3 != null) {
                    object3 = string4;
                    if (adQualityVerifiableNetwork != null) {
                        object3 = object4 != null ? object4.getAdContent() : null;
                        string4 = object4 != null ? object4.getAdUnitId() : null;
                        object2 = object2 != null ? object2.d() : null;
                        string22 = object4 != null ? object4.getAdId() : null;
                        object4 = object4 != null ? object4.getExtraData() : null;
                        AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = new AdQualityVerificationAdConfiguration(adQualityVerifiableNetwork, string3, object, (AdQualityVerifierAdType)a13, (String)object3, string4, object2, string22, (Map)object4);
                        object3 = adQualityVerificationAdConfiguration;
                    }
                }
                break block14;
            }
            object2 = u.d;
            Object object5 = u.b(v.a(throwable2));
            if (u.g(object5)) {
                object5 = var11_10;
            }
            object3 = (AdQualityVerificationAdConfiguration)object5;
        }
        if (object3 != null) {
            return this.a(context, (AdQualityVerificationAdConfiguration)object3, d10);
        }
        return new AdQualityVerificationResult.NotVerified((AdQualityVerificationError)new AdQualityVerificationError.InternalError("Failed to create ad configuration for verification"));
    }

    public final void onAdClicked() {
        try {
            u.a a13 = u.d;
            this.a.onAdClicked();
            u.b(k0.a);
        }
        catch (Throwable throwable) {
            u.a a14 = u.d;
            u.b(v.a(throwable));
        }
    }

    public final void onAdClosed() {
        try {
            u.a a13 = u.d;
            this.a.onAdClosed();
            u.b(k0.a);
        }
        catch (Throwable throwable) {
            u.a a14 = u.d;
            u.b(v.a(throwable));
        }
    }

    public final void onAdWillDisplay() {
        try {
            u.a a13 = u.d;
            this.a.onAdWillDisplay();
            u.b(k0.a);
        }
        catch (Throwable throwable) {
            u.a a14 = u.d;
            u.b(v.a(throwable));
        }
    }

    public final void onInvalidated() {
        try {
            u.a a13 = u.d;
            this.a.onInvalidated();
            u.b(k0.a);
        }
        catch (Throwable throwable) {
            u.a a14 = u.d;
            u.b(v.a(throwable));
        }
    }
}

