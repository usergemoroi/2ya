/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.intercom.android.sdk.carousel;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.carousel.CarouselView;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.carousel.a;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import io.intercom.android.sdk.state.ProgrammaticCarouselState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.utilities.StoreUtils;
import java.util.List;

public final class CarouselPresenter {
    private final Api api;
    private Carousel carousel;
    @Nullable
    private String carouselId;
    private String carouselSource;
    private final IntercomDataLayer dataLayer;
    private int initialNumberOfScreens;
    private final MetricTracker metricTracker;
    private final PermissionManager permissionManager;
    private Store.Subscription programmaticCarouselSubscription;
    private final Store<State> store;
    private UserIdentity userIdentity;
    private CarouselView view;

    public CarouselPresenter(Store<State> store, Api api, UserIdentity userIdentity, MetricTracker metricTracker, PermissionManager permissionManager, IntercomDataLayer intercomDataLayer) {
        Carousel carousel;
        this.carousel = carousel = Carousel.NULL;
        this.view = null;
        this.programmaticCarouselSubscription = null;
        this.carouselSource = "programmatic";
        this.carouselId = null;
        this.store = store;
        this.api = api;
        this.userIdentity = userIdentity;
        this.metricTracker = metricTracker;
        this.permissionManager = permissionManager;
        this.dataLayer = intercomDataLayer;
        this.filterCarouselScreens(carousel);
    }

    public static /* synthetic */ void a(CarouselPresenter carouselPresenter, String string2, ProgrammaticCarouselState programmaticCarouselState) {
        carouselPresenter.lambda$fetchProgrammaticCarousel$0(string2, programmaticCarouselState);
    }

    private void fetchAutomaticCarousel() {
        Object object = ((OverlayState)this.dataLayer.getOverlayState().getValue()).getCarousel();
        this.carousel = object;
        this.initialNumberOfScreens = ((Carousel)object).getScreens().size();
        this.filterCarouselScreens(this.carousel);
        object = this.view;
        if (object != null) {
            object.showSuccess(this.carousel);
        }
    }

    private void fetchProgrammaticCarousel(@NonNull String string2) {
        StoreUtils.safeUnsubscribe(this.programmaticCarouselSubscription);
        this.store.dispatch(Actions.openProgrammaticCarousel(string2));
        this.programmaticCarouselSubscription = this.store.subscribeToChanges(Selectors.PROGRAMMATIC_CAROUSEL_STATE, new a(this, string2));
    }

    private boolean isTriggeredFromCode() {
        return this.carouselSource.equals("programmatic");
    }

    private /* synthetic */ void lambda$fetchProgrammaticCarousel$0(String object, ProgrammaticCarouselState object2) {
        if (object2 instanceof ProgrammaticCarouselState.Loading) {
            this.metricTracker.startedCarouselFetching((String)object, this.carouselSource);
            object = this.view;
            if (object != null) {
                object.showLoading();
            }
        } else if (object2 instanceof ProgrammaticCarouselState.Success) {
            StoreUtils.safeUnsubscribe(this.programmaticCarouselSubscription);
            this.carousel = object2 = ((ProgrammaticCarouselState.Success)object2).carousel();
            object = this.view;
            if (object != null) {
                object.showSuccess((Carousel)object2);
            }
        } else if (object2 instanceof ProgrammaticCarouselState.Error) {
            StoreUtils.safeUnsubscribe(this.programmaticCarouselSubscription);
            object2 = (ProgrammaticCarouselState.Error)object2;
            this.metricTracker.failedCarousel((String)object, this.carouselSource, ((ProgrammaticCarouselState.Error)object2).errorCode());
            if (this.view != null) {
                if (((ProgrammaticCarouselState.Error)object2).errorCode() == 404) {
                    this.view.showNotFoundError();
                } else {
                    this.view.showGenericError();
                }
            }
        }
    }

    private boolean noUserRegistered() {
        boolean bl2 = !this.userIdentity.identityExists() || this.userIdentity.isSoftReset();
        return bl2;
    }

    private void setSource(@Nullable String string2) {
        string2 = string2 == null ? "automatic" : "programmatic";
        this.carouselSource = string2;
    }

    public void attachView(CarouselView carouselView) {
        this.view = carouselView;
    }

    public void detachView() {
        StoreUtils.safeUnsubscribe(this.programmaticCarouselSubscription);
        this.view = null;
    }

