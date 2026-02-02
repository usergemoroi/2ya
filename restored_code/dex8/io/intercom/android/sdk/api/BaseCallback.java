/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.ErrorObject;
import io.intercom.android.sdk.logger.LumberMill;
import retrofit2.b;
import retrofit2.d;
import retrofit2.z;

public abstract class BaseCallback<T>
implements d<T> {
    private final Twig twig = LumberMill.getLogger();

    static String getDetails(ErrorObject object) {
        object = ((ErrorObject)object).hasErrorBody() ? ((ErrorObject)object).getErrorBody() : ((ErrorObject)object).getThrowable().getMessage();
        Object object2 = object;
        if (object == null) {
            object2 = "unknown error";
        }
        return object2;
    }

    private void handleError(ErrorObject errorObject) {
        this.logFailure("Api call failed", errorObject);
        this.onError(errorObject);
    }

    void logFailure(String string2, ErrorObject errorObject) {
        Twig twig = this.twig;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append(BaseCallback.getDetails(errorObject));
        twig.e(stringBuilder.toString(), new Object[0]);
    }

    protected void onError(ErrorObject errorObject) {
    }

    @Override
    public final void onFailure(b<T> b11, Throwable throwable) {
        this.handleError(new ErrorObject(throwable, null));
    }

    @Override
    public final void onResponse(b<T> b11, z<T> z13) {
        if (z13 == null) {
            this.handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), null));
        } else if (z13.a() == null) {
            this.handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), z13));
        } else if (!z13.e()) {
            this.handleError(new ErrorObject(new Exception("Status code outside the 200-300 range"), z13));
        } else {
            this.onSuccess(z13.a());
        }
    }

    protected abstract void onSuccess(T var1);
}

