/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2={"Lio/intercom/android/sdk/IntercomError;", "", "errorCode", "", "errorMessage", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
@StabilityInferred(parameters=0)
public final class IntercomError {
    public static final int $stable = 0;
    private final int errorCode;
    @NotNull
    private final String errorMessage;

    public IntercomError() {
        this(0, null, 3, null);
    }

    public IntercomError(int n10, @NotNull String string2) {
        y.j(string2, "errorMessage");
        this.errorCode = n10;
        this.errorMessage = string2;
    }

    public /* synthetic */ IntercomError(int n10, String string2, int n13, p p14) {
        if ((n13 & 1) != 0) {
            n10 = 0;
        }
        if ((n13 & 2) != 0) {
            string2 = "";
        }
        this(n10, string2);
    }

    public static /* synthetic */ IntercomError copy$default(IntercomError intercomError, int n10, String string2, int n13, Object object) {
        if ((n13 & 1) != 0) {
            n10 = intercomError.errorCode;
        }
        if ((n13 & 2) != 0) {
            string2 = intercomError.errorMessage;
        }
        return intercomError.copy(n10, string2);
    }

    public final int component1() {
        return this.errorCode;
    }

    @NotNull
    public final String component2() {
        return this.errorMessage;
    }

    @NotNull
    public final IntercomError copy(int n10, @NotNull String string2) {
        y.j(string2, "errorMessage");
        return new IntercomError(n10, string2);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof IntercomError)) {
            return false;
        }
        object = (IntercomError)object;
        if (this.errorCode != ((IntercomError)object).errorCode) {
            return false;
        }
        return y.e(this.errorMessage, ((IntercomError)object).errorMessage);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorCode * 31 + this.errorMessage.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntercomError(errorCode=");
        stringBuilder.append(this.errorCode);
        stringBuilder.append(", errorMessage=");
        stringBuilder.append(this.errorMessage);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

