/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0014"}, d2={"Lkotlin/Function1;", "Lgatewayprotocol/v1/RequestPolicyKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "-initializerequestPolicy", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "requestPolicy", "copy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicyOrBuilder;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "getRetryPolicyOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicyOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "retryPolicyOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "getTimeoutPolicyOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicyOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "timeoutPolicyOrNull", "unity-ads_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nRequestPolicyKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestPolicyKt.kt\ngatewayprotocol/v1/RequestPolicyKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class RequestPolicyKtKt {
    @JvmName(name="-initializerequestPolicy")
    @NotNull
    public static final NativeConfigurationOuterClass.RequestPolicy -initializerequestPolicy(@NotNull l<? super RequestPolicyKt.Dsl, k0> l10) {
        y.j(l10, "block");
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        Object object = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        y.i(object, "newBuilder()");
        object = companion._create((NativeConfigurationOuterClass.RequestPolicy.Builder)object);
        l10.invoke(object);
        return ((RequestPolicyKt.Dsl)object)._build();
    }

    @NotNull
    public static final NativeConfigurationOuterClass.RequestPolicy copy(@NotNull NativeConfigurationOuterClass.RequestPolicy object, @NotNull l<? super RequestPolicyKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((NativeConfigurationOuterClass.RequestPolicy.Builder)object);
        l10.invoke(object);
        return ((RequestPolicyKt.Dsl)object)._build();
    }

    @Nullable
    public static final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicyOrNull(@NotNull NativeConfigurationOuterClass.RequestPolicyOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasRetryPolicy() ? object.getRetryPolicy() : null;
        return object;
    }

    @Nullable
    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicyOrNull(@NotNull NativeConfigurationOuterClass.RequestPolicyOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasTimeoutPolicy() ? object.getTimeoutPolicy() : null;
        return object;
    }
}