    public void fetchCarousel(@Nullable String string2) {
        this.carouselId = string2;
        this.setSource(string2);
        if ("programmatic".equals(this.carouselSource)) {
            if (TextUtils.isEmpty((CharSequence)string2)) {
                this.view.logEmptyCarouselError();
                this.view.showNotFoundError();
            } else if (this.noUserRegistered()) {
                this.view.logUserNotRegisteredError();
                this.view.showNotFoundError();
            } else {
                this.fetchProgrammaticCarousel(string2);
            }
        } else {
            this.fetchAutomaticCarousel();
        }
    }

    @VisibleForTesting
    void filterCarouselScreens(Carousel object) {
        object = ((Carousel)object).getScreens().iterator();
        while (object.hasNext()) {
            if (!this.screenShouldBeRemoved((CarouselScreen)object.next())) continue;
            object.remove();
        }
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    public String getCarouselSource() {
        return this.carouselSource;
    }

    public void recordActionButtonTappedStats(@NonNull String string2) {
        String string3 = this.getCarousel().getInstanceId();
        this.api.markCarouselActionButtonTapped(string3, string2, this.isTriggeredFromCode());
    }

    public void recordDismissedOrCompletedMetric(String string2, boolean bl2, int n10) {
        String string3 = this.getCarousel().getInstanceId();
        if (TextUtils.isEmpty((CharSequence)string3)) {
            if (!TextUtils.isEmpty((CharSequence)this.carouselId)) {
                this.metricTracker.dismissedCarouselFetching(string2, this.carouselId, this.carouselSource);
            }
            return;
        }
        int n13 = this.getCarousel().getScreens().size();
        if (bl2) {
            this.metricTracker.completedCarousel(string2, string3, this.carouselSource, this.initialNumberOfScreens, n13);
        } else {
            this.metricTracker.dismissedCarousel(string2, string3, this.carouselSource, this.initialNumberOfScreens, n13, n10);
        }
    }

    public void recordDismissedOrCompletedStats(boolean bl2) {
        String string2 = this.getCarousel().getInstanceId();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return;
        }
        if (bl2) {
            this.api.markCarouselAsCompleted(string2, this.isTriggeredFromCode());
        } else {
            this.api.markCarouselAsDismissed(string2, this.isTriggeredFromCode());
        }
    }

    public void recordOpenMetric() {
        int n10 = this.getCarousel().getScreens().size();
        this.metricTracker.openedCarousel(this.getCarousel().getInstanceId(), this.carouselSource, this.initialNumberOfScreens, n10);
    }

    public void recordPermissionRequestedMetric(String string2, int[] nArray, String string3) {
        boolean bl2;
        String string4 = this.getCarousel().getInstanceId();
        int n10 = nArray.length;
        boolean bl3 = false;
        int n13 = 0;
        while (true) {
            bl2 = bl3;
            if (n13 >= n10) break;
            if (nArray[n13] == 0) {
                this.api.markPermissionGranted(string4, string3, this.isTriggeredFromCode());
                bl2 = true;
                break;
            }
            ++n13;
        }
        this.metricTracker.requestedPermission(string2, string4, this.carouselSource, bl2);
    }

    public void recordScreenSeenStats(String string2) {
        String string3 = this.getCarousel().getInstanceId();
        this.api.markCarouselScreenViewed(string3, string2, this.isTriggeredFromCode());
    }

    public void recordSentToPermissionSettingsMetric(ScreenAction object, String string2) {
        String string3 = ((ScreenAction)object).getType();
        object = ((ScreenAction)object).getValidPermissions(this.permissionManager);
        boolean bl2 = this.permissionManager.permissionsGranted((List<String>)object);
        object = this.getCarousel().getInstanceId();
        if (bl2) {
            this.api.markPermissionGranted((String)object, string2, this.isTriggeredFromCode());
        }
        this.metricTracker.sentToPermissionSettings(string3, (String)object, this.carouselSource, bl2);
    }

    public void resetPersistedCarousel() {
        this.store.dispatch(Actions.carouselDismissed());
        this.dataLayer.clearCarousel();
    }

    public void retryFetch(@Nullable String object) {
        if (TextUtils.isEmpty((CharSequence)object)) {
            object = this.view;
            if (object != null) {
                object.showNotFoundError();
            }
            return;
        }
        this.metricTracker.retriedCarouselFetching((String)object, this.carouselSource);
        this.fetchProgrammaticCarousel((String)object);
    }

    @VisibleForTesting
    boolean screenShouldBeRemoved(CarouselScreen object) {
        object = ((CarouselScreen)object).getPermissionAction();
        boolean bl2 = ScreenAction.NULL.equals(object);
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        if ((object = ((ScreenAction)object).getValidPermissions(this.permissionManager)).isEmpty() || this.permissionManager.permissionsGranted((List<String>)object)) {
            bl3 = true;
        }
        return bl3;
    }
}

