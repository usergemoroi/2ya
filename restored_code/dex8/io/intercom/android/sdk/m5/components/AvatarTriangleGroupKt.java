/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.layout.BoxKt
 *  androidx.compose.foundation.layout.BoxScopeInstance
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
 *  androidx.compose.ui.Alignment$Companion
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.layout.MeasurePolicy
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.node.ComposeUiNode$Companion
 *  androidx.compose.ui.tooling.preview.Preview
 *  androidx.compose.ui.unit.Dp
 *  androidx.compose.ui.unit.TextUnitKt
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.CutAvatarBoxShape;
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
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\tH\u0003\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\tH\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000e\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2={"", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "avatarShape", "Landroidx/compose/ui/unit/Dp;", "size", "Lkotlin/k0;", "AvatarTriangleGroup--jt2gSs", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/runtime/Composer;II)V", "AvatarTriangleGroup", "SingleAvatarPreview", "(Landroidx/compose/runtime/Composer;I)V", "DoubleAvatarsPreview", "TripleAvatarsPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nAvatarTriangleGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarTriangleGroup.kt\nio/intercom/android/sdk/m5/components/AvatarTriangleGroupKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n154#2:129\n154#2:130\n154#2:170\n154#2:177\n154#2:179\n75#3:131\n92#3:132\n51#3:133\n58#3:171\n75#3:172\n58#3:173\n75#3:174\n64#3:175\n58#3:176\n58#3:178\n68#4,6:134\n74#4:168\n78#4:184\n79#5,11:140\n92#5:183\n456#6,8:151\n464#6,3:165\n467#6,3:180\n3737#7,6:159\n1#8:169\n*S KotlinDebug\n*F\n+ 1 AvatarTriangleGroup.kt\nio/intercom/android/sdk/m5/components/AvatarTriangleGroupKt\n*L\n27#1:129\n33#1:130\n45#1:170\n60#1:177\n62#1:179\n34#1:131\n34#1:132\n34#1:133\n47#1:171\n47#1:172\n48#1:173\n48#1:174\n48#1:175\n48#1:176\n62#1:178\n35#1:134,6\n35#1:168\n35#1:184\n35#1:140,11\n35#1:183\n35#1:151,8\n35#1:165,3\n35#1:180,3\n35#1:159,6\n*E\n"})
public final class AvatarTriangleGroupKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void AvatarTriangleGroup--jt2gSs(@NotNull List<AvatarWrapper> list, @Nullable Modifier modifier, @Nullable Shape shape, float f11, @Nullable Composer object, int n10, int n13) {
        int n14;
        y.j(list, "avatars");
        Composer composer = object.startRestartGroup(-534156342);
        if ((n13 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        if ((n13 & 4) != 0) {
            shape = AvatarIconKt.getComposeShape(AvatarShape.CIRCLE);
            n14 = n10 & 0xFFFFFC7F;
        } else {
            n14 = n10;
        }
        if ((n13 & 8) != 0) {
            f11 = Dp.constructor-impl((float)32);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart((int)-534156342, (int)n14, (int)-1, (String)"io.intercom.android.sdk.m5.components.AvatarTriangleGroup (AvatarTriangleGroup.kt:22)");
        }
        long l10 = TextUnitKt.getSp((int)12);
        if (list.size() > 1) {
            composer.startReplaceableGroup(738098958);
            float f12 = Dp.constructor-impl((float)1.0f);
            float f13 = 2;
            float f14 = Dp.constructor-impl((float)(Dp.constructor-impl((float)(f11 / f13)) + Dp.constructor-impl((float)(f12 * f13))));
            Modifier modifier2 = SizeKt.size-3ABfNKs((Modifier)modifier, (float)f11);
            composer.startReplaceableGroup(733328855);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.rememberBoxMeasurePolicy((Alignment)companion.getTopStart(), (boolean)false, (Composer)composer, (int)0);
            composer.startReplaceableGroup(-1323940314);
            int n15 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
            object = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a a14 = companion2.getConstructor();
            modifier2 = LayoutKt.modifierMaterializerOf((Modifier)modifier2);
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
            Updater.set-impl((Composer)a14, (Object)measurePolicy, (p)companion2.getSetMeasurePolicy());
            Updater.set-impl((Composer)a14, (Object)object, (p)companion2.getSetResolvedCompositionLocals());
            object = companion2.getSetCompositeKeyHash();
            if (a14.getInserting() || !y.e(a14.rememberedValue(), n15)) {
                a14.updateRememberedValue((Object)n15);
                a14.apply((Object)n15, (p)object);
            }
            modifier2.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
            composer.startReplaceableGroup(2058660585);
            modifier2 = BoxScopeInstance.INSTANCE;
            object = t.o(list) >= 0 ? list.get(0) : AvatarWrapper.Companion.getNULL();
            object = (AvatarWrapper)object;
            measurePolicy = Modifier.Companion;
            companion2 = modifier2.align(SizeKt.size-3ABfNKs((Modifier)measurePolicy, (float)f14), companion.getTopCenter());
            f12 = Dp.constructor-impl((float)f13);
            float f15 = f11 - f14;
            AvatarIconKt.AvatarIcon-Rd90Nhg((Modifier)companion2, (AvatarWrapper)object, new CutAvatarBoxShape(shape, f12, t.p((Object[])new kotlin.t[]{z.a(Dp.box-impl((float)Dp.constructor-impl((float)(Dp.constructor-impl((float)f15) / f13))), Dp.box-impl((float)Dp.constructor-impl((float)f15))), z.a(Dp.box-impl((float)Dp.constructor-impl((float)(-Dp.constructor-impl((float)(Dp.constructor-impl((float)f15) / f13))))), Dp.box-impl((float)Dp.constructor-impl((float)f15)))}), null), false, l10, null, composer, 24640, 40);
            object = 1 <= t.o(list) ? list.get(1) : AvatarWrapper.Companion.getNULL();
            object = (AvatarWrapper)object;
            AvatarIconKt.AvatarIcon-Rd90Nhg(modifier2.align(SizeKt.size-3ABfNKs((Modifier)measurePolicy, (float)f14), companion.getBottomStart()), (AvatarWrapper)object, new CutAvatarBoxShape(shape, Dp.constructor-impl((float)f13), t.e(z.a(Dp.box-impl((float)Dp.constructor-impl((float)f15)), Dp.box-impl((float)Dp.constructor-impl((float)0.0f)))), null), false, l10, null, composer, 24640, 40);
            object = 2 <= t.o(list) ? list.get(2) : AvatarWrapper.Companion.getNULL();
            object = (AvatarWrapper)object;
            AvatarIconKt.AvatarIcon-Rd90Nhg(modifier2.align(SizeKt.size-3ABfNKs((Modifier)measurePolicy, (float)f14), companion.getBottomEnd()), (AvatarWrapper)object, shape, false, l10, null, composer, n14 & 0x380 | 0x6040, 40);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(738100872);
            object = t.o(list) >= 0 ? list.get(0) : AvatarWrapper.Companion.getNULL();
            AvatarWrapper avatarWrapper = (AvatarWrapper)object;
            Modifier modifier3 = SizeKt.size-3ABfNKs((Modifier)modifier, (float)f11);
            object = avatarWrapper.getAvatar().getShape();
            y.i(object, "avatar.avatar.shape");
            AvatarIconKt.AvatarIcon-Rd90Nhg(modifier3, avatarWrapper, (Shape)AvatarIconKt.getComposeShape((AvatarShape)((Object)object)), false, 0L, null, composer, 64, 56);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((object = composer.endRestartGroup()) != null) {
            object.updateScope((p)new p<Composer, Integer, k0>(list, modifier, shape, f11, n10, n13){
                final int $$changed;
                final int $$default;
                final Shape $avatarShape;
                final List<AvatarWrapper> $avatars;
                final Modifier $modifier;
                final float $size;
                {
                    this.$avatars = list;
                    this.$modifier = modifier;
                    this.$avatarShape = shape;
                    this.$size = f11;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    AvatarTriangleGroupKt.AvatarTriangleGroup--jt2gSs(this.$avatars, this.$modifier, this.$avatarShape, this.$size, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview(locale="ar", name="RTL")
    private static final void DoubleAvatarsPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-2121947035);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-2121947035, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.DoubleAvatarsPreview (AvatarTriangleGroup.kt:102)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    AvatarTriangleGroupKt.access$DoubleAvatarsPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void SingleAvatarPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-932654159);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-932654159, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.SingleAvatarPreview (AvatarTriangleGroup.kt:89)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    AvatarTriangleGroupKt.access$SingleAvatarPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview(locale="ar", name="RTL")
    private static final void TripleAvatarsPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-724464974);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-724464974, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TripleAvatarsPreview (AvatarTriangleGroup.kt:116)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarTriangleGroupKt.INSTANCE.getLambda-3$intercom_sdk_base_release(), composer, 3072, 7);
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
                    AvatarTriangleGroupKt.access$TripleAvatarsPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$DoubleAvatarsPreview(Composer composer, int n10) {
        AvatarTriangleGroupKt.DoubleAvatarsPreview(composer, n10);
    }

    public static final /* synthetic */ void access$SingleAvatarPreview(Composer composer, int n10) {
        AvatarTriangleGroupKt.SingleAvatarPreview(composer, n10);
    }

    public static final /* synthetic */ void access$TripleAvatarsPreview(Composer composer, int n10) {
        AvatarTriangleGroupKt.TripleAvatarsPreview(composer, n10);
    }
}

