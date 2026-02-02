/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.system;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.io.File;

public final class RootChecker {
    private static final String[] a = new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    public static int isRootedPhone() {
        int n10 = !RootChecker.isSuperuserApkExists() && !RootChecker.isSuperuserNativeLibExists() ? 0 : 1;
        return n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isSuperuserApkExists() {
        block3: {
            try {
                File file = new File("/system/app/Superuser/Superuser.apk");
                boolean bl2 = file.exists();
                if (!bl2) break block3;
                return true;
            }
            catch (Throwable throwable) {
                return false;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean isSuperuserNativeLibExists() {
        String[] stringArray = a;
        int n10 = 0;
        while (n10 < 8) {
            String string2 = stringArray[n10];
            try {
                if (!AndroidUtils.isApiAchieved(31)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("su");
                    File file = new File(stringBuilder.toString());
                    boolean bl2 = file.exists();
                    if (bl2) {
                        return true;
                    }
                }
            }
            catch (Throwable throwable) {}
            ++n10;
        }
        return false;
    }

    public static final class RootStatus {
        public static final int NOT_ROOT = 0;
        public static final int ROOT = 1;
    }
}

