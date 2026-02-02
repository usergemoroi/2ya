/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  kotlin.io.i
 */
package io.appmetrica.analytics.coreutils.internal.io;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.io.AppDataDirProviderForN;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.i;
import kotlin.jvm.JvmStatic;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0007\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u0017*\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u0017*\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u0017*\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u0017*\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001e\u00a8\u0006 "}, d2={"Lio/appmetrica/analytics/coreutils/internal/io/FileUtils;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "sdkStorage", "(Landroid/content/Context;)Ljava/io/File;", "getAppStorageDirectory", "", "fileName", "getFileFromSdkStorage", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "getFileFromAppStorage", "getCrashesDirectory", "getNativeCrashDirectory", "filePath", "getFileFromPath", "(Ljava/lang/String;)Ljava/io/File;", "getAppDataDir", "Lkotlin/k0;", "resetSdkStorage", "()V", "to", "", "move", "(Ljava/io/File;Ljava/io/File;)Z", "copyToNullable", "moveByCopy", "moveByRename", "SDK_STORAGE_RELATIVE_PATH", "Ljava/lang/String;", "SDK_FILES_PREFIX", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class FileUtils {
    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();
    @NotNull
    public static final String SDK_FILES_PREFIX = "appmetrica_analytics";
    @NotNull
    public static final String SDK_STORAGE_RELATIVE_PATH = "/appmetrica/analytics";
    private static volatile File a;

    private FileUtils() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    public static final boolean copyToNullable(@Nullable File file, @Nullable File file2) {
        if (file == null) return false;
        if (file2 == null) {
            return false;
        }
        if (!file.exists()) return false;
        try {
            i.t((File)file, (File)file2, (boolean)false, (int)0, (int)6, null);
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    @JvmStatic
    @SuppressLint(value={"NewApi"})
    @Nullable
    public static final File getAppDataDir(@NotNull Context object) {
        object = AndroidUtils.isApiAchieved(24) ? AppDataDirProviderForN.INSTANCE.dataDir((Context)object) : ((object = object.getFilesDir()) != null ? ((File)object).getParentFile() : null);
        return object;
    }

    @JvmStatic
    @Nullable
    public static final File getAppStorageDirectory(@NotNull Context context) {
        return context.getNoBackupFilesDir();
    }

    @JvmStatic
    @Nullable
    public static final File getCrashesDirectory(@NotNull Context context) {
        return FileUtils.getFileFromSdkStorage(context, "crashes");
    }

    @JvmStatic
    @Nullable
    public static final File getFileFromAppStorage(@NotNull Context object, @NotNull String string2) {
        object = (object = FileUtils.getAppStorageDirectory(object)) != null ? new File((File)object, string2) : null;
        return object;
    }

    @JvmStatic
    @NotNull
    public static final File getFileFromPath(@NotNull String string2) {
        return new File(string2);
    }

    @JvmStatic
    @Nullable
    public static final File getFileFromSdkStorage(@NotNull Context object, @NotNull String string2) {
        object = (object = FileUtils.sdkStorage(object)) != null ? new File((File)object, string2) : null;
        return object;
    }

    @JvmStatic
    @Nullable
    public static final File getNativeCrashDirectory(@NotNull Context context) {
        return FileUtils.getFileFromSdkStorage(context, "native_crashes");
    }

    @JvmStatic
    public static final boolean move(@Nullable File file, @Nullable File file2) {
        FileUtils fileUtils = INSTANCE;
        boolean bl2 = fileUtils.moveByRename(file, file2) || fileUtils.moveByCopy(file, file2);
        return bl2;
    }

    @JvmStatic
    @VisibleForTesting
    public static final void resetSdkStorage() {
        FileUtils fileUtils = INSTANCE;
        synchronized (fileUtils) {
            a = null;
            k0 k02 = k0.a;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final File sdkStorage(@NotNull Context object) {
        if (a != null) return a;
        FileUtils fileUtils = INSTANCE;
        synchronized (fileUtils) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        File file = FileUtils.getAppStorageDirectory((Context)object);
                        if (file == null) {
                            object = null;
                            break block4;
                        }
                        object = new File(file, SDK_STORAGE_RELATIVE_PATH);
                        if (((File)object).exists()) break block4;
                        ((File)object).mkdirs();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                a = object;
                object = k0.a;
                return a;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean moveByCopy(@Nullable File file, @Nullable File file2) {
        if (file == null) return false;
        if (file2 == null) {
            return false;
        }
        if (!file.exists()) return false;
        try {
            i.t((File)file, (File)file2, (boolean)false, (int)0, (int)6, null);
            file.delete();
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public final boolean moveByRename(@Nullable File comparable, @Nullable File file) {
        boolean bl2 = file != null && (comparable = comparable != null ? Boolean.valueOf(((File)comparable).renameTo(file)) : null) != null ? (Boolean)comparable : false;
        return bl2;
    }
}

