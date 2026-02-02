/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intercom.twig.Twig
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.ShutdownState;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.w;
import org.json.JSONException;
import org.json.JSONObject;

public class ShutdownInterceptor
implements w {
    private static final String ERROR = "error";
    private static final String MESSAGE = "message";
    private static final String MESSENGER_SHUTDOWN_RESPONSE = "messenger_shutdown_response";
    private static final String SHUTDOWN_PERIOD = "shutdown_period";
    private static final String TYPE = "type";
    private final ShutdownState shutdownState;
    private final Twig twig = LumberMill.getLogger();

    public ShutdownInterceptor(ShutdownState shutdownState) {
        this.shutdownState = shutdownState;
    }

    @Override
    public d0 intercept(w.a object) throws IOException {
        if (this.shutdownState.canSendNetworkRequests()) {
            d0 d03 = object.proceed(object.request());
            object = d03;
            if (!d03.A()) {
                object = d03.d();
                String string2 = ((e0)object).string();
                d03 = d03.L().b(e0.create(((e0)object).contentType(), string2)).c();
                ((e0)object).close();
                object = new JSONObject(string2);
                Object object2 = object.getJSONObject(ERROR);
                object = d03;
                try {
                    if (object2.getString(TYPE).equals(MESSENGER_SHUTDOWN_RESPONSE)) {
                        long l10 = object2.getLong(SHUTDOWN_PERIOD);
                        object = object2.getString(MESSAGE);
                        this.shutdownState.updateShutdownState(TimeUnit.SECONDS.toMillis(l10), (String)object);
                        object = d03;
                    }
                }
                catch (JSONException jSONException) {
                    object = this.twig;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Failed to deserialise error response: `");
                    ((StringBuilder)object2).append(string2);
                    ((StringBuilder)object2).append("` message: `");
                    ((StringBuilder)object2).append(d03.C());
                    ((StringBuilder)object2).append("`");
                    object.internal(((StringBuilder)object2).toString());
                    object = d03;
                }
            }
            return object;
        }
        this.twig.e(this.shutdownState.getShutdownReason(), new Object[0]);
        throw new IOException(this.shutdownState.getShutdownReason());
    }
}

