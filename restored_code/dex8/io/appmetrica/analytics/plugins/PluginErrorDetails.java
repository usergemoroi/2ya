/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PluginErrorDetails {
    private final String a;
    private final String b;
    private final ArrayList c;
    private final String d;
    private final String e;
    private final Map f;

    private PluginErrorDetails(String string2, String string3, List list, String string4, String string5, Map map2) {
        this.a = string2;
        this.b = string3;
        this.c = new ArrayList(list);
        this.d = string4;
        this.e = string5;
        this.f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map2));
    }

    /* synthetic */ PluginErrorDetails(String string2, String string3, List list, String string4, String string5, Map map2, int n10) {
        this(string2, string3, list, string4, string5, map2);
    }

    @Nullable
    public String getExceptionClass() {
        return this.a;
    }

    @Nullable
    public String getMessage() {
        return this.b;
    }

    @Nullable
    public String getPlatform() {
        return this.d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.e;
    }

    public static class Builder {
        private String a;
        private String b;
        private List c;
        private String d;
        private String e;
        private Map f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.a, this.b, WrapUtils.getOrDefault(this.c, new ArrayList()), this.d, this.e, WrapUtils.getOrDefault(this.f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String string2) {
            this.a = string2;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String string2) {
            this.b = string2;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String string2) {
            this.d = string2;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map2) {
            this.f = map2;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String string2) {
            this.e = string2;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }
}

