/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.helpcenter.utils;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2={"Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;", "", "()V", "isEligibleUser", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
public final class HelpCenterEligibilityChecker {
    @NotNull
    public static final HelpCenterEligibilityChecker INSTANCE = new HelpCenterEligibilityChecker();

    private HelpCenterEligibilityChecker() {
    }

    public final boolean isEligibleUser() {
        boolean bl2;
        Twig twig = LumberMill.getLogger();
        UserIdentity userIdentity = Injector.get().getUserIdentity();
        if (userIdentity.identityExists() && !userIdentity.isSoftReset()) {
            bl2 = true;
        } else {
            twig.e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayHelpCenter().", new Object[0]);
            bl2 = false;
        }
        return bl2;
    }
}

