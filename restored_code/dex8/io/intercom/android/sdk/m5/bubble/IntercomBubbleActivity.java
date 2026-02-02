/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.activity.ComponentActivity
 *  androidx.activity.compose.ComponentActivityKt
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.bubble;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"Lio/intercom/android/sdk/m5/bubble/IntercomBubbleActivity;", "Landroidx/activity/ComponentActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k0;", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class IntercomBubbleActivity
extends ComponentActivity {
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default((ComponentActivity)this, null, (p)ComposableLambdaKt.composableLambdaInstance((int)947575690, (boolean)true, (Object)new p<Composer, Integer, k0>(this){
            final IntercomBubbleActivity this$0;
            {
                this.this$0 = intercomBubbleActivity;
                super(2);
            }

            @Composable
            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
            public final void invoke(@Nullable Composer composer, int n10) {
                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)947575690, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity.onCreate.<anonymous> (IntercomBubbleActivity.kt:12)");
                    }
                    IntercomThemeKt.IntercomTheme(null, null, null, (p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)-397450188, (boolean)true, (Object)new p<Composer, Integer, k0>(this.this$0){
                        final IntercomBubbleActivity this$0;
                        {
                            this.this$0 = intercomBubbleActivity;
                            super(2);
                        }

                        @Composable
                        @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                        public final void invoke(@Nullable Composer composer, int n10) {
                            if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                            } else {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart((int)-397450188, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity.onCreate.<anonymous>.<anonymous> (IntercomBubbleActivity.kt:13)");
                                }
                                Intent intent = this.this$0.getIntent();
                                y.i(intent, "intent");
                                IntercomRootNavHostKt.IntercomRootNavHost(intent, this.this$0, composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }), composer, 3072, 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), (int)1, null);
    }
}

