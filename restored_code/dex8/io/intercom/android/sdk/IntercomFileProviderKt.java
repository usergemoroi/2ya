/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.intercom.android.sdk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"}, d2={"fileProviderAuthority", "", "Landroid/content/Context;", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
public final class IntercomFileProviderKt {
    @NotNull
    public static final String fileProviderAuthority(@NotNull Context context) {
        y.j(context, "<this>");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append(".IntercomFileProvider");
        return stringBuilder.toString();
    }
}

