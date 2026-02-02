/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  kotlin.text.p
 */
package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"}, d2={"getDeviceIdentifier", "", "context", "Landroid/content/Context;", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
public final class DeviceIdentifierHolderKt {
    @NotNull
    public static final String getDeviceIdentifier(@NotNull Context object) {
        block3: {
            String string2;
            SharedPreferences sharedPreferences;
            block2: {
                y.j(object, "context");
                sharedPreferences = object.getSharedPreferences("INTERCOM_SDK_PREFS", 0);
                y.i(sharedPreferences, "context.getSharedPrefere\u2026ntext.MODE_PRIVATE,\n    )");
                string2 = sharedPreferences.getString("device_identifier", "");
                if (string2 == null) break block2;
                object = string2;
                if (!p.h0((CharSequence)string2)) break block3;
            }
            object = UUID.randomUUID().toString();
            y.i(object, "randomUUID().toString()");
            string2 = sharedPreferences.edit();
            string2.putString("device_identifier", (String)object);
            string2.apply();
        }
        return object;
    }
}

