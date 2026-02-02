/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.appset.AppSet
 *  com.google.android.gms.appset.AppSetIdInfo
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 */
package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2={"Lio/appmetrica/analytics/appsetid/internal/AppSetIdRetriever;", "Lio/appmetrica/analytics/appsetid/internal/IAppSetIdRetriever;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", "listener", "Lkotlin/k0;", "retrieveAppSetId", "(Landroid/content/Context;Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;)V", "<init>", "()V", "appsetid_release"}, k=1, mv={1, 6, 0})
public final class AppSetIdRetriever
implements IAppSetIdRetriever {
    private final Object a = new Object();
    private final ArrayList b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever object, int n10) {
        object.getClass();
        object = n10 != 1 ? (n10 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER) : AppSetIdScope.APP;
        return object;
    }

    public static final /* synthetic */ List access$getListeners$p(AppSetIdRetriever appSetIdRetriever) {
        return appSetIdRetriever.b;
    }

    public static final /* synthetic */ Object access$getListenersLock$p(AppSetIdRetriever appSetIdRetriever) {
        return appSetIdRetriever.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void retrieveAppSetId(@NotNull Context object, @NotNull AppSetIdListener object2) throws Throwable {
        Task task = AppSet.getClient((Context)object).getAppSetIdInfo();
        object2 = new OnCompleteListener<AppSetIdInfo>(this, (AppSetIdListener)object2){
            final AppSetIdRetriever a;
            final AppSetIdListener b;
            {
                this.a = appSetIdRetriever;
                this.b = appSetIdListener;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void onComplete(@NotNull Task<AppSetIdInfo> task) {
                Object object = AppSetIdRetriever.access$getListenersLock$p(this.a);
                AppSetIdRetriever appSetIdRetriever = this.a;
                // MONITORENTER : object
                AppSetIdRetriever.access$getListeners$p(appSetIdRetriever).remove(this);
                // MONITOREXIT : object
                if (task.isSuccessful()) {
                    this.b.onAppSetIdRetrieved(((AppSetIdInfo)task.getResult()).getId(), AppSetIdRetriever.access$convertScope(this.a, ((AppSetIdInfo)task.getResult()).getScope()));
                    return;
                }
                this.b.onFailure(task.getException());
            }
        };
        object = this.a;
        synchronized (object) {
            this.b.add(object2);
        }
        task.addOnCompleteListener((OnCompleteListener)object2);
    }
}

