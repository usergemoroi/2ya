/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000b"}, d2={"Lkotlin/Function1;", "Lgatewayprotocol/v1/TokenCountersKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "-initializetokenCounters", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "tokenCounters", "copy", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "unity-ads_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTokenCountersKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenCountersKt.kt\ngatewayprotocol/v1/TokenCountersKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class TokenCountersKtKt {
    @JvmName(name="-initializetokenCounters")
    @NotNull
    public static final HeaderBiddingTokenOuterClass.TokenCounters -initializetokenCounters(@NotNull l<? super TokenCountersKt.Dsl, k0> l10) {
        y.j(l10, "block");
        Object object = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        y.i(builder, "newBuilder()");
        object = ((TokenCountersKt.Dsl.Companion)object)._create(builder);
        l10.invoke(object);
        return ((TokenCountersKt.Dsl)object)._build();
    }

    @NotNull
    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(@NotNull HeaderBiddingTokenOuterClass.TokenCounters object, @NotNull l<? super TokenCountersKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((HeaderBiddingTokenOuterClass.TokenCounters.Builder)object);
        l10.invoke(object);
        return ((TokenCountersKt.Dsl)object)._build();
    }
}

