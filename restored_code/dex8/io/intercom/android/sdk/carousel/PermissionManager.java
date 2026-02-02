/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build$VERSION
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  androidx.core.app.ActivityCompat
 *  androidx.core.content.ContextCompat
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.carousel;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermissionManager {
    private static final String BACKGROUND_LOCATION_PERMISSION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static final Twig twig = LumberMill.getLogger();
    private final Activity activity;

    public PermissionManager(Activity activity) {
        this.activity = activity;
    }

    public boolean anyPermissionPermanentlyDeniedInResult(String[] stringArray, int[] nArray) {
        for (int i14 = 0; i14 < stringArray.length; ++i14) {
            if (nArray[i14] != -1 || ActivityCompat.shouldShowRequestPermissionRationale((Activity)this.activity, (String)stringArray[i14])) continue;
            return true;
        }
        return false;
    }

    public int getPermissionStatus(String string2) {
        if (ContextCompat.checkSelfPermission((Context)this.activity, (String)string2) == 0) {
            return 0;
        }
        if (ActivityCompat.shouldShowRequestPermissionRationale((Activity)this.activity, (String)string2)) {
            return 1;
        }
        return 2;
    }

    public List<String> permissionsExistInManifest(List<String> object) {
        ArrayList<String> arrayList = new ArrayList<String>();
        List<String> list = this.permissionsInManifest();
        object = object.iterator();
        while (object.hasNext()) {
            String string2 = (String)object.next();
            if (!list.contains(string2)) continue;
            boolean bl2 = BACKGROUND_LOCATION_PERMISSION.equals(string2);
            boolean bl3 = Build.VERSION.SDK_INT < 29;
            if (bl2 && bl3) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    public boolean permissionsGranted(List<String> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.getPermissionStatus((String)object.next()) == 0) continue;
            return false;
        }
        return true;
    }

    @VisibleForTesting
    List<String> permissionsInManifest() {
        try {
            List<String> list = Arrays.asList(this.activity.getPackageManager().getPackageInfo((String)this.activity.getPackageName(), (int)4096).requestedPermissions);
            return list;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Twig twig = PermissionManager.twig;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Package name is unknown, error: ");
            stringBuilder.append(nameNotFoundException.getMessage());
            twig.internal(stringBuilder.toString());
            return new ArrayList<String>();
        }
    }

    public void requestPermissions(@NonNull String[] stringArray, @IntRange(from=0L) int n10) {
        ActivityCompat.requestPermissions((Activity)this.activity, (String[])stringArray, (int)n10);
    }

    @Retention(value=RetentionPolicy.SOURCE)
    public static @interface PermissionStatus {
        public static final int DENIED_TEMPORARILY = 1;
        public static final int GRANTED = 0;
        public static final int NEVER_ASKED_OR_DENIED_PERMANENTLY = 2;
    }
}

