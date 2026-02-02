/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  androidx.annotation.ColorInt
 *  com.google.gson.Gson
 *  kotlin.collections.b1
 *  kotlin.text.p
 */
package io.intercom.android.sdk.identity;

import android.content.SharedPreferences;
import androidx.annotation.ColorInt;
import com.google.gson.Gson;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0004\u001a\u00020\u0003*\u00020\n2\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\b\u0004\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0013\"\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0013\"\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0013\"\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u0013\"\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u0013\"\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u0013\"\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u0013\"\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u0013\"\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b \u0010\u0013\"\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\u0013\"\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\"\u0010\u0013\"\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b#\u0010\u0013\"\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010\u0013\"\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b%\u0010\u0013\"\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b&\u0010\u0013\"\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b'\u0010\u0013\"\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b(\u0010\u0013\"\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b)\u0010\u0013\"\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b*\u0010\u0013\"\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b+\u0010\u0013\"\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b,\u0010\u0013\"\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010\u0013\"\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010\u0013\"\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u0010\u0013\"\u0014\u00100\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b0\u0010\u0013\"\u0014\u00101\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b1\u0010\u0013\"\u0014\u00102\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b2\u0010\u0013\"\u0014\u00103\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b3\u0010\u0013\"\u0014\u00104\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b4\u0010\u0013\"\u0014\u00105\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b5\u0010\u0013\"\u0014\u00106\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b6\u0010\u0013\"\u0014\u00107\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b7\u0010\u0013\"\u0014\u00108\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b8\u0010\u0013\"\u0014\u00109\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b9\u0010\u0013\"\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b:\u0010\u0013\"\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b;\u0010\u0013\u00a8\u0006<"}, d2={"Lio/intercom/android/sdk/models/Config;", "", "defaultColor", "Lio/intercom/android/sdk/identity/AppConfig;", "getAppConfig", "(Lio/intercom/android/sdk/models/Config;I)Lio/intercom/android/sdk/identity/AppConfig;", "", "color", "getConfigColor", "(Ljava/lang/String;I)I", "Landroid/content/SharedPreferences;", "Lio/intercom/android/nexus/NexusConfig;", "realTimeConfig", "(Landroid/content/SharedPreferences;ILio/intercom/android/nexus/NexusConfig;)Lio/intercom/android/sdk/identity/AppConfig;", "newAppConfig", "Lkotlin/k0;", "setAppConfig", "(Landroid/content/SharedPreferences;Lio/intercom/android/sdk/identity/AppConfig;)V", "APP_NAME", "Ljava/lang/String;", "APP_INTERCOM_LINK", "APP_INBOUND_MESSAGES", "APP_TEMPORARY_EXPECTATIONS_MESSAGE", "APP_TEAM_BIO", "APP_PRIMARY_COLOR", "APP_SECONDARY_COLOR", "APP_PRIMARY_COLOR_RENDER_DARK_TEXT", "APP_SECONDARY_COLOR_RENDER_DARK_TEXT", "APP_HELP_CENTER_COLOR_RENDER_DARK_TEXT", "APP_USER_UPDATE_CACHE_MAX_AGE_MS", "APP_RATE_LIMIT_PERIOD_MS", "APP_SOFT_RESET_TIMEOUT_MS", "APP_NEW_SESSION_THRESHOLD_MS", "APP_UPLOAD_SIZE_LIMIT", "APP_RATE_LIMIT_COUNT", "APP_AUDIO_ENABLED", "APP_METRICS_ENABLED", "APP_WALLPAPER", "APP_LOCALE", "APP_HELP_CENTER_LOCALE", "APP_RECEIVED_FROM_SERVER", "APP_BACKGROUND_REQUESTS_ENABLED", "APP_HELP_CENTER_URL", "APP_HELP_CENTER_URLS", "APP_HELP_CENTER_PRIMARY_COLOR", "APP_FEATURES", "APP_LAUNCHER_LOGO_URL", "APP_MESSENGER_LOGO_URL", "APP_TEAM_INTRO", "APP_TEAM_GREETING", "APP_IDENTITY_VERIFICATION_ENABLED", "APP_ACCESS_TEAMMATE_ENABLED", "APP_HELP_CENTER_REQUIRE_SEARCH", "APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED", "APP_HAS_OPEN_CONVERSATIONS", "APP_HUB_HEADER_CONFIG", "FILE_UPLOAD_SUPPORTED_FILE_TYPES", "NEW_PUSH_UI_DISABLED", "APP_ATTACHMENT_SETTINGS", "APP_ARTICLE_AUTO_REACTION_ENABLED", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nAppConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppConfig.kt\nio/intercom/android/sdk/identity/AppConfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class AppConfigKt {
    @NotNull
    private static final String APP_ACCESS_TEAMMATE_ENABLED = "access_to_teammate_enabled";
    @NotNull
    private static final String APP_ARTICLE_AUTO_REACTION_ENABLED = "article_auto_reaction_enabled";
    @NotNull
    private static final String APP_ATTACHMENT_SETTINGS = "app_attachment_settings";
    @NotNull
    private static final String APP_AUDIO_ENABLED = "app_audio_enabled";
    @NotNull
    private static final String APP_BACKGROUND_REQUESTS_ENABLED = "app_background_requests_enabled";
    @NotNull
    private static final String APP_FEATURES = "features";
    @NotNull
    private static final String APP_HAS_OPEN_CONVERSATIONS = "has_open_conversations";
    @NotNull
    private static final String APP_HELP_CENTER_COLOR_RENDER_DARK_TEXT = "app_help_center_color_render_dark_text";
    @NotNull
    private static final String APP_HELP_CENTER_LOCALE = "help_center_locale";
    @NotNull
    private static final String APP_HELP_CENTER_PRIMARY_COLOR = "app_help_center_primary_color";
    @NotNull
    private static final String APP_HELP_CENTER_REQUIRE_SEARCH = "help_center_require_search";
    @NotNull
    private static final String APP_HELP_CENTER_URL = "help_center_url";
    @NotNull
    private static final String APP_HELP_CENTER_URLS = "help_center_urls";
    @NotNull
    private static final String APP_HUB_HEADER_CONFIG = "hub_config";
    @NotNull
    private static final String APP_IDENTITY_VERIFICATION_ENABLED = "app_identity_verification_enabled";
    @NotNull
    private static final String APP_INBOUND_MESSAGES = "app_inbound_messages";
    @NotNull
    private static final String APP_INTERCOM_LINK = "app_intercom_link";
    @NotNull
    private static final String APP_LAUNCHER_LOGO_URL = "app_launcher_logo_url";
    @NotNull
    private static final String APP_LOCALE = "app_locale";
    @NotNull
    private static final String APP_MESSENGER_LOGO_URL = "app_messenger_logo_url";
    @NotNull
    private static final String APP_METRICS_ENABLED = "app_metrics_enabled";
    @NotNull
    private static final String APP_NAME = "app_name";
    @NotNull
    private static final String APP_NEW_SESSION_THRESHOLD_MS = "new_session_threshold_ms";
    @NotNull
    private static final String APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED = "prevent_multiple_inbound_conversations_enabled";
    @NotNull
    private static final String APP_PRIMARY_COLOR = "app_primary_color";
    @NotNull
    private static final String APP_PRIMARY_COLOR_RENDER_DARK_TEXT = "app_primary_color_render_dark_text";
    @NotNull
    private static final String APP_RATE_LIMIT_COUNT = "app_rate_limit_count";
    @NotNull
    private static final String APP_RATE_LIMIT_PERIOD_MS = "app_rate_limit_period_ms";
    @NotNull
    private static final String APP_RECEIVED_FROM_SERVER = "app_received_from_server";
    @NotNull
    private static final String APP_SECONDARY_COLOR = "app_secondary_color";
    @NotNull
    private static final String APP_SECONDARY_COLOR_RENDER_DARK_TEXT = "app_secondary_color_render_dark_text";
    @NotNull
    private static final String APP_SOFT_RESET_TIMEOUT_MS = "app_soft_reset_timeout_ms";
    @NotNull
    private static final String APP_TEAM_BIO = "app_team_bio";
    @NotNull
    private static final String APP_TEAM_GREETING = "app_team_greeting";
    @NotNull
    private static final String APP_TEAM_INTRO = "app_team_intro";
    @NotNull
    private static final String APP_TEMPORARY_EXPECTATIONS_MESSAGE = "app_temporary_expectations_message";
    @NotNull
    private static final String APP_UPLOAD_SIZE_LIMIT = "upload_size_limit";
    @NotNull
    private static final String APP_USER_UPDATE_CACHE_MAX_AGE_MS = "app_user_update_cache_max_age_ms";
    @NotNull
    private static final String APP_WALLPAPER = "app_wallpaper";
    @NotNull
    private static final String FILE_UPLOAD_SUPPORTED_FILE_TYPES = "file_upload_extension_trusted_list";
    @NotNull
    private static final String NEW_PUSH_UI_DISABLED = "new_push_ui_disabled";

    @NotNull
    public static final AppConfig getAppConfig(@NotNull SharedPreferences sharedPreferences, @ColorInt int n10, @NotNull NexusConfig nexusConfig) {
        String string2;
        String string3;
        String string4;
        Set set;
        String string5;
        String string6;
        String string7;
        y.j(sharedPreferences, "<this>");
        y.j(nexusConfig, "realTimeConfig");
        int n13 = sharedPreferences.getInt(APP_PRIMARY_COLOR, n10);
        int n14 = sharedPreferences.getInt(APP_SECONDARY_COLOR, n13);
        Gson gson = new Gson();
        String string8 = sharedPreferences.getString(APP_NAME, "");
        if (string8 == null) {
            string8 = "";
        }
        int n15 = ColorUtils.darkenColor(n13);
        int n16 = ColorUtils.darkenColor(n14);
        boolean bl2 = sharedPreferences.getBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, false);
        boolean bl3 = sharedPreferences.getBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, false);
        boolean bl4 = sharedPreferences.getBoolean(APP_HELP_CENTER_COLOR_RENDER_DARK_TEXT, false);
        boolean bl5 = sharedPreferences.getBoolean(APP_INTERCOM_LINK, true);
        boolean bl6 = sharedPreferences.getBoolean(APP_INBOUND_MESSAGES, false);
        String string9 = sharedPreferences.getString(APP_TEMPORARY_EXPECTATIONS_MESSAGE, "");
        if (string9 == null) {
            string9 = "";
        }
        int n17 = sharedPreferences.getInt(APP_RATE_LIMIT_COUNT, 100);
        long l10 = sharedPreferences.getLong(APP_RATE_LIMIT_PERIOD_MS, Config.DEFAULT_RATE_LIMIT_PERIOD_MS);
        long l11 = sharedPreferences.getLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, Config.DEFAULT_CACHE_MAX_AGE_MS);
        long l13 = sharedPreferences.getLong(APP_NEW_SESSION_THRESHOLD_MS, Config.DEFAULT_SESSION_TIMEOUT_MS);
        long l14 = sharedPreferences.getLong(APP_SOFT_RESET_TIMEOUT_MS, Config.DEFAULT_SOFT_RESET_TIMEOUT_MS);
        long l15 = sharedPreferences.getLong(APP_UPLOAD_SIZE_LIMIT, 0x6400000L);
        boolean bl7 = sharedPreferences.getBoolean(APP_METRICS_ENABLED, true);
        boolean bl8 = sharedPreferences.getBoolean(APP_AUDIO_ENABLED, true);
        String string10 = sharedPreferences.getString(APP_TEAM_BIO, "");
        if (string10 == null) {
            string10 = "";
        }
        if ((string7 = sharedPreferences.getString(APP_WALLPAPER, "")) == null) {
            string7 = "";
        }
        if ((string6 = sharedPreferences.getString(APP_LOCALE, "")) == null) {
            string6 = "";
        }
        if ((string5 = sharedPreferences.getString(APP_HELP_CENTER_LOCALE, "")) == null) {
            string5 = "";
        }
        boolean bl9 = sharedPreferences.getBoolean(APP_RECEIVED_FROM_SERVER, false);
        boolean bl10 = sharedPreferences.getBoolean(APP_BACKGROUND_REQUESTS_ENABLED, true);
        String string11 = sharedPreferences.getString(APP_HELP_CENTER_URL, "");
        if (string11 == null) {
            string11 = "";
        }
        Set set2 = set = sharedPreferences.getStringSet(APP_HELP_CENTER_URLS, b1.f());
        if (set == null) {
            set2 = b1.f();
        }
        n10 = sharedPreferences.getInt(APP_HELP_CENTER_PRIMARY_COLOR, n10);
        Object object = sharedPreferences.getStringSet(APP_FEATURES, b1.f());
        set = object;
        if (object == null) {
            set = b1.f();
        }
        if ((object = sharedPreferences.getString(APP_LAUNCHER_LOGO_URL, "")) == null) {
            object = "";
        }
        if ((string4 = sharedPreferences.getString(APP_MESSENGER_LOGO_URL, "")) == null) {
            string4 = "";
        }
        if ((string3 = sharedPreferences.getString(APP_TEAM_INTRO, "")) == null) {
            string3 = "";
        }
        if ((string2 = sharedPreferences.getString(APP_TEAM_GREETING, "")) == null) {
            string2 = "";
        }
        boolean bl11 = sharedPreferences.getBoolean(APP_IDENTITY_VERIFICATION_ENABLED, false);
        boolean bl12 = sharedPreferences.getBoolean(APP_ACCESS_TEAMMATE_ENABLED, true);
        boolean bl13 = sharedPreferences.getBoolean(APP_HELP_CENTER_REQUIRE_SEARCH, false);
        boolean bl14 = sharedPreferences.getBoolean(APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED, false);
        boolean bl15 = sharedPreferences.getBoolean(APP_HAS_OPEN_CONVERSATIONS, false);
        ConfigModules configModules = (ConfigModules)gson.fromJson(sharedPreferences.getString(APP_HUB_HEADER_CONFIG, null), ConfigModules.class);
        Object object2 = sharedPreferences.getStringSet(FILE_UPLOAD_SUPPORTED_FILE_TYPES, b1.f());
        Set set3 = object2;
        if (object2 == null) {
            set3 = b1.f();
        }
        boolean bl16 = sharedPreferences.getBoolean(NEW_PUSH_UI_DISABLED, false);
        object2 = gson.fromJson(sharedPreferences.getString(APP_ATTACHMENT_SETTINGS, gson.toJson((Object)AttachmentSettings.Companion.getDEFAULT())), AttachmentSettings.class);
        y.i(object2, "gson.fromJson(\n         \u2026gs::class.java,\n        )");
        return new AppConfig(string8, n13, n15, n14, n16, bl2, bl3, bl4, bl5, bl6, string9, n17, l10, l11, l13, l14, l15, bl7, bl8, string10, string7, string6, string5, bl9, bl10, string11, set2, n10, set, (String)object, string4, string3, string2, bl11, bl12, bl13, bl14, bl15, configModules, set3, nexusConfig, bl16, (AttachmentSettings)object2, sharedPreferences.getBoolean(APP_ARTICLE_AUTO_REACTION_ENABLED, true));
    }

    @NotNull
    public static final AppConfig getAppConfig(@NotNull Config config, @ColorInt int n10) {
        y.j(config, "<this>");
        int n13 = AppConfigKt.getConfigColor(config.getPrimaryColor(), n10);
        int n14 = AppConfigKt.getConfigColor(config.getSecondaryColor(), n10);
        String string2 = config.getName();
        y.i(string2, "name");
        int n15 = ColorUtils.darkenColor(n13);
        int n16 = ColorUtils.darkenColor(n14);
        boolean bl2 = config.isPrimaryColorRenderDarkText();
        boolean bl3 = config.isSecondaryColorRenderDarkText();
        boolean bl4 = config.isHelpCenterColorRenderDarkText();
        boolean bl5 = config.isShowPoweredBy();
        boolean bl6 = config.isInboundMessages();
        String string3 = config.temporaryExpectationsMessage();
        y.i(string3, "temporaryExpectationsMessage()");
        int n17 = config.getRateLimitCount();
        long l10 = config.getRateLimitPeriod();
        long l11 = config.getUserUpdateCacheMaxAge();
        long l13 = config.getNewSessionThreshold();
        long l14 = config.getSoftResetTimeout();
        long l15 = config.getUploadSizeLimit();
        boolean bl7 = config.isMetricsEnabled();
        boolean bl8 = config.isAudioEnabled();
        String string4 = config.getWelcomeMessage();
        y.i(string4, "welcomeMessage");
        Object object = config.getMessenger4Background();
        String string5 = object;
        if (p.h0((CharSequence)object)) {
            string5 = config.getMessengerBackground();
        }
        y.i(string5, "messenger4Background.ifB\u2026k { messengerBackground }");
        String string6 = config.getLocale();
        y.i(string6, "locale");
        String string7 = config.getHelpCenterLocale();
        y.i(string7, "helpCenterLocale");
        boolean bl9 = config.isBackgroundRequestsEnabled();
        String string8 = config.getHelpCenterUrl();
        y.i(string8, "helpCenterUrl");
        Set<String> set = config.getHelpCenterUrls();
        y.i(set, "helpCenterUrls");
        n10 = AppConfigKt.getConfigColor(config.getHelpCenterBaseColor(), n10);
        Set<String> set2 = config.getFeatures();
        y.i(set2, APP_FEATURES);
        String string9 = config.getLauncherLogoUrl();
        y.i(string9, "launcherLogoUrl");
        String string10 = config.getMessengerLogoUrl();
        y.i(string10, "messengerLogoUrl");
        String string11 = config.getTeamIntro();
        y.i(string11, "teamIntro");
        String string12 = config.getTeamGreeting();
        y.i(string12, "teamGreeting");
        boolean bl10 = config.getIdentityVerificationEnabled();
        boolean bl11 = config.accessToTeammateEnabled();
        boolean bl12 = config.helpCenterRequireSearch();
        boolean bl13 = config.preventMultipleInboundConversationsEnabled();
        boolean bl14 = config.hasOpenConversations();
        object = config.modules();
        Set<String> set3 = config.getFileUploadSupportedFileTypes();
        y.i(set3, "fileUploadSupportedFileTypes");
        NexusConfig nexusConfig = config.getRealTimeConfig();
        y.i(nexusConfig, "realTimeConfig");
        boolean bl15 = config.isAndroidNewPushUiDisabled();
        AttachmentSettings attachmentSettings = config.getAttachmentSettings();
        y.i(attachmentSettings, "attachmentSettings");
        return new AppConfig(string2, n13, n15, n14, n16, bl2, bl3, bl4, bl5, bl6, string3, n17, l10, l11, l13, l14, l15, bl7, bl8, string4, string5, string6, string7, true, bl9, string8, set, n10, set2, string9, string10, string11, string12, bl10, bl11, bl12, bl13, bl14, (ConfigModules)object, set3, nexusConfig, bl15, attachmentSettings, config.isArticleAutoReactionEnabled());
    }

    private static final int getConfigColor(String string2, int n10) {
        if (string2 != null) {
            n10 = ColorUtils.parseColor(string2);
        }
        return n10;
    }

    public static final void setAppConfig(@NotNull SharedPreferences sharedPreferences, @NotNull AppConfig appConfig) {
        y.j(sharedPreferences, "<this>");
        y.j(appConfig, "newAppConfig");
        Gson gson = new Gson();
        sharedPreferences.edit().putString(APP_NAME, appConfig.getName()).putString(APP_TEAM_BIO, appConfig.getTeamProfileBio()).putString(APP_WALLPAPER, appConfig.getWallpaper()).putString(APP_LOCALE, appConfig.getLocale()).putString(APP_HELP_CENTER_LOCALE, appConfig.getHelpCenterLocale()).putString(APP_LAUNCHER_LOGO_URL, appConfig.getLauncherLogoUrl()).putString(APP_MESSENGER_LOGO_URL, appConfig.getMessengerLogoUrl()).putString(APP_TEAM_INTRO, appConfig.getTeamIntro()).putString(APP_TEAM_GREETING, appConfig.getTeamGreeting()).putInt(APP_PRIMARY_COLOR, appConfig.getPrimaryColor()).putInt(APP_SECONDARY_COLOR, appConfig.getSecondaryColor()).putInt(APP_HELP_CENTER_PRIMARY_COLOR, appConfig.getHelpCenterBaseColor()).putInt(APP_RATE_LIMIT_COUNT, appConfig.getRateLimitCount()).putLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, appConfig.getUserUpdateCacheMaxAgeMs()).putLong(APP_RATE_LIMIT_PERIOD_MS, appConfig.getRateLimitPeriodMs()).putLong(APP_NEW_SESSION_THRESHOLD_MS, appConfig.getNewSessionThresholdMs()).putLong(APP_SOFT_RESET_TIMEOUT_MS, appConfig.getSoftResetTimeoutMs()).putLong(APP_UPLOAD_SIZE_LIMIT, appConfig.getUploadSizeLimit()).putBoolean(APP_INTERCOM_LINK, appConfig.getShouldShowIntercomLink()).putBoolean(APP_INBOUND_MESSAGES, appConfig.isInboundMessages()).putString(APP_TEMPORARY_EXPECTATIONS_MESSAGE, appConfig.getTemporaryExpectationsMessage()).putBoolean(APP_AUDIO_ENABLED, appConfig.isAudioEnabled()).putBoolean(APP_METRICS_ENABLED, appConfig.isMetricsEnabled()).putBoolean(APP_RECEIVED_FROM_SERVER, appConfig.isReceivedFromServer()).putBoolean(APP_BACKGROUND_REQUESTS_ENABLED, appConfig.isBackgroundRequestsEnabled()).putBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, appConfig.isPrimaryColorRenderDarkText()).putBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, appConfig.isSecondaryColorRenderDarkText()).putBoolean(APP_HELP_CENTER_COLOR_RENDER_DARK_TEXT, appConfig.isHelpCenterColorRenderDarkText()).putString(APP_HELP_CENTER_URL, appConfig.getHelpCenterUrl()).putStringSet(APP_HELP_CENTER_URLS, appConfig.getHelpCenterUrls()).putStringSet(APP_FEATURES, appConfig.getFeatures()).putBoolean(APP_ACCESS_TEAMMATE_ENABLED, appConfig.isAccessToTeammateEnabled()).putBoolean(APP_HELP_CENTER_REQUIRE_SEARCH, appConfig.isHelpCenterRequireSearchEnabled()).putBoolean(APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED, appConfig.isPreventMultipleInboundConversationsEnabled()).putBoolean(APP_HAS_OPEN_CONVERSATIONS, appConfig.getHasOpenConversations()).putString(APP_HUB_HEADER_CONFIG, gson.toJson((Object)appConfig.getConfigModules())).putStringSet(FILE_UPLOAD_SUPPORTED_FILE_TYPES, appConfig.getFileUploadSupportedFileTypes()).putString(APP_ATTACHMENT_SETTINGS, gson.toJson((Object)appConfig.getAttachmentSettings())).putBoolean(APP_ARTICLE_AUTO_REACTION_ENABLED, appConfig.getArticleAutoReactionEnabled()).apply();
    }
}

