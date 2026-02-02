/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  androidx.annotation.VisibleForTesting
 *  com.google.gson.Gson
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.errorreporting;

import android.content.Context;
import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.errorreporting.ErrorReport;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.persistence.JsonStorage;
import java.io.File;
import java.util.concurrent.RejectedExecutionException;

class ErrorReportStore {
    private static final String REPORT_FILE_PATH = "intercom-error.json";
    private static final Twig TWIG = LumberMill.getLogger();
    private final File reportFile;
    private final JsonStorage storage;

    @VisibleForTesting
    ErrorReportStore(File file, JsonStorage jsonStorage) {
        this.reportFile = file;
        this.storage = jsonStorage;
    }

    public static ErrorReportStore create(Context context, Gson gson) {
        return new ErrorReportStore(new File(context.getCacheDir(), REPORT_FILE_PATH), new JsonStorage(gson));
    }

    private void readAndSendReport(Api api) {
        this.storage.loadThenDelete(this.reportFile, ErrorReport.class, new JsonStorage.LoadHandler<ErrorReport>(){
            final ErrorReportStore this$0;
            final Api val$api;
            {
                this.this$0 = errorReportStore;
                this.val$api = api;
            }

            @Override
            public void onLoad(ErrorReport errorReport) {
                this.val$api.sendErrorReport(errorReport);
            }
        });
    }

    void deleteFromDisk() {
        this.storage.loadThenDelete(this.reportFile, ErrorReport.class, new JsonStorage.LoadHandler<ErrorReport>(this){
            final ErrorReportStore this$0;
            {
                this.this$0 = errorReportStore;
            }

            @Override
            public void onLoad(ErrorReport errorReport) {
            }
        });
    }

    void saveToDisk(ErrorReport errorReport) {
        this.storage.saveToFileAsJson(errorReport, this.reportFile);
    }

    void sendSavedReport(Provider<Api> twig) {
        try {
            Runnable runnable = new Runnable(){
                final ErrorReportStore this$0;
                final Provider val$apiProvider;
                {
                    this.this$0 = errorReportStore;
                    this.val$apiProvider = provider;
                }

                @Override
                public void run() {
                    if (this.this$0.reportFile.exists()) {
                        this.this$0.readAndSendReport((Api)this.val$apiProvider.get());
                    }
                }
            };
            AsyncTask.execute((Runnable)runnable);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            twig = TWIG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't queue up sending of event: ");
            stringBuilder.append(rejectedExecutionException);
            twig.internal(stringBuilder.toString());
        }
    }
}

