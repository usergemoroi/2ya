/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0003#$\"J\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002J\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002J\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u00a8\u0006%"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent;", "", "", "", "getEnvironment", "", "getExtras", "getAttributes", "toString", "", "a", "I", "getType", "()I", "type", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "c", "getValue", "value", "d", "Ljava/lang/Integer;", "getServiceDataReporterType", "()Ljava/lang/Integer;", "serviceDataReporterType", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "e", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "getCategory", "()Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "category", "Companion", "Builder", "Category", "modules-api_release"}, k=1, mv={1, 6, 0})
public final class InternalModuleEvent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int a;
    private final String b;
    private final String c;
    private final Integer d;
    private final Category e;
    private final List f;
    private final List g;
    private final List h;

    private InternalModuleEvent(Builder builder) {
        this.a = builder.getType$modules_api_release();
        this.b = builder.getName();
        this.c = builder.getValue();
        this.d = builder.getServiceDataReporterType();
        this.e = builder.getCategory();
        this.f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.g = CollectionUtils.getListFromMap(builder.getExtras());
        this.h = CollectionUtils.getListFromMap(builder.getAttributes());
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, p p14) {
        this(builder);
    }

    @JvmStatic
    @NotNull
    public static final Builder newBuilder(int n10) {
        return Companion.newBuilder(n10);
    }

    @Nullable
    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.h);
    }

    @Nullable
    public final Category getCategory() {
        return this.e;
    }

    @Nullable
    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f);
    }

    @Nullable
    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.g);
    }

    @Nullable
    public final String getName() {
        return this.b;
    }

    @Nullable
    public final Integer getServiceDataReporterType() {
        return this.d;
    }

    public final int getType() {
        return this.a;
    }

    @Nullable
    public final String getValue() {
        return this.c;
    }

    @NotNull
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

    @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u00a2\u0006\u0004\b=\u0010>J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u001c\u0010\u000f\u001a\u00020\u00002\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rJ\u001c\u0010\u0012\u001a\u00020\u00002\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rJ\u001c\u0010\u0014\u001a\u00020\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rJ\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u001a\u0010\u001b\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106\u00a8\u0006?"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Builder;", "", "", "name", "withName", "value", "withValue", "", "serviceDataReporterType", "withServiceDataReporterType", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "category", "withCategory", "", "environment", "withEnvironment", "", "extras", "withExtras", "attributes", "withAttributes", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent;", "build", "a", "I", "getType$modules_api_release", "()I", "type", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "c", "getValue", "setValue", "d", "Ljava/lang/Integer;", "getServiceDataReporterType", "()Ljava/lang/Integer;", "setServiceDataReporterType", "(Ljava/lang/Integer;)V", "e", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "getCategory", "()Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "setCategory", "(Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;)V", "f", "Ljava/util/Map;", "getEnvironment", "()Ljava/util/Map;", "setEnvironment", "(Ljava/util/Map;)V", "g", "getExtras", "setExtras", "h", "getAttributes", "setAttributes", "<init>", "(I)V", "modules-api_release"}, k=1, mv={1, 6, 0})
    public static final class Builder {
        private final int a;
        private String b;
        private String c;
        private Integer d;
        private Category e;
        private Map f;
        private Map g;
        private Map h;

        public Builder(int n10) {
            this.a = n10;
        }

        @NotNull
        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        @Nullable
        public final Map<String, Object> getAttributes() {
            return this.h;
        }

        @Nullable
        public final Category getCategory() {
            return this.e;
        }

        @Nullable
        public final Map<String, Object> getEnvironment() {
            return this.f;
        }

        @Nullable
        public final Map<String, byte[]> getExtras() {
            return this.g;
        }

        @Nullable
        public final String getName() {
            return this.b;
        }

        @Nullable
        public final Integer getServiceDataReporterType() {
            return this.d;
        }

        public final int getType$modules_api_release() {
            return this.a;
        }

        @Nullable
        public final String getValue() {
            return this.c;
        }

        public final void setAttributes(@Nullable Map<String, ? extends Object> map2) {
            this.h = map2;
        }

        public final void setCategory(@Nullable Category category) {
            this.e = category;
        }

        public final void setEnvironment(@Nullable Map<String, ? extends Object> map2) {
            this.f = map2;
        }

        public final void setExtras(@Nullable Map<String, byte[]> map2) {
            this.g = map2;
        }

        public final void setName(@Nullable String string2) {
            this.b = string2;
        }

        public final void setServiceDataReporterType(@Nullable Integer n10) {
            this.d = n10;
        }

        public final void setValue(@Nullable String string2) {
            this.c = string2;
        }

        @NotNull
        public final Builder withAttributes(@Nullable Map<String, ? extends Object> map2) {
            if (map2 != null) {
                this.h = new HashMap<String, Object>(map2);
            }
            return this;
        }

        @NotNull
        public final Builder withCategory(@NotNull Category category) {
            this.e = category;
            return this;
        }

        @NotNull
        public final Builder withEnvironment(@Nullable Map<String, ? extends Object> map2) {
            if (map2 != null) {
                this.f = new HashMap<String, Object>(map2);
            }
            return this;
        }

        @NotNull
        public final Builder withExtras(@Nullable Map<String, byte[]> map2) {
            if (map2 != null) {
                this.g = new HashMap<String, byte[]>(map2);
            }
            return this;
        }

        @NotNull
        public final Builder withName(@Nullable String string2) {
            this.b = string2;
            return this;
        }

        @NotNull
        public final Builder withServiceDataReporterType(int n10) {
            this.d = n10;
            return this;
        }

        @NotNull
        public final Builder withValue(@Nullable String string2) {
            this.c = string2;
            return this;
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "", "GENERAL", "SYSTEM", "modules-api_release"}, k=1, mv={1, 6, 0})
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

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a8\u0006\u0006"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Companion;", "", "", "type", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Builder;", "newBuilder", "modules-api_release"}, k=1, mv={1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder newBuilder(int n10) {
            return new Builder(n10);
        }
    }
}

