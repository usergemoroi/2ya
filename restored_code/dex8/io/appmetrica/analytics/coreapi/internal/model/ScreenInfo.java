/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, d2={"Lio/appmetrica/analytics/coreapi/internal/model/ScreenInfo;", "", "", "component1", "component2", "component3", "", "component4", "width", "height", "dpi", "scaleFactor", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "I", "getWidth", "()I", "b", "getHeight", "c", "getDpi", "d", "F", "getScaleFactor", "()F", "<init>", "(IIIF)V", "core-api_release"}, k=1, mv={1, 6, 0})
public final class ScreenInfo {
    private final int a;
    private final int b;
    private final int c;
    private final float d;

    public ScreenInfo(int n10, int n13, int n14, float f11) {
        this.a = n10;
        this.b = n13;
        this.c = n14;
        this.d = f11;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int n10, int n13, int n14, float f11, int n15, Object object) {
        if ((n15 & 1) != 0) {
            n10 = screenInfo.a;
        }
        if ((n15 & 2) != 0) {
            n13 = screenInfo.b;
        }
        if ((n15 & 4) != 0) {
            n14 = screenInfo.c;
        }
        if ((n15 & 8) != 0) {
            f11 = screenInfo.d;
        }
        return screenInfo.copy(n10, n13, n14, f11);
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final float component4() {
        return this.d;
    }

    @NotNull
    public final ScreenInfo copy(int n10, int n13, int n14, float f11) {
        return new ScreenInfo(n10, n13, n14, f11);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ScreenInfo)) {
            return false;
        }
        object = (ScreenInfo)object;
        if (this.a != ((ScreenInfo)object).a) {
            return false;
        }
        if (this.b != ((ScreenInfo)object).b) {
            return false;
        }
        if (this.c != ((ScreenInfo)object).c) {
            return false;
        }
        return y.e(Float.valueOf(this.d), Float.valueOf(((ScreenInfo)object).d));
    }

    public final int getDpi() {
        return this.c;
    }

    public final int getHeight() {
        return this.b;
    }

    public final float getScaleFactor() {
        return this.d;
    }

    public final int getWidth() {
        return this.a;
    }

    public int hashCode() {
        int n10 = this.a;
        int n13 = this.b;
        int n14 = this.c;
        return Float.floatToIntBits(this.d) + (n14 + (n13 + n10 * 31) * 31) * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScreenInfo(width=");
        stringBuilder.append(this.a);
        stringBuilder.append(", height=");
        stringBuilder.append(this.b);
        stringBuilder.append(", dpi=");
        stringBuilder.append(this.c);
        stringBuilder.append(", scaleFactor=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

