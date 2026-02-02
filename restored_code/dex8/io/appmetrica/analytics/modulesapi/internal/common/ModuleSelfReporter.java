/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.common;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H&\u00a2\u0006\u0004\b\u0005\u0010\tJ!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\nJ)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\rJ#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&\u00a2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\b\u0011\u0010\n\u00a8\u0006\u0014"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/common/ModuleSelfReporter;", "", "", "eventName", "Lkotlin/k0;", "reportEvent", "(Ljava/lang/String;)V", "", "eventValue", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "", "type", "(ILjava/lang/String;Ljava/lang/String;)V", "message", "", "error", "reportError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "identifier", "modules-api_release"}, k=1, mv={1, 6, 0})
public interface ModuleSelfReporter {
    public void reportError(@NotNull String var1, @Nullable String var2);

    public void reportError(@NotNull String var1, @Nullable Throwable var2);

    public void reportEvent(int var1, @NotNull String var2, @Nullable String var3);

    public void reportEvent(@NotNull String var1);

    public void reportEvent(@NotNull String var1, @Nullable String var2);

    public void reportEvent(@NotNull String var1, @Nullable Map<String, ? extends Object> var2);

    @Metadata(k=3, mv={1, 6, 0}, xi=48)
    public static final class DefaultImpls {
        public static /* synthetic */ void reportError$default(ModuleSelfReporter moduleSelfReporter, String string2, String string3, int n10, Object object) {
            if (object == null) {
                if ((n10 & 2) != 0) {
                    string3 = null;
                }
                moduleSelfReporter.reportError(string2, string3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
        }

        public static /* synthetic */ void reportError$default(ModuleSelfReporter moduleSelfReporter, String string2, Throwable throwable, int n10, Object object) {
            if (object == null) {
                if ((n10 & 2) != 0) {
                    throwable = null;
                }
                moduleSelfReporter.reportError(string2, throwable);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
        }
    }
}

