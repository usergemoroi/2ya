/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  ru.ok.tracer.base.http.e
 *  ru.ok.tracer.base.http.f
 *  ru.ok.tracer.base.http.h
 */
package ru.ok.tracer.base.http;

import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import ru.ok.tracer.base.http.e;
import ru.ok.tracer.base.http.f;
import ru.ok.tracer.base.http.h;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\r\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lru/ok/tracer/base/http/c;", "Lru/ok/tracer/base/http/h;", "Ljava/io/OutputStream;", "stream", "Lkotlin/k0;", "writeTo", "(Ljava/io/OutputStream;)V", "", "c", "Ljava/lang/String;", "boundary", "", "Lru/ok/tracer/base/http/f;", "d", "Ljava/util/List;", "parts", "e", "getContentType", "()Ljava/lang/String;", "contentType", "", "f", "J", "()J", "contentLength", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "tracer-base_release"}, k=1, mv={1, 7, 1})
public final class c
implements h {
    @NotNull
    private final String c;
    @NotNull
    private final List<f> d;
    @NotNull
    private final String e;
    private final long f;

    public c(@NotNull String object, @NotNull List<f> object2) {
        long l4;
        y.j((Object)object, (String)"boundary");
        y.j(object2, (String)"parts");
        this.c = object;
        this.d = object2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("multipart/form-data; boundary=");
        stringBuilder.append((String)object);
        this.e = stringBuilder.toString();
        object = (Iterable)object2;
        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (((f)object.next()).a().d() >= 0L) continue;
                l4 = -1L;
                break;
            }
        } else {
            object = this.d;
            l4 = (long)ru.ok.tracer.base.http.e.c().length + (long)ru.ok.tracer.base.http.e.d((String)this.c) + (long)ru.ok.tracer.base.http.e.b().length;
            object2 = object.iterator();
            while (object2.hasNext()) {
                object = (f)object2.next();
                l4 = l4 + (long)ru.ok.tracer.base.http.e.c().length + (long)ru.ok.tracer.base.http.e.d((String)this.c) + (long)ru.ok.tracer.base.http.e.b().length + object.b();
            }
        }
        this.f = l4;
    }

    public long d() {
        return this.f;
    }

    @NotNull
    public String getContentType() {
        return this.e;
    }

    public void writeTo(@NotNull OutputStream outputStream) {
        y.j((Object)outputStream, (String)"stream");
        for (f f4 : this.d) {
            outputStream.write(ru.ok.tracer.base.http.e.c());
            ru.ok.tracer.base.http.e.e((OutputStream)outputStream, (String)this.c);
            outputStream.write(ru.ok.tracer.base.http.e.b());
            f4.c(outputStream);
        }
        outputStream.write(ru.ok.tracer.base.http.e.c());
        ru.ok.tracer.base.http.e.e((OutputStream)outputStream, (String)this.c);
        outputStream.write(ru.ok.tracer.base.http.e.c());
    }
}

