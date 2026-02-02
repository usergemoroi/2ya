/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RequestDataHolder {
    private NetworkTask.Method a = NetworkTask.Method.GET;
    private final HashMap b = new HashMap();
    private byte[] c = null;
    private Long d;
    private Integer e;

    public void applySendTime(long l10) {
        this.d = l10;
        l10 = TimeUnit.MILLISECONDS.toSeconds(l10);
        this.e = ((GregorianCalendar)Calendar.getInstance()).getTimeZone().getOffset(l10 * 1000L) / 1000;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.a;
    }

    @Nullable
    public byte[] getPostData() {
        return this.c;
    }

    @Nullable
    public Long getSendTimestamp() {
        return this.d;
    }

    @Nullable
    public Integer getSendTimezoneSec() {
        return this.e;
    }

    public void setHeader(@NonNull String string2, String ... stringArray) {
        this.b.put(string2, Arrays.asList(stringArray));
    }

    public void setPostData(@Nullable byte[] byArray) {
        this.a = NetworkTask.Method.POST;
        this.c = byArray;
    }
}

