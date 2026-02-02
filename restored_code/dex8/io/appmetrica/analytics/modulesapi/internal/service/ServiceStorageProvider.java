/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteOpenHelper
 */
package io.appmetrica.analytics.modulesapi.internal.service;

import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/service/ServiceStorageProvider;", "", "appDataStorage", "Ljava/io/File;", "getAppDataStorage", "()Ljava/io/File;", "appFileStorage", "getAppFileStorage", "dbStorage", "Landroid/database/sqlite/SQLiteOpenHelper;", "getDbStorage", "()Landroid/database/sqlite/SQLiteOpenHelper;", "sdkDataStorage", "getSdkDataStorage", "tempCacheStorage", "Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage;", "getTempCacheStorage", "()Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage;", "legacyModulePreferences", "Lio/appmetrica/analytics/modulesapi/internal/common/ModulePreferences;", "modulePreferences", "moduleIdentifier", "", "modules-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface ServiceStorageProvider {
    @Nullable
    public File getAppDataStorage();

    @Nullable
    public File getAppFileStorage();

    @NotNull
    public SQLiteOpenHelper getDbStorage();

    @Nullable
    public File getSdkDataStorage();

    @NotNull
    public TempCacheStorage getTempCacheStorage();

    @NotNull
    public ModulePreferences legacyModulePreferences();

    @NotNull
    public ModulePreferences modulePreferences(@NotNull String var1);
}

