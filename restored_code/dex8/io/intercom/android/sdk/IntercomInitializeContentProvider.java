/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.intercom.android.sdk;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.intercom.android.sdk.LateInitializationPreparer;

public class IntercomInitializeContentProvider
extends ContentProvider {
    public int delete(@NonNull Uri uri, @Nullable String string2, @Nullable String[] stringArray) {
        return 0;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = this.getContext();
        if (context instanceof Application) {
            context = (Application)context;
            LateInitializationPreparer.getInstance().register((Application)context);
        }
        return false;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] stringArray, @Nullable String string2, @Nullable String[] stringArray2, @Nullable String string3) {
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String string2, @Nullable String[] stringArray) {
        return 0;
    }
}

