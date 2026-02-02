/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH&\u00a2\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u000bH&\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0010H&\u00a2\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0010H&\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0015H&\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0015H&\u00a2\u0006\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/common/ModulePreferences;", "", "", "key", "value", "Lkotlin/k0;", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "fallback", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "putLong", "(Ljava/lang/String;J)V", "getLong", "(Ljava/lang/String;J)J", "", "putInt", "(Ljava/lang/String;I)V", "getInt", "(Ljava/lang/String;I)I", "", "putBoolean", "(Ljava/lang/String;Z)V", "getBoolean", "(Ljava/lang/String;Z)Z", "modules-api_release"}, k=1, mv={1, 6, 0})
public interface ModulePreferences {
    public boolean getBoolean(@NotNull String var1, boolean var2);

    public int getInt(@NotNull String var1, int var2);

    public long getLong(@NotNull String var1, long var2);

    @Nullable
    public String getString(@NotNull String var1, @Nullable String var2);

    public void putBoolean(@NotNull String var1, boolean var2);

    public void putInt(@NotNull String var1, int var2);

    public void putLong(@NotNull String var1, long var2);

    public void putString(@NotNull String var1, @Nullable String var2);

    @Metadata(k=3, mv={1, 6, 0}, xi=48)
    public static final class DefaultImpls {
        public static /* synthetic */ int getInt$default(ModulePreferences modulePreferences, String string2, int n10, int n13, Object object) {
            if (object == null) {
                if ((n13 & 2) != 0) {
                    n10 = 0;
                }
                return modulePreferences.getInt(string2, n10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }

        public static /* synthetic */ long getLong$default(ModulePreferences modulePreferences, String string2, long l10, int n10, Object object) {
            if (object == null) {
                if ((n10 & 2) != 0) {
                    l10 = 0L;
                }
                return modulePreferences.getLong(string2, l10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }

        public static /* synthetic */ String getString$default(ModulePreferences modulePreferences, String string2, String string3, int n10, Object object) {
            if (object == null) {
                if ((n10 & 2) != 0) {
                    string3 = null;
                }
                return modulePreferences.getString(string2, string3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
    }
}

