/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.appsetid.internal;

import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", "", "", "id", "Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;", "scope", "Lkotlin/k0;", "onAppSetIdRetrieved", "(Ljava/lang/String;Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;)V", "", "ex", "onFailure", "(Ljava/lang/Throwable;)V", "appsetid_release"}, k=1, mv={1, 6, 0})
public interface AppSetIdListener {
    public void onAppSetIdRetrieved(@Nullable String var1, @NotNull AppSetIdScope var2);

    public void onFailure(@Nullable Throwable var1);
}

