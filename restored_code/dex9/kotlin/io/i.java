/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.io.h
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.io;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.g;
import kotlin.io.h;
import kotlin.io.k;
import kotlin.io.l;
import kotlin.io.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"kotlin/io/j", "kotlin/io/k", "kotlin/io/l", "kotlin/io/m"}, d2={}, k=4, mv={1, 9, 0})
public final class i
extends m {
    public static /* bridge */ /* synthetic */ void c(@NotNull File file, @NotNull byte[] byArray) {
        k.c(file, byArray);
    }

    public static /* bridge */ /* synthetic */ List h(File file, Charset charset, int n4, Object object) {
        return k.h(file, charset, n4, object);
    }

    public static /* bridge */ /* synthetic */ String j(File file, Charset charset, int n4, Object object) {
        return k.j(file, charset, n4, object);
    }

    public static /* bridge */ /* synthetic */ void k(@NotNull File file, @NotNull byte[] byArray) {
        k.k(file, byArray);
    }

    public static /* bridge */ /* synthetic */ void l(@NotNull File file, @NotNull String string, @NotNull Charset charset) {
        k.l(file, string, charset);
    }

    public static /* bridge */ /* synthetic */ void m(File file, String string, Charset charset, int n4, Object object) {
        k.m(file, string, charset, n4, object);
    }

    public static /* bridge */ /* synthetic */ g p(File file, h h4, int n4, Object object) {
        return l.p(file, h4, n4, object);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ g r(@NotNull File file) {
        return l.r(file);
    }

    public static /* bridge */ /* synthetic */ File t(File file, File file2, boolean bl, int n4, int n5, Object object) {
        return m.t(file, file2, bl, n4, n5, object);
    }

    public static /* bridge */ /* synthetic */ boolean u(@NotNull File file) {
        return m.u(file);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ String v(@NotNull File file) {
        return m.v(file);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ File x(@NotNull File file, @NotNull String string) {
        return m.x(file, string);
    }
}

