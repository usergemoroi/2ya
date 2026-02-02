/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.errorreporting;

import io.intercom.android.sdk.errorreporting.ErrorReporter;
import java.io.PrintStream;

class IntercomExceptionHandler
implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler originalHandler;
    private final ErrorReporter reporter;

    IntercomExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ErrorReporter errorReporter) {
        this.originalHandler = uncaughtExceptionHandler;
        this.reporter = errorReporter;
    }

    static void disable() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (uncaughtExceptionHandler instanceof IntercomExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(((IntercomExceptionHandler)uncaughtExceptionHandler).originalHandler);
        }
    }

    static void enable(ErrorReporter errorReporter) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (uncaughtExceptionHandler instanceof IntercomExceptionHandler) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new IntercomExceptionHandler(uncaughtExceptionHandler, errorReporter));
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        this.reporter.saveReport(throwable);
        Object object = this.originalHandler;
        if (object != null) {
            object.uncaughtException(thread, throwable);
        } else {
            object = System.err;
            ((PrintStream)object).printf("Exception in thread \"%s\" ", thread.getName());
            throwable.printStackTrace((PrintStream)object);
        }
    }
}

