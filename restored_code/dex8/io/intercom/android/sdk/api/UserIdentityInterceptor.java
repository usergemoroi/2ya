/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.w;

class UserIdentityInterceptor
implements w {
    private static final String NO_USER_IDENTITY = "A network request was made with no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).";
    private static final String USER_IDENTITY_CHANGED = "registered user changed while this request was in flight";
    private final Twig twig = LumberMill.getLogger();
    private final UserIdentity userIdentity;

    public UserIdentityInterceptor(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Override
    public d0 intercept(w.a object) throws IOException {
        if (this.userIdentity.identityExists()) {
            String string2 = this.userIdentity.getFingerprint();
            object = object.proceed(object.request());
            if (string2.equals(this.userIdentity.getFingerprint())) {
                this.twig.internal("interceptor", "proceeding");
                return object;
            }
            this.twig.internal("interceptor", "halting: user identity changed");
            if (object != null) {
                ((d0)object).d().close();
            }
            throw new IOException(USER_IDENTITY_CHANGED);
        }
        if (this.userIdentity.isSoftReset() && object.request().k().toString().contains("device_tokens") && object.request().h().equals("PUT")) {
            this.twig.internal("interceptor", "removing device token - proceeding");
            return object.proceed(object.request());
        }
        throw new IOException(NO_USER_IDENTITY);
    }
}

