/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.api.BaseCallback;
import io.intercom.android.sdk.api.ErrorObject;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.models.events.failure.FetchCarouselFailedEvent;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import retrofit2.b;
import retrofit2.d;
import retrofit2.z;

class CallbackHolder {
    private static final Twig TWIG = LumberMill.getLogger();
    final IntercomDataLayer dataLayer;
    final Store<State> store;

    CallbackHolder(Store<State> store, IntercomDataLayer intercomDataLayer) {
        this.store = store;
        this.dataLayer = intercomDataLayer;
    }

    d<CarouselResponse.Builder> getCarouselCallback(String string2) {
        return new BaseCallback<CarouselResponse.Builder>(this, string2){
            final CallbackHolder this$0;
            final String val$carouselId;
            {
                this.this$0 = callbackHolder;
                this.val$carouselId = string2;
            }

            @Override
            protected void onError(ErrorObject errorObject) {
                this.this$0.store.dispatch(Actions.programmaticCarouselError(FetchCarouselFailedEvent.create(this.val$carouselId, errorObject)));
            }

            @Override
            protected void onSuccess(CarouselResponse.Builder builder) {
                this.this$0.store.dispatch(Actions.programmaticCarouselSuccess(builder.build().carousel().build()));
            }
        };
    }

    BaseCallback<LogEventResponse.Builder> logEventCallback() {
        return new BaseCallback<LogEventResponse.Builder>(this){
            final CallbackHolder this$0;
            {
                this.this$0 = callbackHolder;
            }

            @Override
            public void onSuccess(LogEventResponse.Builder object) {
                object = ((LogEventResponse.Builder)object).build();
                this.this$0.store.dispatch(Actions.baseResponseReceived((BaseResponse)object));
                this.this$0.store.dispatch(Actions.unreadConversationsSuccess((UsersResponse)object));
                this.this$0.dataLayer.updateCarousel(((LogEventResponse)object).getCarousel());
            }
        };
    }

    d<Void> loggingCallback(String string2) {
        return new d<Void>(){
            final CallbackHolder this$0;
            final String val$action;
            {
                this.this$0 = callbackHolder;
                this.val$action = string2;
            }

            @Override
            public void onFailure(b<Void> twig, Throwable serializable) {
                twig = TWIG;
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append(this.val$action);
                ((StringBuilder)serializable).append(" failure");
                twig.internal(((StringBuilder)serializable).toString());
            }

            @Override
            public void onResponse(b<Void> object, z<Void> twig) {
                twig = TWIG;
                object = new StringBuilder();
                ((StringBuilder)object).append(this.val$action);
                ((StringBuilder)object).append(" success");
                twig.internal(((StringBuilder)object).toString());
            }
        };
    }

    BaseCallback<UsersResponse.Builder> unreadCallback() {
        return new BaseCallback<UsersResponse.Builder>(this){
            final CallbackHolder this$0;
            {
                this.this$0 = callbackHolder;
            }

            @Override
            public void onSuccess(UsersResponse.Builder object) {
                object = ((UsersResponse.Builder)object).build();
                this.this$0.store.dispatch(Actions.baseResponseReceived((BaseResponse)object));
                this.this$0.store.dispatch(Actions.unreadConversationsSuccess((UsersResponse)object));
            }
        };
    }
}

