/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import java.util.LinkedList;
import java.util.List;

public class UserProfile {
    private final List a;

    private UserProfile(LinkedList linkedList) {
        this.a = CollectionUtils.unmodifiableListCopy(linkedList);
    }

    /* synthetic */ UserProfile(LinkedList linkedList, int n10) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends ko>> getUserProfileUpdates() {
        return this.a;
    }

    public static class Builder {
        private final LinkedList a = new LinkedList();

        private Builder() {
        }

        /* synthetic */ Builder(int n10) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends ko> userProfileUpdate) {
            this.a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.a, 0);
        }
    }
}

