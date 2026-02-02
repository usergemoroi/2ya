/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.errorreporting;

import io.intercom.android.sdk.errorreporting.ErrorReport;
import io.intercom.android.sdk.errorreporting.ExceptionReport;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.List;

class ExceptionParser {
    private static final String[] ALLOWED_PACKAGES = new String[]{"io.intercom.android.sdk", "java.", "android.", "com.android.", "com.google."};
    private static final String INTERCOM_SDK_PACKAGE = "io.intercom.android.sdk";
    private static final String REDACTION_LINE = "[Non Intercom/OS method]";

    ExceptionParser() {
    }

    private List<ExceptionReport> createExceptionReports(Throwable throwable) {
        ArrayList<ExceptionReport> arrayList = new ArrayList<ExceptionReport>();
        while (throwable != null) {
            arrayList.add(new ExceptionReport(throwable.getClass().getName(), throwable.getLocalizedMessage(), this.getStacktraceString(throwable.getStackTrace())));
            throwable = throwable.getCause();
        }
        return arrayList;
    }

    private String getStacktraceString(StackTraceElement[] stackTraceElementArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i14 = 0; i14 < stackTraceElementArray.length; ++i14) {
            Object object = stackTraceElementArray[i14];
            object = this.isFromAllowedPackage((StackTraceElement)object) ? ((StackTraceElement)object).toString() : REDACTION_LINE;
            stringBuilder.append((String)object);
            if (i14 >= stackTraceElementArray.length - 1) continue;
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private boolean isFromAllowedPackage(StackTraceElement object) {
        object = ((StackTraceElement)object).getClassName();
        String[] stringArray = ALLOWED_PACKAGES;
        int n10 = stringArray.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            if (!((String)object).startsWith(stringArray[i14])) continue;
            return true;
        }
        return false;
    }

    boolean containsIntercomMethod(Throwable throwable) {
        while (true) {
            if (throwable == null) break;
            StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
            int n10 = stackTraceElementArray.length;
            for (int i14 = 0; i14 < n10; ++i14) {
                if (!stackTraceElementArray[i14].getClassName().startsWith(INTERCOM_SDK_PACKAGE)) continue;
                return true;
            }
            throwable = throwable.getCause();
        }
        return false;
    }

    ErrorReport createReportFrom(Throwable throwable) {
        return new ErrorReport(this.createExceptionReports(throwable), TimeProvider.SYSTEM.currentTimeMillis());
    }
}

