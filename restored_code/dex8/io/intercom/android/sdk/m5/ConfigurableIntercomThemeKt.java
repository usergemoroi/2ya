/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableInferredTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\b\u0004H\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007\"\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lkotlin/Function0;", "Lkotlin/k0;", "Landroidx/compose/runtime/Composable;", "content", "ConfigurableIntercomTheme", "(Lio/intercom/android/sdk/identity/AppConfig;Lkotlin/jvm/functions/p;Landroidx/compose/runtime/Composer;I)V", "", "DarkModeEnabled", "Z", "getDarkModeEnabled", "()Z", "setDarkModeEnabled", "(Z)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
public final class ConfigurableIntercomThemeKt {
    private static boolean DarkModeEnabled;

    @Composable
    @ComposableInferredTarget(scheme="[0[0]]")
    public static final void ConfigurableIntercomTheme(@NotNull AppConfig appConfig, @NotNull p<? super Composer, ? super Integer, k0> p14, @Nullable Composer object, int n10) {
        y.j(appConfig, "appConfig");
        y.j(p14, "content");
        Composer composer = object.startRestartGroup(-299610223);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart((int)-299610223, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.ConfigurableIntercomTheme (ConfigurableIntercomTheme.kt:12)");
        }
        Object object2 = appConfig.getConfigModules();
        Object var10_6 = null;
        object = var10_6;
        if (object2 != null) {
            object2 = ((ConfigModules)object2).getCustomization();
            object = var10_6;
            if (object2 != null) {
                long l10 = ColorExtensionsKt.toComposeColor$default(((CustomizationModel)object2).getAction().getBackgroundColor(), 0.0f, 1, null);
                long l11 = ColorExtensionsKt.toComposeColor$default(((CustomizationModel)object2).getAction().getForegroundColor(), 0.0f, 1, null);
                object = ((CustomizationModel)object2).getActionContrastWhite();
                long l13 = object != null && (object = ((CustomizationColorsModel)object).getBackgroundColor()) != null ? ColorExtensionsKt.toComposeColor$default((String)object, 0.0f, 1, null) : ColorExtensionsKt.toComposeColor$default(((CustomizationModel)object2).getAction().getBackgroundColor(), 0.0f, 1, null);
                object = IntercomColorsKt.getIntercomColors-EXAOFh0(l10, l11, l13, ColorExtensionsKt.toComposeColor$default(((CustomizationModel)object2).getHeader().getBackgroundColor(), 0.0f, 1, null), ColorExtensionsKt.toComposeColor$default(((CustomizationModel)object2).getHeader().getForegroundColor(), 0.0f, 1, null), DarkModeEnabled ^ true);
            }
        }
        composer.startReplaceableGroup(933488834);
        if (object == null) {
            object = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable);
        }
        composer.endReplaceableGroup();
        IntercomThemeKt.IntercomTheme((IntercomColors)object, null, null, p14, composer, n10 << 6 & 0x1C00, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((object = composer.endRestartGroup()) != null) {
            object.updateScope((p)new p<Composer, Integer, k0>(appConfig, p14, n10){
                final int $$changed;
                final AppConfig $appConfig;
                final p<Composer, Integer, k0> $content;
                {
                    this.$appConfig = appConfig;
                    this.$content = p14;
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(this.$appConfig, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final boolean getDarkModeEnabled() {
        return DarkModeEnabled;
    }

    public static final void setDarkModeEnabled(boolean bl2) {
        DarkModeEnabled = bl2;
    }
}

