/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Parser
 */
package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class StaticDeviceInfoOuterClass {
    private StaticDeviceInfoOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class StaticDeviceInfo
    extends GeneratedMessageLite<StaticDeviceInfo, Builder>
    implements StaticDeviceInfoOrBuilder {
        public static final int ANDROID_FIELD_NUMBER = 19;
        public static final int APP_DEBUGGABLE_FIELD_NUMBER = 3;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int BUNDLE_VERSION_FIELD_NUMBER = 2;
        public static final int CPU_COUNT_FIELD_NUMBER = 17;
        public static final int CPU_MODEL_FIELD_NUMBER = 16;
        private static final StaticDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 6;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
        public static final int GPU_MODEL_FIELD_NUMBER = 18;
        public static final int IOS_FIELD_NUMBER = 20;
        public static final int MADE_WITH_UNITY_FIELD_NUMBER = 21;
        public static final int OS_VERSION_FIELD_NUMBER = 5;
        private static volatile Parser<StaticDeviceInfo> PARSER;
        public static final int ROOTED_FIELD_NUMBER = 4;
        public static final int SCREEN_DENSITY_FIELD_NUMBER = 9;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 11;
        public static final int SCREEN_SIZE_FIELD_NUMBER = 12;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
        public static final int STORES_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 14;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 15;
        public static final int WEBVIEW_UA_FIELD_NUMBER = 8;
        private boolean appDebuggable_;
        private int bitField0_;
        private String bundleId_ = "";
        private String bundleVersion_ = "";
        private long cpuCount_;
        private String cpuModel_ = "";
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String gpuModel_ = "";
        private boolean madeWithUnity_;
        private String osVersion_ = "";
        private int platformSpecificCase_ = 0;
        private Object platformSpecific_;
        private boolean rooted_;
        private int screenDensity_;
        private int screenHeight_;
        private int screenSize_;
        private int screenWidth_;
        private Internal.ProtobufList<String> stores_ = GeneratedMessageLite.emptyProtobufList();
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private String webviewUa_ = "";

        static {
            StaticDeviceInfo staticDeviceInfo;
            DEFAULT_INSTANCE = staticDeviceInfo = new StaticDeviceInfo();
            GeneratedMessageLite.registerDefaultInstance(StaticDeviceInfo.class, (GeneratedMessageLite)staticDeviceInfo);
        }

        private StaticDeviceInfo() {
        }

        private void addAllStores(Iterable<String> iterable) {
            this.ensureStoresIsMutable();
            AbstractMessageLite.addAll(iterable, this.stores_);
        }

        private void addStores(String string2) {
            string2.getClass();
            this.ensureStoresIsMutable();
            this.stores_.add(string2);
        }

        private void addStoresBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureStoresIsMutable();
            this.stores_.add(byteString.toStringUtf8());
        }

        private void clearAndroid() {
            if (this.platformSpecificCase_ == 19) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearAppDebuggable() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.appDebuggable_ = false;
        }

        private void clearBundleId() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.bundleId_ = StaticDeviceInfo.getDefaultInstance().getBundleId();
        }

        private void clearBundleVersion() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.bundleVersion_ = StaticDeviceInfo.getDefaultInstance().getBundleVersion();
        }

        private void clearCpuCount() {
            this.bitField0_ &= 0xFFFF7FFF;
            this.cpuCount_ = 0L;
        }

        private void clearCpuModel() {
            this.bitField0_ &= 0xFFFFBFFF;
            this.cpuModel_ = StaticDeviceInfo.getDefaultInstance().getCpuModel();
        }

        private void clearDeviceMake() {
            this.bitField0_ &= 0xFFFFFFDF;
            this.deviceMake_ = StaticDeviceInfo.getDefaultInstance().getDeviceMake();
        }

        private void clearDeviceModel() {
            this.bitField0_ &= 0xFFFFFFBF;
            this.deviceModel_ = StaticDeviceInfo.getDefaultInstance().getDeviceModel();
        }

        private void clearGpuModel() {
            this.bitField0_ &= 0xFFFEFFFF;
            this.gpuModel_ = StaticDeviceInfo.getDefaultInstance().getGpuModel();
        }

        private void clearIos() {
            if (this.platformSpecificCase_ == 20) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearMadeWithUnity() {
            this.bitField0_ &= 0xFFFDFFFF;
            this.madeWithUnity_ = false;
        }

        private void clearOsVersion() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.osVersion_ = StaticDeviceInfo.getDefaultInstance().getOsVersion();
        }

        private void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        private void clearRooted() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.rooted_ = false;
        }

        private void clearScreenDensity() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.screenDensity_ = 0;
        }

        private void clearScreenHeight() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.screenHeight_ = 0;
        }

        private void clearScreenSize() {
            this.bitField0_ &= 0xFFFFF7FF;
            this.screenSize_ = 0;
        }

        private void clearScreenWidth() {
            this.bitField0_ &= 0xFFFFFDFF;
            this.screenWidth_ = 0;
        }

        private void clearStores() {
            this.stores_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearTotalDiskSpace() {
            this.bitField0_ &= 0xFFFFEFFF;
            this.totalDiskSpace_ = 0L;
        }

        private void clearTotalRamMemory() {
            this.bitField0_ &= 0xFFFFDFFF;
            this.totalRamMemory_ = 0L;
        }

        private void clearWebviewUa() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.webviewUa_ = StaticDeviceInfo.getDefaultInstance().getWebviewUa();
        }

        private void ensureStoresIsMutable() {
            Internal.ProtobufList<String> protobufList = this.stores_;
            if (!protobufList.isModifiable()) {
                this.stores_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static StaticDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAndroid(Android android) {
            android.getClass();
            this.platformSpecific_ = this.platformSpecificCase_ == 19 && this.platformSpecific_ != Android.getDefaultInstance() ? ((Android.Builder)Android.newBuilder((Android)this.platformSpecific_).mergeFrom(android)).buildPartial() : android;
            this.platformSpecificCase_ = 19;
        }

        private void mergeIos(Ios ios) {
            ios.getClass();
            this.platformSpecific_ = this.platformSpecificCase_ == 20 && this.platformSpecific_ != Ios.getDefaultInstance() ? ((Ios.Builder)Ios.newBuilder((Ios)this.platformSpecific_).mergeFrom(ios)).buildPartial() : ios;
            this.platformSpecificCase_ = 20;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(StaticDeviceInfo staticDeviceInfo) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(staticDeviceInfo);
        }

        public static StaticDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static StaticDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static StaticDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static StaticDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static StaticDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static StaticDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static StaticDeviceInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<StaticDeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAndroid(Android android) {
            android.getClass();
            this.platformSpecific_ = android;
            this.platformSpecificCase_ = 19;
        }

        private void setAppDebuggable(boolean bl2) {
            this.bitField0_ |= 4;
            this.appDebuggable_ = bl2;
        }

        private void setBundleId(String string2) {
            string2.getClass();
            this.bitField0_ |= 1;
            this.bundleId_ = string2;
        }

        private void setBundleIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.bundleId_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setBundleVersion(String string2) {
            string2.getClass();
            this.bitField0_ |= 2;
            this.bundleVersion_ = string2;
        }

        private void setBundleVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.bundleVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setCpuCount(long l10) {
            this.bitField0_ |= 0x8000;
            this.cpuCount_ = l10;
        }

        private void setCpuModel(String string2) {
            string2.getClass();
            this.bitField0_ |= 0x4000;
            this.cpuModel_ = string2;
        }

        private void setCpuModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.cpuModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 0x4000;
        }

        private void setDeviceMake(String string2) {
            string2.getClass();
            this.bitField0_ |= 0x20;
            this.deviceMake_ = string2;
        }

        private void setDeviceMakeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.deviceMake_ = byteString.toStringUtf8();
            this.bitField0_ |= 0x20;
        }

        private void setDeviceModel(String string2) {
            string2.getClass();
            this.bitField0_ |= 0x40;
            this.deviceModel_ = string2;
        }

        private void setDeviceModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.deviceModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 0x40;
        }

        private void setGpuModel(String string2) {
            string2.getClass();
            this.bitField0_ |= 0x10000;
            this.gpuModel_ = string2;
        }

        private void setGpuModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.gpuModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 0x10000;
        }

        private void setIos(Ios ios) {
            ios.getClass();
            this.platformSpecific_ = ios;
            this.platformSpecificCase_ = 20;
        }

        private void setMadeWithUnity(boolean bl2) {
            this.bitField0_ |= 0x20000;
            this.madeWithUnity_ = bl2;
        }

        private void setOsVersion(String string2) {
            string2.getClass();
            this.bitField0_ |= 0x10;
            this.osVersion_ = string2;
        }

        private void setOsVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.osVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 0x10;
        }

        private void setRooted(boolean bl2) {
            this.bitField0_ |= 8;
            this.rooted_ = bl2;
        }

        private void setScreenDensity(int n10) {
            this.bitField0_ |= 0x100;
            this.screenDensity_ = n10;
        }

        private void setScreenHeight(int n10) {
            this.bitField0_ |= 0x400;
            this.screenHeight_ = n10;
        }

        private void setScreenSize(int n10) {
            this.bitField0_ |= 0x800;
            this.screenSize_ = n10;
        }

        private void setScreenWidth(int n10) {
            this.bitField0_ |= 0x200;
            this.screenWidth_ = n10;
        }

        private void setStores(int n10, String string2) {
            string2.getClass();
            this.ensureStoresIsMutable();
            this.stores_.set(n10, string2);
        }

        private void setTotalDiskSpace(long l10) {
            this.bitField0_ |= 0x1000;
            this.totalDiskSpace_ = l10;
        }

        private void setTotalRamMemory(long l10) {
            this.bitField0_ |= 0x2000;
            this.totalRamMemory_ = l10;
        }

        private void setWebviewUa(String string2) {
            string2.getClass();
            this.bitField0_ |= 0x80;
            this.webviewUa_ = string2;
        }

        private void setWebviewUaBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.webviewUa_ = byteString.toStringUtf8();
            this.bitField0_ |= 0x80;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke defaultInstanceBasedParser, Object defaultInstanceBasedParser2, Object object) {
            switch (a.a[defaultInstanceBasedParser.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                    if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                    synchronized (StaticDeviceInfo.class) {
                        try {
                            defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                            if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                            return defaultInstanceBasedParser;
                        }
                        catch (Throwable throwable) {}
                        throw throwable;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0015\u0001\u0001\u0001\u0015\u0015\u0000\u0001\u0000\u0001\u1208\u0000\u0002\u1208\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1208\u0004\u0006\u1208\u0005\u0007\u1208\u0006\b\u1208\u0007\t\u100b\b\n\u100b\t\u000b\u100b\n\f\u100b\u000b\r\u021a\u000e\u1002\f\u000f\u1002\r\u0010\u1208\u000e\u0011\u1002\u000f\u0012\u1208\u0010\u0013<\u0000\u0014<\u0000\u0015\u1007\u0011", (Object[])new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "bundleId_", "bundleVersion_", "appDebuggable_", "rooted_", "osVersion_", "deviceMake_", "deviceModel_", "webviewUa_", "screenDensity_", "screenWidth_", "screenHeight_", "screenSize_", "stores_", "totalDiskSpace_", "totalRamMemory_", "cpuModel_", "cpuCount_", "gpuModel_", Android.class, Ios.class, "madeWithUnity_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new StaticDeviceInfo();
        }

        @Override
        public Android getAndroid() {
            if (this.platformSpecificCase_ == 19) {
                return (Android)this.platformSpecific_;
            }
            return Android.getDefaultInstance();
        }

        @Override
        public boolean getAppDebuggable() {
            return this.appDebuggable_;
        }

        @Override
        public String getBundleId() {
            return this.bundleId_;
        }

        @Override
        public ByteString getBundleIdBytes() {
            return ByteString.copyFromUtf8((String)this.bundleId_);
        }

        @Override
        public String getBundleVersion() {
            return this.bundleVersion_;
        }

        @Override
        public ByteString getBundleVersionBytes() {
            return ByteString.copyFromUtf8((String)this.bundleVersion_);
        }

        @Override
        public long getCpuCount() {
            return this.cpuCount_;
        }

        @Override
        public String getCpuModel() {
            return this.cpuModel_;
        }

        @Override
        public ByteString getCpuModelBytes() {
            return ByteString.copyFromUtf8((String)this.cpuModel_);
        }

        @Override
        public String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8((String)this.deviceMake_);
        }

        @Override
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8((String)this.deviceModel_);
        }

        @Override
        public String getGpuModel() {
            return this.gpuModel_;
        }

        @Override
        public ByteString getGpuModelBytes() {
            return ByteString.copyFromUtf8((String)this.gpuModel_);
        }

        @Override
        public Ios getIos() {
            if (this.platformSpecificCase_ == 20) {
                return (Ios)this.platformSpecific_;
            }
            return Ios.getDefaultInstance();
        }

        @Override
        public boolean getMadeWithUnity() {
            return this.madeWithUnity_;
        }

        @Override
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8((String)this.osVersion_);
        }

        @Override
        public PlatformSpecificCase getPlatformSpecificCase() {
            return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        @Override
        public boolean getRooted() {
            return this.rooted_;
        }

        @Override
        public int getScreenDensity() {
            return this.screenDensity_;
        }

        @Override
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        @Override
        public int getScreenSize() {
            return this.screenSize_;
        }

        @Override
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        @Override
        public String getStores(int n10) {
            return (String)this.stores_.get(n10);
        }

        @Override
        public ByteString getStoresBytes(int n10) {
            return ByteString.copyFromUtf8((String)((String)this.stores_.get(n10)));
        }

        @Override
        public int getStoresCount() {
            return this.stores_.size();
        }

        @Override
        public List<String> getStoresList() {
            return this.stores_;
        }

        @Override
        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        @Override
        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        @Override
        public String getWebviewUa() {
            return this.webviewUa_;
        }

        @Override
        public ByteString getWebviewUaBytes() {
            return ByteString.copyFromUtf8((String)this.webviewUa_);
        }

        @Override
        public boolean hasAndroid() {
            boolean bl2 = this.platformSpecificCase_ == 19;
            return bl2;
        }

        @Override
        public boolean hasAppDebuggable() {
            boolean bl2 = (this.bitField0_ & 4) != 0;
            return bl2;
        }

        @Override
        public boolean hasBundleId() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        @Override
        public boolean hasBundleVersion() {
            boolean bl2 = (this.bitField0_ & 2) != 0;
            return bl2;
        }

        @Override
        public boolean hasCpuCount() {
            boolean bl2 = (this.bitField0_ & 0x8000) != 0;
            return bl2;
        }

        @Override
        public boolean hasCpuModel() {
            boolean bl2 = (this.bitField0_ & 0x4000) != 0;
            return bl2;
        }

        @Override
        public boolean hasDeviceMake() {
            boolean bl2 = (this.bitField0_ & 0x20) != 0;
            return bl2;
        }

        @Override
        public boolean hasDeviceModel() {
            boolean bl2 = (this.bitField0_ & 0x40) != 0;
            return bl2;
        }

        @Override
        public boolean hasGpuModel() {
            boolean bl2 = (this.bitField0_ & 0x10000) != 0;
            return bl2;
        }

        @Override
        public boolean hasIos() {
            boolean bl2 = this.platformSpecificCase_ == 20;
            return bl2;
        }

        @Override
        public boolean hasMadeWithUnity() {
            boolean bl2 = (this.bitField0_ & 0x20000) != 0;
            return bl2;
        }

        @Override
        public boolean hasOsVersion() {
            boolean bl2 = (this.bitField0_ & 0x10) != 0;
            return bl2;
        }

        @Override
        public boolean hasRooted() {
            boolean bl2 = (this.bitField0_ & 8) != 0;
            return bl2;
        }

        @Override
        public boolean hasScreenDensity() {
            boolean bl2 = (this.bitField0_ & 0x100) != 0;
            return bl2;
        }

        @Override
        public boolean hasScreenHeight() {
            boolean bl2 = (this.bitField0_ & 0x400) != 0;
            return bl2;
        }

        @Override
        public boolean hasScreenSize() {
            boolean bl2 = (this.bitField0_ & 0x800) != 0;
            return bl2;
        }

        @Override
        public boolean hasScreenWidth() {
            boolean bl2 = (this.bitField0_ & 0x200) != 0;
            return bl2;
        }

        @Override
        public boolean hasTotalDiskSpace() {
            boolean bl2 = (this.bitField0_ & 0x1000) != 0;
            return bl2;
        }

        @Override
        public boolean hasTotalRamMemory() {
            boolean bl2 = (this.bitField0_ & 0x2000) != 0;
            return bl2;
        }

        @Override
        public boolean hasWebviewUa() {
            boolean bl2 = (this.bitField0_ & 0x80) != 0;
            return bl2;
        }

        public static final class Android
        extends GeneratedMessageLite<Android, Builder>
        implements AndroidOrBuilder {
            public static final int ANDROID_FINGERPRINT_FIELD_NUMBER = 3;
            public static final int API_LEVEL_FIELD_NUMBER = 1;
            public static final int APK_DEVELOPER_SIGNING_CERTIFICATE_HASH_FIELD_NUMBER = 5;
            public static final int APP_INSTALLER_FIELD_NUMBER = 4;
            public static final int BUILD_BOARD_FIELD_NUMBER = 6;
            public static final int BUILD_BOOTLOADER_FIELD_NUMBER = 13;
            public static final int BUILD_BRAND_FIELD_NUMBER = 7;
            public static final int BUILD_DEVICE_FIELD_NUMBER = 8;
            public static final int BUILD_DISPLAY_FIELD_NUMBER = 9;
            public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 10;
            public static final int BUILD_HARDWARE_FIELD_NUMBER = 11;
            public static final int BUILD_HOST_FIELD_NUMBER = 12;
            public static final int BUILD_ID_FIELD_NUMBER = 15;
            public static final int BUILD_PRODUCT_FIELD_NUMBER = 14;
            private static final Android DEFAULT_INSTANCE;
            public static final int EXTENSION_VERSION_FIELD_NUMBER = 16;
            private static volatile Parser<Android> PARSER;
            public static final int PHONE_TYPE_FIELD_NUMBER = 17;
            public static final int SIM_OPERATOR_FIELD_NUMBER = 18;
            public static final int VERSION_CODE_FIELD_NUMBER = 2;
            private String androidFingerprint_ = "";
            private int apiLevel_;
            private String apkDeveloperSigningCertificateHash_ = "";
            private String appInstaller_ = "";
            private int bitField0_;
            private String buildBoard_ = "";
            private String buildBootloader_ = "";
            private String buildBrand_ = "";
            private String buildDevice_ = "";
            private String buildDisplay_ = "";
            private String buildFingerprint_ = "";
            private String buildHardware_ = "";
            private String buildHost_ = "";
            private String buildId_ = "";
            private String buildProduct_ = "";
            private int extensionVersion_;
            private int phoneType_;
            private String simOperator_ = "";
            private int versionCode_;

            static {
                Android android;
                DEFAULT_INSTANCE = android = new Android();
                GeneratedMessageLite.registerDefaultInstance(Android.class, (GeneratedMessageLite)android);
            }

            private Android() {
            }

            private void clearAndroidFingerprint() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.androidFingerprint_ = Android.getDefaultInstance().getAndroidFingerprint();
            }

            private void clearApiLevel() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.apiLevel_ = 0;
            }

            private void clearApkDeveloperSigningCertificateHash() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.apkDeveloperSigningCertificateHash_ = Android.getDefaultInstance().getApkDeveloperSigningCertificateHash();
            }

            private void clearAppInstaller() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.appInstaller_ = Android.getDefaultInstance().getAppInstaller();
            }

            private void clearBuildBoard() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.buildBoard_ = Android.getDefaultInstance().getBuildBoard();
            }

            private void clearBuildBootloader() {
                this.bitField0_ &= 0xFFFFEFFF;
                this.buildBootloader_ = Android.getDefaultInstance().getBuildBootloader();
            }

            private void clearBuildBrand() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.buildBrand_ = Android.getDefaultInstance().getBuildBrand();
            }

            private void clearBuildDevice() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.buildDevice_ = Android.getDefaultInstance().getBuildDevice();
            }

            private void clearBuildDisplay() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.buildDisplay_ = Android.getDefaultInstance().getBuildDisplay();
            }

            private void clearBuildFingerprint() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.buildFingerprint_ = Android.getDefaultInstance().getBuildFingerprint();
            }

            private void clearBuildHardware() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.buildHardware_ = Android.getDefaultInstance().getBuildHardware();
            }

            private void clearBuildHost() {
                this.bitField0_ &= 0xFFFFF7FF;
                this.buildHost_ = Android.getDefaultInstance().getBuildHost();
            }

            private void clearBuildId() {
                this.bitField0_ &= 0xFFFFBFFF;
                this.buildId_ = Android.getDefaultInstance().getBuildId();
            }

            private void clearBuildProduct() {
                this.bitField0_ &= 0xFFFFDFFF;
                this.buildProduct_ = Android.getDefaultInstance().getBuildProduct();
            }

            private void clearExtensionVersion() {
                this.bitField0_ &= 0xFFFF7FFF;
                this.extensionVersion_ = 0;
            }

            private void clearPhoneType() {
                this.bitField0_ &= 0xFFFEFFFF;
                this.phoneType_ = 0;
            }

            private void clearSimOperator() {
                this.bitField0_ &= 0xFFFDFFFF;
                this.simOperator_ = Android.getDefaultInstance().getSimOperator();
            }

            private void clearVersionCode() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.versionCode_ = 0;
            }

            public static Android getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Android android) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(android);
            }

            public static Android parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Android)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Android parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Android parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Android parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Android parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Android parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Android parseFrom(InputStream inputStream) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Android parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Android parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
            }

            public static Android parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Android parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
            }

            public static Android parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Android> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAndroidFingerprint(String string2) {
                string2.getClass();
                this.bitField0_ |= 4;
                this.androidFingerprint_ = string2;
            }

            private void setAndroidFingerprintBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.androidFingerprint_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setApiLevel(int n10) {
                this.bitField0_ |= 1;
                this.apiLevel_ = n10;
            }

            private void setApkDeveloperSigningCertificateHash(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x10;
                this.apkDeveloperSigningCertificateHash_ = string2;
            }

            private void setApkDeveloperSigningCertificateHashBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.apkDeveloperSigningCertificateHash_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x10;
            }

            private void setAppInstaller(String string2) {
                string2.getClass();
                this.bitField0_ |= 8;
                this.appInstaller_ = string2;
            }

            private void setAppInstallerBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.appInstaller_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            private void setBuildBoard(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x20;
                this.buildBoard_ = string2;
            }

            private void setBuildBoardBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildBoard_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x20;
            }

            private void setBuildBootloader(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x1000;
                this.buildBootloader_ = string2;
            }

            private void setBuildBootloaderBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildBootloader_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x1000;
            }

            private void setBuildBrand(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x40;
                this.buildBrand_ = string2;
            }

            private void setBuildBrandBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildBrand_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x40;
            }

            private void setBuildDevice(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x80;
                this.buildDevice_ = string2;
            }

            private void setBuildDeviceBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildDevice_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x80;
            }

            private void setBuildDisplay(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x100;
                this.buildDisplay_ = string2;
            }

            private void setBuildDisplayBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildDisplay_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x100;
            }

            private void setBuildFingerprint(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x200;
                this.buildFingerprint_ = string2;
            }

            private void setBuildFingerprintBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildFingerprint_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x200;
            }

            private void setBuildHardware(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x400;
                this.buildHardware_ = string2;
            }

            private void setBuildHardwareBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildHardware_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x400;
            }

            private void setBuildHost(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x800;
                this.buildHost_ = string2;
            }

            private void setBuildHostBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildHost_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x800;
            }

            private void setBuildId(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x4000;
                this.buildId_ = string2;
            }

            private void setBuildIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildId_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x4000;
            }

            private void setBuildProduct(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x2000;
                this.buildProduct_ = string2;
            }

            private void setBuildProductBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.buildProduct_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x2000;
            }

            private void setExtensionVersion(int n10) {
                this.bitField0_ |= 0x8000;
                this.extensionVersion_ = n10;
            }

            private void setPhoneType(int n10) {
                this.bitField0_ |= 0x10000;
                this.phoneType_ = n10;
            }

            private void setSimOperator(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x20000;
                this.simOperator_ = string2;
            }

            private void setSimOperatorBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.simOperator_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x20000;
            }

            private void setVersionCode(int n10) {
                this.bitField0_ |= 2;
                this.versionCode_ = n10;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke defaultInstanceBasedParser, Object defaultInstanceBasedParser2, Object object) {
                switch (a.a[defaultInstanceBasedParser.ordinal()]) {
                    default: {
                        throw new UnsupportedOperationException();
                    }
                    case 7: {
                        return null;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 5: {
                        defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                        if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                        synchronized (Android.class) {
                            try {
                                defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                                if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                                PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                                return defaultInstanceBasedParser;
                            }
                            catch (Throwable throwable) {}
                            throw throwable;
                        }
                    }
                    case 4: {
                        return DEFAULT_INSTANCE;
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u1208\u0002\u0004\u1208\u0003\u0005\u1208\u0004\u0006\u1208\u0005\u0007\u1208\u0006\b\u1208\u0007\t\u1208\b\n\u1208\t\u000b\u1208\n\f\u1208\u000b\r\u1208\f\u000e\u1208\r\u000f\u1208\u000e\u0010\u100b\u000f\u0011\u1004\u0010\u0012\u1208\u0011", (Object[])new Object[]{"bitField0_", "apiLevel_", "versionCode_", "androidFingerprint_", "appInstaller_", "apkDeveloperSigningCertificateHash_", "buildBoard_", "buildBrand_", "buildDevice_", "buildDisplay_", "buildFingerprint_", "buildHardware_", "buildHost_", "buildBootloader_", "buildProduct_", "buildId_", "extensionVersion_", "phoneType_", "simOperator_"});
                    }
                    case 2: {
                        return new Builder();
                    }
                    case 1: 
                }
                return new Android();
            }

            @Override
            public String getAndroidFingerprint() {
                return this.androidFingerprint_;
            }

            @Override
            public ByteString getAndroidFingerprintBytes() {
                return ByteString.copyFromUtf8((String)this.androidFingerprint_);
            }

            @Override
            public int getApiLevel() {
                return this.apiLevel_;
            }

            @Override
            public String getApkDeveloperSigningCertificateHash() {
                return this.apkDeveloperSigningCertificateHash_;
            }

            @Override
            public ByteString getApkDeveloperSigningCertificateHashBytes() {
                return ByteString.copyFromUtf8((String)this.apkDeveloperSigningCertificateHash_);
            }

            @Override
            public String getAppInstaller() {
                return this.appInstaller_;
            }

            @Override
            public ByteString getAppInstallerBytes() {
                return ByteString.copyFromUtf8((String)this.appInstaller_);
            }

            @Override
            public String getBuildBoard() {
                return this.buildBoard_;
            }

            @Override
            public ByteString getBuildBoardBytes() {
                return ByteString.copyFromUtf8((String)this.buildBoard_);
            }

            @Override
            public String getBuildBootloader() {
                return this.buildBootloader_;
            }

            @Override
            public ByteString getBuildBootloaderBytes() {
                return ByteString.copyFromUtf8((String)this.buildBootloader_);
            }

            @Override
            public String getBuildBrand() {
                return this.buildBrand_;
            }

            @Override
            public ByteString getBuildBrandBytes() {
                return ByteString.copyFromUtf8((String)this.buildBrand_);
            }

            @Override
            public String getBuildDevice() {
                return this.buildDevice_;
            }

            @Override
            public ByteString getBuildDeviceBytes() {
                return ByteString.copyFromUtf8((String)this.buildDevice_);
            }

            @Override
            public String getBuildDisplay() {
                return this.buildDisplay_;
            }

            @Override
            public ByteString getBuildDisplayBytes() {
                return ByteString.copyFromUtf8((String)this.buildDisplay_);
            }

            @Override
            public String getBuildFingerprint() {
                return this.buildFingerprint_;
            }

            @Override
            public ByteString getBuildFingerprintBytes() {
                return ByteString.copyFromUtf8((String)this.buildFingerprint_);
            }

            @Override
            public String getBuildHardware() {
                return this.buildHardware_;
            }

            @Override
            public ByteString getBuildHardwareBytes() {
                return ByteString.copyFromUtf8((String)this.buildHardware_);
            }

            @Override
            public String getBuildHost() {
                return this.buildHost_;
            }

            @Override
            public ByteString getBuildHostBytes() {
                return ByteString.copyFromUtf8((String)this.buildHost_);
            }

            @Override
            public String getBuildId() {
                return this.buildId_;
            }

            @Override
            public ByteString getBuildIdBytes() {
                return ByteString.copyFromUtf8((String)this.buildId_);
            }

            @Override
            public String getBuildProduct() {
                return this.buildProduct_;
            }

            @Override
            public ByteString getBuildProductBytes() {
                return ByteString.copyFromUtf8((String)this.buildProduct_);
            }

            @Override
            public int getExtensionVersion() {
                return this.extensionVersion_;
            }

            @Override
            public int getPhoneType() {
                return this.phoneType_;
            }

            @Override
            public String getSimOperator() {
                return this.simOperator_;
            }

            @Override
            public ByteString getSimOperatorBytes() {
                return ByteString.copyFromUtf8((String)this.simOperator_);
            }

            @Override
            public int getVersionCode() {
                return this.versionCode_;
            }

            @Override
            public boolean hasAndroidFingerprint() {
                boolean bl2 = (this.bitField0_ & 4) != 0;
                return bl2;
            }

            @Override
            public boolean hasApiLevel() {
                int n10 = this.bitField0_;
                boolean bl2 = true;
                if ((n10 & 1) == 0) {
                    bl2 = false;
                }
                return bl2;
            }

            @Override
            public boolean hasApkDeveloperSigningCertificateHash() {
                boolean bl2 = (this.bitField0_ & 0x10) != 0;
                return bl2;
            }

            @Override
            public boolean hasAppInstaller() {
                boolean bl2 = (this.bitField0_ & 8) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildBoard() {
                boolean bl2 = (this.bitField0_ & 0x20) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildBootloader() {
                boolean bl2 = (this.bitField0_ & 0x1000) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildBrand() {
                boolean bl2 = (this.bitField0_ & 0x40) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildDevice() {
                boolean bl2 = (this.bitField0_ & 0x80) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildDisplay() {
                boolean bl2 = (this.bitField0_ & 0x100) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildFingerprint() {
                boolean bl2 = (this.bitField0_ & 0x200) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildHardware() {
                boolean bl2 = (this.bitField0_ & 0x400) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildHost() {
                boolean bl2 = (this.bitField0_ & 0x800) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildId() {
                boolean bl2 = (this.bitField0_ & 0x4000) != 0;
                return bl2;
            }

            @Override
            public boolean hasBuildProduct() {
                boolean bl2 = (this.bitField0_ & 0x2000) != 0;
                return bl2;
            }

            @Override
            public boolean hasExtensionVersion() {
                boolean bl2 = (this.bitField0_ & 0x8000) != 0;
                return bl2;
            }

            @Override
            public boolean hasPhoneType() {
                boolean bl2 = (this.bitField0_ & 0x10000) != 0;
                return bl2;
            }

            @Override
            public boolean hasSimOperator() {
                boolean bl2 = (this.bitField0_ & 0x20000) != 0;
                return bl2;
            }

            @Override
            public boolean hasVersionCode() {
                boolean bl2 = (this.bitField0_ & 2) != 0;
                return bl2;
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Android, Builder>
            implements AndroidOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder clearAndroidFingerprint() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearAndroidFingerprint();
                    return this;
                }

                public Builder clearApiLevel() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearApiLevel();
                    return this;
                }

                public Builder clearApkDeveloperSigningCertificateHash() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearApkDeveloperSigningCertificateHash();
                    return this;
                }

                public Builder clearAppInstaller() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearAppInstaller();
                    return this;
                }

                public Builder clearBuildBoard() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildBoard();
                    return this;
                }

                public Builder clearBuildBootloader() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildBootloader();
                    return this;
                }

                public Builder clearBuildBrand() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildBrand();
                    return this;
                }

                public Builder clearBuildDevice() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildDevice();
                    return this;
                }

                public Builder clearBuildDisplay() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildDisplay();
                    return this;
                }

                public Builder clearBuildFingerprint() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildFingerprint();
                    return this;
                }

                public Builder clearBuildHardware() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildHardware();
                    return this;
                }

                public Builder clearBuildHost() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildHost();
                    return this;
                }

                public Builder clearBuildId() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildId();
                    return this;
                }

                public Builder clearBuildProduct() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildProduct();
                    return this;
                }

                public Builder clearExtensionVersion() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearExtensionVersion();
                    return this;
                }

                public Builder clearPhoneType() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearPhoneType();
                    return this;
                }

                public Builder clearSimOperator() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearSimOperator();
                    return this;
                }

                public Builder clearVersionCode() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearVersionCode();
                    return this;
                }

                @Override
                public String getAndroidFingerprint() {
                    return ((Android)this.instance).getAndroidFingerprint();
                }

                @Override
                public ByteString getAndroidFingerprintBytes() {
                    return ((Android)this.instance).getAndroidFingerprintBytes();
                }

                @Override
                public int getApiLevel() {
                    return ((Android)this.instance).getApiLevel();
                }

                @Override
                public String getApkDeveloperSigningCertificateHash() {
                    return ((Android)this.instance).getApkDeveloperSigningCertificateHash();
                }

                @Override
                public ByteString getApkDeveloperSigningCertificateHashBytes() {
                    return ((Android)this.instance).getApkDeveloperSigningCertificateHashBytes();
                }

                @Override
                public String getAppInstaller() {
                    return ((Android)this.instance).getAppInstaller();
                }

                @Override
                public ByteString getAppInstallerBytes() {
                    return ((Android)this.instance).getAppInstallerBytes();
                }

                @Override
                public String getBuildBoard() {
                    return ((Android)this.instance).getBuildBoard();
                }

                @Override
                public ByteString getBuildBoardBytes() {
                    return ((Android)this.instance).getBuildBoardBytes();
                }

                @Override
                public String getBuildBootloader() {
                    return ((Android)this.instance).getBuildBootloader();
                }

                @Override
                public ByteString getBuildBootloaderBytes() {
                    return ((Android)this.instance).getBuildBootloaderBytes();
                }

                @Override
                public String getBuildBrand() {
                    return ((Android)this.instance).getBuildBrand();
                }

                @Override
                public ByteString getBuildBrandBytes() {
                    return ((Android)this.instance).getBuildBrandBytes();
                }

                @Override
                public String getBuildDevice() {
                    return ((Android)this.instance).getBuildDevice();
                }

                @Override
                public ByteString getBuildDeviceBytes() {
                    return ((Android)this.instance).getBuildDeviceBytes();
                }

                @Override
                public String getBuildDisplay() {
                    return ((Android)this.instance).getBuildDisplay();
                }

                @Override
                public ByteString getBuildDisplayBytes() {
                    return ((Android)this.instance).getBuildDisplayBytes();
                }

                @Override
                public String getBuildFingerprint() {
                    return ((Android)this.instance).getBuildFingerprint();
                }

                @Override
                public ByteString getBuildFingerprintBytes() {
                    return ((Android)this.instance).getBuildFingerprintBytes();
                }

                @Override
                public String getBuildHardware() {
                    return ((Android)this.instance).getBuildHardware();
                }

                @Override
                public ByteString getBuildHardwareBytes() {
                    return ((Android)this.instance).getBuildHardwareBytes();
                }

                @Override
                public String getBuildHost() {
                    return ((Android)this.instance).getBuildHost();
                }

                @Override
                public ByteString getBuildHostBytes() {
                    return ((Android)this.instance).getBuildHostBytes();
                }

                @Override
                public String getBuildId() {
                    return ((Android)this.instance).getBuildId();
                }

                @Override
                public ByteString getBuildIdBytes() {
                    return ((Android)this.instance).getBuildIdBytes();
                }

                @Override
                public String getBuildProduct() {
                    return ((Android)this.instance).getBuildProduct();
                }

                @Override
                public ByteString getBuildProductBytes() {
                    return ((Android)this.instance).getBuildProductBytes();
                }

                @Override
                public int getExtensionVersion() {
                    return ((Android)this.instance).getExtensionVersion();
                }

                @Override
                public int getPhoneType() {
                    return ((Android)this.instance).getPhoneType();
                }

                @Override
                public String getSimOperator() {
                    return ((Android)this.instance).getSimOperator();
                }

                @Override
                public ByteString getSimOperatorBytes() {
                    return ((Android)this.instance).getSimOperatorBytes();
                }

                @Override
                public int getVersionCode() {
                    return ((Android)this.instance).getVersionCode();
                }

                @Override
                public boolean hasAndroidFingerprint() {
                    return ((Android)this.instance).hasAndroidFingerprint();
                }

                @Override
                public boolean hasApiLevel() {
                    return ((Android)this.instance).hasApiLevel();
                }

                @Override
                public boolean hasApkDeveloperSigningCertificateHash() {
                    return ((Android)this.instance).hasApkDeveloperSigningCertificateHash();
                }

                @Override
                public boolean hasAppInstaller() {
                    return ((Android)this.instance).hasAppInstaller();
                }

                @Override
                public boolean hasBuildBoard() {
                    return ((Android)this.instance).hasBuildBoard();
                }

                @Override
                public boolean hasBuildBootloader() {
                    return ((Android)this.instance).hasBuildBootloader();
                }

                @Override
                public boolean hasBuildBrand() {
                    return ((Android)this.instance).hasBuildBrand();
                }

                @Override
                public boolean hasBuildDevice() {
                    return ((Android)this.instance).hasBuildDevice();
                }

                @Override
                public boolean hasBuildDisplay() {
                    return ((Android)this.instance).hasBuildDisplay();
                }

                @Override
                public boolean hasBuildFingerprint() {
                    return ((Android)this.instance).hasBuildFingerprint();
                }

                @Override
                public boolean hasBuildHardware() {
                    return ((Android)this.instance).hasBuildHardware();
                }

                @Override
                public boolean hasBuildHost() {
                    return ((Android)this.instance).hasBuildHost();
                }

                @Override
                public boolean hasBuildId() {
                    return ((Android)this.instance).hasBuildId();
                }

                @Override
                public boolean hasBuildProduct() {
                    return ((Android)this.instance).hasBuildProduct();
                }

                @Override
                public boolean hasExtensionVersion() {
                    return ((Android)this.instance).hasExtensionVersion();
                }

                @Override
                public boolean hasPhoneType() {
                    return ((Android)this.instance).hasPhoneType();
                }

                @Override
                public boolean hasSimOperator() {
                    return ((Android)this.instance).hasSimOperator();
                }

                @Override
                public boolean hasVersionCode() {
                    return ((Android)this.instance).hasVersionCode();
                }

                public Builder setAndroidFingerprint(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAndroidFingerprint(string2);
                    return this;
                }

                public Builder setAndroidFingerprintBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAndroidFingerprintBytes(byteString);
                    return this;
                }

                public Builder setApiLevel(int n10) {
                    this.copyOnWrite();
                    ((Android)this.instance).setApiLevel(n10);
                    return this;
                }

                public Builder setApkDeveloperSigningCertificateHash(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setApkDeveloperSigningCertificateHash(string2);
                    return this;
                }

                public Builder setApkDeveloperSigningCertificateHashBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setApkDeveloperSigningCertificateHashBytes(byteString);
                    return this;
                }

                public Builder setAppInstaller(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAppInstaller(string2);
                    return this;
                }

                public Builder setAppInstallerBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAppInstallerBytes(byteString);
                    return this;
                }

                public Builder setBuildBoard(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBoard(string2);
                    return this;
                }

                public Builder setBuildBoardBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBoardBytes(byteString);
                    return this;
                }

                public Builder setBuildBootloader(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBootloader(string2);
                    return this;
                }

                public Builder setBuildBootloaderBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBootloaderBytes(byteString);
                    return this;
                }

                public Builder setBuildBrand(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBrand(string2);
                    return this;
                }

                public Builder setBuildBrandBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBrandBytes(byteString);
                    return this;
                }

                public Builder setBuildDevice(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildDevice(string2);
                    return this;
                }

                public Builder setBuildDeviceBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildDeviceBytes(byteString);
                    return this;
                }

                public Builder setBuildDisplay(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildDisplay(string2);
                    return this;
                }

                public Builder setBuildDisplayBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildDisplayBytes(byteString);
                    return this;
                }

                public Builder setBuildFingerprint(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildFingerprint(string2);
                    return this;
                }

                public Builder setBuildFingerprintBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildFingerprintBytes(byteString);
                    return this;
                }

                public Builder setBuildHardware(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildHardware(string2);
                    return this;
                }

                public Builder setBuildHardwareBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildHardwareBytes(byteString);
                    return this;
                }

                public Builder setBuildHost(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildHost(string2);
                    return this;
                }

                public Builder setBuildHostBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildHostBytes(byteString);
                    return this;
                }

                public Builder setBuildId(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildId(string2);
                    return this;
                }

                public Builder setBuildIdBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildIdBytes(byteString);
                    return this;
                }

                public Builder setBuildProduct(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildProduct(string2);
                    return this;
                }

                public Builder setBuildProductBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildProductBytes(byteString);
                    return this;
                }

                public Builder setExtensionVersion(int n10) {
                    this.copyOnWrite();
                    ((Android)this.instance).setExtensionVersion(n10);
                    return this;
                }

                public Builder setPhoneType(int n10) {
                    this.copyOnWrite();
                    ((Android)this.instance).setPhoneType(n10);
                    return this;
                }

                public Builder setSimOperator(String string2) {
                    this.copyOnWrite();
                    ((Android)this.instance).setSimOperator(string2);
                    return this;
                }

                public Builder setSimOperatorBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Android)this.instance).setSimOperatorBytes(byteString);
                    return this;
                }

                public Builder setVersionCode(int n10) {
                    this.copyOnWrite();
                    ((Android)this.instance).setVersionCode(n10);
                    return this;
                }
            }
        }

        public static interface AndroidOrBuilder
        extends MessageLiteOrBuilder {
            public String getAndroidFingerprint();

            public ByteString getAndroidFingerprintBytes();

            public int getApiLevel();

            public String getApkDeveloperSigningCertificateHash();

            public ByteString getApkDeveloperSigningCertificateHashBytes();

            public String getAppInstaller();

            public ByteString getAppInstallerBytes();

            public String getBuildBoard();

            public ByteString getBuildBoardBytes();

            public String getBuildBootloader();

            public ByteString getBuildBootloaderBytes();

            public String getBuildBrand();

            public ByteString getBuildBrandBytes();

            public String getBuildDevice();

            public ByteString getBuildDeviceBytes();

            public String getBuildDisplay();

            public ByteString getBuildDisplayBytes();

            public String getBuildFingerprint();

            public ByteString getBuildFingerprintBytes();

            public String getBuildHardware();

            public ByteString getBuildHardwareBytes();

            public String getBuildHost();

            public ByteString getBuildHostBytes();

            public String getBuildId();

            public ByteString getBuildIdBytes();

            public String getBuildProduct();

            public ByteString getBuildProductBytes();

            public int getExtensionVersion();

            public int getPhoneType();

            public String getSimOperator();

            public ByteString getSimOperatorBytes();

            public int getVersionCode();

            public boolean hasAndroidFingerprint();

            public boolean hasApiLevel();

            public boolean hasApkDeveloperSigningCertificateHash();

            public boolean hasAppInstaller();

            public boolean hasBuildBoard();

            public boolean hasBuildBootloader();

            public boolean hasBuildBrand();

            public boolean hasBuildDevice();

            public boolean hasBuildDisplay();

            public boolean hasBuildFingerprint();

            public boolean hasBuildHardware();

            public boolean hasBuildHost();

            public boolean hasBuildId();

            public boolean hasBuildProduct();

            public boolean hasExtensionVersion();

            public boolean hasPhoneType();

            public boolean hasSimOperator();

            public boolean hasVersionCode();
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<StaticDeviceInfo, Builder>
        implements StaticDeviceInfoOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllStores(Iterable<String> iterable) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).addAllStores(iterable);
                return this;
            }

            public Builder addStores(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).addStores(string2);
                return this;
            }

            public Builder addStoresBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).addStoresBytes(byteString);
                return this;
            }

            public Builder clearAndroid() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearAndroid();
                return this;
            }

            public Builder clearAppDebuggable() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearAppDebuggable();
                return this;
            }

            public Builder clearBundleId() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearBundleId();
                return this;
            }

            public Builder clearBundleVersion() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearBundleVersion();
                return this;
            }

            public Builder clearCpuCount() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearCpuCount();
                return this;
            }

            public Builder clearCpuModel() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearCpuModel();
                return this;
            }

            public Builder clearDeviceMake() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearDeviceMake();
                return this;
            }

            public Builder clearDeviceModel() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearGpuModel() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearGpuModel();
                return this;
            }

            public Builder clearIos() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearIos();
                return this;
            }

            public Builder clearMadeWithUnity() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearMadeWithUnity();
                return this;
            }

            public Builder clearOsVersion() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearOsVersion();
                return this;
            }

            public Builder clearPlatformSpecific() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearPlatformSpecific();
                return this;
            }

            public Builder clearRooted() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearRooted();
                return this;
            }

            public Builder clearScreenDensity() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearScreenDensity();
                return this;
            }

            public Builder clearScreenHeight() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearScreenHeight();
                return this;
            }

            public Builder clearScreenSize() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearScreenSize();
                return this;
            }

            public Builder clearScreenWidth() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearScreenWidth();
                return this;
            }

            public Builder clearStores() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearStores();
                return this;
            }

            public Builder clearTotalDiskSpace() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearTotalDiskSpace();
                return this;
            }

            public Builder clearTotalRamMemory() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearTotalRamMemory();
                return this;
            }

            public Builder clearWebviewUa() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearWebviewUa();
                return this;
            }

            @Override
            public Android getAndroid() {
                return ((StaticDeviceInfo)this.instance).getAndroid();
            }

            @Override
            public boolean getAppDebuggable() {
                return ((StaticDeviceInfo)this.instance).getAppDebuggable();
            }

            @Override
            public String getBundleId() {
                return ((StaticDeviceInfo)this.instance).getBundleId();
            }

            @Override
            public ByteString getBundleIdBytes() {
                return ((StaticDeviceInfo)this.instance).getBundleIdBytes();
            }

            @Override
            public String getBundleVersion() {
                return ((StaticDeviceInfo)this.instance).getBundleVersion();
            }

            @Override
            public ByteString getBundleVersionBytes() {
                return ((StaticDeviceInfo)this.instance).getBundleVersionBytes();
            }

            @Override
            public long getCpuCount() {
                return ((StaticDeviceInfo)this.instance).getCpuCount();
            }

            @Override
            public String getCpuModel() {
                return ((StaticDeviceInfo)this.instance).getCpuModel();
            }

            @Override
            public ByteString getCpuModelBytes() {
                return ((StaticDeviceInfo)this.instance).getCpuModelBytes();
            }

            @Override
            public String getDeviceMake() {
                return ((StaticDeviceInfo)this.instance).getDeviceMake();
            }

            @Override
            public ByteString getDeviceMakeBytes() {
                return ((StaticDeviceInfo)this.instance).getDeviceMakeBytes();
            }

            @Override
            public String getDeviceModel() {
                return ((StaticDeviceInfo)this.instance).getDeviceModel();
            }

            @Override
            public ByteString getDeviceModelBytes() {
                return ((StaticDeviceInfo)this.instance).getDeviceModelBytes();
            }

            @Override
            public String getGpuModel() {
                return ((StaticDeviceInfo)this.instance).getGpuModel();
            }

            @Override
            public ByteString getGpuModelBytes() {
                return ((StaticDeviceInfo)this.instance).getGpuModelBytes();
            }

            @Override
            public Ios getIos() {
                return ((StaticDeviceInfo)this.instance).getIos();
            }

            @Override
            public boolean getMadeWithUnity() {
                return ((StaticDeviceInfo)this.instance).getMadeWithUnity();
            }

            @Override
            public String getOsVersion() {
                return ((StaticDeviceInfo)this.instance).getOsVersion();
            }

            @Override
            public ByteString getOsVersionBytes() {
                return ((StaticDeviceInfo)this.instance).getOsVersionBytes();
            }

            @Override
            public PlatformSpecificCase getPlatformSpecificCase() {
                return ((StaticDeviceInfo)this.instance).getPlatformSpecificCase();
            }

            @Override
            public boolean getRooted() {
                return ((StaticDeviceInfo)this.instance).getRooted();
            }

            @Override
            public int getScreenDensity() {
                return ((StaticDeviceInfo)this.instance).getScreenDensity();
            }

            @Override
            public int getScreenHeight() {
                return ((StaticDeviceInfo)this.instance).getScreenHeight();
            }

            @Override
            public int getScreenSize() {
                return ((StaticDeviceInfo)this.instance).getScreenSize();
            }

            @Override
            public int getScreenWidth() {
                return ((StaticDeviceInfo)this.instance).getScreenWidth();
            }

            @Override
            public String getStores(int n10) {
                return ((StaticDeviceInfo)this.instance).getStores(n10);
            }

            @Override
            public ByteString getStoresBytes(int n10) {
                return ((StaticDeviceInfo)this.instance).getStoresBytes(n10);
            }

            @Override
            public int getStoresCount() {
                return ((StaticDeviceInfo)this.instance).getStoresCount();
            }

            @Override
            public List<String> getStoresList() {
                return Collections.unmodifiableList(((StaticDeviceInfo)this.instance).getStoresList());
            }

            @Override
            public long getTotalDiskSpace() {
                return ((StaticDeviceInfo)this.instance).getTotalDiskSpace();
            }

            @Override
            public long getTotalRamMemory() {
                return ((StaticDeviceInfo)this.instance).getTotalRamMemory();
            }

            @Override
            public String getWebviewUa() {
                return ((StaticDeviceInfo)this.instance).getWebviewUa();
            }

            @Override
            public ByteString getWebviewUaBytes() {
                return ((StaticDeviceInfo)this.instance).getWebviewUaBytes();
            }

            @Override
            public boolean hasAndroid() {
                return ((StaticDeviceInfo)this.instance).hasAndroid();
            }

            @Override
            public boolean hasAppDebuggable() {
                return ((StaticDeviceInfo)this.instance).hasAppDebuggable();
            }

            @Override
            public boolean hasBundleId() {
                return ((StaticDeviceInfo)this.instance).hasBundleId();
            }

            @Override
            public boolean hasBundleVersion() {
                return ((StaticDeviceInfo)this.instance).hasBundleVersion();
            }

            @Override
            public boolean hasCpuCount() {
                return ((StaticDeviceInfo)this.instance).hasCpuCount();
            }

            @Override
            public boolean hasCpuModel() {
                return ((StaticDeviceInfo)this.instance).hasCpuModel();
            }

            @Override
            public boolean hasDeviceMake() {
                return ((StaticDeviceInfo)this.instance).hasDeviceMake();
            }

            @Override
            public boolean hasDeviceModel() {
                return ((StaticDeviceInfo)this.instance).hasDeviceModel();
            }

            @Override
            public boolean hasGpuModel() {
                return ((StaticDeviceInfo)this.instance).hasGpuModel();
            }

            @Override
            public boolean hasIos() {
                return ((StaticDeviceInfo)this.instance).hasIos();
            }

            @Override
            public boolean hasMadeWithUnity() {
                return ((StaticDeviceInfo)this.instance).hasMadeWithUnity();
            }

            @Override
            public boolean hasOsVersion() {
                return ((StaticDeviceInfo)this.instance).hasOsVersion();
            }

            @Override
            public boolean hasRooted() {
                return ((StaticDeviceInfo)this.instance).hasRooted();
            }

            @Override
            public boolean hasScreenDensity() {
                return ((StaticDeviceInfo)this.instance).hasScreenDensity();
            }

            @Override
            public boolean hasScreenHeight() {
                return ((StaticDeviceInfo)this.instance).hasScreenHeight();
            }

            @Override
            public boolean hasScreenSize() {
                return ((StaticDeviceInfo)this.instance).hasScreenSize();
            }

            @Override
            public boolean hasScreenWidth() {
                return ((StaticDeviceInfo)this.instance).hasScreenWidth();
            }

            @Override
            public boolean hasTotalDiskSpace() {
                return ((StaticDeviceInfo)this.instance).hasTotalDiskSpace();
            }

            @Override
            public boolean hasTotalRamMemory() {
                return ((StaticDeviceInfo)this.instance).hasTotalRamMemory();
            }

            @Override
            public boolean hasWebviewUa() {
                return ((StaticDeviceInfo)this.instance).hasWebviewUa();
            }

            public Builder mergeAndroid(Android android) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).mergeAndroid(android);
                return this;
            }

            public Builder mergeIos(Ios ios) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).mergeIos(ios);
                return this;
            }

            public Builder setAndroid(Android.Builder builder) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setAndroid((Android)builder.build());
                return this;
            }

            public Builder setAndroid(Android android) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setAndroid(android);
                return this;
            }

            public Builder setAppDebuggable(boolean bl2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setAppDebuggable(bl2);
                return this;
            }

            public Builder setBundleId(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setBundleId(string2);
                return this;
            }

            public Builder setBundleIdBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setBundleIdBytes(byteString);
                return this;
            }

            public Builder setBundleVersion(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setBundleVersion(string2);
                return this;
            }

            public Builder setBundleVersionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setBundleVersionBytes(byteString);
                return this;
            }

            public Builder setCpuCount(long l10) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setCpuCount(l10);
                return this;
            }

            public Builder setCpuModel(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setCpuModel(string2);
                return this;
            }

            public Builder setCpuModelBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setCpuModelBytes(byteString);
                return this;
            }

            public Builder setDeviceMake(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setDeviceMake(string2);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            public Builder setDeviceModel(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setDeviceModel(string2);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            public Builder setGpuModel(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setGpuModel(string2);
                return this;
            }

            public Builder setGpuModelBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setGpuModelBytes(byteString);
                return this;
            }

            public Builder setIos(Ios.Builder builder) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setIos((Ios)builder.build());
                return this;
            }

            public Builder setIos(Ios ios) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setIos(ios);
                return this;
            }

            public Builder setMadeWithUnity(boolean bl2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setMadeWithUnity(bl2);
                return this;
            }

            public Builder setOsVersion(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setOsVersion(string2);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setOsVersionBytes(byteString);
                return this;
            }

            public Builder setRooted(boolean bl2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setRooted(bl2);
                return this;
            }

            public Builder setScreenDensity(int n10) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setScreenDensity(n10);
                return this;
            }

            public Builder setScreenHeight(int n10) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setScreenHeight(n10);
                return this;
            }

            public Builder setScreenSize(int n10) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setScreenSize(n10);
                return this;
            }

            public Builder setScreenWidth(int n10) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setScreenWidth(n10);
                return this;
            }

            public Builder setStores(int n10, String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setStores(n10, string2);
                return this;
            }

            public Builder setTotalDiskSpace(long l10) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setTotalDiskSpace(l10);
                return this;
            }

            public Builder setTotalRamMemory(long l10) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setTotalRamMemory(l10);
                return this;
            }

            public Builder setWebviewUa(String string2) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setWebviewUa(string2);
                return this;
            }

            public Builder setWebviewUaBytes(ByteString byteString) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setWebviewUaBytes(byteString);
                return this;
            }
        }

        public static final class Ios
        extends GeneratedMessageLite<Ios, Builder>
        implements IosOrBuilder {
            public static final int BUILT_SDK_VERSION_FIELD_NUMBER = 3;
            public static final int CAN_MAKE_PAYMENTS_FIELD_NUMBER = 6;
            private static final Ios DEFAULT_INSTANCE;
            private static volatile Parser<Ios> PARSER;
            public static final int SCREEN_SCALE_FIELD_NUMBER = 5;
            public static final int SIMULATOR_FIELD_NUMBER = 2;
            public static final int SKADNETWORK_ID_FIELD_NUMBER = 4;
            public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 1;
            public static final int XCODE_BUILD_VERSION_FIELD_NUMBER = 8;
            public static final int XCODE_SDK_BUILD_VERSION_FIELD_NUMBER = 9;
            public static final int XCODE_VERSION_FIELD_NUMBER = 7;
            private int bitField0_;
            private String builtSdkVersion_ = "";
            private boolean canMakePayments_;
            private int screenScale_;
            private boolean simulator_;
            private Internal.ProtobufList<String> skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();
            private long systemBootTime_;
            private String xcodeBuildVersion_ = "";
            private String xcodeSdkBuildVersion_ = "";
            private String xcodeVersion_ = "";

            static {
                Ios ios;
                DEFAULT_INSTANCE = ios = new Ios();
                GeneratedMessageLite.registerDefaultInstance(Ios.class, (GeneratedMessageLite)ios);
            }

            private Ios() {
            }

            private void addAllSkadnetworkId(Iterable<String> iterable) {
                this.ensureSkadnetworkIdIsMutable();
                AbstractMessageLite.addAll(iterable, this.skadnetworkId_);
            }

            private void addSkadnetworkId(String string2) {
                string2.getClass();
                this.ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(string2);
            }

            private void addSkadnetworkIdBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(byteString.toStringUtf8());
            }

            private void clearBuiltSdkVersion() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.builtSdkVersion_ = Ios.getDefaultInstance().getBuiltSdkVersion();
            }

            private void clearCanMakePayments() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.canMakePayments_ = false;
            }

            private void clearScreenScale() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.screenScale_ = 0;
            }

            private void clearSimulator() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.simulator_ = false;
            }

            private void clearSkadnetworkId() {
                this.skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearSystemBootTime() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.systemBootTime_ = 0L;
            }

            private void clearXcodeBuildVersion() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.xcodeBuildVersion_ = Ios.getDefaultInstance().getXcodeBuildVersion();
            }

            private void clearXcodeSdkBuildVersion() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.xcodeSdkBuildVersion_ = Ios.getDefaultInstance().getXcodeSdkBuildVersion();
            }

            private void clearXcodeVersion() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.xcodeVersion_ = Ios.getDefaultInstance().getXcodeVersion();
            }

            private void ensureSkadnetworkIdIsMutable() {
                Internal.ProtobufList<String> protobufList = this.skadnetworkId_;
                if (!protobufList.isModifiable()) {
                    this.skadnetworkId_ = GeneratedMessageLite.mutableCopy(protobufList);
                }
            }

            public static Ios getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Ios ios) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(ios);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ios)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Ios parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Ios parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Ios parseFrom(InputStream inputStream) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Ios parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Ios parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
            }

            public static Ios parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Ios> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBuiltSdkVersion(String string2) {
                string2.getClass();
                this.bitField0_ |= 4;
                this.builtSdkVersion_ = string2;
            }

            private void setBuiltSdkVersionBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.builtSdkVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setCanMakePayments(boolean bl2) {
                this.bitField0_ |= 0x10;
                this.canMakePayments_ = bl2;
            }

            private void setScreenScale(int n10) {
                this.bitField0_ |= 8;
                this.screenScale_ = n10;
            }

            private void setSimulator(boolean bl2) {
                this.bitField0_ |= 2;
                this.simulator_ = bl2;
            }

            private void setSkadnetworkId(int n10, String string2) {
                string2.getClass();
                this.ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.set(n10, string2);
            }

            private void setSystemBootTime(long l10) {
                this.bitField0_ |= 1;
                this.systemBootTime_ = l10;
            }

            private void setXcodeBuildVersion(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x40;
                this.xcodeBuildVersion_ = string2;
            }

            private void setXcodeBuildVersionBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.xcodeBuildVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x40;
            }

            private void setXcodeSdkBuildVersion(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x80;
                this.xcodeSdkBuildVersion_ = string2;
            }

            private void setXcodeSdkBuildVersionBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.xcodeSdkBuildVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x80;
            }

            private void setXcodeVersion(String string2) {
                string2.getClass();
                this.bitField0_ |= 0x20;
                this.xcodeVersion_ = string2;
            }

            private void setXcodeVersionBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
                this.xcodeVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 0x20;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke defaultInstanceBasedParser, Object defaultInstanceBasedParser2, Object object) {
                switch (a.a[defaultInstanceBasedParser.ordinal()]) {
                    default: {
                        throw new UnsupportedOperationException();
                    }
                    case 7: {
                        return null;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 5: {
                        defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                        if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                        synchronized (Ios.class) {
                            try {
                                defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                                if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                                PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                                return defaultInstanceBasedParser;
                            }
                            catch (Throwable throwable) {}
                            throw throwable;
                        }
                    }
                    case 4: {
                        return DEFAULT_INSTANCE;
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1208\u0002\u0004\u021a\u0005\u100b\u0003\u0006\u1007\u0004\u0007\u1208\u0005\b\u1208\u0006\t\u1208\u0007", (Object[])new Object[]{"bitField0_", "systemBootTime_", "simulator_", "builtSdkVersion_", "skadnetworkId_", "screenScale_", "canMakePayments_", "xcodeVersion_", "xcodeBuildVersion_", "xcodeSdkBuildVersion_"});
                    }
                    case 2: {
                        return new Builder();
                    }
                    case 1: 
                }
                return new Ios();
            }

            @Override
            public String getBuiltSdkVersion() {
                return this.builtSdkVersion_;
            }

            @Override
            public ByteString getBuiltSdkVersionBytes() {
                return ByteString.copyFromUtf8((String)this.builtSdkVersion_);
            }

            @Override
            public boolean getCanMakePayments() {
                return this.canMakePayments_;
            }

            @Override
            public int getScreenScale() {
                return this.screenScale_;
            }

            @Override
            public boolean getSimulator() {
                return this.simulator_;
            }

            @Override
            public String getSkadnetworkId(int n10) {
                return (String)this.skadnetworkId_.get(n10);
            }

            @Override
            public ByteString getSkadnetworkIdBytes(int n10) {
                return ByteString.copyFromUtf8((String)((String)this.skadnetworkId_.get(n10)));
            }

            @Override
            public int getSkadnetworkIdCount() {
                return this.skadnetworkId_.size();
            }

            @Override
            public List<String> getSkadnetworkIdList() {
                return this.skadnetworkId_;
            }

            @Override
            public long getSystemBootTime() {
                return this.systemBootTime_;
            }

            @Override
            public String getXcodeBuildVersion() {
                return this.xcodeBuildVersion_;
            }

            @Override
            public ByteString getXcodeBuildVersionBytes() {
                return ByteString.copyFromUtf8((String)this.xcodeBuildVersion_);
            }

            @Override
            public String getXcodeSdkBuildVersion() {
                return this.xcodeSdkBuildVersion_;
            }

            @Override
            public ByteString getXcodeSdkBuildVersionBytes() {
                return ByteString.copyFromUtf8((String)this.xcodeSdkBuildVersion_);
            }

            @Override
            public String getXcodeVersion() {
                return this.xcodeVersion_;
            }

            @Override
            public ByteString getXcodeVersionBytes() {
                return ByteString.copyFromUtf8((String)this.xcodeVersion_);
            }

            @Override
            public boolean hasBuiltSdkVersion() {
                boolean bl2 = (this.bitField0_ & 4) != 0;
                return bl2;
            }

            @Override
            public boolean hasCanMakePayments() {
                boolean bl2 = (this.bitField0_ & 0x10) != 0;
                return bl2;
            }

            @Override
            public boolean hasScreenScale() {
                boolean bl2 = (this.bitField0_ & 8) != 0;
                return bl2;
            }

            @Override
            public boolean hasSimulator() {
                boolean bl2 = (this.bitField0_ & 2) != 0;
                return bl2;
            }

            @Override
            public boolean hasSystemBootTime() {
                int n10 = this.bitField0_;
                boolean bl2 = true;
                if ((n10 & 1) == 0) {
                    bl2 = false;
                }
                return bl2;
            }

            @Override
            public boolean hasXcodeBuildVersion() {
                boolean bl2 = (this.bitField0_ & 0x40) != 0;
                return bl2;
            }

            @Override
            public boolean hasXcodeSdkBuildVersion() {
                boolean bl2 = (this.bitField0_ & 0x80) != 0;
                return bl2;
            }

            @Override
            public boolean hasXcodeVersion() {
                boolean bl2 = (this.bitField0_ & 0x20) != 0;
                return bl2;
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Ios, Builder>
            implements IosOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder addAllSkadnetworkId(Iterable<String> iterable) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addAllSkadnetworkId(iterable);
                    return this;
                }

                public Builder addSkadnetworkId(String string2) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addSkadnetworkId(string2);
                    return this;
                }

                public Builder addSkadnetworkIdBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addSkadnetworkIdBytes(byteString);
                    return this;
                }

                public Builder clearBuiltSdkVersion() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearBuiltSdkVersion();
                    return this;
                }

                public Builder clearCanMakePayments() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearCanMakePayments();
                    return this;
                }

                public Builder clearScreenScale() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearScreenScale();
                    return this;
                }

                public Builder clearSimulator() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearSimulator();
                    return this;
                }

                public Builder clearSkadnetworkId() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearSkadnetworkId();
                    return this;
                }

                public Builder clearSystemBootTime() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearSystemBootTime();
                    return this;
                }

                public Builder clearXcodeBuildVersion() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearXcodeBuildVersion();
                    return this;
                }

                public Builder clearXcodeSdkBuildVersion() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearXcodeSdkBuildVersion();
                    return this;
                }

                public Builder clearXcodeVersion() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearXcodeVersion();
                    return this;
                }

                @Override
                public String getBuiltSdkVersion() {
                    return ((Ios)this.instance).getBuiltSdkVersion();
                }

                @Override
                public ByteString getBuiltSdkVersionBytes() {
                    return ((Ios)this.instance).getBuiltSdkVersionBytes();
                }

                @Override
                public boolean getCanMakePayments() {
                    return ((Ios)this.instance).getCanMakePayments();
                }

                @Override
                public int getScreenScale() {
                    return ((Ios)this.instance).getScreenScale();
                }

                @Override
                public boolean getSimulator() {
                    return ((Ios)this.instance).getSimulator();
                }

                @Override
                public String getSkadnetworkId(int n10) {
                    return ((Ios)this.instance).getSkadnetworkId(n10);
                }

                @Override
                public ByteString getSkadnetworkIdBytes(int n10) {
                    return ((Ios)this.instance).getSkadnetworkIdBytes(n10);
                }

                @Override
                public int getSkadnetworkIdCount() {
                    return ((Ios)this.instance).getSkadnetworkIdCount();
                }

                @Override
                public List<String> getSkadnetworkIdList() {
                    return Collections.unmodifiableList(((Ios)this.instance).getSkadnetworkIdList());
                }

                @Override
                public long getSystemBootTime() {
                    return ((Ios)this.instance).getSystemBootTime();
                }

                @Override
                public String getXcodeBuildVersion() {
                    return ((Ios)this.instance).getXcodeBuildVersion();
                }

                @Override
                public ByteString getXcodeBuildVersionBytes() {
                    return ((Ios)this.instance).getXcodeBuildVersionBytes();
                }

                @Override
                public String getXcodeSdkBuildVersion() {
                    return ((Ios)this.instance).getXcodeSdkBuildVersion();
                }

                @Override
                public ByteString getXcodeSdkBuildVersionBytes() {
                    return ((Ios)this.instance).getXcodeSdkBuildVersionBytes();
                }

                @Override
                public String getXcodeVersion() {
                    return ((Ios)this.instance).getXcodeVersion();
                }

                @Override
                public ByteString getXcodeVersionBytes() {
                    return ((Ios)this.instance).getXcodeVersionBytes();
                }

                @Override
                public boolean hasBuiltSdkVersion() {
                    return ((Ios)this.instance).hasBuiltSdkVersion();
                }

                @Override
                public boolean hasCanMakePayments() {
                    return ((Ios)this.instance).hasCanMakePayments();
                }

                @Override
                public boolean hasScreenScale() {
                    return ((Ios)this.instance).hasScreenScale();
                }

                @Override
                public boolean hasSimulator() {
                    return ((Ios)this.instance).hasSimulator();
                }

                @Override
                public boolean hasSystemBootTime() {
                    return ((Ios)this.instance).hasSystemBootTime();
                }

                @Override
                public boolean hasXcodeBuildVersion() {
                    return ((Ios)this.instance).hasXcodeBuildVersion();
                }

                @Override
                public boolean hasXcodeSdkBuildVersion() {
                    return ((Ios)this.instance).hasXcodeSdkBuildVersion();
                }

                @Override
                public boolean hasXcodeVersion() {
                    return ((Ios)this.instance).hasXcodeVersion();
                }

                public Builder setBuiltSdkVersion(String string2) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setBuiltSdkVersion(string2);
                    return this;
                }

                public Builder setBuiltSdkVersionBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setBuiltSdkVersionBytes(byteString);
                    return this;
                }

                public Builder setCanMakePayments(boolean bl2) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setCanMakePayments(bl2);
                    return this;
                }

                public Builder setScreenScale(int n10) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setScreenScale(n10);
                    return this;
                }

                public Builder setSimulator(boolean bl2) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setSimulator(bl2);
                    return this;
                }

                public Builder setSkadnetworkId(int n10, String string2) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setSkadnetworkId(n10, string2);
                    return this;
                }

                public Builder setSystemBootTime(long l10) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setSystemBootTime(l10);
                    return this;
                }

                public Builder setXcodeBuildVersion(String string2) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeBuildVersion(string2);
                    return this;
                }

                public Builder setXcodeBuildVersionBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeBuildVersionBytes(byteString);
                    return this;
                }

                public Builder setXcodeSdkBuildVersion(String string2) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeSdkBuildVersion(string2);
                    return this;
                }

                public Builder setXcodeSdkBuildVersionBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeSdkBuildVersionBytes(byteString);
                    return this;
                }

                public Builder setXcodeVersion(String string2) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeVersion(string2);
                    return this;
                }

                public Builder setXcodeVersionBytes(ByteString byteString) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeVersionBytes(byteString);
                    return this;
                }
            }
        }

        public static interface IosOrBuilder
        extends MessageLiteOrBuilder {
            public String getBuiltSdkVersion();

            public ByteString getBuiltSdkVersionBytes();

            public boolean getCanMakePayments();

            public int getScreenScale();

            public boolean getSimulator();

            public String getSkadnetworkId(int var1);

            public ByteString getSkadnetworkIdBytes(int var1);

            public int getSkadnetworkIdCount();

            public List<String> getSkadnetworkIdList();

            public long getSystemBootTime();

            public String getXcodeBuildVersion();

            public ByteString getXcodeBuildVersionBytes();

            public String getXcodeSdkBuildVersion();

            public ByteString getXcodeSdkBuildVersionBytes();

            public String getXcodeVersion();

            public ByteString getXcodeVersionBytes();

            public boolean hasBuiltSdkVersion();

            public boolean hasCanMakePayments();

            public boolean hasScreenScale();

            public boolean hasSimulator();

            public boolean hasSystemBootTime();

            public boolean hasXcodeBuildVersion();

            public boolean hasXcodeSdkBuildVersion();

            public boolean hasXcodeVersion();
        }

        public static enum PlatformSpecificCase {
            ANDROID(19),
            IOS(20),
            PLATFORMSPECIFIC_NOT_SET(0);

            private final int value;

            private PlatformSpecificCase(int n13) {
                this.value = n13;
            }

            public static PlatformSpecificCase forNumber(int n10) {
                if (n10 != 0) {
                    if (n10 != 19) {
                        if (n10 != 20) {
                            return null;
                        }
                        return IOS;
                    }
                    return ANDROID;
                }
                return PLATFORMSPECIFIC_NOT_SET;
            }

            public static PlatformSpecificCase valueOf(String string2) {
                return Enum.valueOf(PlatformSpecificCase.class, string2);
            }

            public int getNumber() {
                return this.value;
            }
        }
    }

    public static interface StaticDeviceInfoOrBuilder
    extends MessageLiteOrBuilder {
        public StaticDeviceInfo.Android getAndroid();

        public boolean getAppDebuggable();

        public String getBundleId();

        public ByteString getBundleIdBytes();

        public String getBundleVersion();

        public ByteString getBundleVersionBytes();

        public long getCpuCount();

        public String getCpuModel();

        public ByteString getCpuModelBytes();

        public String getDeviceMake();

        public ByteString getDeviceMakeBytes();

        public String getDeviceModel();

        public ByteString getDeviceModelBytes();

        public String getGpuModel();

        public ByteString getGpuModelBytes();

        public StaticDeviceInfo.Ios getIos();

        public boolean getMadeWithUnity();

        public String getOsVersion();

        public ByteString getOsVersionBytes();

        public StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase();

        public boolean getRooted();

        public int getScreenDensity();

        public int getScreenHeight();

        public int getScreenSize();

        public int getScreenWidth();

        public String getStores(int var1);

        public ByteString getStoresBytes(int var1);

        public int getStoresCount();

        public List<String> getStoresList();

        public long getTotalDiskSpace();

        public long getTotalRamMemory();

        public String getWebviewUa();

        public ByteString getWebviewUaBytes();

        public boolean hasAndroid();

        public boolean hasAppDebuggable();

        public boolean hasBundleId();

        public boolean hasBundleVersion();

        public boolean hasCpuCount();

        public boolean hasCpuModel();

        public boolean hasDeviceMake();

        public boolean hasDeviceModel();

        public boolean hasGpuModel();

        public boolean hasIos();

        public boolean hasMadeWithUnity();

        public boolean hasOsVersion();

        public boolean hasRooted();

        public boolean hasScreenDensity();

        public boolean hasScreenHeight();

        public boolean hasScreenSize();

        public boolean hasScreenWidth();

        public boolean hasTotalDiskSpace();

        public boolean hasTotalRamMemory();

        public boolean hasWebviewUa();
    }
}

