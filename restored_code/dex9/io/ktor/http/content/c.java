/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.http.d
 *  io.ktor.http.i
 *  io.ktor.http.v
 *  io.ktor.utils.io.charsets.a
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlin.text.d
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.http.content;

import io.ktor.http.content.b;
import io.ktor.http.d;
import io.ktor.http.i;
import io.ktor.http.v;
import io.ktor.utils.io.charsets.a;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u001a\u00a8\u0006\u001e"}, d2={"Lio/ktor/http/content/c;", "Lio/ktor/http/content/b$a;", "", "d", "()[B", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getText", "text", "Lio/ktor/http/c;", "b", "Lio/ktor/http/c;", "()Lio/ktor/http/c;", "contentType", "Lio/ktor/http/v;", "c", "Lio/ktor/http/v;", "getStatus", "()Lio/ktor/http/v;", "status", "[B", "bytes", "", "()Ljava/lang/Long;", "contentLength", "<init>", "(Ljava/lang/String;Lio/ktor/http/c;Lio/ktor/http/v;)V", "ktor-http"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTextContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContent.kt\nio/ktor/http/content/TextContent\n+ 2 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n1#1,29:1\n8#2,3:30\n*S KotlinDebug\n*F\n+ 1 TextContent.kt\nio/ktor/http/content/TextContent\n*L\n20#1:30,3\n*E\n"})
public final class c
extends b.a {
    @NotNull
    private final String a;
    @NotNull
    private final io.ktor.http.c b;
    @Nullable
    private final v c;
    @NotNull
    private final byte[] d;

    public c(@NotNull String object, @NotNull io.ktor.http.c object2, @Nullable v object3) {
        y.j((Object)object, (String)"text");
        y.j((Object)object2, (String)"contentType");
        this.a = object;
        this.b = object2;
        this.c = object3;
        object3 = io.ktor.http.d.a((i)this.b());
        object2 = object3;
        if (object3 == null) {
            object2 = kotlin.text.d.b;
        }
        if (y.e((Object)object2, (Object)kotlin.text.d.b)) {
            object = kotlin.text.p.w((String)object);
        } else {
            object2 = ((Charset)object2).newEncoder();
            y.i((Object)object2, (String)"charset.newEncoder()");
            object = io.ktor.utils.io.charsets.a.g((CharsetEncoder)object2, (CharSequence)object, (int)0, (int)((String)object).length());
        }
        this.d = (byte[])object;
    }

    public /* synthetic */ c(String string, io.ktor.http.c c4, v v3, int n4, p p4) {
        if ((n4 & 4) != 0) {
            v3 = null;
        }
        this(string, c4, v3);
    }

    @NotNull
    public Long a() {
        return this.d.length;
    }

    @NotNull
    public io.ktor.http.c b() {
        return this.b;
    }

    @Override
    @NotNull
    public byte[] d() {
        return this.d;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TextContent[");
        stringBuilder.append((Object)this.b());
        stringBuilder.append("] \"");
        stringBuilder.append(kotlin.text.p.t1(this.a, 30));
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }
}

