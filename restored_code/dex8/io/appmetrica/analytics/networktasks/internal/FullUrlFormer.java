/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.impl.c;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.List;

public class FullUrlFormer<T> {
    private List a = new ArrayList();
    private int b = -1;
    private String c;
    private final IParamsAppender d;
    private final ConfigProvider e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.d = iParamsAppender;
        this.e = configProvider;
    }

    public void buildAndSetFullHostUrl() {
        Uri.Builder builder = Uri.parse((String)((String)this.a.get(this.b))).buildUpon();
        Object t13 = this.e.getConfig();
        this.d.appendParams(builder, t13);
        this.c = builder.build().toString();
    }

    @Nullable
    public List<String> getAllHosts() {
        return this.a;
    }

    @Nullable
    public String getUrl() {
        return new c((String)this.c).a;
    }

    public boolean hasMoreHosts() {
        int n10 = this.b;
        boolean bl2 = true;
        if (n10 + 1 >= this.a.size()) {
            bl2 = false;
        }
        return bl2;
    }

    public void incrementAttemptNumber() {
        ++this.b;
    }

    public void setHosts(@Nullable List<String> list) {
        List<String> list2 = list;
        if (list == null) {
            list2 = new ArrayList<String>();
        }
        this.a = list2;
    }
}

