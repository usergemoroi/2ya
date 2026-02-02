/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.google.auto.value.AutoValue
 */
package io.intercom.android.sdk.blocks.lib.models;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.blocks.lib.models.AutoValue_BlockMetadata;
import io.intercom.android.sdk.models.carousel.Appearance;
import io.intercom.android.sdk.utilities.NullSafety;

@AutoValue
public abstract class BlockMetadata {
    public static BlockMetadata NULL = new Builder().build();

    static BlockMetadata create(boolean bl2, boolean bl3, Appearance appearance) {
        return new AutoValue_BlockMetadata(bl2, bl3, appearance);
    }

    public abstract Appearance getAppearance();

    public abstract boolean isFirstObject();

    public abstract boolean isLastObject();

    public boolean isSingleObject() {
        boolean bl2 = this.isFirstObject() && this.isLastObject();
        return bl2;
    }

    public static final class Builder {
        @Nullable
        Appearance.Builder appearance;
        @Nullable
        Boolean isFirstObject;
        @Nullable
        Boolean isLastObject;

        public BlockMetadata build() {
            Object object = this.appearance;
            object = object == null ? Appearance.NULL : ((Appearance.Builder)object).build();
            return BlockMetadata.create(NullSafety.valueOrDefault(this.isFirstObject, false), NullSafety.valueOrDefault(this.isLastObject, false), (Appearance)object);
        }

        public Builder isFirstObject(Boolean bl2) {
            this.isFirstObject = bl2;
            return this;
        }

        public Builder isLastObject(Boolean bl2) {
            this.isLastObject = bl2;
            return this;
        }

        public Builder withAppearance(Appearance.Builder builder) {
            this.appearance = builder;
            return this;
        }
    }
}

