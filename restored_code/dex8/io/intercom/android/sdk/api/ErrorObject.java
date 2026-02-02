/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.api;

import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import retrofit2.z;

public class ErrorObject {
    @Nullable
    private final String errorBody;
    private final int statusCode;
    private final Throwable throwable;
    private final Twig twig = LumberMill.getLogger();

    public ErrorObject(Throwable throwable, @Nullable z z13) {
        this.throwable = throwable;
        this.errorBody = this.parseErrorBody(z13);
        this.statusCode = this.parseStatusCode(z13);
    }

    private String parseErrorBody(@Nullable z object) {
        if (object != null && ((z)object).d() != null) {
            try {
                object = ((z)object).d().string();
                return object;
            }
            catch (IOException iOException) {
                Twig twig = this.twig;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't parse error body: ");
                stringBuilder.append(iOException.getMessage());
                twig.internal(stringBuilder.toString());
            }
        }
        return null;
    }

    private int parseStatusCode(@Nullable z z13) {
        if (z13 != null) {
            return z13.b();
        }
        return -1;
    }

    @Nullable
    String getErrorBody() {
        return this.errorBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    boolean hasErrorBody() {
        boolean bl2 = this.errorBody != null;
        return bl2;
    }
}

