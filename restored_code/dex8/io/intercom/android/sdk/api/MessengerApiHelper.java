/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  kotlin.collections.s0
 */
package io.intercom.android.sdk.api;

import com.google.gson.Gson;
import io.intercom.android.sdk.Injector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.y;
import okhttp3.c0;
import okhttp3.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0000\u00a2\u0006\u0004\b\t\u0010\u0007\u00a8\u0006\r"}, d2={"Lio/intercom/android/sdk/api/MessengerApiHelper;", "", "", "", "options", "Lokhttp3/c0;", "optionsMapToRequestBody", "(Ljava/util/Map;)Lokhttp3/c0;", "bodyParams", "getDefaultRequestBody$intercom_sdk_base_release", "getDefaultRequestBody", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class MessengerApiHelper {
    @NotNull
    public static final MessengerApiHelper INSTANCE = new MessengerApiHelper();

    private MessengerApiHelper() {
    }

    public static /* synthetic */ c0 getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper messengerApiHelper, Map map2, int n10, Object object) {
        if ((n10 & 1) != 0) {
            map2 = s0.j();
        }
        return messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(map2);
    }

    @NotNull
    public final c0 getDefaultRequestBody$intercom_sdk_base_release(@NotNull Map<String, ? extends Object> map2) {
        y.j(map2, "bodyParams");
        Injector injector2 = Injector.get();
        Map<String, Object> map3 = injector2.getUserIdentity().toMap();
        injector2.getApi().addSecureHash(map3);
        map3.putAll(map2);
        y.i(map3, "userIdentityMap");
        return this.optionsMapToRequestBody(map3);
    }

    @JvmName(name="optionsMapToRequestBody")
    @NotNull
    public final c0 optionsMapToRequestBody(@NotNull Map<String, ? extends Object> object) {
        y.j(object, "options");
        c0.a a14 = c0.Companion;
        object = new Gson().toJson(object);
        y.i(object, "Gson().toJson(options)");
        return a14.b((String)object, x.e.a("application/json; charset=utf-8"));
    }
}

