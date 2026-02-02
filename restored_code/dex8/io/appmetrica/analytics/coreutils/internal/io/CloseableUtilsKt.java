/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package io.appmetrica.analytics.coreutils.internal.io;

import android.database.Cursor;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2={"Ljava/io/Closeable;", "Lkotlin/k0;", "closeSafely", "(Ljava/io/Closeable;)V", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)V", "core-utils_release"}, k=2, mv={1, 6, 0})
public final class CloseableUtilsKt {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void closeSafely(@Nullable Cursor cursor) {
        if (cursor == null) return;
        try {
            cursor.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void closeSafely(@Nullable Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

