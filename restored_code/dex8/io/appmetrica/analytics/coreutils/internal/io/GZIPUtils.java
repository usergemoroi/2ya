/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.io;

import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.io.b;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007\u00a8\u0006\u0006"}, d2={"Lio/appmetrica/analytics/coreutils/internal/io/GZIPUtils;", "", "", "input", "gzipBytes", "unGzipBytes", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class GZIPUtils {
    @NotNull
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final byte[] gzipBytes(@Nullable byte[] byArray) throws IOException {
        void var0_2;
        ByteArrayOutputStream byteArrayOutputStream;
        Object object;
        block6: {
            object = null;
            Object var3_6 = null;
            if (byArray == null) return object;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            }
            catch (Throwable throwable) {
                object = null;
                byteArrayOutputStream = var3_6;
                break block6;
            }
            try {
                object = new GZIPOutputStream(byteArrayOutputStream);
            }
            catch (Throwable throwable) {
                object = null;
                break block6;
            }
            try {
                ((OutputStream)object).write(byArray);
                ((GZIPOutputStream)object).finish();
                byArray = byteArrayOutputStream.toByteArray();
            }
            catch (Throwable throwable) {
                break block6;
            }
            CloseableUtilsKt.closeSafely((Closeable)object);
            CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            return byArray;
        }
        CloseableUtilsKt.closeSafely((Closeable)object);
        CloseableUtilsKt.closeSafely(byteArrayOutputStream);
        throw var0_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final byte[] unGzipBytes(@Nullable byte[] object) throws IOException {
        void var1_3;
        ByteArrayInputStream byteArrayInputStream;
        block6: {
            byte[] byArray = null;
            Object var3_6 = null;
            if (object == null) return byArray;
            try {
                byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            }
            catch (Throwable throwable) {
                object = null;
                byteArrayInputStream = var3_6;
                break block6;
            }
            try {
                object = new GZIPInputStream(byteArrayInputStream);
            }
            catch (Throwable throwable) {
                object = null;
                break block6;
            }
            try {
                byArray = b.c((InputStream)object);
            }
            catch (Throwable throwable) {
                break block6;
            }
            CloseableUtilsKt.closeSafely((Closeable)object);
            CloseableUtilsKt.closeSafely(byteArrayInputStream);
            return byArray;
        }
        CloseableUtilsKt.closeSafely((Closeable)object);
        CloseableUtilsKt.closeSafely(byteArrayInputStream);
        throw var1_3;
    }
}

