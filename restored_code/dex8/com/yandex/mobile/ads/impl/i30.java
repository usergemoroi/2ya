/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.j30
 *  kotlin.collections.l
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.j30;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.l;
import org.jetbrains.annotations.NotNull;

final class i30
implements j30 {
    @NotNull
    public final List<InetAddress> a(@NotNull String object) {
        try {
            List list = l.i1((Object[])InetAddress.getAllByName((String)object));
            return list;
        }
        catch (NullPointerException nullPointerException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Broken system behaviour for dns lookup of ");
            stringBuilder.append((String)object);
            object = new UnknownHostException(stringBuilder.toString());
            ((Throwable)object).initCause(nullPointerException);
            throw object;
        }
    }
}

