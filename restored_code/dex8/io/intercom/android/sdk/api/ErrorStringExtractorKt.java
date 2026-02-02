/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.l
 *  com.intercom.twig.Twig
 *  kotlin.collections.t
 *  kotlin.jvm.functions.l
 */
package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.ErrorObject;
import io.intercom.android.sdk.api.ErrorStringExtractorKt;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"}, d2={"extractErrorString", "", "errorObject", "Lio/intercom/android/sdk/api/ErrorObject;", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
public final class ErrorStringExtractorKt {
    @NotNull
    public static final String extractErrorString(@NotNull ErrorObject object) {
        Object object2;
        block6: {
            String string2;
            block5: {
                y.j(object, "errorObject");
                Twig twig = LumberMill.getLogger();
                boolean bl2 = ((ErrorObject)object).hasErrorBody();
                string2 = "Something went wrong";
                object2 = string2;
                if (!bl2) break block6;
                object2 = string2;
                if (((ErrorObject)object).getErrorBody() == null) break block6;
                try {
                    object2 = (com.google.gson.l)Injector.get().getGson().fromJson(((ErrorObject)object).getErrorBody(), com.google.gson.l.class);
                    if (object2 != null) break block5;
                    return "Something went wrong";
                }
                catch (Exception exception) {
                    twig.e((Throwable)exception);
                    object2 = ((ErrorObject)object).getThrowable().getMessage();
                    if (object2 != null) break block6;
                    object2 = string2;
                }
            }
            if (object2.x("error")) {
                object = object2.u("error").k();
            } else {
                object = string2;
                if (object2.x("errors")) {
                    object = object2.v("errors");
                    y.i(object, "jsonObject.getAsJsonArray(\"errors\")");
                    object = t.B0((Iterable)object, (CharSequence)" - ", null, null, (int)0, null, (l)extractErrorString.1.INSTANCE, (int)30, null);
                }
            }
            y.i(object, "{\n        val jsonObject\u2026        }\n        }\n    }");
            object2 = object;
        }
        return object2;
    }
}

