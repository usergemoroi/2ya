/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.MutableState
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SnapshotStateKt
 *  androidx.compose.ui.platform.AbstractComposeView
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0015\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\b\u0003\u0010\u0004R+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2={"Lio/intercom/android/sdk/m5/components/IntercomPrimaryButton;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/k0;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "", "<set-?>", "text$delegate", "Landroidx/compose/runtime/MutableState;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "Lkotlin/Function0;", "onClick$delegate", "getOnClick", "()Lkotlin/jvm/functions/a;", "setOnClick", "(Lkotlin/jvm/functions/a;)V", "onClick", "", "trailingIconId$delegate", "getTrailingIconId", "()Ljava/lang/Integer;", "setTrailingIconId", "(Ljava/lang/Integer;)V", "trailingIconId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nIntercomPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomPrimaryButton.kt\nio/intercom/android/sdk/m5/components/IntercomPrimaryButton\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,105:1\n81#2:106\n107#2,2:107\n81#2:109\n107#2,2:110\n81#2:112\n107#2,2:113\n*S KotlinDebug\n*F\n+ 1 IntercomPrimaryButton.kt\nio/intercom/android/sdk/m5/components/IntercomPrimaryButton\n*L\n73#1:106\n73#1:107,2\n74#1:109\n74#1:110,2\n75#1:112\n75#1:113,2\n*E\n"})
public final class IntercomPrimaryButton
extends AbstractComposeView {
    @NotNull
    private final MutableState onClick$delegate;
    @NotNull
    private final MutableState text$delegate;
    @NotNull
    private final MutableState trailingIconId$delegate;

    @JvmOverloads
    public IntercomPrimaryButton(@NotNull Context context) {
        y.j(context, "context");
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public IntercomPrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        y.j(context, "context");
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public IntercomPrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int n10) {
        y.j(context, "context");
        super(context, attributeSet, n10);
        this.text$delegate = SnapshotStateKt.mutableStateOf$default((Object)"", null, (int)2, null);
        this.onClick$delegate = SnapshotStateKt.mutableStateOf$default((Object)((Object)onClick.2.INSTANCE), null, (int)2, null);
        this.trailingIconId$delegate = SnapshotStateKt.mutableStateOf$default(null, null, (int)2, null);
    }

    public /* synthetic */ IntercomPrimaryButton(Context context, AttributeSet attributeSet, int n10, int n13, p p14) {
        if ((n13 & 2) != 0) {
            attributeSet = null;
        }
        if ((n13 & 4) != 0) {
            n10 = 0;
        }
        this(context, attributeSet, n10);
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer, int n10) {
        int n13;
        composer = composer.startRestartGroup(346924157);
        if ((n10 & 0xE) == 0) {
            n13 = composer.changed((Object)this) ? 4 : 2;
            n13 |= n10;
        } else {
            n13 = n10;
        }
        if ((n13 & 0xB) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)346924157, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.IntercomPrimaryButton.Content (IntercomPrimaryButton.kt:77)");
            }
            String string2 = this.getText();
            a<k0> a14 = this.getOnClick();
            IntercomPrimaryButtonKt.IntercomPrimaryButton(string2, null, this.getTrailingIconId(), a14, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<Composer, Integer, k0>(this, n10){
                final int $$changed;
                final IntercomPrimaryButton $tmp0_rcvr;
                {
                    this.$tmp0_rcvr = intercomPrimaryButton;
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    this.$tmp0_rcvr.Content(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @NotNull
    public final a<k0> getOnClick() {
        return (a)this.onClick$delegate.getValue();
    }

    @NotNull
    public final String getText() {
        return (String)this.text$delegate.getValue();
    }

    @Nullable
    public final Integer getTrailingIconId() {
        return (Integer)this.trailingIconId$delegate.getValue();
    }

    public final void setOnClick(@NotNull a<k0> a14) {
        y.j(a14, "<set-?>");
        this.onClick$delegate.setValue(a14);
    }

    public final void setText(@NotNull String string2) {
        y.j(string2, "<set-?>");
        this.text$delegate.setValue((Object)string2);
    }

    public final void setTrailingIconId(@Nullable Integer n10) {
        this.trailingIconId$delegate.setValue((Object)n10);
    }
}

