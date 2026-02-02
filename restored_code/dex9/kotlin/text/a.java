/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalStdlibApi
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.WasExperimental
 *  kotlin.text.b
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.text;

import java.util.Locale;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.text.b;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"kotlin/text/b", "kotlin/text/c"}, d2={}, k=4, mv={1, 9, 0})
public final class a
extends c {
    @PublishedApi
    public static /* bridge */ /* synthetic */ int a(int n4) {
        return b.a((int)n4);
    }

    public static /* bridge */ /* synthetic */ boolean c(char c4) {
        return b.c((char)c4);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @NotNull
    public static /* bridge */ /* synthetic */ String d(char c4, @NotNull Locale locale) {
        return b.d((char)c4, (Locale)locale);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @NotNull
    public static /* bridge */ /* synthetic */ String e(char c4, @NotNull Locale locale) {
        return b.e((char)c4, (Locale)locale);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static /* bridge */ /* synthetic */ int g(char c4) {
        return c.g(c4);
    }

    public static /* bridge */ /* synthetic */ boolean i(char c4) {
        return c.i(c4);
    }

    @SinceKotlin(version="1.5")
    @NotNull
    public static /* bridge */ /* synthetic */ String j(char c4) {
        return c.j(c4);
    }
}

