/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  android.util.Pair
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Da;
import io.appmetrica.analytics.impl.M2;
import io.appmetrica.analytics.impl.M9;
import io.appmetrica.analytics.impl.O9;
import io.appmetrica.analytics.impl.P9;
import io.appmetrica.analytics.impl.bg;
import io.appmetrica.analytics.impl.cg;
import io.appmetrica.analytics.impl.dj;
import io.appmetrica.analytics.impl.ej;
import io.appmetrica.analytics.impl.fj;
import io.appmetrica.analytics.impl.gj;
import io.appmetrica.analytics.impl.hj;
import io.appmetrica.analytics.impl.ij;
import io.appmetrica.analytics.impl.k2;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.n6;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class o6
implements CounterReportApi,
Parcelable {
    public static final Parcelable.Creator<o6> CREATOR = new n6();
    @Nullable
    protected String a;
    @Nullable
    protected String b;
    public String c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public String h;
    public long i;
    public long j;
    public Da k = Da.b;
    public M9 l;
    public Bundle m;
    public Boolean n;
    public Integer o;
    public Map p = new HashMap();

    public o6() {
        this("", 0);
    }

    public o6(@Nullable String string2, int n10) {
        this("", string2, n10);
    }

    public o6(@Nullable String string2, @Nullable String string3, int n10) {
        this(string2, string3, n10, new SystemTimeProvider());
    }

    @VisibleForTesting
    public o6(@Nullable String string2, @Nullable String string3, int n10, @NonNull SystemTimeProvider systemTimeProvider) {
        this.a = string3;
        this.d = n10;
        this.b = string2;
        this.i = systemTimeProvider.elapsedRealtime();
        this.j = systemTimeProvider.currentTimeMillis();
    }

    public static Pair a(Bundle object) {
        object = object.containsKey("CounterReport.AppEnvironmentDiffKey") && object.containsKey("CounterReport.AppEnvironmentDiffValue") ? new Pair((Object)object.getString("CounterReport.AppEnvironmentDiffKey"), (Object)object.getString("CounterReport.AppEnvironmentDiffValue")) : null;
        return object;
    }

    @NonNull
    public static o6 a() {
        o6 o63 = new o6("", 0);
        Bb bb4 = Bb.c;
        o63.d = 16384;
        return o63;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public static o6 a(@NonNull cg object) {
        void var0_3;
        Object object2 = "";
        int n10 = 0;
        o6 o63 = new o6("", "", 0);
        Bb bb4 = Bb.c;
        o63.d = 40976;
        ProductInfo productInfo = ((cg)object).a;
        ij ij3 = new ij();
        ij3.a = productInfo.quantity;
        ij3.f = productInfo.priceMicros;
        String string2 = productInfo.priceCurrency;
        try {
            String string3 = Currency.getInstance(string2).getCurrencyCode();
        }
        catch (Throwable throwable) {
            String string4 = object2;
        }
        ij3.b = var0_3.getBytes();
        ij3.c = productInfo.sku.getBytes();
        dj dj3 = new dj();
        dj3.a = productInfo.purchaseOriginalJson.getBytes();
        dj3.b = productInfo.signature.getBytes();
        ij3.e = dj3;
        ij3.g = true;
        ij3.h = 1;
        ProductType productType = productInfo.type;
        int n13 = bg.a[productType.ordinal()] != 2 ? 1 : 2;
        ij3.i = n13;
        hj hj3 = new hj();
        hj3.a = productInfo.purchaseToken.getBytes();
        hj3.b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        ij3.j = hj3;
        if (productInfo.type == ProductType.SUBS) {
            gj gj3 = new gj();
            gj3.a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                object2 = new fj();
                ((fj)object2).a = period.number;
                Period.TimeUnit timeUnit = period.timeUnit;
                n13 = bg.b[timeUnit.ordinal()];
                n13 = n13 != 1 ? (n13 != 2 ? (n13 != 3 ? (n13 != 4 ? 0 : 4) : 3) : 2) : 1;
                ((fj)object2).b = n13;
                gj3.b = object2;
            }
            object2 = new ej();
            ((ej)object2).a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                fj fj3 = new fj();
                fj3.a = period2.number;
                Period.TimeUnit timeUnit = period2.timeUnit;
                n13 = bg.b[timeUnit.ordinal()];
                n13 = n13 != 1 ? (n13 != 2 ? (n13 != 3 ? (n13 != 4 ? n10 : 4) : 3) : 2) : 1;
                fj3.b = n13;
                ((ej)object2).b = fj3;
            }
            ((ej)object2).c = productInfo.introductoryPriceCycles;
            gj3.c = object2;
            ij3.k = gj3;
        }
        o63.setValueBytes(MessageNano.toByteArray(ij3));
        return o63;
    }

    @NonNull
    public static o6 a(@NonNull o6 o63) {
        return o6.a(o63, Bb.g);
    }

    public static o6 a(o6 o63, Bb bb4) {
        o63 = o6.d(o63);
        o63.d = bb4.a;
        return o63;
    }

    @NonNull
    public static o6 a(@NonNull o6 o63, @NonNull ma object) {
        o6 o64 = o6.a(o63, Bb.B);
        object = new O9((String)((ma)object).b.a());
        o64.setValueBytes(MessageNano.toByteArray(new P9().a((O9)object)));
        o64.j = o63.j;
        o64.i = o63.i;
        return o64;
    }

    @NonNull
    public static o6 a(@NonNull o6 o63, @Nullable String string2) {
        o63 = o6.d(o63);
        Bb bb4 = Bb.c;
        o63.d = 12289;
        o63.setValue(string2);
        return o63;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public static o6 a(@NonNull o6 var0, @NonNull Collection<PermissionState> var1_2, @Nullable M2 var2_3, @NonNull k2 var3_4, @NonNull List<String> var4_5) {
        var5_6 = o6.d((o6)var0);
        try {
            block12: {
                var6_7 = new JSONArray();
                for (Object var0 : var1_2 /* !! */ ) {
                    var1_2 /* !! */  = new JSONObject();
                    var6_7.put((Object)var1_2 /* !! */ .put("name", (Object)var0.name).put("granted", var0.granted));
                }
                var1_2 /* !! */  = new JSONObject();
                if (var2_3 == null) break block12;
                var1_2 /* !! */ .put("background_restricted", (Object)var2_3.b);
                var0 = var2_3.a;
                var3_4.getClass();
                if (var0 == null) ** GOTO lbl-1000
                switch (var0.ordinal()) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        var0 = null;
                        break;
                    }
                    case 6: {
                        var0 = "UNKNOWN";
                        break;
                    }
                    case 5: {
                        var0 = "RESTRICTED";
                        break;
                    }
                    case 4: {
                        var0 = "RARE";
                        break;
                    }
                    case 3: {
                        var0 = "FREQUENT";
                        break;
                    }
                    case 2: {
                        var0 = "WORKING_SET";
                        break;
                    }
                    case 1: {
                        var0 = "ACTIVE";
                        break;
                    }
                    case 0: {
                        var0 = "EXEMPTED";
                    }
                }
                var1_2 /* !! */ .put("app_standby_bucket", var0);
            }
            var0 = new JSONObject();
            var1_2 /* !! */  = var0.put("permissions", (Object)var6_7).put("background_restrictions", (Object)var1_2 /* !! */ );
            var0 = new JSONArray(var4_5);
            var0 = var1_2 /* !! */ .put("available_providers", var0).toString();
        }
        catch (Throwable var0_1) {
            var0 = "";
        }
        var1_2 /* !! */  = Bb.c;
        var5_6.d = 12288;
        var5_6.setValue((String)var0);
        return var5_6;
    }

    @NonNull
    public static o6 a(@NonNull String string2) {
        o6 o63 = new o6("", 0);
        Bb bb4 = Bb.c;
        o63.d = 12320;
        o63.b = string2;
        o63.l = M9.c;
        return o63;
    }

    @NonNull
    public static o6 b(@Nullable Bundle object) {
        if (object != null) {
            try {
                object = (o6)object.getParcelable("CounterReport.Object");
                if (object != null) {
                    return object;
                }
            }
            catch (Throwable throwable) {
                return new o6("", 0);
            }
        }
        return new o6("", 0);
    }

    @NonNull
    public static o6 b(@NonNull o6 o63) {
        return o6.a(o63, Bb.A);
    }

    @NonNull
    public static o6 c(@NonNull o6 o63) {
        return o6.a(o63, Bb.d);
    }

    @NonNull
    public static o6 d(@NonNull o6 o63) {
        o6 o64 = new o6("", 0);
        o64.j = o63.j;
        o64.i = o63.i;
        o64.f = o63.f;
        o64.c = o63.c;
        o64.m = o63.m;
        o64.p = o63.p;
        o64.h = o63.h;
        return o64;
    }

    @NonNull
    public static o6 e(@NonNull o6 o63) {
        return o6.a(o63, Bb.F);
    }

    public final void a(long l10) {
        this.i = l10;
    }

    public final void a(@NonNull Da da3) {
        this.k = da3;
    }

    public final void a(@Nullable M9 m94) {
        this.l = m94;
    }

    public final void a(@Nullable Boolean bl2) {
        this.n = bl2;
    }

    public final void a(@Nullable Integer n10) {
        this.o = n10;
    }

    public final void a(String string2, String string3) {
        if (this.f == null) {
            this.f = new Pair((Object)string2, (Object)string3);
        }
    }

    @Nullable
    public final Pair<String, String> b() {
        return this.f;
    }

    public final void b(long l10) {
        this.j = l10;
    }

    public final void b(@Nullable String string2) {
        this.c = string2;
    }

    @Nullable
    public final Boolean c() {
        return this.n;
    }

    public final void c(@Nullable Bundle bundle) {
        this.m = bundle;
    }

    public void c(@Nullable String string2) {
        this.h = string2;
    }

    public final long d() {
        return this.i;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", (Parcelable)this);
        return bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.j;
    }

    @Nullable
    public final String f() {
        return this.c;
    }

    @NonNull
    public final Da g() {
        return this.k;
    }

    @Override
    public final int getBytesTruncated() {
        return this.g;
    }

    @Override
    public final int getCustomType() {
        return this.e;
    }

    @Override
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.p;
    }

    @Override
    @Nullable
    public final String getName() {
        return this.a;
    }

    @Override
    public final int getType() {
        return this.d;
    }

    @Override
    @Nullable
    public final String getValue() {
        return this.b;
    }

    @Override
    @Nullable
    public final byte[] getValueBytes() {
        Object object = this.b;
        object = object == null ? null : (Object)Base64.decode((String)object, (int)0);
        return object;
    }

    @Nullable
    public final Integer h() {
        return this.o;
    }

    @Nullable
    public final Bundle i() {
        return this.m;
    }

    @Nullable
    public final String j() {
        return this.h;
    }

    @Nullable
    public final M9 k() {
        return this.l;
    }

    public final boolean l() {
        boolean bl2 = this.a == null;
        return bl2;
    }

    public final boolean m() {
        Bb bb4 = Bb.c;
        boolean bl2 = -1 == this.d;
        return bl2;
    }

    @Override
    public final void setBytesTruncated(int n10) {
        this.g = n10;
    }

    @Override
    public final void setCustomType(int n10) {
        this.e = n10;
    }

    @Override
    public final void setExtras(@NonNull Map<String, byte[]> map2) {
        this.p = map2;
    }

    @Override
    public void setName(@Nullable String string2) {
        this.a = string2;
    }

    @Override
    public final void setType(int n10) {
        this.d = n10;
    }

    @Override
    public void setValue(@Nullable String string2) {
        this.b = string2;
    }

    @Override
    public void setValueBytes(@Nullable byte[] object) {
        object = object == null ? null : (Object)new String(Base64.encode((byte[])object, (int)0));
        this.b = object;
    }

    @NonNull
    public final String toString() {
        String string2;
        Locale locale = Locale.US;
        String string3 = this.a;
        String string4 = Bb.a((int)this.d).b;
        String string5 = this.b;
        if (string5 == null) {
            string2 = null;
        } else {
            string2 = string5;
            if (string5.length() > 500) {
                string2 = string5.substring(0, 500);
            }
        }
        return String.format(locale, "[event: %s, type: %s, value: %s]", string3, string4, string2);
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.a);
        bundle.putString("CounterReport.Value", this.b);
        bundle.putInt("CounterReport.Type", this.d);
        bundle.putInt("CounterReport.CustomType", this.e);
        bundle.putInt("CounterReport.TRUNCATED", this.g);
        bundle.putString("CounterReport.ProfileID", this.h);
        bundle.putInt("CounterReport.UniquenessStatus", this.k.a);
        Object object = this.m;
        if (object != null) {
            bundle.putParcelable("CounterReport.Payload", (Parcelable)object);
        }
        if ((object = this.c) != null) {
            bundle.putString("CounterReport.Environment", (String)object);
        }
        if ((object = this.f) != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String)((Pair)object).first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String)((Pair)object).second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.i);
        bundle.putLong("CounterReport.CreationTimestamp", this.j);
        object = this.l;
        if (object != null) {
            bundle.putInt("CounterReport.Source", ((M9)((Object)object)).a);
        }
        if ((object = this.n) != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", ((Boolean)object).booleanValue());
        }
        if ((object = this.o) != null) {
            bundle.putInt("CounterReport.OpenId", ((Integer)object).intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.p));
        parcel.writeBundle(bundle);
    }
}

