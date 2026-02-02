/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.ColorInt
 *  androidx.collection.a
 */
package io.intercom.android.sdk.identity;

import androidx.annotation.ColorInt;
import androidx.collection.a;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.Space;
import java.util.Collection;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\ba\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0083\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030!\u0012\b\b\u0001\u0010\"\u001a\u00020\u0005\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010+\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020\n\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u00020\n\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u00020\n\u00a2\u0006\u0002\u00106J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\nH\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020\u0012H\u00c6\u0003J\t\u0010f\u001a\u00020\u0012H\u00c6\u0003J\t\u0010g\u001a\u00020\u0012H\u00c6\u0003J\t\u0010h\u001a\u00020\u0012H\u00c6\u0003J\t\u0010i\u001a\u00020\u0012H\u00c6\u0003J\t\u0010j\u001a\u00020\nH\u00c6\u0003J\t\u0010k\u001a\u00020\nH\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\t\u0010q\u001a\u00020\nH\u00c6\u0003J\t\u0010r\u001a\u00020\nH\u00c6\u0003J\t\u0010s\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00030!H\u00c6\u0003J\t\u0010u\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00030!H\u00c6\u0003J\t\u0010w\u001a\u00020\u0005H\u00c6\u0003J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\nH\u00c6\u0003J\t\u0010}\u001a\u00020\nH\u00c6\u0003J\t\u0010~\u001a\u00020\nH\u00c6\u0003J\t\u0010\u007f\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\nH\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010.H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030!H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u000201H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u000204H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\nH\u00c6\u0003J\u00d6\u0003\u0010\u008d\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030!2\b\b\u0003\u0010\"\u001a\u00020\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030!2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030!2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u00020\n2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\nH\u00c6\u0001J\u0015\u0010\u008e\u0001\u001a\u00020\n2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010\u0090\u0001\u001a\u00020\n2\u0007\u0010\u0091\u0001\u001a\u00020\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005H\u00d6\u0001J\u0007\u0010\u0093\u0001\u001a\u00020\nJ\u0011\u0010\u0094\u0001\u001a\u00020\n2\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001J\n\u0010\u0097\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0011\u00105\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u00103\u001a\u000204\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010-\u001a\u0004\u0018\u00010.\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030!\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030!\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010,\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00108R\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030!\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010>R\u0011\u0010)\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u00108R\u0011\u0010\u0018\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u00108R\u0011\u0010\u001e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u00108R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u00108R\u0011\u0010*\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u00108R\u0011\u0010(\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u00108R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u00108R\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u00108R\u0011\u0010+\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u00108R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u00108R\u0011\u0010\u001d\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u00108R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u00108R\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010DR\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010DR\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010DR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010DR\u0011\u00102\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00108R\u0011\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bN\u0010O\u001a\u0004\bP\u0010BR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010BR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010BR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010MR\u0011\u00100\u001a\u000201\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010BR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010BR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00108R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010MR\u0011\u0010'\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010DR\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010DR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010DR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010DR\u0011\u0010\u0016\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010MR\u0011\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010MR\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010D\u00a8\u0006\u0098\u0001"}, d2={"Lio/intercom/android/sdk/identity/AppConfig;", "", "name", "", "primaryColor", "", "primaryColorDark", "secondaryColor", "secondaryColorDark", "isPrimaryColorRenderDarkText", "", "isSecondaryColorRenderDarkText", "isHelpCenterColorRenderDarkText", "shouldShowIntercomLink", "isInboundMessages", "temporaryExpectationsMessage", "rateLimitCount", "rateLimitPeriodMs", "", "userUpdateCacheMaxAgeMs", "newSessionThresholdMs", "softResetTimeoutMs", "uploadSizeLimit", "isMetricsEnabled", "isAudioEnabled", "teamProfileBio", "wallpaper", "locale", "helpCenterLocale", "isReceivedFromServer", "isBackgroundRequestsEnabled", "helpCenterUrl", "helpCenterUrls", "", "helpCenterBaseColor", "features", "launcherLogoUrl", "messengerLogoUrl", "teamIntro", "teamGreeting", "isIdentityVerificationEnabled", "isAccessToTeammateEnabled", "isHelpCenterRequireSearchEnabled", "isPreventMultipleInboundConversationsEnabled", "hasOpenConversations", "configModules", "Lio/intercom/android/sdk/models/ConfigModules;", "fileUploadSupportedFileTypes", "realTimeConfig", "Lio/intercom/android/nexus/NexusConfig;", "newPushUiDisabled", "attachmentSettings", "Lio/intercom/android/sdk/models/AttachmentSettings;", "articleAutoReactionEnabled", "(Ljava/lang/String;IIIIZZZZZLjava/lang/String;IJJJJJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Set;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLio/intercom/android/sdk/models/ConfigModules;Ljava/util/Set;Lio/intercom/android/nexus/NexusConfig;ZLio/intercom/android/sdk/models/AttachmentSettings;Z)V", "getArticleAutoReactionEnabled", "()Z", "getAttachmentSettings", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "getConfigModules", "()Lio/intercom/android/sdk/models/ConfigModules;", "getFeatures", "()Ljava/util/Set;", "getFileUploadSupportedFileTypes", "getHasOpenConversations", "getHelpCenterBaseColor", "()I", "getHelpCenterLocale", "()Ljava/lang/String;", "getHelpCenterUrl", "getHelpCenterUrls", "getLauncherLogoUrl", "getLocale", "getMessengerLogoUrl", "getName", "getNewPushUiDisabled", "getNewSessionThresholdMs", "()J", "getPrimaryColor$annotations", "()V", "getPrimaryColor", "getPrimaryColorDark", "getRateLimitCount", "getRateLimitPeriodMs", "getRealTimeConfig", "()Lio/intercom/android/nexus/NexusConfig;", "getSecondaryColor", "getSecondaryColorDark", "getShouldShowIntercomLink", "getSoftResetTimeoutMs", "getTeamGreeting", "getTeamIntro", "getTeamProfileBio", "getTemporaryExpectationsMessage", "getUploadSizeLimit", "getUserUpdateCacheMaxAgeMs", "getWallpaper", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hasFeature", "feature", "hashCode", "isBackgroundRequestsDisabled", "isSpaceEnabled", "space", "Lio/intercom/android/sdk/models/Space$Type;", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
@SourceDebugExtension(value={"SMAP\nAppConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppConfig.kt\nio/intercom/android/sdk/identity/AppConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1747#2,3:299\n*S KotlinDebug\n*F\n+ 1 AppConfig.kt\nio/intercom/android/sdk/identity/AppConfig\n*L\n70#1:299,3\n*E\n"})
public final class AppConfig {
    private final boolean articleAutoReactionEnabled;
    @NotNull
    private final AttachmentSettings attachmentSettings;
    @Nullable
    private final ConfigModules configModules;
    @NotNull
    private final Set<String> features;
    @NotNull
    private final Set<String> fileUploadSupportedFileTypes;
    private final boolean hasOpenConversations;
    private final int helpCenterBaseColor;
    @NotNull
    private final String helpCenterLocale;
    @NotNull
    private final String helpCenterUrl;
    @NotNull
    private final Set<String> helpCenterUrls;
    private final boolean isAccessToTeammateEnabled;
    private final boolean isAudioEnabled;
    private final boolean isBackgroundRequestsEnabled;
    private final boolean isHelpCenterColorRenderDarkText;
    private final boolean isHelpCenterRequireSearchEnabled;
    private final boolean isIdentityVerificationEnabled;
    private final boolean isInboundMessages;
    private final boolean isMetricsEnabled;
    private final boolean isPreventMultipleInboundConversationsEnabled;
    private final boolean isPrimaryColorRenderDarkText;
    private final boolean isReceivedFromServer;
    private final boolean isSecondaryColorRenderDarkText;
    @NotNull
    private final String launcherLogoUrl;
    @NotNull
    private final String locale;
    @NotNull
    private final String messengerLogoUrl;
    @NotNull
    private final String name;
    private final boolean newPushUiDisabled;
    private final long newSessionThresholdMs;
    private final int primaryColor;
    private final int primaryColorDark;
    private final int rateLimitCount;
    private final long rateLimitPeriodMs;
    @NotNull
    private final NexusConfig realTimeConfig;
    private final int secondaryColor;
    private final int secondaryColorDark;
    private final boolean shouldShowIntercomLink;
    private final long softResetTimeoutMs;
    @NotNull
    private final String teamGreeting;
    @NotNull
    private final String teamIntro;
    @NotNull
    private final String teamProfileBio;
    @NotNull
    private final String temporaryExpectationsMessage;
    private final long uploadSizeLimit;
    private final long userUpdateCacheMaxAgeMs;
    @NotNull
    private final String wallpaper;

    public AppConfig(@NotNull String string2, @ColorInt int n10, @ColorInt int n13, @ColorInt int n14, @ColorInt int n15, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, @NotNull String string3, int n16, long l10, long l11, long l13, long l14, long l15, boolean bl7, boolean bl8, @NotNull String string4, @NotNull String string5, @NotNull String string6, @NotNull String string7, boolean bl9, boolean bl10, @NotNull String string8, @NotNull Set<String> set, @ColorInt int n17, @NotNull Set<String> set2, @NotNull String string9, @NotNull String string10, @NotNull String string11, @NotNull String string12, boolean bl11, boolean bl12, boolean bl13, boolean bl14, boolean bl15, @Nullable ConfigModules configModules, @NotNull Set<String> set3, @NotNull NexusConfig nexusConfig, boolean bl16, @NotNull AttachmentSettings attachmentSettings, boolean bl17) {
        y.j(string2, "name");
        y.j(string3, "temporaryExpectationsMessage");
        y.j(string4, "teamProfileBio");
        y.j(string5, "wallpaper");
        y.j(string6, "locale");
        y.j(string7, "helpCenterLocale");
        y.j(string8, "helpCenterUrl");
        y.j(set, "helpCenterUrls");
        y.j(set2, "features");
        y.j(string9, "launcherLogoUrl");
        y.j(string10, "messengerLogoUrl");
        y.j(string11, "teamIntro");
        y.j(string12, "teamGreeting");
        y.j(set3, "fileUploadSupportedFileTypes");
        y.j(nexusConfig, "realTimeConfig");
        y.j(attachmentSettings, "attachmentSettings");
        this.name = string2;
        this.primaryColor = n10;
        this.primaryColorDark = n13;
        this.secondaryColor = n14;
        this.secondaryColorDark = n15;
        this.isPrimaryColorRenderDarkText = bl2;
        this.isSecondaryColorRenderDarkText = bl3;
        this.isHelpCenterColorRenderDarkText = bl4;
        this.shouldShowIntercomLink = bl5;
        this.isInboundMessages = bl6;
        this.temporaryExpectationsMessage = string3;
        this.rateLimitCount = n16;
        this.rateLimitPeriodMs = l10;
        this.userUpdateCacheMaxAgeMs = l11;
        this.newSessionThresholdMs = l13;
        this.softResetTimeoutMs = l14;
        this.uploadSizeLimit = l15;
        this.isMetricsEnabled = bl7;
        this.isAudioEnabled = bl8;
        this.teamProfileBio = string4;
        this.wallpaper = string5;
        this.locale = string6;
        this.helpCenterLocale = string7;
        this.isReceivedFromServer = bl9;
        this.isBackgroundRequestsEnabled = bl10;
        this.helpCenterUrl = string8;
        this.helpCenterUrls = set;
        this.helpCenterBaseColor = n17;
        this.features = set2;
        this.launcherLogoUrl = string9;
        this.messengerLogoUrl = string10;
        this.teamIntro = string11;
        this.teamGreeting = string12;
        this.isIdentityVerificationEnabled = bl11;
        this.isAccessToTeammateEnabled = bl12;
        this.isHelpCenterRequireSearchEnabled = bl13;
        this.isPreventMultipleInboundConversationsEnabled = bl14;
        this.hasOpenConversations = bl15;
        this.configModules = configModules;
        this.fileUploadSupportedFileTypes = set3;
        this.realTimeConfig = nexusConfig;
        this.newPushUiDisabled = bl16;
        this.attachmentSettings = attachmentSettings;
        this.articleAutoReactionEnabled = bl17;
    }

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String string2, int n10, int n13, int n14, int n15, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, String string3, int n16, long l10, long l11, long l13, long l14, long l15, boolean bl7, boolean bl8, String string4, String string5, String string6, String string7, boolean bl9, boolean bl10, String string8, Set set, int n17, Set set2, String string9, String string10, String string11, String string12, boolean bl11, boolean bl12, boolean bl13, boolean bl14, boolean bl15, ConfigModules configModules, Set set3, NexusConfig nexusConfig, boolean bl16, AttachmentSettings attachmentSettings, boolean bl17, int n18, int n19, Object object) {
        block43: {
            if ((n18 & 1) != 0) {
                string2 = appConfig.name;
            }
            if ((n18 & 2) != 0) {
                n10 = appConfig.primaryColor;
            }
            if ((n18 & 4) != 0) {
                n13 = appConfig.primaryColorDark;
            }
            if ((n18 & 8) != 0) {
                n14 = appConfig.secondaryColor;
            }
            if ((n18 & 0x10) != 0) {
                n15 = appConfig.secondaryColorDark;
            }
            if ((n18 & 0x20) != 0) {
                bl2 = appConfig.isPrimaryColorRenderDarkText;
            }
            if ((n18 & 0x40) != 0) {
                bl3 = appConfig.isSecondaryColorRenderDarkText;
            }
            if ((n18 & 0x80) != 0) {
                bl4 = appConfig.isHelpCenterColorRenderDarkText;
            }
            if ((n18 & 0x100) != 0) {
                bl5 = appConfig.shouldShowIntercomLink;
            }
            if ((n18 & 0x200) != 0) {
                bl6 = appConfig.isInboundMessages;
            }
            if ((n18 & 0x400) != 0) {
                string3 = appConfig.temporaryExpectationsMessage;
            }
            if ((n18 & 0x800) != 0) {
                n16 = appConfig.rateLimitCount;
            }
            if ((n18 & 0x1000) != 0) {
                l10 = appConfig.rateLimitPeriodMs;
            }
            if ((n18 & 0x2000) != 0) {
                l11 = appConfig.userUpdateCacheMaxAgeMs;
            }
            if ((n18 & 0x4000) != 0) {
                l13 = appConfig.newSessionThresholdMs;
            }
            if ((n18 & 0x8000) != 0) {
                l14 = appConfig.softResetTimeoutMs;
            }
            if ((n18 & 0x10000) != 0) {
                l15 = appConfig.uploadSizeLimit;
            }
            if ((n18 & 0x20000) != 0) {
                bl7 = appConfig.isMetricsEnabled;
            }
            if ((0x40000 & n18) != 0) {
                bl8 = appConfig.isAudioEnabled;
            }
            if ((n18 & 0x80000) != 0) {
                string4 = appConfig.teamProfileBio;
            }
            if ((n18 & 0x100000) != 0) {
                string5 = appConfig.wallpaper;
            }
            if ((n18 & 0x200000) != 0) {
                string6 = appConfig.locale;
            }
            if ((n18 & 0x400000) != 0) {
                string7 = appConfig.helpCenterLocale;
            }
            if ((n18 & 0x800000) != 0) {
                bl9 = appConfig.isReceivedFromServer;
            }
            if ((n18 & 0x1000000) != 0) {
                bl10 = appConfig.isBackgroundRequestsEnabled;
            }
            if ((n18 & 0x2000000) != 0) {
                string8 = appConfig.helpCenterUrl;
            }
            if ((n18 & 0x4000000) != 0) {
                set = appConfig.helpCenterUrls;
            }
            if ((n18 & 0x8000000) != 0) {
                n17 = appConfig.helpCenterBaseColor;
            }
            if ((n18 & 0x10000000) != 0) {
                set2 = appConfig.features;
            }
            if ((n18 & 0x20000000) != 0) {
                string9 = appConfig.launcherLogoUrl;
            }
            if ((n18 & 0x40000000) != 0) {
                string10 = appConfig.messengerLogoUrl;
            }
            if ((n18 & Integer.MIN_VALUE) != 0) {
                string11 = appConfig.teamIntro;
            }
            if ((n19 & 1) != 0) {
                string12 = appConfig.teamGreeting;
            }
            if ((n19 & 2) != 0) {
                bl11 = appConfig.isIdentityVerificationEnabled;
            }
            if ((n19 & 4) != 0) {
                bl12 = appConfig.isAccessToTeammateEnabled;
            }
            if ((n19 & 8) != 0) {
                bl13 = appConfig.isHelpCenterRequireSearchEnabled;
            }
            if ((n19 & 0x10) != 0) {
                bl14 = appConfig.isPreventMultipleInboundConversationsEnabled;
            }
            if ((n19 & 0x20) != 0) {
                bl15 = appConfig.hasOpenConversations;
            }
            if ((n19 & 0x40) != 0) {
                configModules = appConfig.configModules;
            }
            if ((n19 & 0x80) != 0) {
                set3 = appConfig.fileUploadSupportedFileTypes;
            }
            if ((n19 & 0x100) != 0) {
                nexusConfig = appConfig.realTimeConfig;
            }
            if ((n19 & 0x200) != 0) {
                bl16 = appConfig.newPushUiDisabled;
            }
            if ((n19 & 0x400) != 0) {
                attachmentSettings = appConfig.attachmentSettings;
            }
            if ((n19 & 0x800) == 0) break block43;
            bl17 = appConfig.articleAutoReactionEnabled;
        }
        return appConfig.copy(string2, n10, n13, n14, n15, bl2, bl3, bl4, bl5, bl6, string3, n16, l10, l11, l13, l14, l15, bl7, bl8, string4, string5, string6, string7, bl9, bl10, string8, set, n17, set2, string9, string10, string11, string12, bl11, bl12, bl13, bl14, bl15, configModules, set3, nexusConfig, bl16, attachmentSettings, bl17);
    }

    @Deprecated(message="Use MaterialTheme.colors.primary instead")
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.isInboundMessages;
    }

    @NotNull
    public final String component11() {
        return this.temporaryExpectationsMessage;
    }

    public final int component12() {
        return this.rateLimitCount;
    }

    public final long component13() {
        return this.rateLimitPeriodMs;
    }

    public final long component14() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final long component15() {
        return this.newSessionThresholdMs;
    }

    public final long component16() {
        return this.softResetTimeoutMs;
    }

    public final long component17() {
        return this.uploadSizeLimit;
    }

    public final boolean component18() {
        return this.isMetricsEnabled;
    }

    public final boolean component19() {
        return this.isAudioEnabled;
    }

    public final int component2() {
        return this.primaryColor;
    }

    @NotNull
    public final String component20() {
        return this.teamProfileBio;
    }

    @NotNull
    public final String component21() {
        return this.wallpaper;
    }

    @NotNull
    public final String component22() {
        return this.locale;
    }

    @NotNull
    public final String component23() {
        return this.helpCenterLocale;
    }

    public final boolean component24() {
        return this.isReceivedFromServer;
    }

    public final boolean component25() {
        return this.isBackgroundRequestsEnabled;
    }

    @NotNull
    public final String component26() {
        return this.helpCenterUrl;
    }

    @NotNull
    public final Set<String> component27() {
        return this.helpCenterUrls;
    }

    public final int component28() {
        return this.helpCenterBaseColor;
    }

    @NotNull
    public final Set<String> component29() {
        return this.features;
    }

    public final int component3() {
        return this.primaryColorDark;
    }

    @NotNull
    public final String component30() {
        return this.launcherLogoUrl;
    }

    @NotNull
    public final String component31() {
        return this.messengerLogoUrl;
    }

    @NotNull
    public final String component32() {
        return this.teamIntro;
    }

    @NotNull
    public final String component33() {
        return this.teamGreeting;
    }

    public final boolean component34() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean component35() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean component36() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean component37() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean component38() {
        return this.hasOpenConversations;
    }

    @Nullable
    public final ConfigModules component39() {
        return this.configModules;
    }

    public final int component4() {
        return this.secondaryColor;
    }

    @NotNull
    public final Set<String> component40() {
        return this.fileUploadSupportedFileTypes;
    }

    @NotNull
    public final NexusConfig component41() {
        return this.realTimeConfig;
    }

    public final boolean component42() {
        return this.newPushUiDisabled;
    }

    @NotNull
    public final AttachmentSettings component43() {
        return this.attachmentSettings;
    }

    public final boolean component44() {
        return this.articleAutoReactionEnabled;
    }

    public final int component5() {
        return this.secondaryColorDark;
    }

    public final boolean component6() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component7() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean component8() {
        return this.isHelpCenterColorRenderDarkText;
    }

    public final boolean component9() {
        return this.shouldShowIntercomLink;
    }

    @NotNull
    public final AppConfig copy(@NotNull String string2, @ColorInt int n10, @ColorInt int n13, @ColorInt int n14, @ColorInt int n15, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, @NotNull String string3, int n16, long l10, long l11, long l13, long l14, long l15, boolean bl7, boolean bl8, @NotNull String string4, @NotNull String string5, @NotNull String string6, @NotNull String string7, boolean bl9, boolean bl10, @NotNull String string8, @NotNull Set<String> set, @ColorInt int n17, @NotNull Set<String> set2, @NotNull String string9, @NotNull String string10, @NotNull String string11, @NotNull String string12, boolean bl11, boolean bl12, boolean bl13, boolean bl14, boolean bl15, @Nullable ConfigModules configModules, @NotNull Set<String> set3, @NotNull NexusConfig nexusConfig, boolean bl16, @NotNull AttachmentSettings attachmentSettings, boolean bl17) {
        y.j(string2, "name");
        y.j(string3, "temporaryExpectationsMessage");
        y.j(string4, "teamProfileBio");
        y.j(string5, "wallpaper");
        y.j(string6, "locale");
        y.j(string7, "helpCenterLocale");
        y.j(string8, "helpCenterUrl");
        y.j(set, "helpCenterUrls");
        y.j(set2, "features");
        y.j(string9, "launcherLogoUrl");
        y.j(string10, "messengerLogoUrl");
        y.j(string11, "teamIntro");
        y.j(string12, "teamGreeting");
        y.j(set3, "fileUploadSupportedFileTypes");
        y.j(nexusConfig, "realTimeConfig");
        y.j(attachmentSettings, "attachmentSettings");
        return new AppConfig(string2, n10, n13, n14, n15, bl2, bl3, bl4, bl5, bl6, string3, n16, l10, l11, l13, l14, l15, bl7, bl8, string4, string5, string6, string7, bl9, bl10, string8, set, n17, set2, string9, string10, string11, string12, bl11, bl12, bl13, bl14, bl15, configModules, set3, nexusConfig, bl16, attachmentSettings, bl17);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AppConfig)) {
            return false;
        }
        object = (AppConfig)object;
        if (!y.e(this.name, ((AppConfig)object).name)) {
            return false;
        }
        if (this.primaryColor != ((AppConfig)object).primaryColor) {
            return false;
        }
        if (this.primaryColorDark != ((AppConfig)object).primaryColorDark) {
            return false;
        }
        if (this.secondaryColor != ((AppConfig)object).secondaryColor) {
            return false;
        }
        if (this.secondaryColorDark != ((AppConfig)object).secondaryColorDark) {
            return false;
        }
        if (this.isPrimaryColorRenderDarkText != ((AppConfig)object).isPrimaryColorRenderDarkText) {
            return false;
        }
        if (this.isSecondaryColorRenderDarkText != ((AppConfig)object).isSecondaryColorRenderDarkText) {
            return false;
        }
        if (this.isHelpCenterColorRenderDarkText != ((AppConfig)object).isHelpCenterColorRenderDarkText) {
            return false;
        }
        if (this.shouldShowIntercomLink != ((AppConfig)object).shouldShowIntercomLink) {
            return false;
        }
        if (this.isInboundMessages != ((AppConfig)object).isInboundMessages) {
            return false;
        }
        if (!y.e(this.temporaryExpectationsMessage, ((AppConfig)object).temporaryExpectationsMessage)) {
            return false;
        }
        if (this.rateLimitCount != ((AppConfig)object).rateLimitCount) {
            return false;
        }
        if (this.rateLimitPeriodMs != ((AppConfig)object).rateLimitPeriodMs) {
            return false;
        }
        if (this.userUpdateCacheMaxAgeMs != ((AppConfig)object).userUpdateCacheMaxAgeMs) {
            return false;
        }
        if (this.newSessionThresholdMs != ((AppConfig)object).newSessionThresholdMs) {
            return false;
        }
        if (this.softResetTimeoutMs != ((AppConfig)object).softResetTimeoutMs) {
            return false;
        }
        if (this.uploadSizeLimit != ((AppConfig)object).uploadSizeLimit) {
            return false;
        }
        if (this.isMetricsEnabled != ((AppConfig)object).isMetricsEnabled) {
            return false;
        }
        if (this.isAudioEnabled != ((AppConfig)object).isAudioEnabled) {
            return false;
        }
        if (!y.e(this.teamProfileBio, ((AppConfig)object).teamProfileBio)) {
            return false;
        }
        if (!y.e(this.wallpaper, ((AppConfig)object).wallpaper)) {
            return false;
        }
        if (!y.e(this.locale, ((AppConfig)object).locale)) {
            return false;
        }
        if (!y.e(this.helpCenterLocale, ((AppConfig)object).helpCenterLocale)) {
            return false;
        }
        if (this.isReceivedFromServer != ((AppConfig)object).isReceivedFromServer) {
            return false;
        }
        if (this.isBackgroundRequestsEnabled != ((AppConfig)object).isBackgroundRequestsEnabled) {
            return false;
        }
        if (!y.e(this.helpCenterUrl, ((AppConfig)object).helpCenterUrl)) {
            return false;
        }
        if (!y.e(this.helpCenterUrls, ((AppConfig)object).helpCenterUrls)) {
            return false;
        }
        if (this.helpCenterBaseColor != ((AppConfig)object).helpCenterBaseColor) {
            return false;
        }
        if (!y.e(this.features, ((AppConfig)object).features)) {
            return false;
        }
        if (!y.e(this.launcherLogoUrl, ((AppConfig)object).launcherLogoUrl)) {
            return false;
        }
        if (!y.e(this.messengerLogoUrl, ((AppConfig)object).messengerLogoUrl)) {
            return false;
        }
        if (!y.e(this.teamIntro, ((AppConfig)object).teamIntro)) {
            return false;
        }
        if (!y.e(this.teamGreeting, ((AppConfig)object).teamGreeting)) {
            return false;
        }
        if (this.isIdentityVerificationEnabled != ((AppConfig)object).isIdentityVerificationEnabled) {
            return false;
        }
        if (this.isAccessToTeammateEnabled != ((AppConfig)object).isAccessToTeammateEnabled) {
            return false;
        }
        if (this.isHelpCenterRequireSearchEnabled != ((AppConfig)object).isHelpCenterRequireSearchEnabled) {
            return false;
        }
        if (this.isPreventMultipleInboundConversationsEnabled != ((AppConfig)object).isPreventMultipleInboundConversationsEnabled) {
            return false;
        }
        if (this.hasOpenConversations != ((AppConfig)object).hasOpenConversations) {
            return false;
        }
        if (!y.e(this.configModules, ((AppConfig)object).configModules)) {
            return false;
        }
        if (!y.e(this.fileUploadSupportedFileTypes, ((AppConfig)object).fileUploadSupportedFileTypes)) {
            return false;
        }
        if (!y.e(this.realTimeConfig, ((AppConfig)object).realTimeConfig)) {
            return false;
        }
        if (this.newPushUiDisabled != ((AppConfig)object).newPushUiDisabled) {
            return false;
        }
        if (!y.e(this.attachmentSettings, ((AppConfig)object).attachmentSettings)) {
            return false;
        }
        return this.articleAutoReactionEnabled == ((AppConfig)object).articleAutoReactionEnabled;
    }

    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    @NotNull
    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    @Nullable
    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    @NotNull
    public final Set<String> getFeatures() {
        return this.features;
    }

    @NotNull
    public final Set<String> getFileUploadSupportedFileTypes() {
        return this.fileUploadSupportedFileTypes;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final int getHelpCenterBaseColor() {
        return this.helpCenterBaseColor;
    }

    @NotNull
    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    @NotNull
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    @NotNull
    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    @NotNull
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getMessengerLogoUrl() {
        return this.messengerLogoUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getNewPushUiDisabled() {
        return this.newPushUiDisabled;
    }

    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getPrimaryColorDark() {
        return this.primaryColorDark;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    @NotNull
    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    public final boolean getShouldShowIntercomLink() {
        return this.shouldShowIntercomLink;
    }

    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    @NotNull
    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    @NotNull
    public final String getTeamIntro() {
        return this.teamIntro;
    }

    @NotNull
    public final String getTeamProfileBio() {
        return this.teamProfileBio;
    }

    @NotNull
    public final String getTemporaryExpectationsMessage() {
        return this.temporaryExpectationsMessage;
    }

    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    @NotNull
    public final String getWallpaper() {
        return this.wallpaper;
    }

    public final boolean hasFeature(@NotNull String string2) {
        y.j(string2, "feature");
        return this.features.contains(string2);
    }

    public int hashCode() {
        int n10;
        ConfigModules configModules;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n23;
        int n24;
        int n25;
        int n26;
        int n27;
        int n28;
        int n29 = this.name.hashCode();
        int n33 = this.primaryColor;
        int n34 = this.primaryColorDark;
        int n35 = this.secondaryColor;
        int n36 = this.secondaryColorDark;
        int n37 = this.isPrimaryColorRenderDarkText;
        int n38 = 1;
        int n39 = n37;
        if (n37 != 0) {
            n39 = 1;
        }
        n37 = n28 = this.isSecondaryColorRenderDarkText;
        if (n28 != 0) {
            n37 = 1;
        }
        n28 = n27 = this.isHelpCenterColorRenderDarkText;
        if (n27 != 0) {
            n28 = 1;
        }
        n27 = n26 = this.shouldShowIntercomLink;
        if (n26 != 0) {
            n27 = 1;
        }
        n26 = n25 = this.isInboundMessages;
        if (n25 != 0) {
            n26 = 1;
        }
        int n42 = this.temporaryExpectationsMessage.hashCode();
        int n44 = this.rateLimitCount;
        int n45 = a.a((long)this.rateLimitPeriodMs);
        int n46 = a.a((long)this.userUpdateCacheMaxAgeMs);
        int n47 = a.a((long)this.newSessionThresholdMs);
        int n48 = a.a((long)this.softResetTimeoutMs);
        int n49 = a.a((long)this.uploadSizeLimit);
        n25 = n24 = this.isMetricsEnabled;
        if (n24 != 0) {
            n25 = 1;
        }
        n24 = n23 = this.isAudioEnabled;
        if (n23 != 0) {
            n24 = 1;
        }
        int n54 = this.teamProfileBio.hashCode();
        int n55 = this.wallpaper.hashCode();
        int n56 = this.locale.hashCode();
        int n57 = this.helpCenterLocale.hashCode();
        n23 = n19 = this.isReceivedFromServer;
        if (n19 != 0) {
            n23 = 1;
        }
        n19 = n18 = this.isBackgroundRequestsEnabled;
        if (n18 != 0) {
            n19 = 1;
        }
        int n58 = this.helpCenterUrl.hashCode();
        int n59 = ((Object)this.helpCenterUrls).hashCode();
        int n63 = this.helpCenterBaseColor;
        int n64 = ((Object)this.features).hashCode();
        int n65 = this.launcherLogoUrl.hashCode();
        int n66 = this.messengerLogoUrl.hashCode();
        int n67 = this.teamIntro.hashCode();
        int n68 = this.teamGreeting.hashCode();
        n18 = n17 = this.isIdentityVerificationEnabled;
        if (n17 != 0) {
            n18 = 1;
        }
        n17 = n16 = this.isAccessToTeammateEnabled;
        if (n16 != 0) {
            n17 = 1;
        }
        n16 = n15 = this.isHelpCenterRequireSearchEnabled;
        if (n15 != 0) {
            n16 = 1;
        }
        n15 = n14 = this.isPreventMultipleInboundConversationsEnabled;
        if (n14 != 0) {
            n15 = 1;
        }
        n14 = n13 = this.hasOpenConversations;
        if (n13 != 0) {
            n14 = 1;
        }
        n13 = (configModules = this.configModules) == null ? 0 : configModules.hashCode();
        int n69 = ((Object)this.fileUploadSupportedFileTypes).hashCode();
        int n73 = this.realTimeConfig.hashCode();
        int n74 = n10 = this.newPushUiDisabled;
        if (n10 != 0) {
            n74 = 1;
        }
        int n75 = this.attachmentSettings.hashCode();
        n10 = this.articleAutoReactionEnabled;
        if (n10 == 0) {
            n38 = n10;
        }
        return ((((((((((((((((((((((((((((((((((((((((((n29 * 31 + n33) * 31 + n34) * 31 + n35) * 31 + n36) * 31 + n39) * 31 + n37) * 31 + n28) * 31 + n27) * 31 + n26) * 31 + n42) * 31 + n44) * 31 + n45) * 31 + n46) * 31 + n47) * 31 + n48) * 31 + n49) * 31 + n25) * 31 + n24) * 31 + n54) * 31 + n55) * 31 + n56) * 31 + n57) * 31 + n23) * 31 + n19) * 31 + n58) * 31 + n59) * 31 + n63) * 31 + n64) * 31 + n65) * 31 + n66) * 31 + n67) * 31 + n68) * 31 + n18) * 31 + n17) * 31 + n16) * 31 + n15) * 31 + n14) * 31 + n13) * 31 + n69) * 31 + n73) * 31 + n74) * 31 + n75) * 31 + n38;
    }

    public final boolean isAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsDisabled() {
        return this.isBackgroundRequestsEnabled ^ true;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isHelpCenterColorRenderDarkText() {
        return this.isHelpCenterColorRenderDarkText;
    }

    public final boolean isHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean isIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean isSpaceEnabled(@NotNull Space.Type type) {
        boolean bl2;
        block7: {
            boolean bl3;
            y.j((Object)type, "space");
            Object object = this.configModules;
            bl2 = bl3 = false;
            if (object != null) {
                object = ((ConfigModules)object).getHome();
                bl2 = bl3;
                if (object != null) {
                    object = ((HomeConfig)object).getOpenConfig();
                    bl2 = bl3;
                    if (object != null) {
                        object = ((OpenConfig)object).getSpaces();
                        bl2 = bl3;
                        if (object != null) {
                            if ((object = (Iterable)object) instanceof Collection && ((Collection)object).isEmpty()) {
                                bl2 = bl3;
                            } else {
                                object = object.iterator();
                                do {
                                    bl2 = bl3;
                                    if (!object.hasNext()) break block7;
                                } while (((Space)object.next()).getType() != type);
                                bl2 = true;
                            }
                        }
                    }
                }
            }
        }
        return bl2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AppConfig(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", primaryColor=");
        stringBuilder.append(this.primaryColor);
        stringBuilder.append(", primaryColorDark=");
        stringBuilder.append(this.primaryColorDark);
        stringBuilder.append(", secondaryColor=");
        stringBuilder.append(this.secondaryColor);
        stringBuilder.append(", secondaryColorDark=");
        stringBuilder.append(this.secondaryColorDark);
        stringBuilder.append(", isPrimaryColorRenderDarkText=");
        stringBuilder.append(this.isPrimaryColorRenderDarkText);
        stringBuilder.append(", isSecondaryColorRenderDarkText=");
        stringBuilder.append(this.isSecondaryColorRenderDarkText);
        stringBuilder.append(", isHelpCenterColorRenderDarkText=");
        stringBuilder.append(this.isHelpCenterColorRenderDarkText);
        stringBuilder.append(", shouldShowIntercomLink=");
        stringBuilder.append(this.shouldShowIntercomLink);
        stringBuilder.append(", isInboundMessages=");
        stringBuilder.append(this.isInboundMessages);
        stringBuilder.append(", temporaryExpectationsMessage=");
        stringBuilder.append(this.temporaryExpectationsMessage);
        stringBuilder.append(", rateLimitCount=");
        stringBuilder.append(this.rateLimitCount);
        stringBuilder.append(", rateLimitPeriodMs=");
        stringBuilder.append(this.rateLimitPeriodMs);
        stringBuilder.append(", userUpdateCacheMaxAgeMs=");
        stringBuilder.append(this.userUpdateCacheMaxAgeMs);
        stringBuilder.append(", newSessionThresholdMs=");
        stringBuilder.append(this.newSessionThresholdMs);
        stringBuilder.append(", softResetTimeoutMs=");
        stringBuilder.append(this.softResetTimeoutMs);
        stringBuilder.append(", uploadSizeLimit=");
        stringBuilder.append(this.uploadSizeLimit);
        stringBuilder.append(", isMetricsEnabled=");
        stringBuilder.append(this.isMetricsEnabled);
        stringBuilder.append(", isAudioEnabled=");
        stringBuilder.append(this.isAudioEnabled);
        stringBuilder.append(", teamProfileBio=");
        stringBuilder.append(this.teamProfileBio);
        stringBuilder.append(", wallpaper=");
        stringBuilder.append(this.wallpaper);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.locale);
        stringBuilder.append(", helpCenterLocale=");
        stringBuilder.append(this.helpCenterLocale);
        stringBuilder.append(", isReceivedFromServer=");
        stringBuilder.append(this.isReceivedFromServer);
        stringBuilder.append(", isBackgroundRequestsEnabled=");
        stringBuilder.append(this.isBackgroundRequestsEnabled);
        stringBuilder.append(", helpCenterUrl=");
        stringBuilder.append(this.helpCenterUrl);
        stringBuilder.append(", helpCenterUrls=");
        stringBuilder.append(this.helpCenterUrls);
        stringBuilder.append(", helpCenterBaseColor=");
        stringBuilder.append(this.helpCenterBaseColor);
        stringBuilder.append(", features=");
        stringBuilder.append(this.features);
        stringBuilder.append(", launcherLogoUrl=");
        stringBuilder.append(this.launcherLogoUrl);
        stringBuilder.append(", messengerLogoUrl=");
        stringBuilder.append(this.messengerLogoUrl);
        stringBuilder.append(", teamIntro=");
        stringBuilder.append(this.teamIntro);
        stringBuilder.append(", teamGreeting=");
        stringBuilder.append(this.teamGreeting);
        stringBuilder.append(", isIdentityVerificationEnabled=");
        stringBuilder.append(this.isIdentityVerificationEnabled);
        stringBuilder.append(", isAccessToTeammateEnabled=");
        stringBuilder.append(this.isAccessToTeammateEnabled);
        stringBuilder.append(", isHelpCenterRequireSearchEnabled=");
        stringBuilder.append(this.isHelpCenterRequireSearchEnabled);
        stringBuilder.append(", isPreventMultipleInboundConversationsEnabled=");
        stringBuilder.append(this.isPreventMultipleInboundConversationsEnabled);
        stringBuilder.append(", hasOpenConversations=");
        stringBuilder.append(this.hasOpenConversations);
        stringBuilder.append(", configModules=");
        stringBuilder.append(this.configModules);
        stringBuilder.append(", fileUploadSupportedFileTypes=");
        stringBuilder.append(this.fileUploadSupportedFileTypes);
        stringBuilder.append(", realTimeConfig=");
        stringBuilder.append(this.realTimeConfig);
        stringBuilder.append(", newPushUiDisabled=");
        stringBuilder.append(this.newPushUiDisabled);
        stringBuilder.append(", attachmentSettings=");
        stringBuilder.append(this.attachmentSettings);
        stringBuilder.append(", articleAutoReactionEnabled=");
        stringBuilder.append(this.articleAutoReactionEnabled);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

