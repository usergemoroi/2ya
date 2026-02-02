/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.impl.de;
import io.appmetrica.analytics.impl.ie;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModuleDummy;

public final class je {
    public final NativeCrashServiceModule a;
    public final de b;

    public je() {
        NativeCrashServiceModule nativeCrashServiceModule;
        NativeCrashServiceModule nativeCrashServiceModule2 = nativeCrashServiceModule = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashServiceModuleImpl", NativeCrashServiceModule.class);
        if (nativeCrashServiceModule == null) {
            nativeCrashServiceModule2 = new NativeCrashServiceModuleDummy();
        }
        this.a = nativeCrashServiceModule2;
        this.b = new de(new ie(this));
    }
}

