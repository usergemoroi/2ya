/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.h7;
import io.appmetrica.analytics.impl.w7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;

public final class z7 {
    public final h7 a;
    public final List b;
    public final boolean c;

    public z7(h7 h74, ArrayList arrayList, boolean bl2) {
        this.a = h74;
        this.b = arrayList;
        this.c = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String a(Context object, w7 w74) {
        File file;
        File file2;
        void var2_4;
        try {
            file2 = this.a.a((Context)object, var2_4.b());
            if (file2.exists()) return file2.getPath();
            file = file2.getParentFile();
            if (file == null) return file2.getPath();
        }
        catch (Throwable throwable) {
            return var2_4.b();
        }
        if (!file.exists() && !file.mkdirs()) return file2.getPath();
        this.a((Context)object, var2_4.a(), file2);
        return file2.getPath();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(Context context, String string2, File file) {
        Object object = this.b;
        if (object instanceof Collection && object.isEmpty()) return;
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = ((h7)object.next()).a(context, string2);
            if (!((File)object2).exists()) continue;
            try {
                if (this.c) {
                    FileUtils.copyToNullable((File)object2, file);
                } else {
                    FileUtils.move((File)object2, file);
                }
                object2 = ((File)object2).getPath();
                String string3 = file.getPath();
                for (String string4 : t.p((Object[])new String[]{"-journal", "-shm", "-wal"})) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object2);
                    stringBuilder.append(string4);
                    File file2 = new File(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string3);
                    stringBuilder2.append(string4);
                    File file3 = new File(stringBuilder2.toString());
                    if (this.c) {
                        FileUtils.copyToNullable(file2, file3);
                        continue;
                    }
                    FileUtils.move(file2, file3);
                }
                return;
            }
        // Removed invalid catch block
        }
    }
}

