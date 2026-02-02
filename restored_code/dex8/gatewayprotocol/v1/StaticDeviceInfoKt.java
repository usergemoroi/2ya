/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.kotlin.DslList
 *  com.google.protobuf.kotlin.DslProxy
 *  com.google.protobuf.kotlin.ProtoDslMarker
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J,\u0010\n\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\b\u0005H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\tJ,\u0010\u000f\u001a\u00020\f2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\b\u0005H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0015"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt;", "", "Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "-initializeandroid", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "android", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "-initializeios", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "ios", "<init>", "()V", "AndroidKt", "Dsl", "IosKt", "unity-ads_release"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nStaticDeviceInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticDeviceInfoKt.kt\ngatewayprotocol/v1/StaticDeviceInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1343:1\n1#2:1344\n*E\n"})
public final class StaticDeviceInfoKt {
    @NotNull
    public static final StaticDeviceInfoKt INSTANCE = new StaticDeviceInfoKt();

    private StaticDeviceInfoKt() {
    }

    @JvmName(name="-initializeandroid")
    @NotNull
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android -initializeandroid(@NotNull l<? super AndroidKt.Dsl, k0> l10) {
        y.j(l10, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.Companion;
        Object object = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        y.i(object, "newBuilder()");
        object = companion._create((StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder)object);
        l10.invoke(object);
        return ((AndroidKt.Dsl)object)._build();
    }

    @JvmName(name="-initializeios")
    @NotNull
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios -initializeios(@NotNull l<? super IosKt.Dsl, k0> l10) {
        y.j(l10, "block");
        Object object = IosKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder();
        y.i(builder, "newBuilder()");
        object = ((IosKt.Dsl.Companion)object)._create(builder);
        l10.invoke(object);
        return ((IosKt.Dsl)object)._build();
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class AndroidKt {
        @NotNull
        public static final AndroidKt INSTANCE = new AndroidKt();

        private AndroidKt() {
        }

        @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b6\b\u0007\u0018\u0000 o2\u00020\u0001:\u0001oB\u0011\b\u0002\u0012\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\bm\u0010nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000e\u001a\u00020\b\u00a2\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0007J\r\u0010\u0010\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0012\u001a\u00020\b\u00a2\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0013\u0010\u0007J\r\u0010\u0014\u001a\u00020\b\u00a2\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0015\u0010\u0007J\r\u0010\u0016\u001a\u00020\b\u00a2\u0006\u0004\b\u0016\u0010\nJ\r\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0017\u0010\u0007J\r\u0010\u0018\u001a\u00020\b\u00a2\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0019\u0010\u0007J\r\u0010\u001a\u001a\u00020\b\u00a2\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001b\u0010\u0007J\r\u0010\u001c\u001a\u00020\b\u00a2\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001d\u0010\u0007J\r\u0010\u001e\u001a\u00020\b\u00a2\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001f\u0010\u0007J\r\u0010 \u001a\u00020\b\u00a2\u0006\u0004\b \u0010\nJ\r\u0010!\u001a\u00020\u0005\u00a2\u0006\u0004\b!\u0010\u0007J\r\u0010\"\u001a\u00020\b\u00a2\u0006\u0004\b\"\u0010\nJ\r\u0010#\u001a\u00020\u0005\u00a2\u0006\u0004\b#\u0010\u0007J\r\u0010$\u001a\u00020\b\u00a2\u0006\u0004\b$\u0010\nJ\r\u0010%\u001a\u00020\u0005\u00a2\u0006\u0004\b%\u0010\u0007J\r\u0010&\u001a\u00020\b\u00a2\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\u0005\u00a2\u0006\u0004\b'\u0010\u0007J\r\u0010(\u001a\u00020\b\u00a2\u0006\u0004\b(\u0010\nJ\r\u0010)\u001a\u00020\u0005\u00a2\u0006\u0004\b)\u0010\u0007J\r\u0010*\u001a\u00020\b\u00a2\u0006\u0004\b*\u0010\nJ\r\u0010+\u001a\u00020\u0005\u00a2\u0006\u0004\b+\u0010\u0007J\r\u0010,\u001a\u00020\b\u00a2\u0006\u0004\b,\u0010\nR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010/R$\u00106\u001a\u0002002\u0006\u00101\u001a\u0002008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00109\u001a\u0002002\u0006\u00101\u001a\u0002008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105R$\u0010?\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010B\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R$\u0010E\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R$\u0010H\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R$\u0010K\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R$\u0010N\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R$\u0010Q\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010<\"\u0004\bP\u0010>R$\u0010T\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010<\"\u0004\bS\u0010>R$\u0010W\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010<\"\u0004\bV\u0010>R$\u0010Z\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010<\"\u0004\bY\u0010>R$\u0010]\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010<\"\u0004\b\\\u0010>R$\u0010`\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R$\u0010c\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010<\"\u0004\bb\u0010>R$\u0010f\u001a\u0002002\u0006\u00101\u001a\u0002008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bd\u00103\"\u0004\be\u00105R$\u0010i\u001a\u0002002\u0006\u00101\u001a\u0002008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bg\u00103\"\u0004\bh\u00105R$\u0010l\u001a\u00020:2\u0006\u00101\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bj\u0010<\"\u0004\bk\u0010>\u00a8\u0006p"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lkotlin/k0;", "clearApiLevel", "()V", "", "hasApiLevel", "()Z", "clearVersionCode", "hasVersionCode", "clearAndroidFingerprint", "hasAndroidFingerprint", "clearAppInstaller", "hasAppInstaller", "clearApkDeveloperSigningCertificateHash", "hasApkDeveloperSigningCertificateHash", "clearBuildBoard", "hasBuildBoard", "clearBuildBrand", "hasBuildBrand", "clearBuildDevice", "hasBuildDevice", "clearBuildDisplay", "hasBuildDisplay", "clearBuildFingerprint", "hasBuildFingerprint", "clearBuildHardware", "hasBuildHardware", "clearBuildHost", "hasBuildHost", "clearBuildBootloader", "hasBuildBootloader", "clearBuildProduct", "hasBuildProduct", "clearBuildId", "hasBuildId", "clearExtensionVersion", "hasExtensionVersion", "clearPhoneType", "hasPhoneType", "clearSimOperator", "hasSimOperator", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "", "value", "getApiLevel", "()I", "setApiLevel", "(I)V", "apiLevel", "getVersionCode", "setVersionCode", "versionCode", "", "getAndroidFingerprint", "()Ljava/lang/String;", "setAndroidFingerprint", "(Ljava/lang/String;)V", "androidFingerprint", "getAppInstaller", "setAppInstaller", "appInstaller", "getApkDeveloperSigningCertificateHash", "setApkDeveloperSigningCertificateHash", "apkDeveloperSigningCertificateHash", "getBuildBoard", "setBuildBoard", "buildBoard", "getBuildBrand", "setBuildBrand", "buildBrand", "getBuildDevice", "setBuildDevice", "buildDevice", "getBuildDisplay", "setBuildDisplay", "buildDisplay", "getBuildFingerprint", "setBuildFingerprint", "buildFingerprint", "getBuildHardware", "setBuildHardware", "buildHardware", "getBuildHost", "setBuildHost", "buildHost", "getBuildBootloader", "setBuildBootloader", "buildBootloader", "getBuildProduct", "setBuildProduct", "buildProduct", "getBuildId", "setBuildId", "buildId", "getExtensionVersion", "setExtensionVersion", "extensionVersion", "getPhoneType", "setPhoneType", "phoneType", "getSimOperator", "setSimOperator", "simOperator", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
        @ProtoDslMarker
        public static final class Dsl {
            @NotNull
            public static final Companion Companion = new Companion(null);
            @NotNull
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, p p14) {
                this(builder);
            }

            @PublishedApi
            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                GeneratedMessageLite generatedMessageLite = this._builder.build();
                y.i(generatedMessageLite, "_builder.build()");
                return (StaticDeviceInfoOuterClass.StaticDeviceInfo.Android)generatedMessageLite;
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            @JvmName(name="getAndroidFingerprint")
            @NotNull
            public final String getAndroidFingerprint() {
                String string2 = this._builder.getAndroidFingerprint();
                y.i(string2, "_builder.getAndroidFingerprint()");
                return string2;
            }

            @JvmName(name="getApiLevel")
            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            @JvmName(name="getApkDeveloperSigningCertificateHash")
            @NotNull
            public final String getApkDeveloperSigningCertificateHash() {
                String string2 = this._builder.getApkDeveloperSigningCertificateHash();
                y.i(string2, "_builder.getApkDeveloperSigningCertificateHash()");
                return string2;
            }

            @JvmName(name="getAppInstaller")
            @NotNull
            public final String getAppInstaller() {
                String string2 = this._builder.getAppInstaller();
                y.i(string2, "_builder.getAppInstaller()");
                return string2;
            }

            @JvmName(name="getBuildBoard")
            @NotNull
            public final String getBuildBoard() {
                String string2 = this._builder.getBuildBoard();
                y.i(string2, "_builder.getBuildBoard()");
                return string2;
            }

            @JvmName(name="getBuildBootloader")
            @NotNull
            public final String getBuildBootloader() {
                String string2 = this._builder.getBuildBootloader();
                y.i(string2, "_builder.getBuildBootloader()");
                return string2;
            }

            @JvmName(name="getBuildBrand")
            @NotNull
            public final String getBuildBrand() {
                String string2 = this._builder.getBuildBrand();
                y.i(string2, "_builder.getBuildBrand()");
                return string2;
            }

            @JvmName(name="getBuildDevice")
            @NotNull
            public final String getBuildDevice() {
                String string2 = this._builder.getBuildDevice();
                y.i(string2, "_builder.getBuildDevice()");
                return string2;
            }

            @JvmName(name="getBuildDisplay")
            @NotNull
            public final String getBuildDisplay() {
                String string2 = this._builder.getBuildDisplay();
                y.i(string2, "_builder.getBuildDisplay()");
                return string2;
            }

            @JvmName(name="getBuildFingerprint")
            @NotNull
            public final String getBuildFingerprint() {
                String string2 = this._builder.getBuildFingerprint();
                y.i(string2, "_builder.getBuildFingerprint()");
                return string2;
            }

            @JvmName(name="getBuildHardware")
            @NotNull
            public final String getBuildHardware() {
                String string2 = this._builder.getBuildHardware();
                y.i(string2, "_builder.getBuildHardware()");
                return string2;
            }

            @JvmName(name="getBuildHost")
            @NotNull
            public final String getBuildHost() {
                String string2 = this._builder.getBuildHost();
                y.i(string2, "_builder.getBuildHost()");
                return string2;
            }

            @JvmName(name="getBuildId")
            @NotNull
            public final String getBuildId() {
                String string2 = this._builder.getBuildId();
                y.i(string2, "_builder.getBuildId()");
                return string2;
            }

            @JvmName(name="getBuildProduct")
            @NotNull
            public final String getBuildProduct() {
                String string2 = this._builder.getBuildProduct();
                y.i(string2, "_builder.getBuildProduct()");
                return string2;
            }

            @JvmName(name="getExtensionVersion")
            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            @JvmName(name="getPhoneType")
            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            @JvmName(name="getSimOperator")
            @NotNull
            public final String getSimOperator() {
                String string2 = this._builder.getSimOperator();
                y.i(string2, "_builder.getSimOperator()");
                return string2;
            }

            @JvmName(name="getVersionCode")
            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            @JvmName(name="setAndroidFingerprint")
            public final void setAndroidFingerprint(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setAndroidFingerprint(string2);
            }

            @JvmName(name="setApiLevel")
            public final void setApiLevel(int n10) {
                this._builder.setApiLevel(n10);
            }

            @JvmName(name="setApkDeveloperSigningCertificateHash")
            public final void setApkDeveloperSigningCertificateHash(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setApkDeveloperSigningCertificateHash(string2);
            }

            @JvmName(name="setAppInstaller")
            public final void setAppInstaller(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setAppInstaller(string2);
            }

            @JvmName(name="setBuildBoard")
            public final void setBuildBoard(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildBoard(string2);
            }

            @JvmName(name="setBuildBootloader")
            public final void setBuildBootloader(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildBootloader(string2);
            }

            @JvmName(name="setBuildBrand")
            public final void setBuildBrand(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildBrand(string2);
            }

            @JvmName(name="setBuildDevice")
            public final void setBuildDevice(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildDevice(string2);
            }

            @JvmName(name="setBuildDisplay")
            public final void setBuildDisplay(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildDisplay(string2);
            }

            @JvmName(name="setBuildFingerprint")
            public final void setBuildFingerprint(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildFingerprint(string2);
            }

            @JvmName(name="setBuildHardware")
            public final void setBuildHardware(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildHardware(string2);
            }

            @JvmName(name="setBuildHost")
            public final void setBuildHost(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildHost(string2);
            }

            @JvmName(name="setBuildId")
            public final void setBuildId(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildId(string2);
            }

            @JvmName(name="setBuildProduct")
            public final void setBuildProduct(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuildProduct(string2);
            }

            @JvmName(name="setExtensionVersion")
            public final void setExtensionVersion(int n10) {
                this._builder.setExtensionVersion(n10);
            }

            @JvmName(name="setPhoneType")
            public final void setPhoneType(int n10) {
                this._builder.setPhoneType(n10);
            }

            @JvmName(name="setSimOperator")
            public final void setSimOperator(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setSimOperator(string2);
            }

            @JvmName(name="setVersionCode")
            public final void setVersionCode(int n10) {
                this._builder.setVersionCode(n10);
            }

            @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(p p14) {
                    this();
                }

                @PublishedApi
                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    y.j(builder, "builder");
                    return new Dsl(builder, null);
                }
            }
        }
    }

    @Metadata(d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u009f\u00012\u00020\u0001:\u0004\u009f\u0001\u00a0\u0001B\u0013\b\u0002\u0012\u0006\u0010J\u001a\u00020I\u00a2\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000e\u001a\u00020\b\u00a2\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0007J\r\u0010\u0010\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0012\u001a\u00020\b\u00a2\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0013\u0010\u0007J\r\u0010\u0014\u001a\u00020\b\u00a2\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0015\u0010\u0007J\r\u0010\u0016\u001a\u00020\b\u00a2\u0006\u0004\b\u0016\u0010\nJ\r\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0017\u0010\u0007J\r\u0010\u0018\u001a\u00020\b\u00a2\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0019\u0010\u0007J\r\u0010\u001a\u001a\u00020\b\u00a2\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001b\u0010\u0007J\r\u0010\u001c\u001a\u00020\b\u00a2\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001d\u0010\u0007J\r\u0010\u001e\u001a\u00020\b\u00a2\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001f\u0010\u0007J\r\u0010 \u001a\u00020\b\u00a2\u0006\u0004\b \u0010\nJ'\u0010'\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\u0006\u0010$\u001a\u00020\"H\u0007\u00a2\u0006\u0004\b%\u0010&J(\u0010)\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\u0006\u0010$\u001a\u00020\"H\u0087\n\u00a2\u0006\u0004\b(\u0010&J-\u0010.\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0007\u00a2\u0006\u0004\b,\u0010-J.\u0010)\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0087\n\u00a2\u0006\u0004\b/\u0010-J0\u00104\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\u0006\u00101\u001a\u0002002\u0006\u0010$\u001a\u00020\"H\u0087\u0002\u00a2\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0007\u00a2\u0006\u0004\b5\u00106J\r\u00108\u001a\u00020\u0005\u00a2\u0006\u0004\b8\u0010\u0007J\r\u00109\u001a\u00020\b\u00a2\u0006\u0004\b9\u0010\nJ\r\u0010:\u001a\u00020\u0005\u00a2\u0006\u0004\b:\u0010\u0007J\r\u0010;\u001a\u00020\b\u00a2\u0006\u0004\b;\u0010\nJ\r\u0010<\u001a\u00020\u0005\u00a2\u0006\u0004\b<\u0010\u0007J\r\u0010=\u001a\u00020\b\u00a2\u0006\u0004\b=\u0010\nJ\r\u0010>\u001a\u00020\u0005\u00a2\u0006\u0004\b>\u0010\u0007J\r\u0010?\u001a\u00020\b\u00a2\u0006\u0004\b?\u0010\nJ\r\u0010@\u001a\u00020\u0005\u00a2\u0006\u0004\b@\u0010\u0007J\r\u0010A\u001a\u00020\b\u00a2\u0006\u0004\bA\u0010\nJ\r\u0010B\u001a\u00020\u0005\u00a2\u0006\u0004\bB\u0010\u0007J\r\u0010C\u001a\u00020\b\u00a2\u0006\u0004\bC\u0010\nJ\r\u0010D\u001a\u00020\u0005\u00a2\u0006\u0004\bD\u0010\u0007J\r\u0010E\u001a\u00020\b\u00a2\u0006\u0004\bE\u0010\nJ\r\u0010F\u001a\u00020\u0005\u00a2\u0006\u0004\bF\u0010\u0007J\r\u0010G\u001a\u00020\b\u00a2\u0006\u0004\bG\u0010\nJ\r\u0010H\u001a\u00020\u0005\u00a2\u0006\u0004\bH\u0010\u0007R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010KR$\u0010P\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010S\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR$\u0010W\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bT\u0010\n\"\u0004\bU\u0010VR$\u0010Z\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010\n\"\u0004\bY\u0010VR$\u0010]\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010M\"\u0004\b\\\u0010OR$\u0010`\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b^\u0010M\"\u0004\b_\u0010OR$\u0010c\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010M\"\u0004\bb\u0010OR$\u0010f\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bd\u0010M\"\u0004\be\u0010OR$\u0010k\u001a\u0002002\u0006\u0010$\u001a\u0002008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010n\u001a\u0002002\u0006\u0010$\u001a\u0002008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR$\u0010q\u001a\u0002002\u0006\u0010$\u001a\u0002008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bo\u0010h\"\u0004\bp\u0010jR$\u0010t\u001a\u0002002\u0006\u0010$\u001a\u0002008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\br\u0010h\"\u0004\bs\u0010jR\u001d\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!8F\u00a2\u0006\u0006\u001a\u0004\bu\u0010vR$\u0010}\u001a\u00020x2\u0006\u0010$\u001a\u00020x8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R%\u0010\u0080\u0001\u001a\u00020x2\u0006\u0010$\u001a\u00020x8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b~\u0010z\"\u0004\b\u007f\u0010|R'\u0010\u0083\u0001\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"8G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010M\"\u0005\b\u0082\u0001\u0010OR'\u0010\u0086\u0001\u001a\u00020x2\u0006\u0010$\u001a\u00020x8G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010z\"\u0005\b\u0085\u0001\u0010|R'\u0010\u0089\u0001\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"8G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010M\"\u0005\b\u0088\u0001\u0010OR+\u0010\u008f\u0001\u001a\u00030\u008a\u00012\u0007\u0010$\u001a\u00030\u008a\u00018G@GX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R+\u0010\u0095\u0001\u001a\u00030\u0090\u00012\u0007\u0010$\u001a\u00030\u0090\u00018G@GX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R'\u0010\u0098\u0001\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010\n\"\u0005\b\u0097\u0001\u0010VR\u0015\u0010\u009c\u0001\u001a\u00030\u0099\u00018G\u00a2\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\u00a8\u0006\u00a1\u0001"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "Lkotlin/k0;", "clearBundleId", "()V", "", "hasBundleId", "()Z", "clearBundleVersion", "hasBundleVersion", "clearAppDebuggable", "hasAppDebuggable", "clearRooted", "hasRooted", "clearOsVersion", "hasOsVersion", "clearDeviceMake", "hasDeviceMake", "clearDeviceModel", "hasDeviceModel", "clearWebviewUa", "hasWebviewUa", "clearScreenDensity", "hasScreenDensity", "clearScreenWidth", "hasScreenWidth", "clearScreenHeight", "hasScreenHeight", "clearScreenSize", "hasScreenSize", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", "value", "addStores", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignStores", "plusAssign", "", "values", "addAllStores", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllStores", "", "index", "setStores", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearStores", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearTotalDiskSpace", "hasTotalDiskSpace", "clearTotalRamMemory", "hasTotalRamMemory", "clearCpuModel", "hasCpuModel", "clearCpuCount", "hasCpuCount", "clearGpuModel", "hasGpuModel", "clearAndroid", "hasAndroid", "clearIos", "hasIos", "clearMadeWithUnity", "hasMadeWithUnity", "clearPlatformSpecific", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "bundleId", "getBundleVersion", "setBundleVersion", "bundleVersion", "getAppDebuggable", "setAppDebuggable", "(Z)V", "appDebuggable", "getRooted", "setRooted", "rooted", "getOsVersion", "setOsVersion", "osVersion", "getDeviceMake", "setDeviceMake", "deviceMake", "getDeviceModel", "setDeviceModel", "deviceModel", "getWebviewUa", "setWebviewUa", "webviewUa", "getScreenDensity", "()I", "setScreenDensity", "(I)V", "screenDensity", "getScreenWidth", "setScreenWidth", "screenWidth", "getScreenHeight", "setScreenHeight", "screenHeight", "getScreenSize", "setScreenSize", "screenSize", "getStores", "()Lcom/google/protobuf/kotlin/DslList;", "stores", "", "getTotalDiskSpace", "()J", "setTotalDiskSpace", "(J)V", "totalDiskSpace", "getTotalRamMemory", "setTotalRamMemory", "totalRamMemory", "getCpuModel", "setCpuModel", "cpuModel", "getCpuCount", "setCpuCount", "cpuCount", "getGpuModel", "setGpuModel", "gpuModel", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "getAndroid", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;)V", "android", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "getIos", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;)V", "ios", "getMadeWithUnity", "setMadeWithUnity", "madeWithUnity", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "platformSpecificCase", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;)V", "Companion", "StoresProxy", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (StaticDeviceInfoOuterClass.StaticDeviceInfo)generatedMessageLite;
        }

        @JvmName(name="addAllStores")
        public final /* synthetic */ void addAllStores(DslList dslList, Iterable iterable) {
            y.j(dslList, "<this>");
            y.j(iterable, "values");
            this._builder.addAllStores(iterable);
        }

        @JvmName(name="addStores")
        public final /* synthetic */ void addStores(DslList dslList, String string2) {
            y.j(dslList, "<this>");
            y.j(string2, "value");
            this._builder.addStores(string2);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearMadeWithUnity() {
            this._builder.clearMadeWithUnity();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        @JvmName(name="clearStores")
        public final /* synthetic */ void clearStores(DslList dslList) {
            y.j(dslList, "<this>");
            this._builder.clearStores();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        @JvmName(name="getAndroid")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android = this._builder.getAndroid();
            y.i(android, "_builder.getAndroid()");
            return android;
        }

        @JvmName(name="getAppDebuggable")
        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        @JvmName(name="getBundleId")
        @NotNull
        public final String getBundleId() {
            String string2 = this._builder.getBundleId();
            y.i(string2, "_builder.getBundleId()");
            return string2;
        }

        @JvmName(name="getBundleVersion")
        @NotNull
        public final String getBundleVersion() {
            String string2 = this._builder.getBundleVersion();
            y.i(string2, "_builder.getBundleVersion()");
            return string2;
        }

        @JvmName(name="getCpuCount")
        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        @JvmName(name="getCpuModel")
        @NotNull
        public final String getCpuModel() {
            String string2 = this._builder.getCpuModel();
            y.i(string2, "_builder.getCpuModel()");
            return string2;
        }

        @JvmName(name="getDeviceMake")
        @NotNull
        public final String getDeviceMake() {
            String string2 = this._builder.getDeviceMake();
            y.i(string2, "_builder.getDeviceMake()");
            return string2;
        }

        @JvmName(name="getDeviceModel")
        @NotNull
        public final String getDeviceModel() {
            String string2 = this._builder.getDeviceModel();
            y.i(string2, "_builder.getDeviceModel()");
            return string2;
        }

        @JvmName(name="getGpuModel")
        @NotNull
        public final String getGpuModel() {
            String string2 = this._builder.getGpuModel();
            y.i(string2, "_builder.getGpuModel()");
            return string2;
        }

        @JvmName(name="getIos")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = this._builder.getIos();
            y.i(ios, "_builder.getIos()");
            return ios;
        }

        @JvmName(name="getMadeWithUnity")
        public final boolean getMadeWithUnity() {
            return this._builder.getMadeWithUnity();
        }

        @JvmName(name="getOsVersion")
        @NotNull
        public final String getOsVersion() {
            String string2 = this._builder.getOsVersion();
            y.i(string2, "_builder.getOsVersion()");
            return string2;
        }

        @JvmName(name="getPlatformSpecificCase")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            y.i((Object)platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        @JvmName(name="getRooted")
        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        @JvmName(name="getScreenDensity")
        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        @JvmName(name="getScreenHeight")
        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        @JvmName(name="getScreenSize")
        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        @JvmName(name="getScreenWidth")
        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        @NotNull
        public final DslList<String, StoresProxy> getStores() {
            List<String> list = this._builder.getStoresList();
            y.i(list, "_builder.getStoresList()");
            return new DslList(list);
        }

        @JvmName(name="getTotalDiskSpace")
        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        @JvmName(name="getTotalRamMemory")
        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        @JvmName(name="getWebviewUa")
        @NotNull
        public final String getWebviewUa() {
            String string2 = this._builder.getWebviewUa();
            y.i(string2, "_builder.getWebviewUa()");
            return string2;
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasMadeWithUnity() {
            return this._builder.hasMadeWithUnity();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        @JvmName(name="plusAssignAllStores")
        public final /* synthetic */ void plusAssignAllStores(DslList<String, StoresProxy> dslList, Iterable<String> iterable) {
            y.j(dslList, "<this>");
            y.j(iterable, "values");
            this.addAllStores(dslList, iterable);
        }

        @JvmName(name="plusAssignStores")
        public final /* synthetic */ void plusAssignStores(DslList<String, StoresProxy> dslList, String string2) {
            y.j(dslList, "<this>");
            y.j(string2, "value");
            this.addStores(dslList, string2);
        }

        @JvmName(name="setAndroid")
        public final void setAndroid(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android) {
            y.j(android, "value");
            this._builder.setAndroid(android);
        }

        @JvmName(name="setAppDebuggable")
        public final void setAppDebuggable(boolean bl2) {
            this._builder.setAppDebuggable(bl2);
        }

        @JvmName(name="setBundleId")
        public final void setBundleId(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setBundleId(string2);
        }

        @JvmName(name="setBundleVersion")
        public final void setBundleVersion(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setBundleVersion(string2);
        }

        @JvmName(name="setCpuCount")
        public final void setCpuCount(long l10) {
            this._builder.setCpuCount(l10);
        }

        @JvmName(name="setCpuModel")
        public final void setCpuModel(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setCpuModel(string2);
        }

        @JvmName(name="setDeviceMake")
        public final void setDeviceMake(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setDeviceMake(string2);
        }

        @JvmName(name="setDeviceModel")
        public final void setDeviceModel(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setDeviceModel(string2);
        }

        @JvmName(name="setGpuModel")
        public final void setGpuModel(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setGpuModel(string2);
        }

        @JvmName(name="setIos")
        public final void setIos(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios) {
            y.j(ios, "value");
            this._builder.setIos(ios);
        }

        @JvmName(name="setMadeWithUnity")
        public final void setMadeWithUnity(boolean bl2) {
            this._builder.setMadeWithUnity(bl2);
        }

        @JvmName(name="setOsVersion")
        public final void setOsVersion(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setOsVersion(string2);
        }

        @JvmName(name="setRooted")
        public final void setRooted(boolean bl2) {
            this._builder.setRooted(bl2);
        }

        @JvmName(name="setScreenDensity")
        public final void setScreenDensity(int n10) {
            this._builder.setScreenDensity(n10);
        }

        @JvmName(name="setScreenHeight")
        public final void setScreenHeight(int n10) {
            this._builder.setScreenHeight(n10);
        }

        @JvmName(name="setScreenSize")
        public final void setScreenSize(int n10) {
            this._builder.setScreenSize(n10);
        }

        @JvmName(name="setScreenWidth")
        public final void setScreenWidth(int n10) {
            this._builder.setScreenWidth(n10);
        }

        @JvmName(name="setStores")
        public final /* synthetic */ void setStores(DslList dslList, int n10, String string2) {
            y.j(dslList, "<this>");
            y.j(string2, "value");
            this._builder.setStores(n10, string2);
        }

        @JvmName(name="setTotalDiskSpace")
        public final void setTotalDiskSpace(long l10) {
            this._builder.setTotalDiskSpace(l10);
        }

        @JvmName(name="setTotalRamMemory")
        public final void setTotalRamMemory(long l10) {
            this._builder.setTotalRamMemory(l10);
        }

        @JvmName(name="setWebviewUa")
        public final void setWebviewUa(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setWebviewUa(string2);
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                y.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class StoresProxy
        extends DslProxy {
            private StoresProxy() {
            }
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class IosKt {
        @NotNull
        public static final IosKt INSTANCE = new IosKt();

        private IosKt() {
        }

        @Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b'\b\u0007\u0018\u0000 X2\u00020\u0001:\u0002XYB\u0011\b\u0002\u0012\u0006\u00101\u001a\u000200\u00a2\u0006\u0004\bV\u0010WJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000e\u001a\u00020\b\u00a2\u0006\u0004\b\u000e\u0010\nJ'\u0010\u0015\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\n\u00a2\u0006\u0004\b\u0016\u0010\u0014J-\u0010\u001c\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u0017\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0087\n\u00a2\u0006\u0004\b\u001d\u0010\u001bJ0\u0010\"\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\u0002\u00a2\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007\u00a2\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020\u0005\u00a2\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\b\u00a2\u0006\u0004\b'\u0010\nJ\r\u0010(\u001a\u00020\u0005\u00a2\u0006\u0004\b(\u0010\u0007J\r\u0010)\u001a\u00020\b\u00a2\u0006\u0004\b)\u0010\nJ\r\u0010*\u001a\u00020\u0005\u00a2\u0006\u0004\b*\u0010\u0007J\r\u0010+\u001a\u00020\b\u00a2\u0006\u0004\b+\u0010\nJ\r\u0010,\u001a\u00020\u0005\u00a2\u0006\u0004\b,\u0010\u0007J\r\u0010-\u001a\u00020\b\u00a2\u0006\u0004\b-\u0010\nJ\r\u0010.\u001a\u00020\u0005\u00a2\u0006\u0004\b.\u0010\u0007J\r\u0010/\u001a\u00020\b\u00a2\u0006\u0004\b/\u0010\nR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R$\u00108\u001a\u0002032\u0006\u0010\u0012\u001a\u0002038G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010<\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\n\"\u0004\b:\u0010;R$\u0010A\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001d\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8F\u00a2\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010I\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u001e8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010L\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010\n\"\u0004\bK\u0010;R$\u0010O\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010>\"\u0004\bN\u0010@R$\u0010R\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010>\"\u0004\bQ\u0010@R$\u0010U\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bS\u0010>\"\u0004\bT\u0010@\u00a8\u0006Z"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lkotlin/k0;", "clearSystemBootTime", "()V", "", "hasSystemBootTime", "()Z", "clearSimulator", "hasSimulator", "clearBuiltSdkVersion", "hasBuiltSdkVersion", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", "value", "addSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignSkadnetworkId", "plusAssign", "", "values", "addAllSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllSkadnetworkId", "", "index", "setSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearScreenScale", "hasScreenScale", "clearCanMakePayments", "hasCanMakePayments", "clearXcodeVersion", "hasXcodeVersion", "clearXcodeBuildVersion", "hasXcodeBuildVersion", "clearXcodeSdkBuildVersion", "hasXcodeSdkBuildVersion", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "_builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "", "getSystemBootTime", "()J", "setSystemBootTime", "(J)V", "systemBootTime", "getSimulator", "setSimulator", "(Z)V", "simulator", "getBuiltSdkVersion", "()Ljava/lang/String;", "setBuiltSdkVersion", "(Ljava/lang/String;)V", "builtSdkVersion", "getSkadnetworkId", "()Lcom/google/protobuf/kotlin/DslList;", "skadnetworkId", "getScreenScale", "()I", "setScreenScale", "(I)V", "screenScale", "getCanMakePayments", "setCanMakePayments", "canMakePayments", "getXcodeVersion", "setXcodeVersion", "xcodeVersion", "getXcodeBuildVersion", "setXcodeBuildVersion", "xcodeBuildVersion", "getXcodeSdkBuildVersion", "setXcodeSdkBuildVersion", "xcodeSdkBuildVersion", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;)V", "Companion", "SkadnetworkIdProxy", "unity-ads_release"}, k=1, mv={1, 8, 0})
        @ProtoDslMarker
        public static final class Dsl {
            @NotNull
            public static final Companion Companion = new Companion(null);
            @NotNull
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, p p14) {
                this(builder);
            }

            @PublishedApi
            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                GeneratedMessageLite generatedMessageLite = this._builder.build();
                y.i(generatedMessageLite, "_builder.build()");
                return (StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios)generatedMessageLite;
            }

            @JvmName(name="addAllSkadnetworkId")
            public final /* synthetic */ void addAllSkadnetworkId(DslList dslList, Iterable iterable) {
                y.j(dslList, "<this>");
                y.j(iterable, "values");
                this._builder.addAllSkadnetworkId(iterable);
            }

            @JvmName(name="addSkadnetworkId")
            public final /* synthetic */ void addSkadnetworkId(DslList dslList, String string2) {
                y.j(dslList, "<this>");
                y.j(string2, "value");
                this._builder.addSkadnetworkId(string2);
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            @JvmName(name="clearSkadnetworkId")
            public final /* synthetic */ void clearSkadnetworkId(DslList dslList) {
                y.j(dslList, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            @JvmName(name="getBuiltSdkVersion")
            @NotNull
            public final String getBuiltSdkVersion() {
                String string2 = this._builder.getBuiltSdkVersion();
                y.i(string2, "_builder.getBuiltSdkVersion()");
                return string2;
            }

            @JvmName(name="getCanMakePayments")
            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            @JvmName(name="getScreenScale")
            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            @JvmName(name="getSimulator")
            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            @NotNull
            public final DslList<String, SkadnetworkIdProxy> getSkadnetworkId() {
                List<String> list = this._builder.getSkadnetworkIdList();
                y.i(list, "_builder.getSkadnetworkIdList()");
                return new DslList(list);
            }

            @JvmName(name="getSystemBootTime")
            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            @JvmName(name="getXcodeBuildVersion")
            @NotNull
            public final String getXcodeBuildVersion() {
                String string2 = this._builder.getXcodeBuildVersion();
                y.i(string2, "_builder.getXcodeBuildVersion()");
                return string2;
            }

            @JvmName(name="getXcodeSdkBuildVersion")
            @NotNull
            public final String getXcodeSdkBuildVersion() {
                String string2 = this._builder.getXcodeSdkBuildVersion();
                y.i(string2, "_builder.getXcodeSdkBuildVersion()");
                return string2;
            }

            @JvmName(name="getXcodeVersion")
            @NotNull
            public final String getXcodeVersion() {
                String string2 = this._builder.getXcodeVersion();
                y.i(string2, "_builder.getXcodeVersion()");
                return string2;
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            @JvmName(name="plusAssignAllSkadnetworkId")
            public final /* synthetic */ void plusAssignAllSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, Iterable<String> iterable) {
                y.j(dslList, "<this>");
                y.j(iterable, "values");
                this.addAllSkadnetworkId(dslList, iterable);
            }

            @JvmName(name="plusAssignSkadnetworkId")
            public final /* synthetic */ void plusAssignSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, String string2) {
                y.j(dslList, "<this>");
                y.j(string2, "value");
                this.addSkadnetworkId(dslList, string2);
            }

            @JvmName(name="setBuiltSdkVersion")
            public final void setBuiltSdkVersion(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setBuiltSdkVersion(string2);
            }

            @JvmName(name="setCanMakePayments")
            public final void setCanMakePayments(boolean bl2) {
                this._builder.setCanMakePayments(bl2);
            }

            @JvmName(name="setScreenScale")
            public final void setScreenScale(int n10) {
                this._builder.setScreenScale(n10);
            }

            @JvmName(name="setSimulator")
            public final void setSimulator(boolean bl2) {
                this._builder.setSimulator(bl2);
            }

            @JvmName(name="setSkadnetworkId")
            public final /* synthetic */ void setSkadnetworkId(DslList dslList, int n10, String string2) {
                y.j(dslList, "<this>");
                y.j(string2, "value");
                this._builder.setSkadnetworkId(n10, string2);
            }

            @JvmName(name="setSystemBootTime")
            public final void setSystemBootTime(long l10) {
                this._builder.setSystemBootTime(l10);
            }

            @JvmName(name="setXcodeBuildVersion")
            public final void setXcodeBuildVersion(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setXcodeBuildVersion(string2);
            }

            @JvmName(name="setXcodeSdkBuildVersion")
            public final void setXcodeSdkBuildVersion(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setXcodeSdkBuildVersion(string2);
            }

            @JvmName(name="setXcodeVersion")
            public final void setXcodeVersion(@NotNull String string2) {
                y.j(string2, "value");
                this._builder.setXcodeVersion(string2);
            }

            @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(p p14) {
                    this();
                }

                @PublishedApi
                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    y.j(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
            public static final class SkadnetworkIdProxy
            extends DslProxy {
                private SkadnetworkIdProxy() {
                }
            }
        }
    }
}

