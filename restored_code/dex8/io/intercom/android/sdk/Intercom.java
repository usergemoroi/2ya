/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Application
 *  android.app.TaskStackBuilder
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.VisibleForTesting
 *  androidx.compose.runtime.internal.StabilityInferred
 *  com.intercom.twig.Twig
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.text.p
 */
package io.intercom.android.sdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomContent;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomPushManager;
import io.intercom.android.sdk.IntercomSpace;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.IntercomStatusCallbackKt;
import io.intercom.android.sdk.LateInitializationPreparer;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.ResetManager;
import io.intercom.android.sdk.UnreadConversationCountListener;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.a;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.push.IntercomLegacyPushClientHandler;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.store.UnreadCountTracker;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.AttributeSanitiser;
import io.intercom.android.sdk.utilities.ValidatorUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u009b\u00012\u00020\u0001:\u0006\u009b\u0001\u009c\u0001\u009d\u0001B\u00b3\u0001\b\u0001\u0012\u0006\u0010h\u001a\u00020g\u0012\f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j\u0012\u0006\u0010o\u001a\u00020n\u0012\f\u0010s\u001a\b\u0012\u0004\u0012\u00020r0q\u0012\u0006\u0010v\u001a\u00020u\u0012\u0006\u0010y\u001a\u00020x\u0012\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001\u0012\u0006\u0010|\u001a\u00020{\u0012\u0006\u0010\u007f\u001a\u00020~\u0012\u000e\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010j\u0012\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001\u0012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001\u0012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010j\u0012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001\u0012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001\u0012\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001\u00a2\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\fH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020 H\u0007\u00a2\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b(\u0010\u000bJ\u0017\u0010)\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\r\u00a2\u0006\u0004\b0\u0010\u001aJ\u0019\u00102\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u000101H\u0007\u00a2\u0006\u0004\b2\u00103J\u001f\u00102\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b2\u00104J\u0015\u00105\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r\u00a2\u0006\u0004\b5\u0010\u001aJ+\u00105\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u0003\u0018\u00010\f\u00a2\u0006\u0004\b5\u0010\u0016J\u000f\u00107\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b7\u0010\u000bJ\r\u00108\u001a\u00020\t\u00a2\u0006\u0004\b8\u0010\u000bJ\u0017\u00108\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b8\u0010\u001aJ\u000f\u0010:\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b:\u0010\u000bJ\u000f\u0010;\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b;\u0010\u000bJ!\u0010>\u001a\u00020\t2\u0010\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010<H\u0007\u00a2\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0004\bA\u0010\u001aJ\u0017\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020\rH\u0007\u00a2\u0006\u0004\bC\u0010\u001aJ\u0015\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020D\u00a2\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\t2\b\u0010I\u001a\u0004\u0018\u00010H\u00a2\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\t2\b\u0010I\u001a\u0004\u0018\u00010H\u00a2\u0006\u0004\bL\u0010KJ\r\u0010M\u001a\u00020\t\u00a2\u0006\u0004\bM\u0010\u000bJ\r\u0010N\u001a\u00020\t\u00a2\u0006\u0004\bN\u0010\u000bJ\u0017\u0010N\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\tH\u0007\u00a2\u0006\u0004\bP\u0010\u000bJ\r\u0010Q\u001a\u00020\t\u00a2\u0006\u0004\bQ\u0010\u000bJ\u0015\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u00020R\u00a2\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\t2\b\u0010S\u001a\u0004\u0018\u00010R\u00a2\u0006\u0004\bV\u0010UJ\u0017\u0010X\u001a\u00020\t2\u0006\u0010W\u001a\u00020\rH\u0007\u00a2\u0006\u0004\bX\u0010\u001aJ\u0017\u0010[\u001a\u00020\t2\b\u0010Z\u001a\u0004\u0018\u00010Y\u00a2\u0006\u0004\b[\u0010\\J!\u0010`\u001a\u00020\t2\b\u0010]\u001a\u0004\u0018\u00010\r2\b\u0010_\u001a\u0004\u0018\u00010^\u00a2\u0006\u0004\b`\u0010aJ!\u0010e\u001a\u00020\t2\b\u0010b\u001a\u0004\u0018\u00010\r2\b\u0010d\u001a\u0004\u0018\u00010c\u00a2\u0006\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020r0q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001d\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010j8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0082\u0001\u0010mR\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001d\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010j8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u008a\u0001\u0010mR\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0014\u0010\u0096\u0001\u001a\u00020D8F\u00a2\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\u00a8\u0006\u009e\u0001"}, d2={"Lio/intercom/android/sdk/Intercom;", "", "", "shouldDisableErrorReporting", "()Z", "Lio/intercom/android/sdk/identity/Registration;", "userRegistration", "userIsRegistered", "(Lio/intercom/android/sdk/identity/Registration;)Z", "Lkotlin/k0;", "softRegister", "()V", "", "", "userAttributes", "Lio/intercom/android/sdk/IntercomStatusCallback;", "intercomStatusCallback", "performUpdate", "(Ljava/util/Map;Lio/intercom/android/sdk/IntercomStatusCallback;)V", "name", "metadata", "logEventWithValidation", "(Ljava/lang/String;Ljava/util/Map;)V", "noUserRegistered", "error", "logErrorAndOpenInbox", "(Ljava/lang/String;)V", "pushDataString", "Landroid/app/TaskStackBuilder;", "customStack", "openIntercomChatPush", "(Ljava/lang/String;Landroid/app/TaskStackBuilder;)V", "Lio/intercom/android/sdk/IntercomSpace;", "space", "present", "(Lio/intercom/android/sdk/IntercomSpace;)V", "Lio/intercom/android/sdk/IntercomContent;", "content", "presentContent", "(Lio/intercom/android/sdk/IntercomContent;)V", "registerUnidentifiedUser", "loginUnidentifiedUser", "(Lio/intercom/android/sdk/IntercomStatusCallback;)V", "registerIdentifiedUser", "(Lio/intercom/android/sdk/identity/Registration;)V", "loginIdentifiedUser", "(Lio/intercom/android/sdk/identity/Registration;Lio/intercom/android/sdk/IntercomStatusCallback;)V", "userHash", "setUserHash", "Lio/intercom/android/sdk/UserAttributes;", "updateUser", "(Lio/intercom/android/sdk/UserAttributes;)V", "(Lio/intercom/android/sdk/UserAttributes;Lio/intercom/android/sdk/IntercomStatusCallback;)V", "logEvent", "metaData", "displayMessenger", "displayMessageComposer", "initialMessage", "displayConversationsList", "displayHelpCenter", "", "collectionIds", "displayHelpCenterCollections", "(Ljava/util/List;)V", "carouselId", "displayCarousel", "surveyId", "displaySurvey", "", "bottomPadding", "setBottomPadding", "(I)V", "Lio/intercom/android/sdk/Intercom$Visibility;", "visibility", "setInAppMessageVisibility", "(Lio/intercom/android/sdk/Intercom$Visibility;)V", "setLauncherVisibility", "hideIntercom", "handlePushMessage", "(Landroid/app/TaskStackBuilder;)V", "reset", "logout", "Lio/intercom/android/sdk/UnreadConversationCountListener;", "listener", "addUnreadConversationCountListener", "(Lio/intercom/android/sdk/UnreadConversationCountListener;)V", "removeUnreadConversationCountListener", "articleId", "displayArticle", "Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;", "collectionRequestCallback", "fetchHelpCenterCollections", "(Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;)V", "collectionId", "Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;", "collectionContentRequestCallback", "fetchHelpCenterCollection", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;)V", "searchTerm", "Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;", "searchRequestCallback", "searchHelpCenter", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;)V", "Lio/intercom/android/sdk/api/DeDuper;", "superDeDuper", "Lio/intercom/android/sdk/api/DeDuper;", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/api/Api;", "apiProvider", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/nexus/NexusClient;", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "Lio/intercom/android/sdk/store/Store;", "Lio/intercom/android/sdk/state/State;", "store", "Lio/intercom/android/sdk/store/Store;", "Lio/intercom/android/sdk/store/UnreadCountTracker;", "unreadCountTracker", "Lio/intercom/android/sdk/store/UnreadCountTracker;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Landroid/app/Application;", "context", "Landroid/app/Application;", "Lio/intercom/android/sdk/overlay/OverlayPresenter;", "overlayPresenter", "Lio/intercom/android/sdk/overlay/OverlayPresenter;", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfigProvider", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "Lio/intercom/android/sdk/push/SystemNotificationManager;", "systemNotificationManager", "Lio/intercom/android/sdk/push/SystemNotificationManager;", "Lio/intercom/android/sdk/api/UserUpdater;", "userUpdater", "Lio/intercom/android/sdk/ResetManager;", "resetManager", "Lio/intercom/android/sdk/ResetManager;", "Lcom/intercom/twig/Twig;", "twig", "Lcom/intercom/twig/Twig;", "Lio/intercom/android/sdk/utilities/ActivityFinisher;", "activityFinisher", "Lio/intercom/android/sdk/utilities/ActivityFinisher;", "getUnreadConversationCount", "()I", "unreadConversationCount", "Lio/intercom/android/sdk/errorreporting/ErrorReporter;", "errorReporter", "<init>", "(Lio/intercom/android/sdk/api/DeDuper;Lio/intercom/android/sdk/Provider;Lio/intercom/android/nexus/NexusClient;Lio/intercom/android/sdk/store/Store;Lio/intercom/android/sdk/store/UnreadCountTracker;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/errorreporting/ErrorReporter;Landroid/app/Application;Lio/intercom/android/sdk/overlay/OverlayPresenter;Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/push/SystemNotificationManager;Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/ResetManager;Lcom/intercom/twig/Twig;Lio/intercom/android/sdk/utilities/ActivityFinisher;)V", "Companion", "LogLevel", "Visibility", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@StabilityInferred(parameters=0)
@SourceDebugExtension(value={"SMAP\nIntercom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Intercom.kt\nio/intercom/android/sdk/Intercom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1152:1\n1#2:1153\n*E\n"})
public final class Intercom {
    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final Visibility GONE;
    @NotNull
    public static final String PUSH_RECEIVER = "intercom_sdk";
    private static final Twig TWIG;
    @JvmField
    @NotNull
    public static final Visibility VISIBLE;
    @SuppressLint(value={"StaticFieldLeak"})
    @Nullable
    private static Intercom instance;
    @NotNull
    private final ActivityFinisher activityFinisher;
    @NotNull
    private final Provider<Api> apiProvider;
    @NotNull
    private final Provider<AppConfig> appConfigProvider;
    @NotNull
    private final Application context;
    @NotNull
    private final MetricTracker metricTracker;
    @NotNull
    private final NexusClient nexusClient;
    @NotNull
    private final OverlayPresenter overlayPresenter;
    @NotNull
    private final ResetManager resetManager;
    @NotNull
    private final Store<State> store;
    @NotNull
    private final DeDuper superDeDuper;
    @NotNull
    private final SystemNotificationManager systemNotificationManager;
    @NotNull
    private final Twig twig;
    @NotNull
    private final UnreadCountTracker unreadCountTracker;
    @NotNull
    private final UserIdentity userIdentity;
    @NotNull
    private final Provider<UserUpdater> userUpdater;

    static {
        Companion = new Companion(null);
        $stable = 8;
        VISIBLE = Visibility.VISIBLE;
        GONE = Visibility.GONE;
        TWIG = LumberMill.getLogger();
    }

    @VisibleForTesting
    public Intercom(@NotNull DeDuper object, @NotNull Provider<Api> provider, @NotNull NexusClient nexusClient, @NotNull Store<State> store, @NotNull UnreadCountTracker unreadCountTracker, @NotNull MetricTracker metricTracker, @NotNull ErrorReporter errorReporter, @NotNull Application application, @NotNull OverlayPresenter overlayPresenter, @NotNull Provider<AppConfig> provider2, @NotNull UserIdentity userIdentity, @NotNull SystemNotificationManager systemNotificationManager, @NotNull Provider<UserUpdater> provider3, @NotNull ResetManager resetManager, @NotNull Twig twig, @NotNull ActivityFinisher activityFinisher) {
        y.j(object, "superDeDuper");
        y.j(provider, "apiProvider");
        y.j(nexusClient, "nexusClient");
        y.j(store, "store");
        y.j(unreadCountTracker, "unreadCountTracker");
        y.j(metricTracker, "metricTracker");
        y.j(errorReporter, "errorReporter");
        y.j(application, "context");
        y.j(overlayPresenter, "overlayPresenter");
        y.j(provider2, "appConfigProvider");
        y.j(userIdentity, "userIdentity");
        y.j(systemNotificationManager, "systemNotificationManager");
        y.j(provider3, "userUpdater");
        y.j(resetManager, "resetManager");
        y.j(twig, "twig");
        y.j(activityFinisher, "activityFinisher");
        this.superDeDuper = object;
        this.apiProvider = provider;
        this.nexusClient = nexusClient;
        this.store = store;
        this.unreadCountTracker = unreadCountTracker;
        this.metricTracker = metricTracker;
        this.context = application;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = provider2;
        this.userIdentity = userIdentity;
        this.systemNotificationManager = systemNotificationManager;
        this.userUpdater = provider3;
        this.resetManager = resetManager;
        this.twig = twig;
        this.activityFinisher = activityFinisher;
        object = IntercomPushManager.getInstalledModuleType();
        if (object != null && WhenMappings.$EnumSwitchMapping$0[((Enum)object).ordinal()] == 1) {
            twig.i("Enabling FCM for cloud messaging", new Object[0]);
            IntercomLegacyPushClientHandler.Companion.setUpNotificationChannels(systemNotificationManager, (Context)application);
            IntercomPushManager.initializeFcmService(application);
        } else {
            twig.internal("No FCM integration detected");
        }
        if (this.shouldDisableErrorReporting()) {
            errorReporter.disableExceptionHandler();
        } else {
            errorReporter.enableExceptionHandler();
        }
    }

    public static /* synthetic */ void a(Intercom intercom) {
        Intercom.softRegister$lambda$0(intercom);
    }

    @JvmStatic
    @NotNull
    public static final Intercom client() {
        synchronized (Intercom.class) {
            Intercom intercom = Companion.client();
            return intercom;
        }
    }

    @JvmStatic
    public static final void initialize(@Nullable Application application, @Nullable String string2, @Nullable String string3) {
        synchronized (Intercom.class) {
            Companion.initialize(application, string2, string3);
            return;
        }
    }

    private final void logErrorAndOpenInbox(String string2) {
        this.twig.e(string2, new Object[0]);
        this.present(IntercomSpace.Messages);
    }

    private final void logEventWithValidation(String string2, Map<String, ?> map2) {
        if (string2 != null && string2.length() != 0) {
            this.apiProvider.get().logEvent(string2, map2);
        } else {
            this.twig.e("The event name is null or empty. We can't log an event with this string.", new Object[0]);
        }
    }

    public static /* synthetic */ void loginIdentifiedUser$default(Intercom intercom, Registration registration, IntercomStatusCallback intercomStatusCallback, int n10, Object object) {
        if ((n10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginIdentifiedUser(registration, intercomStatusCallback);
    }

    public static /* synthetic */ void loginUnidentifiedUser$default(Intercom intercom, IntercomStatusCallback intercomStatusCallback, int n10, Object object) {
        if ((n10 & 1) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginUnidentifiedUser(intercomStatusCallback);
    }

    private final boolean noUserRegistered() {
        boolean bl2 = !this.userIdentity.identityExists() || this.userIdentity.isSoftReset();
        return bl2;
    }

    private final void openIntercomChatPush(String string2, TaskStackBuilder taskStackBuilder) {
        if (y.e(string2, "multiple_notifications")) {
            IntercomRootActivityLauncher.INSTANCE.startMessages((Context)this.context);
        } else {
            Intent intent = ConversationScreenOpenerKt.getConversationIntent((Context)this.context, string2, LastParticipatingAdmin.NULL);
            if (taskStackBuilder != null) {
                taskStackBuilder.addNextIntent(intent);
                this.context.startActivities(taskStackBuilder.getIntents());
            } else {
                this.context.startActivity(intent);
            }
        }
        this.metricTracker.viewedPushNotification(string2);
        IntercomLegacyPushClientHandler.Companion.clear(this.systemNotificationManager, (Context)this.context);
    }

    private final void performUpdate(Map<String, ? extends Object> object, IntercomStatusCallback intercomStatusCallback) {
        if (this.userIdentity.isUnidentified()) {
            AttributeSanitiser.anonymousSanitisation(object);
        }
        if (this.superDeDuper.shouldUpdateUser((Map<String, Object>)object)) {
            this.superDeDuper.update((Map<String, ?>)object);
            Boolean bl2 = this.store.select(Selectors.APP_IS_BACKGROUNDED);
            y.i(bl2, "isBackgrounded");
            object = UserUpdateRequest.create(false, bl2, object, false);
            this.userUpdater.get().updateUser((UserUpdateRequest)object, intercomStatusCallback);
            this.twig.internal("dupe", "updated user");
        } else {
            intercomStatusCallback.onSuccess();
            this.twig.internal("dupe", "dropped dupe");
        }
    }

    public static /* synthetic */ void present$default(Intercom intercom, IntercomSpace intercomSpace, int n10, Object object) {
        if ((n10 & 1) != 0) {
            intercomSpace = IntercomSpace.Home;
        }
        intercom.present(intercomSpace);
    }

    @JvmStatic
    public static final void registerForLaterInitialisation(@Nullable Application application) {
        synchronized (Intercom.class) {
            Companion.registerForLaterInitialisation(application);
            return;
        }
    }

    @JvmStatic
    public static final void setLogLevel(@LogLevel int n10) {
        Companion.setLogLevel(n10);
    }

    private final boolean shouldDisableErrorReporting() {
        return this.appConfigProvider.get().hasFeature("disable-error-reporting");
    }

    private final void softRegister() {
        this.nexusClient.connect(this.appConfigProvider.get().getRealTimeConfig(), true);
        this.userIdentity.softRestart();
        this.resetManager.clear();
        a a14 = new a(this);
        if (y.e(Looper.myLooper(), Looper.getMainLooper())) {
            a14.run();
        } else {
            new Handler(Looper.getMainLooper()).post((Runnable)a14);
        }
    }

    private static final void softRegister$lambda$0(Intercom intercom) {
        y.j(intercom, "this$0");
        intercom.overlayPresenter.refreshStateBecauseUserIdentityIsNotInStoreYet();
    }

    @JvmStatic
    public static final void unregisterForLateInitialisation(@Nullable Application application) {
        Companion.unregisterForLateInitialisation(application);
    }

    public static /* synthetic */ void updateUser$default(Intercom intercom, UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback, int n10, Object object) {
        if ((n10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.updateUser(userAttributes, intercomStatusCallback);
    }

    private final boolean userIsRegistered(Registration registration) {
        boolean bl2 = this.userIdentity.isSoftReset() && this.userIdentity.isSameUser(registration);
        return bl2;
    }

    public final void addUnreadConversationCountListener(@NotNull UnreadConversationCountListener unreadConversationCountListener) {
        y.j(unreadConversationCountListener, "listener");
        this.metricTracker.addUnreadConversationCountListenerAPICall();
        this.unreadCountTracker.addListener(unreadConversationCountListener);
    }

    @Deprecated(message="Use presentContent(IntercomContent.Article(id)) instead.")
    public final void displayArticle(@NotNull String string2) {
        y.j(string2, "articleId");
        this.metricTracker.displayArticleAPICall();
        string2 = ArticleActivity.Companion.buildIntent((Context)this.context, new ArticleActivity.ArticleActivityArguments(string2, "api", false, false, 12, null));
        this.context.startActivity((Intent)string2);
    }

    @Deprecated(message="Use presentContent(IntercomContent.Carousel(id)) instead.")
    public final void displayCarousel(@Nullable String string2) {
        this.metricTracker.displayCarouselAPICall();
        Application application = this.context;
        application.startActivity(IntercomCarouselActivity.buildIntent((Context)application, string2));
    }

    @Deprecated(message="Use present(IntercomSpace.Messages) instead.")
    public final void displayConversationsList() {
        this.metricTracker.displayConversationsListAPICall();
        this.metricTracker.openedMessengerConversationList(LauncherOpenBehaviour.LauncherType.CUSTOM);
        IntercomRootActivityLauncher.INSTANCE.startMessages((Context)this.context);
    }

    @Deprecated(message="Use present(IntercomSpace.HelpCenter) instead.")
    public final void displayHelpCenter() {
        this.metricTracker.displayHelpCenterAPICall();
        this.displayHelpCenterCollections(t.m());
    }

    @Deprecated(message="Use presentContent(IntercomContent.HelpCenterCollections(ids)) instead.")
    public final void displayHelpCenterCollections(@Nullable List<String> list) {
        this.metricTracker.displayHelpCenterCollectionsAPICall();
        Application application = this.context;
        list = list != null ? t.o0((Iterable)list) : null;
        List list2 = list;
        if (list == null) {
            list2 = t.m();
        }
        HelpCenterUrlUtilsKt.openCollections((Context)application, list2, "api");
    }

    public final void displayMessageComposer() {
        this.metricTracker.displayMessageComposerAPICall();
        this.displayMessageComposer("");
    }

    public final void displayMessageComposer(@Nullable String string2) {
        if (string2 != null && string2.length() != 0) {
            this.metricTracker.displayMessageComposerInitialMessageAPICall();
        }
        if (this.noUserRegistered()) {
            this.logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device. Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else if (!this.appConfigProvider.get().isReceivedFromServer()) {
            this.logErrorAndOpenInbox("It appears your app has not received a successful response from Intercom. Please check if you are using the correct Android app ID and API Key from the Intercom settings.");
        } else if (!this.appConfigProvider.get().isInboundMessages()) {
            this.logErrorAndOpenInbox("It appears your app is not on a plan that allows message composing. As a fallback we are calling present(IntercomSpace.Messages)");
        } else {
            this.metricTracker.openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType.CUSTOM);
            Application application = this.context;
            String string3 = string2;
            if (string2 == null) {
                string3 = "";
            }
            ConversationScreenOpenerKt.openComposer$default((Context)application, string3, true, null, null, 24, null);
        }
    }

    @Deprecated(message="Use present() instead.")
    public final void displayMessenger() {
        this.metricTracker.displayMessengerAPICall();
        if (this.noUserRegistered()) {
            this.logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else {
            new LauncherOpenBehaviour().openMessenger((Context)this.context);
        }
    }

    @Deprecated(message="Use presentContent(IntercomContent.Survey(id)) instead.")
    public final void displaySurvey(@NotNull String string2) {
        y.j(string2, "surveyId");
        this.metricTracker.displaySurveyAPICall();
        Application application = this.context;
        application.startActivity(IntercomSurveyActivity.Companion.buildIntent((Context)application, string2));
    }

    public final void fetchHelpCenterCollection(@Nullable String string2, @Nullable CollectionContentRequestCallback collectionContentRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        y.g(string2);
        y.g(collectionContentRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollection(metricTracker, string2, collectionContentRequestCallback);
    }

    public final void fetchHelpCenterCollections(@Nullable CollectionRequestCallback collectionRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionsAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        y.g(collectionRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollections(metricTracker, collectionRequestCallback);
    }

    public final int getUnreadConversationCount() {
        this.metricTracker.unreadConversationCountAPICall();
        return this.store.state().unreadConversationIds().size();
    }

    public final void handlePushMessage() {
        this.metricTracker.handlePushMessageAPICall();
        this.handlePushMessage(null);
    }

    public final void handlePushMessage(@Nullable TaskStackBuilder taskStackBuilder) {
        SharedPreferences sharedPreferences;
        String string2;
        if (taskStackBuilder != null) {
            this.metricTracker.handlePushMessageCustomStackAPICall();
        }
        if ((string2 = (sharedPreferences = this.context.getSharedPreferences("INTERCOM_SDK_PUSH_PREFS", 0)).getString("intercom_push_notification_path", "")) != null && !kotlin.text.p.h0((CharSequence)string2)) {
            this.openIntercomChatPush(string2, taskStackBuilder);
            sharedPreferences.edit().clear().apply();
        } else {
            this.twig.internal("No Uri found");
        }
    }

    public final void hideIntercom() {
        this.metricTracker.hideIntercomAPICall();
        this.activityFinisher.finishActivities();
    }

    public final void logEvent(@NotNull String string2) {
        y.j(string2, "name");
        this.metricTracker.logEventAPICall();
        this.logEventWithValidation(string2, s0.j());
    }

    public final void logEvent(@Nullable String string2, @Nullable Map<String, ?> map2) {
        this.metricTracker.logEventMetadataAPICall();
        if (map2 == null) {
            this.twig.i("The metadata provided is null, logging event with no metadata", new Object[0]);
        } else if (map2.isEmpty()) {
            this.twig.i("The metadata provided is empty, logging event with no metadata", new Object[0]);
        }
        map2 = map2 != null ? s0.x(map2) : null;
        Map map3 = map2;
        if (map2 == null) {
            map3 = s0.j();
        }
        this.logEventWithValidation(string2, map3);
    }

    public final void loginIdentifiedUser(@NotNull Registration object, @NotNull IntercomStatusCallback intercomStatusCallback) {
        y.j(object, "userRegistration");
        y.j(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginIdentifiedUserAPICall();
        boolean bl2 = y.e(((Registration)object).getEmail(), this.userIdentity.getEmail());
        UserAttributes userAttributes = null;
        Object object2 = null;
        if (bl2 && y.e(((Registration)object).getUserId(), this.userIdentity.getUserId())) {
            this.twig.i("The user is already registered with the same email and user id", new Object[0]);
            if (this.userIdentity.registrationHasAttributes((Registration)object)) {
                userAttributes = ((Registration)object).getAttributes();
                object = object2;
                if (userAttributes != null) {
                    object = userAttributes.toMap();
                }
                object2 = object;
                if (object == null) {
                    object2 = s0.j();
                }
                this.performUpdate((Map<String, ? extends Object>)object2, intercomStatusCallback);
            } else {
                intercomStatusCallback.onSuccess();
            }
            return;
        }
        if (this.userIsRegistered((Registration)object)) {
            this.softRegister();
            intercomStatusCallback.onSuccess();
        } else {
            this.resetManager.hardReset();
            if (this.userIdentity.canRegisterIdentifiedUser((Registration)object)) {
                this.userIdentity.registerIdentifiedUser((Registration)object);
                this.nexusClient.disconnect();
                boolean bl3 = this.store.select(Selectors.SESSION_STARTED_SINCE_LAST_BACKGROUNDED) ^ true;
                object2 = this.store.select(Selectors.APP_IS_BACKGROUNDED);
                if (((Registration)object).getAttributes() != null) {
                    y.i(object2, "isInBackground");
                    bl2 = (Boolean)object2;
                    object = ((Registration)object).getAttributes();
                    y.g(object);
                    object = UserUpdateRequest.create(bl3, bl2, ((UserAttributes)object).toMap(), true);
                    y.i(object, "{\n                    Us\u2026      )\n                }");
                } else {
                    y.i(object2, "isInBackground");
                    object = UserUpdateRequest.create(bl3, (Boolean)object2, true);
                    y.i(object, "{\n                    Us\u2026, true)\n                }");
                }
                this.userUpdater.get().updateUser((UserUpdateRequest)object, intercomStatusCallback);
            } else if (this.userIdentity.registrationHasAttributes((Registration)object)) {
                this.twig.i("We already have a registered user. Updating this user with the attributes provided.", new Object[0]);
                object2 = ((Registration)object).getAttributes();
                object = userAttributes;
                if (object2 != null) {
                    object = ((UserAttributes)object2).toMap();
                }
                object2 = object;
                if (object == null) {
                    object2 = s0.j();
                }
                this.performUpdate((Map<String, ? extends Object>)object2, intercomStatusCallback);
            } else {
                intercomStatusCallback.onFailure(new IntercomError(3002, "ERROR - Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this."));
            }
        }
    }

    public final void loginUnidentifiedUser(@NotNull IntercomStatusCallback intercomStatusCallback) {
        y.j(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginUnidentifiedUserAPICall();
        if (this.userIdentity.canRegisterUnidentifiedUser()) {
            this.resetManager.hardReset();
            this.userIdentity.registerUnidentifiedUser();
            this.nexusClient.disconnect();
            Object object = this.store.select(Selectors.APP_IS_BACKGROUNDED);
            boolean bl2 = this.store.select(Selectors.SESSION_STARTED_SINCE_LAST_BACKGROUNDED);
            y.i(object, "isBackgrounded");
            object = UserUpdateRequest.create(bl2 ^ true, (Boolean)object, true);
            this.userUpdater.get().updateUser((UserUpdateRequest)object, intercomStatusCallback);
        } else {
            intercomStatusCallback.onFailure(new IntercomError(3002, "Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this. If you are attempting to register an identified user call: registerIdentifiedUser(Registration)"));
        }
    }

    public final void logout() {
        this.metricTracker.logoutAPICall();
        if (!this.userIdentity.isSoftReset()) {
            this.resetManager.softReset();
        }
    }

    @JvmOverloads
    public final void present() {
        Intercom.present$default(this, null, 1, null);
    }

    @JvmOverloads
    public final void present(@NotNull IntercomSpace intercomSpace) {
        y.j((Object)intercomSpace, "space");
        if (this.noUserRegistered()) {
            TWIG.e("Intercom was presented but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).", new Object[0]);
        } else {
            Injector.get().getMetricTracker().presentAPICall(intercomSpace);
            int n10 = WhenMappings.$EnumSwitchMapping$1[intercomSpace.ordinal()];
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        if (n10 == 4) {
                            IntercomRootActivityLauncher.INSTANCE.startTickets((Context)this.context);
                        }
                    } else {
                        IntercomRootActivityLauncher.INSTANCE.startMessages((Context)this.context);
                    }
                } else {
                    IntercomRootActivityLauncher.INSTANCE.startHome((Context)this.context);
                }
            } else {
                HelpCenterUrlUtilsKt.openCollections((Context)this.context, t.m(), "api");
            }
        }
    }

    public final void presentContent(@NotNull IntercomContent intercomContent) {
        y.j(intercomContent, "content");
        if (!Injector.isNotInitialised() && !this.noUserRegistered()) {
            Injector.get().getMetricTracker().presentContentAPICall(intercomContent);
        }
        if (intercomContent instanceof IntercomContent.Article) {
            Application application = this.context;
            application.startActivity(ArticleActivity.Companion.buildIntent((Context)application, new ArticleActivity.ArticleActivityArguments(((IntercomContent.Article)intercomContent).getId(), "api", false, false, 12, null)));
        } else if (intercomContent instanceof IntercomContent.Carousel) {
            Application application = this.context;
            application.startActivity(IntercomCarouselActivity.buildIntent((Context)application, ((IntercomContent.Carousel)intercomContent).getId()));
        } else if (intercomContent instanceof IntercomContent.Survey) {
            Application application = this.context;
            application.startActivity(IntercomSurveyActivity.Companion.buildIntent((Context)application, ((IntercomContent.Survey)intercomContent).getId()));
        } else if (intercomContent instanceof IntercomContent.HelpCenterCollections) {
            HelpCenterUrlUtilsKt.openCollections((Context)this.context, ((IntercomContent.HelpCenterCollections)intercomContent).getIds(), "api");
        } else if (intercomContent instanceof IntercomContent.Conversation) {
            ConversationScreenOpenerKt.openComposer$default((Context)this.context, "", true, null, ((IntercomContent.Conversation)intercomContent).getId(), 8, null);
        } else if (intercomContent instanceof IntercomContent.Ticket) {
            IntercomRootActivityLauncher.INSTANCE.startTicketDetails((Context)this.context, ((IntercomContent.Ticket)intercomContent).getId(), "from_programmatic");
        }
    }

    @Deprecated(level=e.c, message="Use loginIdentifiedUser with callback instead.", replaceWith=@ReplaceWith(expression="loginIdentifiedUser(userRegistration)", imports={}))
    public final void registerIdentifiedUser(@Nullable Registration registration) {
        this.metricTracker.registerIdentifiedUserAPICall();
        if (registration == null) {
            LumberMill.getLogger().e("The registration object passed is null. An example successful call is registerIdentifiedUser(Registration.create().withEmail(email));", new Object[0]);
            return;
        }
        this.loginIdentifiedUser(registration, IntercomStatusCallbackKt.getNoStatusCallback());
    }

    @Deprecated(level=e.c, message="Use loginUnidentifiedUser instead.", replaceWith=@ReplaceWith(expression="loginUnidentifiedUser()", imports={}))
    public final void registerUnidentifiedUser() {
        this.metricTracker.registerUnidentifiedUserAPICall();
        this.loginUnidentifiedUser(IntercomStatusCallbackKt.getNoStatusCallback());
    }

    public final void removeUnreadConversationCountListener(@Nullable UnreadConversationCountListener unreadConversationCountListener) {
        this.metricTracker.removeUnreadConversationCountListenerAPICall();
        if (unreadConversationCountListener != null) {
            this.unreadCountTracker.removeListener(unreadConversationCountListener);
        }
    }

    @Deprecated(message="call {@link #logout()} instead")
    public final void reset() {
        this.metricTracker.resetAPICall();
        this.logout();
    }

    public final void searchHelpCenter(@Nullable String string2, @Nullable SearchRequestCallback searchRequestCallback) {
        this.metricTracker.searchHelpCenterAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        y.g(string2);
        y.g(searchRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterResultsForSearchTerm(metricTracker, string2, searchRequestCallback);
    }

    public final void setBottomPadding(int n10) {
        this.metricTracker.setBottomPaddingAPICall();
        this.store.dispatch(Actions.setBottomPadding(n10));
    }

    public final void setInAppMessageVisibility(@Nullable Visibility visibility) {
        this.metricTracker.setInAppMessageVisibilityAPICall();
        this.store.dispatch(Actions.setInAppNotificationVisibility(visibility));
    }

    public final void setLauncherVisibility(@Nullable Visibility visibility) {
        this.metricTracker.setLauncherVisibilityAPICall();
        this.store.dispatch(Actions.setLauncherVisibility(visibility));
    }

    public final void setUserHash(@NotNull String string2) {
        y.j(string2, "userHash");
        this.metricTracker.setUserHashAPICall();
        if (string2.length() == 0) {
            this.twig.w("The user hash you sent us to verify was empty, we will not be able to authenticate your requests without a valid user hash.", new Object[0]);
        } else if (y.e(this.userIdentity.getHmac(), string2)) {
            this.twig.i("The user hash set matches the existing user identity hash value", new Object[0]);
        } else {
            if (this.userIdentity.softUserIdentityHmacDiffers(string2)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setUserHash(string2);
        }
    }

    @Deprecated(level=e.c, message="Use updateUser with callback instead.", replaceWith=@ReplaceWith(expression="updateUser(userAttributes, statusCallback)", imports={}))
    public final void updateUser(@Nullable UserAttributes userAttributes) {
        this.metricTracker.updateUserAPICall();
        if (userAttributes == null) {
            LumberMill.getLogger().e("updateUser method failed: the UserAttributes object provided is null", new Object[0]);
        } else {
            this.updateUser(userAttributes, IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }

    public final void updateUser(@NotNull UserAttributes object, @NotNull IntercomStatusCallback intercomStatusCallback) {
        y.j(object, "userAttributes");
        y.j(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.updateUserCallbackAPICall();
        object = ((UserAttributes)object).toMap();
        y.i(object, "userAttributes.toMap()");
        this.performUpdate((Map<String, ? extends Object>)object, intercomStatusCallback);
    }

    @Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\"\u0010#J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!\u00a8\u0006$"}, d2={"Lio/intercom/android/sdk/Intercom$Companion;", "", "Landroid/app/Application;", "application", "", "apiKey", "appId", "Lio/intercom/android/sdk/Intercom;", "create", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/Intercom;", "Lkotlin/k0;", "initialize", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;)V", "registerForLaterInitialisation", "(Landroid/app/Application;)V", "unregisterForLateInitialisation", "client", "()Lio/intercom/android/sdk/Intercom;", "", "logLevel", "setLogLevel", "(I)V", "Lio/intercom/android/sdk/Intercom$Visibility;", "GONE", "Lio/intercom/android/sdk/Intercom$Visibility;", "PUSH_RECEIVER", "Ljava/lang/String;", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "TWIG", "Lcom/intercom/twig/Twig;", "VISIBLE", "instance", "Lio/intercom/android/sdk/Intercom;", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        private final Intercom create(Application application, String string2, String object) {
            Injector.initWithAppCredentials(application, string2, (String)object);
            Object object2 = Injector.get();
            UserIdentity userIdentity = ((Injector)object2).getUserIdentity();
            object = ((Injector)object2).getStore();
            DeDuper deDuper = ((Injector)object2).getDeDuper();
            y.i(deDuper, "injector.deDuper");
            Provider<Api> provider = ((Injector)object2).getApiProvider();
            y.i(provider, "injector.apiProvider");
            NexusClient nexusClient = ((Injector)object2).getNexusClient();
            y.i(nexusClient, "injector.nexusClient");
            y.i(object, "store");
            UnreadCountTracker unreadCountTracker = new UnreadCountTracker((Store<State>)object);
            MetricTracker metricTracker = ((Injector)object2).getMetricTracker();
            y.i(metricTracker, "injector.metricTracker");
            ErrorReporter errorReporter = ((Injector)object2).getErrorReporter();
            y.i(errorReporter, "injector.errorReporter");
            OverlayPresenter overlayPresenter = ((Injector)object2).getOverlayPresenter();
            y.i(overlayPresenter, "injector.overlayPresenter");
            Provider<AppConfig> provider2 = ((Injector)object2).getAppConfigProvider();
            y.i(provider2, "injector.appConfigProvider");
            y.i(userIdentity, "userIdentity");
            SystemNotificationManager systemNotificationManager = ((Injector)object2).getSystemNotificationManager();
            y.i(systemNotificationManager, "injector.systemNotificationManager");
            Provider<UserUpdater> provider3 = ((Injector)object2).getUserUpdaterProvider();
            y.i(provider3, "injector.userUpdaterProvider");
            ResetManager resetManager = ((Injector)object2).getResetManager();
            y.i(resetManager, "injector.resetManager");
            string2 = LumberMill.getLogger();
            y.i(string2, "getLogger()");
            object2 = ((Injector)object2).getActivityFinisher();
            y.i(object2, "injector.activityFinisher");
            return new Intercom(deDuper, provider, nexusClient, (Store<State>)object, unreadCountTracker, metricTracker, errorReporter, application, overlayPresenter, provider2, userIdentity, systemNotificationManager, provider3, resetManager, (Twig)string2, (ActivityFinisher)object2);
        }

        @JvmStatic
        @NotNull
        public final Intercom client() {
            synchronized (this) {
                Object object;
                block4: {
                    object = instance;
                    if (object == null) break block4;
                    return object;
                }
                object = new IllegalStateException("Intercom has been initialized incorrectly. Please make sure the first Intercom method you call is initialize() and that you're passing in the correct app ID and API key".toString());
                throw object;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @JvmStatic
        public final void initialize(@Nullable Application application, @Nullable String string2, @Nullable String string3) {
            synchronized (this) {
                Throwable throwable2;
                block6: {
                    try {
                        if (instance != null) {
                            TWIG.i("Intercom has already been initialized", new Object[0]);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    if (ValidatorUtil.isValidConstructorParams(application, string2, string3)) {
                        y.g(application);
                        instance = this.create(application, string2, string3);
                        LateInitializationPreparer.getInstance().handlePastLifecycleEvents(application, Injector.get());
                        Injector.get().getMetricTracker().initialiseAPICall();
                    } else {
                        TWIG.e("Intercom has been initialized incorrectly. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
                    }
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @JvmStatic
        public final void registerForLaterInitialisation(@Nullable Application object) {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    try {
                        if (instance != null) {
                            TWIG.i("Intercom has already been initialized", new Object[0]);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    if (object != null) {
                        LateInitializationPreparer.getInstance().register((Application)object);
                        return;
                    }
                    object = new NullPointerException("Cannot call registerForLaterInitialisation() with a null Application");
                    throw object;
                }
                throw throwable2;
            }
        }

        @JvmStatic
        public final void setLogLevel(@LogLevel int n10) {
            Injector.get().getMetricTracker().setLogLevelAPICall();
            LumberMill.setLogLevel(n10);
        }

        @JvmStatic
        public final void unregisterForLateInitialisation(@Nullable Application application) {
            Injector.get().getMetricTracker().unRegisterForLateInitialisationAPICall();
            if (application != null) {
                LateInitializationPreparer.getInstance().unregister(application);
                return;
            }
            throw new NullPointerException("Cannot call unregisterForLateInitialisation() with a null Application");
        }
    }

    @Retention(value=RetentionPolicy.RUNTIME)
    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/Intercom$LogLevel;", "", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static @interface LogLevel {
        public static final int ASSERT = 7;
        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int DEBUG = 3;
        public static final int DISABLED = 8;
        public static final int ERROR = 6;
        public static final int INFO = 4;
        public static final int VERBOSE = 2;
        public static final int WARN = 5;

        @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2={"Lio/intercom/android/sdk/Intercom$LogLevel$Companion;", "", "()V", "ASSERT", "", "DEBUG", "DISABLED", "ERROR", "INFO", "VERBOSE", "WARN", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            static final Companion $$INSTANCE = new Companion();
            public static final int ASSERT = 7;
            public static final int DEBUG = 3;
            public static final int DISABLED = 8;
            public static final int ERROR = 6;
            public static final int INFO = 4;
            public static final int VERBOSE = 2;
            public static final int WARN = 5;

            private Companion() {
            }
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lio/intercom/android/sdk/Intercom$Visibility;", "", "(Ljava/lang/String;I)V", "GONE", "VISIBLE", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static enum Visibility {
        GONE,
        VISIBLE;

    }

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[IntercomPushManager.IntercomPushIntegrationType.values().length];
            try {
                nArray[IntercomPushManager.IntercomPushIntegrationType.FCM.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            $EnumSwitchMapping$0 = nArray;
            int[] nArray2 = new int[IntercomSpace.values().length];
            try {
                nArray2[IntercomSpace.HelpCenter.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray2[IntercomSpace.Home.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray2[IntercomSpace.Messages.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray2[IntercomSpace.Tickets.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            $EnumSwitchMapping$1 = nArray2;
        }
    }
}

