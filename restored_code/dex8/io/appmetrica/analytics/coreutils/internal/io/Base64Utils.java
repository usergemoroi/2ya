/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package io.appmetrica.analytics.coreutils.internal.io;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.io.GZIPUtils;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.io.b;
import kotlin.jvm.JvmStatic;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lio/appmetrica/analytics/coreutils/internal/io/Base64Utils;", "", "", "stringToZip", "compressBase64String", "", "bytes", "compressBase64", "stringToUnZip", "decompressBase64GzipAsString", "decompressBase64GzipAsBytes", "", "IO_BUFFER_SIZE", "I", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class Base64Utils {
    @NotNull
    public static final Base64Utils INSTANCE = new Base64Utils();
    public static final int IO_BUFFER_SIZE = 4096;

    private Base64Utils() {
    }

    @JvmStatic
    @Nullable
    public static final String compressBase64(@Nullable byte[] object) {
        try {
            object = Base64.encodeToString((byte[])GZIPUtils.gzipBytes(object), (int)0);
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @JvmStatic
    @Nullable
    public static final String compressBase64String(@Nullable String object) {
        Object var1_2 = null;
        if (object != null) {
            object = ((String)object).getBytes(d.b);
        } else {
            object = null;
        }
        try {
            return Base64Utils.compressBase64((byte[])object);
        }
        catch (Throwable throwable) {
            return var1_2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @NotNull
    public static final byte[] decompressBase64GzipAsBytes(@Nullable String object) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] byArray;
        block9: {
            byArray = null;
            object = Base64.decode((String)object, (int)0);
            byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            try {
                object = new GZIPInputStream(byteArrayInputStream);
            }
            catch (Throwable throwable) {
                object = null;
                break block9;
            }
            try {
                return b.c((InputStream)object);
            }
            catch (Throwable throwable) {}
            catch (Throwable throwable) {
                object = null;
                byteArrayInputStream = byArray;
            }
        }
        try {
            byArray = new byte[]{};
            return byArray;
        }
        finally {
            CloseableUtilsKt.closeSafely((Closeable)object);
            CloseableUtilsKt.closeSafely(byteArrayInputStream);
        }
    }

    @JvmStatic
    @Nullable
    public static final String decompressBase64GzipAsString(@Nullable String string2) {
        try {
            String string3;
            string2 = string3 = new String(Base64Utils.decompressBase64GzipAsBytes(string2), d.b);
        }
        catch (Throwable throwable) {
            string2 = null;
        }
        return string2;
    }
}

