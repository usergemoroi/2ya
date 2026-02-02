/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.jb;
import io.appmetrica.analytics.impl.ro;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public final class ya {
    public final File a;
    public FileLock b;
    public RandomAccessFile c;
    public FileChannel d;
    public int e;

    public ya(Context context, String string2) {
        this(ya.a(context, string2));
    }

    public ya(File file) {
        this.e = 0;
        this.a = file;
    }

    public ya(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(".lock");
        this(FileUtils.getFileFromPath(stringBuilder.toString()));
    }

    public static File a(Context object, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(".lock");
        object = FileUtils.getFileFromSdkStorage(object, stringBuilder.toString());
        if (object != null) {
            return object;
        }
        throw new IllegalStateException("Cannot create lock file");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Closeable closeable = new RandomAccessFile(this.a, "rw");
                        this.c = closeable;
                        closeable = ((RandomAccessFile)closeable).getChannel();
                        this.d = closeable;
                        if (this.e != 0) break block3;
                        this.b = ((FileChannel)closeable).lock();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                ++this.e;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n10;
                        this.a.getAbsolutePath();
                        this.e = n10 = this.e - 1;
                        if (n10 != 0) break block3;
                        jb.a(this.b);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                ro.a(this.c);
                ro.a(this.d);
                this.c = null;
                this.b = null;
                this.d = null;
                return;
            }
            throw throwable2;
        }
    }
}

