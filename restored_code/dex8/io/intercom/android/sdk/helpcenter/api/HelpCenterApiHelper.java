/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 */
package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.Injector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\u0007"}, d2={"Lio/intercom/android/sdk/helpcenter/api/HelpCenterApiHelper;", "", "()V", "addDefaultOptions", "", "", "kotlin.jvm.PlatformType", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
@SourceDebugExtension(value={"SMAP\nHelpCenterApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterApi.kt\nio/intercom/android/sdk/helpcenter/api/HelpCenterApiHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1#2:53\n453#3:54\n403#3:55\n1238#4,4:56\n*S KotlinDebug\n*F\n+ 1 HelpCenterApi.kt\nio/intercom/android/sdk/helpcenter/api/HelpCenterApiHelper\n*L\n47#1:54\n47#1:55\n47#1:56,4\n*E\n"})
public final class HelpCenterApiHelper {
    @NotNull
    public static final HelpCenterApiHelper INSTANCE = new HelpCenterApiHelper();

    private HelpCenterApiHelper() {
    }

    @NotNull
    public final Map<String, String> addDefaultOptions() {
        Object object = Injector.get();
        Object object22 = ((Injector)object).getUserIdentity().toMap();
        ((Injector)object).getApi().addSecureHash((Map<String, Object>)object22);
        y.i(object22, "userIdentity.toMap().app\u2026api.addSecureHash(this) }");
        object = new LinkedHashMap(s0.f((int)object22.size()));
        for (Object object22 : (Iterable)object22.entrySet()) {
            object.put(object22.getKey(), object22.getValue().toString());
        }
        return object;
    }
}

