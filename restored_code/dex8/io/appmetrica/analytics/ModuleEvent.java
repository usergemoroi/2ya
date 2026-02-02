/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ModuleEvent {
    private final int a;
    private final String b;
    private final String c;
    private final int d;
    private final Category e;
    private final List f;
    private final List g;
    private final List h;

    private ModuleEvent(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = CollectionUtils.getListFromMap(builder.f);
        this.g = CollectionUtils.getListFromMap(builder.g);
        this.h = CollectionUtils.getListFromMap(builder.h);
    }

    /* synthetic */ ModuleEvent(Builder builder, int n10) {
        this(builder);
    }

    public static Builder newBuilder(int n10) {
        return new Builder(n10, 0);
    }

    @Nullable
    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.h);
    }

    public Category getCategory() {
        return this.e;
    }

    @Nullable
    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f);
    }

    @Nullable
    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.g);
    }

    @Nullable
    public String getName() {
        return this.b;
    }

    public int getServiceDataReporterType() {
        return this.d;
    }

    public int getType() {
        return this.a;
    }

    @Nullable
    public String getValue() {
        return this.c;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ModuleEvent{type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", name='");
        stringBuilder.append(this.b);
        stringBuilder.append("', value='");
        stringBuilder.append(this.c);
        stringBuilder.append("', serviceDataReporterType=");
        stringBuilder.append(this.d);
        stringBuilder.append(", category=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(", environment=");
        stringBuilder.append(this.f);
        stringBuilder.append(", extras=");
        stringBuilder.append(this.g);
        stringBuilder.append(", attributes=");
        stringBuilder.append(this.h);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class Builder {
        private final int a;
        private String b;
        private String c;
        private int d = 1;
        private Category e = Category.GENERAL;
        private HashMap f;
        private HashMap g;
        private HashMap h;

        private Builder(int n10) {
            this.a = n10;
        }

        /* synthetic */ Builder(int n10, int n13) {
            this(n10);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(@Nullable Map<String, Object> map2) {
            if (map2 != null) {
                this.h = new HashMap<String, Object>(map2);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.e = category;
            return this;
        }

        public Builder withEnvironment(@Nullable Map<String, Object> map2) {
            if (map2 != null) {
                this.f = new HashMap<String, Object>(map2);
            }
            return this;
        }

        public Builder withExtras(@Nullable Map<String, byte[]> map2) {
            if (map2 != null) {
                this.g = new HashMap<String, byte[]>(map2);
            }
            return this;
        }

        public Builder withName(@Nullable String string2) {
            this.b = string2;
            return this;
        }

        public Builder withServiceDataReporterType(int n10) {
            this.d = n10;
            return this;
        }

        public Builder withValue(@Nullable String string2) {
            this.c = string2;
            return this;
        }
    }

    public static final class Category
    extends Enum<Category> {
        public static final /* enum */ Category GENERAL;
        public static final /* enum */ Category SYSTEM;
        private static final Category[] a;

        static {
            Category category;
            Category category2;
            GENERAL = category2 = new Category();
            SYSTEM = category = new Category();
            a = new Category[]{category2, category};
        }

        public static Category valueOf(String string2) {
            return Enum.valueOf(Category.class, string2);
        }

        public static Category[] values() {
            return (Category[])a.clone();
        }
    }
}

