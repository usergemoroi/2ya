/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.impl.fh;
import io.appmetrica.analytics.impl.h7;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\t\u00a8\u0006\r"}, d2={"Lio/appmetrica/analytics/impl/i7;", "Lio/appmetrica/analytics/impl/h7;", "Landroid/content/Context;", "context", "", "simpleName", "Ljava/io/File;", "a", "Lio/appmetrica/analytics/impl/fh;", "Lio/appmetrica/analytics/impl/fh;", "relativePathFormer", "<init>", "(Lio/appmetrica/analytics/impl/fh;)V", "analytics_binaryProdRelease"}, k=1, mv={1, 6, 0})
@DoNotInline
public final class i7
implements h7 {
    @NotNull
    private final fh a;

    public i7(@NotNull fh fh3) {
        this.a = fh3;
    }

    @Override
    @NotNull
    public File a(@NotNull Context context, @NotNull String string2) {
        return new File(context.getNoBackupFilesDir(), this.a.a(string2));
    }
}

