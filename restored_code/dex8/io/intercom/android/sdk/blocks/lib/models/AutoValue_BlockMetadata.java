/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks.lib.models;

import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.models.carousel.Appearance;

final class AutoValue_BlockMetadata
extends BlockMetadata {
    private final Appearance appearance;
    private final boolean firstObject;
    private final boolean lastObject;

    AutoValue_BlockMetadata(boolean bl2, boolean bl3, Appearance appearance) {
        this.firstObject = bl2;
        this.lastObject = bl3;
        if (appearance != null) {
            this.appearance = appearance;
            return;
        }
        throw new NullPointerException("Null appearance");
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (object instanceof BlockMetadata) {
            if (this.firstObject != ((BlockMetadata)(object = (BlockMetadata)object)).isFirstObject() || this.lastObject != ((BlockMetadata)object).isLastObject() || !this.appearance.equals(((BlockMetadata)object).getAppearance())) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public Appearance getAppearance() {
        return this.appearance;
    }

    public int hashCode() {
        boolean bl2 = this.firstObject;
        int n10 = 1237;
        int n13 = bl2 ? 1231 : 1237;
        if (this.lastObject) {
            n10 = 1231;
        }
        return ((n13 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ this.appearance.hashCode();
    }

    @Override
    public boolean isFirstObject() {
        return this.firstObject;
    }

    @Override
    public boolean isLastObject() {
        return this.lastObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BlockMetadata{firstObject=");
        stringBuilder.append(this.firstObject);
        stringBuilder.append(", lastObject=");
        stringBuilder.append(this.lastObject);
        stringBuilder.append(", appearance=");
        stringBuilder.append(this.appearance);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

