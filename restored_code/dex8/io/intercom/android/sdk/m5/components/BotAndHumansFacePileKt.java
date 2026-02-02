/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.RowKt
 *  androidx.compose.foundation.layout.RowScopeInstance
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.runtime.Applier
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.ComposablesKt
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Vertical
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.draw.DrawModifierKt
 *  androidx.compose.ui.geometry.Size
 *  androidx.compose.ui.graphics.ClipOp
 *  androidx.compose.ui.graphics.drawscope.ContentDrawScope
 *  androidx.compose.ui.graphics.drawscope.DrawContext
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.unit.Dp
 *  androidx.compose.ui.unit.LayoutDirection
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u001aQ\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\nH\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\nH\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0013\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "Lio/intercom/android/sdk/models/Avatar;", "botAvatar", "Lkotlin/t;", "teammateAvatarPair", "Landroidx/compose/ui/unit/Dp;", "botAvatarSize", "", "botName", "Lkotlin/k0;", "BotAndHumansFacePile-hGBTI10", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/models/Avatar;Lkotlin/t;FLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "BotAndHumansFacePile", "", "humanAvatars", "humanAvatarPairForHome", "(Ljava/util/List;)Lkotlin/t;", "BotWithTwoTeammatesPreview", "(Landroidx/compose/runtime/Composer;I)V", "BotsWithOneTeammatePreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nBotAndHumansFacePile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BotAndHumansFacePile.kt\nio/intercom/android/sdk/m5/components/BotAndHumansFacePileKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,125:1\n182#2:126\n182#2:127\n182#2:128\n58#3:129\n91#4,2:130\n93#4:160\n97#4:181\n79#5,11:132\n92#5:180\n456#6,8:143\n464#6,3:157\n50#6:161\n49#6:162\n50#6:169\n49#6:170\n467#6,3:177\n3737#7,6:151\n1116#8,6:163\n1116#8,6:171\n*S KotlinDebug\n*F\n+ 1 BotAndHumansFacePile.kt\nio/intercom/android/sdk/m5/components/BotAndHumansFacePileKt\n*L\n29#1:126\n30#1:127\n31#1:128\n35#1:129\n33#1:130,2\n33#1:160\n33#1:181\n33#1:132,11\n33#1:180\n33#1:143,8\n33#1:157,3\n43#1:161\n43#1:162\n67#1:169\n67#1:170\n33#1:177,3\n33#1:151,6\n43#1:163,6\n67#1:171,6\n*E\n"})
public final class BotAndHumansFacePileKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void BotAndHumansFacePile-hGBTI10(@Nullable Modifier modifier, @NotNull Avatar avatar, @NotNull t<? extends Avatar, ? extends Avatar> t13, float f11, @Nullable String string2, @Nullable Composer object, int n10, int n13) {
        Composer composer;
        block18: {
            Object object2;
            Object object3;
            block20: {
                float f12;
                float f13;
                block19: {
                    boolean bl2;
                    boolean bl3;
                    Object object4;
                    block15: {
                        block17: {
                            block16: {
                                y.j(avatar, "botAvatar");
                                y.j(t13, "teammateAvatarPair");
                                composer = object.startRestartGroup(957129373);
                                if ((n13 & 1) != 0) {
                                    modifier = Modifier.Companion;
                                }
                                if ((n13 & 0x10) != 0) {
                                    string2 = "";
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart((int)957129373, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.BotAndHumansFacePile (BotAndHumansFacePile.kt:21)");
                                }
                                f13 = Dp.constructor-impl((float)((float)0.75 * f11));
                                f12 = Dp.constructor-impl((float)((float)0.25 * f13));
                                float f14 = Dp.constructor-impl((float)((float)0.0625 * f11));
                                object = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl((float)(f14 - f12)));
                                object4 = Alignment.Companion.getCenterVertically();
                                composer.startReplaceableGroup(693286680);
                                object4 = RowKt.rowMeasurePolicy((Arrangement.Horizontal)object, (Alignment.Vertical)object4, (Composer)composer, (int)48);
                                composer.startReplaceableGroup(-1323940314);
                                int n14 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                                object3 = composer.getCurrentCompositionLocalMap();
                                object2 = ComposeUiNode.Companion;
                                a a14 = object2.getConstructor();
                                object = LayoutKt.modifierMaterializerOf((Modifier)modifier);
                                if (!(composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(a14);
                                } else {
                                    composer.useNode();
                                }
                                a14 = Updater.constructor-impl((Composer)composer);
                                Updater.set-impl((Composer)a14, (Object)object4, (p)object2.getSetMeasurePolicy());
                                Updater.set-impl((Composer)a14, (Object)object3, (p)object2.getSetResolvedCompositionLocals());
                                object4 = object2.getSetCompositeKeyHash();
                                if (a14.getInserting() || !y.e(a14.rememberedValue(), n14)) {
                                    a14.updateRememberedValue((Object)n14);
                                    a14.apply((Object)n14, (p)object4);
                                }
                                object.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                                composer.startReplaceableGroup(2058660585);
                                object = RowScopeInstance.INSTANCE;
                                object = t13.c();
                                composer.startReplaceableGroup(593345406);
                                if (object == null) break block15;
                                object2 = new AvatarWrapper((Avatar)object, false, null, false, false, 30, null);
                                object3 = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, (float)f13);
                                object4 = Dp.box-impl((float)f13);
                                object = Dp.box-impl((float)f12);
                                composer.startReplaceableGroup(511388516);
                                bl3 = composer.changed(object4);
                                bl2 = composer.changed(object);
                                object4 = composer.rememberedValue();
                                if (bl3 | bl2) break block16;
                                object = object4;
                                if (object4 != Composer.Companion.getEmpty()) break block17;
                            }
                            object = new l<ContentDrawScope, k0>(f13, f12){
                                final float $cutSize;
                                final float $teammateAvatarSize;
                                {
                                    this.$teammateAvatarSize = f11;
                                    this.$cutSize = f12;
                                    super(1);
                                }

                                public final void invoke(@NotNull ContentDrawScope contentDrawScope) {
                                    y.j(contentDrawScope, "$this$drawWithContent");
                                    if (contentDrawScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                        float f11 = contentDrawScope.toPx-0680j_4(Dp.constructor-impl((float)(this.$teammateAvatarSize - this.$cutSize)));
                                        float f12 = Size.getHeight-impl((long)contentDrawScope.getSize-NH-jbRc());
                                        int n10 = ClipOp.Companion.getIntersect-rtfAjoo();
                                        DrawContext drawContext = contentDrawScope.getDrawContext();
                                        long l10 = drawContext.getSize-NH-jbRc();
                                        drawContext.getCanvas().save();
                                        drawContext.getTransform().clipRect-N_I0leg(0.0f, 0.0f, f11, f12, n10);
                                        contentDrawScope.drawContent();
                                        drawContext.getCanvas().restore();
                                        drawContext.setSize-uvyYCjk(l10);
                                    } else {
                                        float f13 = contentDrawScope.toPx-0680j_4(this.$cutSize);
                                        float f14 = Size.getWidth-impl((long)contentDrawScope.getSize-NH-jbRc());
                                        float f15 = Size.getHeight-impl((long)contentDrawScope.getSize-NH-jbRc());
                                        int n13 = ClipOp.Companion.getIntersect-rtfAjoo();
                                        DrawContext drawContext = contentDrawScope.getDrawContext();
                                        long l11 = drawContext.getSize-NH-jbRc();
                                        drawContext.getCanvas().save();
                                        drawContext.getTransform().clipRect-N_I0leg(f13, 0.0f, f14, f15, n13);
                                        contentDrawScope.drawContent();
                                        drawContext.getCanvas().restore();
                                        drawContext.setSize-uvyYCjk(l11);
                                    }
                                }
                            };
                            composer.updateRememberedValue(object);
                        }
                        composer.endReplaceableGroup();
                        AvatarIconKt.AvatarIcon-Rd90Nhg(DrawModifierKt.drawWithContent((Modifier)object3, (l)((l)object)), (AvatarWrapper)object2, null, false, 0L, null, composer, 64, 60);
                    }
                    composer.endReplaceableGroup();
                    object = Modifier.Companion;
                    AvatarIconKt.AvatarIcon-Rd90Nhg(SizeKt.size-3ABfNKs((Modifier)object, (float)f11), new AvatarWrapper(avatar, true, null, false, false, 28, null), null, false, 0L, null, composer, 64, 60);
                    object4 = t13.d();
                    composer.startReplaceableGroup(-1801579435);
                    if (object4 == null) break block18;
                    object3 = new AvatarWrapper((Avatar)object4, false, null, false, false, 30, null);
                    object2 = SizeKt.size-3ABfNKs((Modifier)object, (float)f13);
                    object4 = Dp.box-impl((float)f12);
                    object = Dp.box-impl((float)f13);
                    composer.startReplaceableGroup(511388516);
                    bl2 = composer.changed(object4);
                    bl3 = composer.changed(object);
                    object4 = composer.rememberedValue();
                    if (bl2 | bl3) break block19;
                    object = object4;
                    if (object4 != Composer.Companion.getEmpty()) break block20;
                }
                object = new l<ContentDrawScope, k0>(f12, f13){
                    final float $cutSize;
                    final float $teammateAvatarSize;
                    {
                        this.$cutSize = f11;
                        this.$teammateAvatarSize = f12;
                        super(1);
                    }

                    public final void invoke(@NotNull ContentDrawScope contentDrawScope) {
                        y.j(contentDrawScope, "$this$drawWithContent");
                        if (contentDrawScope.getLayoutDirection() == LayoutDirection.Ltr) {
                            float f11 = contentDrawScope.toPx-0680j_4(this.$cutSize);
                            float f12 = Size.getWidth-impl((long)contentDrawScope.getSize-NH-jbRc());
                            float f13 = Size.getHeight-impl((long)contentDrawScope.getSize-NH-jbRc());
                            int n10 = ClipOp.Companion.getIntersect-rtfAjoo();
                            DrawContext drawContext = contentDrawScope.getDrawContext();
                            long l10 = drawContext.getSize-NH-jbRc();
                            drawContext.getCanvas().save();
                            drawContext.getTransform().clipRect-N_I0leg(f11, 0.0f, f12, f13, n10);
                            contentDrawScope.drawContent();
                            drawContext.getCanvas().restore();
                            drawContext.setSize-uvyYCjk(l10);
                        } else {
                            float f14 = contentDrawScope.toPx-0680j_4(Dp.constructor-impl((float)(this.$teammateAvatarSize - this.$cutSize)));
                            float f15 = Size.getHeight-impl((long)contentDrawScope.getSize-NH-jbRc());
                            int n13 = ClipOp.Companion.getIntersect-rtfAjoo();
                            DrawContext drawContext = contentDrawScope.getDrawContext();
                            long l11 = drawContext.getSize-NH-jbRc();
                            drawContext.getCanvas().save();
                            drawContext.getTransform().clipRect-N_I0leg(0.0f, 0.0f, f14, f15, n13);
                            contentDrawScope.drawContent();
                            drawContext.getCanvas().restore();
                            drawContext.setSize-uvyYCjk(l11);
                        }
                    }
                };
                composer.updateRememberedValue(object);
            }
            composer.endReplaceableGroup();
            AvatarIconKt.AvatarIcon-Rd90Nhg(DrawModifierKt.drawWithContent((Modifier)object2, (l)((l)object)), (AvatarWrapper)object3, null, false, 0L, null, composer, 64, 60);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((object = composer.endRestartGroup()) != null) {
            object.updateScope((p)new p<Composer, Integer, k0>(modifier, avatar, t13, f11, string2, n10, n13){
                final int $$changed;
                final int $$default;
                final Avatar $botAvatar;
                final float $botAvatarSize;
                final String $botName;
                final Modifier $modifier;
                final t<Avatar, Avatar> $teammateAvatarPair;
                {
                    this.$modifier = modifier;
                    this.$botAvatar = avatar;
                    this.$teammateAvatarPair = t13;
                    this.$botAvatarSize = f11;
                    this.$botName = string2;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    BotAndHumansFacePileKt.BotAndHumansFacePile-hGBTI10(this.$modifier, this.$botAvatar, this.$teammateAvatarPair, this.$botAvatarSize, this.$botName, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void BotWithTwoTeammatesPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-366024049);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-366024049, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.BotWithTwoTeammatesPreview (BotAndHumansFacePile.kt:95)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(n10){
                final int $$changed;
                {
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    BotAndHumansFacePileKt.access$BotWithTwoTeammatesPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void BotsWithOneTeammatePreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1130939763);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1130939763, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.BotsWithOneTeammatePreview (BotAndHumansFacePile.kt:111)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(n10){
                final int $$changed;
                {
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    BotAndHumansFacePileKt.access$BotsWithOneTeammatePreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$BotWithTwoTeammatesPreview(Composer composer, int n10) {
        BotAndHumansFacePileKt.BotWithTwoTeammatesPreview(composer, n10);
    }

    public static final /* synthetic */ void access$BotsWithOneTeammatePreview(Composer composer, int n10) {
        BotAndHumansFacePileKt.BotsWithOneTeammatePreview(composer, n10);
    }

    @NotNull
    public static final t<Avatar, Avatar> humanAvatarPairForHome(@NotNull List<? extends Avatar> t13) {
        y.j(t13, "humanAvatars");
        int n10 = t13.size();
        t13 = n10 != 0 ? (n10 != 1 ? new t(t13.get(0), t13.get(1)) : new t(null, t13.get(0))) : z.a(null, null);
        return t13;
    }
}

