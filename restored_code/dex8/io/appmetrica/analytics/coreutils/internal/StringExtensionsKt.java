/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.text.a
 */
package io.appmetrica.analytics.coreutils.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"}, d2={"replaceFirstCharWithTitleCase", "", "locale", "Ljava/util/Locale;", "core-utils_release"}, k=2, mv={1, 6, 0}, xi=48)
public final class StringExtensionsKt {
    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String string2) {
        return StringExtensionsKt.replaceFirstCharWithTitleCase(string2, Locale.US);
    }

    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String string2, @NotNull Locale object) {
        CharSequence charSequence = string2;
        if (string2.length() > 0) {
            charSequence = new StringBuilder();
            char c11 = string2.charAt(0);
            object = Character.isLowerCase(c11) ? a.e((char)c11, (Locale)object) : String.valueOf(c11);
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append(string2.substring(1));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

