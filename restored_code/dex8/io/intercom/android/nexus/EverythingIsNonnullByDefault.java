/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.nexus;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

@Documented
@Retention(value=RetentionPolicy.SOURCE)
@Nonnull
@TypeQualifierDefault(value={ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@interface EverythingIsNonnullByDefault {
}

