/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jakewharton.retrofit2.converter.kotlinx.serialization.c
 *  kotlinx.serialization.a0
 */
package io.intercom.android.sdk.api;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.c;
import io.intercom.android.sdk.api.KotlinXConvertorFactory;
import kotlin.Metadata;
import kotlinx.serialization.a0;
import kotlinx.serialization.json.t;
import okhttp3.x;
import org.jetbrains.annotations.NotNull;
import retrofit2.h;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0007"}, d2={"Lio/intercom/android/sdk/api/KotlinXConvertorFactory;", "", "Lretrofit2/h$a;", "getConvertorFactory", "()Lretrofit2/h$a;", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class KotlinXConvertorFactory {
    @NotNull
    public static final KotlinXConvertorFactory INSTANCE = new KotlinXConvertorFactory();

    private KotlinXConvertorFactory() {
    }

    @NotNull
    public final h.a getConvertorFactory() {
        x x10 = x.e.a("application/json");
        return c.a((a0)t.b(null, getConvertorFactory.1.INSTANCE, 1, null), (x)x10);
    }
}

