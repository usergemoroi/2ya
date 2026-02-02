/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.Window
 *  androidx.activity.ComponentActivity
 *  androidx.activity.compose.ComponentActivityKt
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.EffectsKt
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.graphics.Color
 *  androidx.core.view.WindowCompat
 *  com.google.accompanist.systemuicontroller.b
 *  com.google.accompanist.systemuicontroller.c
 *  com.google.accompanist.systemuicontroller.d
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.core.view.WindowCompat;
import com.google.accompanist.systemuicontroller.b;
import com.google.accompanist.systemuicontroller.c;
import com.google.accompanist.systemuicontroller.d;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseComponentActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"Lio/intercom/android/sdk/m5/IntercomRootActivity;", "Lio/intercom/android/sdk/activities/IntercomBaseComponentActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k0;", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class IntercomRootActivity
extends IntercomBaseComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows((Window)this.getWindow(), (boolean)false);
        Injector.get().getApi().openMessenger();
        ComponentActivityKt.setContent$default((ComponentActivity)this, null, (p)ComposableLambdaKt.composableLambdaInstance((int)1535831366, (boolean)true, (Object)new p<Composer, Integer, k0>(this){
            final IntercomRootActivity this$0;
            {
                this.this$0 = intercomRootActivity;
                super(2);
            }

            @Composable
            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
            public final void invoke(@Nullable Composer composer, int n10) {
                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)1535831366, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.IntercomRootActivity.onCreate.<anonymous> (IntercomRootActivity.kt:21)");
                    }
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    y.i(appConfig, "get().appConfigProvider.get()");
                    ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, (p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)-1535408283, (boolean)true, (Object)new p<Composer, Integer, k0>(this.this$0){
                        final IntercomRootActivity this$0;
                        {
                            this.this$0 = intercomRootActivity;
                            super(2);
                        }

                        @Composable
                        @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                        public final void invoke(@Nullable Composer composer, int n10) {
                            block6: {
                                Object object;
                                block8: {
                                    c c11;
                                    block7: {
                                        block5: {
                                            if ((n10 & 0xB) != 2 || !composer.getSkipping()) break block5;
                                            composer.skipToGroupEnd();
                                            break block6;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart((int)-1535408283, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.IntercomRootActivity.onCreate.<anonymous>.<anonymous> (IntercomRootActivity.kt:24)");
                                        }
                                        c11 = d.e(null, (Composer)composer, (int)0, (int)1);
                                        composer.startReplaceableGroup(1157296644);
                                        boolean bl2 = composer.changed((Object)c11);
                                        Object object2 = composer.rememberedValue();
                                        if (bl2) break block7;
                                        object = object2;
                                        if (object2 != Composer.Companion.getEmpty()) break block8;
                                    }
                                    object = new a<k0>(c11){
                                        final c $systemUiController;
                                        {
                                            this.$systemUiController = c11;
                                            super(0);
                                        }

                                        public final void invoke() {
                                            b.a((c)this.$systemUiController, (long)Color.Companion.getTransparent-0d7_KjU(), (boolean)true, (boolean)false, null, (int)12, null);
                                        }
                                    };
                                    composer.updateRememberedValue(object);
                                }
                                composer.endReplaceableGroup();
                                EffectsKt.SideEffect((a)((a)object), (Composer)composer, (int)0);
                                object = this.this$0.getIntent();
                                y.i(object, "intent");
                                IntercomRootNavHostKt.IntercomRootNavHost((Intent)object, (ComponentActivity)this.this$0, composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }), composer, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), (int)1, null);
    }
}

