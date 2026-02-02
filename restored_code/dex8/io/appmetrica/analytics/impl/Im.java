/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.g4;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

public final class im
extends BaseRequestConfig.BaseRequestArguments {
    @Nullable
    public final String a;
    @Nullable
    public final String b;
    @Nullable
    public final Map<String, String> c;
    public final boolean d;
    @Nullable
    public final List<String> e;

    public im() {
        this(null, null, null, false, null);
    }

    public im(@NonNull g4 g44) {
        this(g44.a().c(), g44.a().d(), g44.a().a(), g44.a().h(), g44.a().b());
    }

    public im(@Nullable String string2, @Nullable String string3, @Nullable Map<String, String> map2, boolean bl2, @Nullable List<String> list) {
        this.a = string2;
        this.b = string3;
        this.c = map2;
        this.d = bl2;
        this.e = list;
    }

    public final boolean a(@NonNull im im3) {
        return false;
    }

    @NonNull
    public final im b(@NonNull im list) {
        String string2 = WrapUtils.getOrDefaultNullable(this.a, ((im)((Object)list)).a);
        String string3 = WrapUtils.getOrDefaultNullable(this.b, ((im)((Object)list)).b);
        Map<String, String> map2 = WrapUtils.getOrDefaultNullable(this.c, ((im)((Object)list)).c);
        boolean bl2 = this.d || ((im)((Object)list)).d;
        list = ((im)((Object)list)).d ? ((im)((Object)list)).e : this.e;
        return new im(string2, string3, map2, bl2, list);
    }

    @Override
    public final boolean compareWithOtherArguments(@NonNull Object object) {
        object = (im)object;
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Arguments{distributionReferrer='");
        stringBuilder.append(this.a);
        stringBuilder.append("', installReferrerSource='");
        stringBuilder.append(this.b);
        stringBuilder.append("', clientClids=");
        stringBuilder.append(this.c);
        stringBuilder.append(", hasNewCustomHosts=");
        stringBuilder.append(this.d);
        stringBuilder.append(", newCustomHosts=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

