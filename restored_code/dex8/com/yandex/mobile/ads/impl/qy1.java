/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qm
 *  com.yandex.mobile.ads.impl.vm
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.qm;
import com.yandex.mobile.ads.impl.vm;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class qy1
extends qm {
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public static final int k = 0;

    private qy1(String string2, long l10, long l11, long l13, @Nullable File file) {
        super(string2, l10, l11, l13, file);
    }

    @Nullable
    public static qy1 a(File object, long l10, long l11, vm object2) {
        long l13;
        Object object3;
        Object object4;
        block13: {
            block15: {
                block16: {
                    block14: {
                        object4 = ((File)object).getName();
                        if (((String)object4).endsWith(".v3.exo")) break block13;
                        object4 = ((File)object).getName();
                        object3 = i.matcher((CharSequence)object4);
                        if (((Matcher)object3).matches()) {
                            object4 = ((Matcher)object3).group(1);
                            object4.getClass();
                            object4 = m92.f((String)object4);
                        } else {
                            object3 = h.matcher((CharSequence)object4);
                            if (((Matcher)object3).matches()) {
                                object4 = ((Matcher)object3).group(1);
                                object4.getClass();
                            } else {
                                object4 = null;
                            }
                        }
                        if (object4 == null) break block14;
                        File file = ((File)object).getParentFile();
                        if (file == null) break block15;
                        int n10 = object2.c((String)object4).a;
                        object4 = ((Matcher)object3).group(2);
                        object4.getClass();
                        long l14 = Long.parseLong((String)object4);
                        object4 = ((Matcher)object3).group(3);
                        object4.getClass();
                        l13 = Long.parseLong((String)object4);
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append(n10);
                        ((StringBuilder)object4).append(".");
                        ((StringBuilder)object4).append(l14);
                        ((StringBuilder)object4).append(".");
                        ((StringBuilder)object4).append(l13);
                        ((StringBuilder)object4).append(".v3.exo");
                        object4 = object3 = new File(file, ((StringBuilder)object4).toString());
                        if (((File)object).renameTo((File)object3)) break block16;
                    }
                    object4 = null;
                }
                if (object4 == null) {
                    return null;
                }
                object3 = ((File)object4).getName();
                object = object4;
                object4 = object3;
                break block13;
            }
            throw new IllegalStateException();
        }
        if (!((Matcher)(object4 = j.matcher((CharSequence)object4))).matches()) {
            return null;
        }
        object3 = ((Matcher)object4).group(1);
        object3.getClass();
        object2 = object2.a(Integer.parseInt((String)object3));
        if (object2 == null) {
            return null;
        }
        if (l10 == -1L) {
            l10 = ((File)object).length();
        }
        if (l10 == 0L) {
            return null;
        }
        object3 = ((Matcher)object4).group(2);
        object3.getClass();
        l13 = Long.parseLong((String)object3);
        if (l11 == -9223372036854775807L) {
            object4 = ((Matcher)object4).group(3);
            object4.getClass();
            l11 = Long.parseLong((String)object4);
        }
        return new qy1((String)object2, l13, l10, l11, (File)object);
    }

    public static qy1 a(String string2, long l10) {
        return new qy1(string2, l10, -1L, -9223372036854775807L, null);
    }

    public static qy1 a(String string2, long l10, long l11) {
        return new qy1(string2, l10, l11, -9223372036854775807L, null);
    }

    public final qy1 a(File file, long l10) {
        if (this.e) {
            return new qy1(this.b, this.c, this.d, l10, file);
        }
        throw new IllegalStateException();
    }
}

