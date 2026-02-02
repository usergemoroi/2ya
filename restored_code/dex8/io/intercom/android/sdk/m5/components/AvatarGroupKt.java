/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.RowKt
 *  androidx.compose.foundation.layout.RowScopeInstance
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.runtime.Applier
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.ComposablesKt
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.CompositionLocalMap
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Vertical
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.layout.MeasurePolicy
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.unit.Dp
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.OverlappedAvatarShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\tH\u0003\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000e\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2={"", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "avatarSize", "Landroidx/compose/ui/unit/TextUnit;", "placeHolderTextSize", "Lkotlin/k0;", "AvatarGroup--J8mCjc", "(Ljava/util/List;Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "AvatarGroup", "AvatarGroupPreview", "(Landroidx/compose/runtime/Composer;I)V", "AvatarGroupWithMixedShapesPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nAvatarGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarGroup.kt\nio/intercom/android/sdk/m5/components/AvatarGroupKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n154#2:81\n154#2:82\n64#3:83\n92#3:120\n88#4,5:84\n93#4:117\n97#4:126\n79#5,11:89\n92#5:125\n456#6,8:100\n464#6,3:114\n467#6,3:122\n3737#7,6:108\n1864#8,2:118\n1866#8:121\n*S KotlinDebug\n*F\n+ 1 AvatarGroup.kt\nio/intercom/android/sdk/m5/components/AvatarGroupKt\n*L\n26#1:81\n29#1:82\n31#1:83\n39#1:120\n30#1:84,5\n30#1:117\n30#1:126\n30#1:89,11\n30#1:125\n30#1:100,8\n30#1:114,3\n30#1:122,3\n30#1:108,6\n34#1:118,2\n34#1:121\n*E\n"})
public final class AvatarGroupKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void AvatarGroup--J8mCjc(@NotNull List<AvatarWrapper> list, @Nullable Modifier modifier, float f11, long l10, @Nullable Composer object3, int n10, int n13) {
        int n14;
        y.j(list, "avatars");
        Composer composer = object3.startRestartGroup(-258460642);
        if ((n13 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        if ((n13 & 4) != 0) {
            f11 = Dp.constructor-impl((float)38);
        }
        if ((n13 & 8) != 0) {
            l10 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle2().getFontSize-XSAIIZE();
            n14 = n10 & 0xFFFFE3FF;
        } else {
            n14 = n10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart((int)-258460642, (int)n14, (int)-1, (String)"io.intercom.android.sdk.m5.components.AvatarGroup (AvatarGroup.kt:22)");
        }
        float f12 = 2;
        float f13 = Dp.constructor-impl((float)f12);
        object3 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl((float)(-f13)));
        int n15 = 0;
        Object object2 = SizeKt.wrapContentSize$default((Modifier)modifier, null, (boolean)false, (int)3, null);
        composer.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicy = RowKt.rowMeasurePolicy((Arrangement.Horizontal)object3, (Alignment.Vertical)Alignment.Companion.getTop(), (Composer)composer, (int)0);
        composer.startReplaceableGroup(-1323940314);
        int n16 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
        CompositionLocalMap compositionLocalMap = composer.getCurrentCompositionLocalMap();
        object3 = ComposeUiNode.Companion;
        a a14 = object3.getConstructor();
        object2 = LayoutKt.modifierMaterializerOf((Modifier)object2);
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
        Updater.set-impl((Composer)a14, (Object)measurePolicy, (p)object3.getSetMeasurePolicy());
        Updater.set-impl((Composer)a14, (Object)compositionLocalMap, (p)object3.getSetResolvedCompositionLocals());
        object3 = object3.getSetCompositeKeyHash();
        if (a14.getInserting() || !y.e(a14.rememberedValue(), n16)) {
            a14.updateRememberedValue((Object)n16);
            a14.apply((Object)n16, (p)object3);
        }
        object2.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
        composer.startReplaceableGroup(2058660585);
        object3 = RowScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-1664909668);
        for (Object object3 : (Iterable)list) {
            if (n15 < 0) {
                t.w();
            }
            object2 = (AvatarWrapper)object3;
            if (n15 == 0) {
                object3 = ((AvatarWrapper)object2).getAvatar().getShape();
                y.i(object3, "avatar.avatar.shape");
                object3 = AvatarIconKt.getComposeShape((AvatarShape)((Object)object3));
            } else {
                object3 = list.get(n15 - 1).getAvatar().getShape();
                y.i(object3, "avatars[i - 1].avatar.shape");
                measurePolicy = AvatarIconKt.getComposeShape((AvatarShape)((Object)object3));
                float f14 = Dp.constructor-impl((float)(f13 * f12));
                object3 = ((AvatarWrapper)object2).getAvatar().getShape();
                y.i(object3, "avatar.avatar.shape");
                object3 = new OverlappedAvatarShape((Shape)AvatarIconKt.getComposeShape((AvatarShape)((Object)object3)), (Shape)measurePolicy, f14, null);
            }
            AvatarIconKt.AvatarIcon-Rd90Nhg(SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, (float)f11), (AvatarWrapper)object2, (Shape)object3, false, l10, null, composer, 0xE000 & n14 << 3 | 0x40, 40);
            ++n15;
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((object3 = composer.endRestartGroup()) != null) {
            object3.updateScope((p)new p<Composer, Integer, k0>(list, modifier, f11, l10, n10, n13){
                final int $$changed;
                final int $$default;
                final float $avatarSize;
                final List<AvatarWrapper> $avatars;
                final Modifier $modifier;
                final long $placeHolderTextSize;
                {
                    this.$avatars = list;
                    this.$modifier = modifier;
                    this.$avatarSize = f11;
                    this.$placeHolderTextSize = l10;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    AvatarGroupKt.AvatarGroup--J8mCjc(this.$avatars, this.$modifier, this.$avatarSize, this.$placeHolderTextSize, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void AvatarGroupPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-2091006176);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-2091006176, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.AvatarGroupPreview (AvatarGroup.kt:52)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    AvatarGroupKt.access$AvatarGroupPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void AvatarGroupWithMixedShapesPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-1253949399);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1253949399, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.AvatarGroupWithMixedShapesPreview (AvatarGroup.kt:67)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    AvatarGroupKt.access$AvatarGroupWithMixedShapesPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$AvatarGroupPreview(Composer composer, int n10) {
        AvatarGroupKt.AvatarGroupPreview(composer, n10);
    }

    public static final /* synthetic */ void access$AvatarGroupWithMixedShapesPreview(Composer composer, int n10) {
        AvatarGroupKt.AvatarGroupWithMixedShapesPreview(composer, n10);
    }
}

