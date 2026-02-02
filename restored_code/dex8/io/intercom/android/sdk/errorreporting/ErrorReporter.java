/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.Gson
 */
package io.intercom.android.sdk.errorreporting;

import android.content.Context;
import com.google.gson.Gson;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.errorreporting.ErrorReportStore;
import io.intercom.android.sdk.errorreporting.ExceptionParser;
import io.intercom.android.sdk.errorreporting.IntercomExceptionHandler;

public class ErrorReporter {
    private final Provider<Api> apiProvider;
    private final ExceptionParser exceptionParser;
    private final ErrorReportStore reportStore;

    ErrorReporter(ErrorReportStore errorReportStore, Provider<Api> provider, ExceptionParser exceptionParser) {
        this.reportStore = errorReportStore;
        this.apiProvider = provider;
        this.exceptionParser = exceptionParser;
    }

    public static ErrorReporter create(Context context, Gson gson, Provider<Api> provider) {
        return new ErrorReporter(ErrorReportStore.create(context.getApplicationContext(), gson), provider, new ExceptionParser());
    }

    public void disableExceptionHandler() {
        IntercomExceptionHandler.disable();
        this.reportStore.deleteFromDisk();
    }

    public void enableExceptionHandler() {
        IntercomExceptionHandler.enable(this);
    }

    void saveReport(Throwable throwable) {
        if (this.exceptionParser.containsIntercomMethod(throwable)) {
            this.reportStore.saveToDisk(this.exceptionParser.createReportFrom(throwable));
        }
    }

    public void sendSavedReport() {
        this.reportStore.sendSavedReport(this.apiProvider);
    }
}

