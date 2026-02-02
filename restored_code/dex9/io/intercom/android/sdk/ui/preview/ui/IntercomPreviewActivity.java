/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  androidx.activity.ComponentActivity
 *  androidx.activity.compose.ComponentActivityKt
 *  androidx.compose.material.MaterialThemeKt
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.SnapshotStateKt
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.runtime.internal.StabilityInferred
 *  androidx.compose.ui.graphics.Color
 *  androidx.lifecycle.ViewModelStoreOwner
 *  com.google.accompanist.systemuicontroller.b
 *  com.google.accompanist.systemuicontroller.c
 *  com.google.accompanist.systemuicontroller.d
 *  com.vk.id.internal.auth.a
 *  io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs
 *  io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile
 *  io.intercom.android.sdk.ui.preview.model.PreviewUiState
 *  io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$Companion
 *  io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt
 *  io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel
 *  io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$Companion
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.m
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.intercom.android.sdk.ui.preview.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.accompanist.systemuicontroller.b;
import com.google.accompanist.systemuicontroller.c;
import com.google.accompanist.systemuicontroller.d;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.m;
import kotlin.n;
import kotlinx.coroutines.flow.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2={"Lio/intercom/android/sdk/ui/preview/ui/IntercomPreviewActivity;", "Landroidx/activity/ComponentActivity;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "getPreviewData", "()Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "", "resultCode", "", "Landroid/net/Uri;", "uris", "Lkotlin/k0;", "finishWithResult", "(ILjava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "viewModel$delegate", "Lkotlin/m;", "getViewModel", "()Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "viewModel", "<init>", "()V", "Companion", "intercom-sdk-ui_release"}, k=1, mv={1, 8, 0})
@StabilityInferred(parameters=0)
public final class IntercomPreviewActivity
extends ComponentActivity {
    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final m viewModel$delegate = n.b(new a<PreviewViewModel>(this){
        final IntercomPreviewActivity this$0;
        {
            this.this$0 = intercomPreviewActivity;
            super(0);
        }

        @NotNull
        public final PreviewViewModel invoke() {
            PreviewViewModel.Companion companion = PreviewViewModel.Companion;
            IntercomPreviewActivity intercomPreviewActivity = this.this$0;
            return companion.create$intercom_sdk_ui_release((ViewModelStoreOwner)intercomPreviewActivity, IntercomPreviewActivity.access$getPreviewData(intercomPreviewActivity));
        }
    });

    static {
        Companion = new /* Unavailable Anonymous Inner Class!! */;
        $stable = 8;
    }

    public static final /* synthetic */ void access$finishWithResult(IntercomPreviewActivity intercomPreviewActivity, int n4, List list) {
        intercomPreviewActivity.finishWithResult(n4, list);
    }

    public static final /* synthetic */ IntercomPreviewArgs access$getPreviewData(IntercomPreviewActivity intercomPreviewActivity) {
        return intercomPreviewActivity.getPreviewData();
    }

    public static final /* synthetic */ PreviewViewModel access$getViewModel(IntercomPreviewActivity intercomPreviewActivity) {
        return intercomPreviewActivity.getViewModel();
    }

    private final void finishWithResult(int n4, List<? extends Uri> list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("MEDIA_RESULT_URIS", new ArrayList(list));
        this.setResult(n4, intent);
        this.finish();
    }

    private final IntercomPreviewArgs getPreviewData() {
        Bundle bundle;
        block5: {
            block3: {
                block4: {
                    if (Build.VERSION.SDK_INT < 33) break block3;
                    bundle = this.getIntent().getExtras();
                    if (bundle == null) break block4;
                    IntercomPreviewArgs intercomPreviewArgs = (IntercomPreviewArgs)com.vk.id.internal.auth.a.a((Bundle)bundle, (String)"INTERCOM_PREVIEW_ARGS", IntercomPreviewArgs.class);
                    bundle = intercomPreviewArgs;
                    if (intercomPreviewArgs != null) break block5;
                }
                bundle = new IntercomPreviewArgs(null, null, null, false, null, 31, null);
                break block5;
            }
            bundle = this.getIntent().getExtras();
            IntercomPreviewArgs intercomPreviewArgs = bundle != null ? (IntercomPreviewArgs)bundle.getParcelable("INTERCOM_PREVIEW_ARGS") : null;
            bundle = intercomPreviewArgs;
            if (intercomPreviewArgs == null) {
                bundle = new IntercomPreviewArgs(null, null, null, false, null, 31, null);
            }
        }
        return bundle;
    }

    private final PreviewViewModel getViewModel() {
        return (PreviewViewModel)this.viewModel$delegate.getValue();
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default((ComponentActivity)this, null, (p)ComposableLambdaKt.composableLambdaInstance((int)-2110849940, (boolean)true, (Object)new p<Composer, Integer, k0>(this){
            final IntercomPreviewActivity this$0;
            {
                this.this$0 = intercomPreviewActivity;
                super(2);
            }

            @Composable
            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
            public final void invoke(@Nullable Composer composer, int n4) {
                if ((n4 & 0xB) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)-2110849940, (int)n4, (int)-1, (String)"io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity.onCreate.<anonymous> (IntercomPreviewActivity.kt:29)");
                    }
                    b.b((c)d.e(null, (Composer)composer, (int)0, (int)1), (long)Color.Companion.getBlack-0d7_KjU(), (boolean)false, null, (int)4, null);
                    if (((PreviewUiState)SnapshotStateKt.collectAsState((q0)IntercomPreviewActivity.access$getViewModel(this.this$0).getState$intercom_sdk_ui_release(), null, (Composer)composer, (int)8, (int)1).getValue()).getFiles().isEmpty()) {
                        IntercomPreviewActivity.access$finishWithResult(this.this$0, 0, t.m());
                    }
                    MaterialThemeKt.MaterialTheme(null, null, null, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)1718828824, (boolean)true, (Object)new p<Composer, Integer, k0>(this.this$0){
                        final IntercomPreviewActivity this$0;
                        {
                            this.this$0 = intercomPreviewActivity;
                            super(2);
                        }

                        @Composable
                        @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                        public final void invoke(@Nullable Composer composer, int n4) {
                            if ((n4 & 0xB) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                            } else {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart((int)1718828824, (int)n4, (int)-1, (String)"io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity.onCreate.<anonymous>.<anonymous> (IntercomPreviewActivity.kt:39)");
                                }
                                PreviewRootScreenKt.PreviewRootScreen(null, (IntercomPreviewArgs)IntercomPreviewActivity.access$getPreviewData(this.this$0), (PreviewViewModel)IntercomPreviewActivity.access$getViewModel(this.this$0), (a)new a<k0>(this.this$0){
                                    final IntercomPreviewActivity this$0;
                                    {
                                        this.this$0 = intercomPreviewActivity;
                                        super(0);
                                    }

                                    public final void invoke() {
                                        IntercomPreviewActivity.access$finishWithResult(this.this$0, 0, t.m());
                                    }
                                }, (l)new l<IntercomPreviewFile, k0>(this.this$0){
                                    final IntercomPreviewActivity this$0;
                                    {
                                        this.this$0 = intercomPreviewActivity;
                                        super(1);
                                    }

                                    public final void invoke(@NotNull IntercomPreviewFile intercomPreviewFile) {
                                        y.j((Object)intercomPreviewFile, (String)"it");
                                        IntercomPreviewActivity.access$getViewModel(this.this$0).onDeleteClicked$intercom_sdk_ui_release(intercomPreviewFile);
                                    }
                                }, (l)new l<List<? extends Uri>, k0>(this.this$0){
                                    final IntercomPreviewActivity this$0;
                                    {
                                        this.this$0 = intercomPreviewActivity;
                                        super(1);
                                    }

                                    public final void invoke(@NotNull List<? extends Uri> list) {
                                        y.j(list, (String)"it");
                                        IntercomPreviewActivity.access$finishWithResult(this.this$0, -1, list);
                                    }
                                }, (Composer)composer, (int)576, (int)1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }), (Composer)composer, (int)3072, (int)7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), (int)1, null);
    }
}

