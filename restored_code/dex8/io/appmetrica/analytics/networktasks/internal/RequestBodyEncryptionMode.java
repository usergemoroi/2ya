/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.networktasks.internal;

public final class RequestBodyEncryptionMode
extends Enum<RequestBodyEncryptionMode> {
    public static final /* enum */ RequestBodyEncryptionMode AES_RSA;
    public static final /* enum */ RequestBodyEncryptionMode NONE;
    private static final RequestBodyEncryptionMode[] a;

    static {
        RequestBodyEncryptionMode requestBodyEncryptionMode;
        RequestBodyEncryptionMode requestBodyEncryptionMode2;
        NONE = requestBodyEncryptionMode2 = new RequestBodyEncryptionMode();
        AES_RSA = requestBodyEncryptionMode = new RequestBodyEncryptionMode();
        a = new RequestBodyEncryptionMode[]{requestBodyEncryptionMode2, requestBodyEncryptionMode};
    }

    public static RequestBodyEncryptionMode valueOf(String string2) {
        return Enum.valueOf(RequestBodyEncryptionMode.class, string2);
    }

    public static RequestBodyEncryptionMode[] values() {
        return (RequestBodyEncryptionMode[])a.clone();
    }
}

