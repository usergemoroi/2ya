/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;

public class ExceptionReport {
    @SerializedName(value="class_name")
    private final String className;
    private final String message;
    private final String stacktrace;

    ExceptionReport(String string2, String string3, String string4) {
        this.className = string2;
        this.message = string3;
        this.stacktrace = string4;
    }

    public String getClassName() {
        return this.className;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStacktrace() {
        return this.stacktrace;
    }
}

