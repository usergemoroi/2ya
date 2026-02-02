/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  ru.ok.tracer.base.http.h
 *  ru.ok.tracer.base.http.j
 */
package ru.ok.tracer.base.http;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import ru.ok.tracer.base.http.h;
import ru.ok.tracer.base.http.j;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lru/ok/tracer/base/http/a;", "Lru/ok/tracer/base/http/h;", "Lru/ok/tracer/base/http/j;", "Ljava/io/OutputStream;", "stream", "Lkotlin/k0;", "writeTo", "(Ljava/io/OutputStream;)V", "close", "()V", "", "c", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "contentType", "", "d", "[B", "getBytes", "()[B", "bytes", "", "()J", "contentLength", "<init>", "(Ljava/lang/String;[B)V", "tracer-base_release"}, k=1, mv={1, 7, 1})
public final class a
implements h,
j {
    @NotNull
    private final String c;
    @NotNull
    private final byte[] d;

    public a(@NotNull String string, @NotNull byte[] byArray) {
        y.j((Object)string, (String)"contentType");
        y.j((Object)byArray, (String)"bytes");
        this.c = string;
        this.d = byArray;
    }

    public void close() {
    }

    public long d() {
        return this.getBytes().length;
    }

    @NotNull
    public byte[] getBytes() {
        return this.d;
    }

    @NotNull
    public String getContentType() {
        return this.c;
    }

    public void writeTo(@NotNull OutputStream outputStream) {
        y.j((Object)outputStream, (String)"stream");
        outputStream.write(this.getBytes());
    }
}

