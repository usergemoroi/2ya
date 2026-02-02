/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.errorreporting.ExceptionReport;
import java.util.List;

public class ErrorReport {
    @SerializedName(value="exception_reports")
    private final List<ExceptionReport> exceptionReports;
    private final long timestamp;

    ErrorReport(List<ExceptionReport> list, long l10) {
        this.exceptionReports = list;
        this.timestamp = l10;
    }

    public List<ExceptionReport> getExceptionReports() {
        return this.exceptionReports;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}

