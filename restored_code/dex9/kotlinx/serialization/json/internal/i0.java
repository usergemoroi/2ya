/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.text.e0
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.internal.a
 *  kotlinx.serialization.modules.c
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.modules.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019\u00a8\u0006\u001f"}, d2={"Lkotlinx/serialization/json/internal/i0;", "Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "u", "()I", "", "h", "()J", "", "H", "()B", "", "m", "()S", "Lkotlinx/serialization/json/internal/a;", "a", "Lkotlinx/serialization/json/internal/a;", "lexer", "Lkotlinx/serialization/modules/c;", "b", "Lkotlinx/serialization/modules/c;", "()Lkotlinx/serialization/modules/c;", "serializersModule", "Lkotlinx/serialization/json/b;", "json", "<init>", "(Lkotlinx/serialization/json/internal/a;Lkotlinx/serialization/json/b;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n+ 2 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n384#2,5:392\n384#2,5:397\n384#2,5:402\n384#2,5:407\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n*L\n377#1:392,5\n378#1:397,5\n379#1:402,5\n380#1:407,5\n*E\n"})
public final class i0
extends kotlinx.serialization.encoding.a {
    @NotNull
    private final a a;
    @NotNull
    private final c b;

    public i0(@NotNull a a4, @NotNull b b4) {
        y.j((Object)a4, (String)"lexer");
        y.j((Object)b4, (String)"json");
        this.a = a4;
        this.b = b4.a();
    }

    @Override
    public byte H() {
        a a4 = this.a;
        String string = a4.q();
        try {
            byte by = e0.a((String)string);
            return by;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse type '");
            stringBuilder.append("UByte");
            stringBuilder.append("' for input '");
            stringBuilder.append(string);
            stringBuilder.append('\'');
            kotlinx.serialization.json.internal.a.x((a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
            throw new j();
        }
    }

    @NotNull
    public c a() {
        return this.b;
    }

    @Override
    public long h() {
        a a4 = this.a;
        String string = a4.q();
        try {
            long l4 = e0.g((String)string);
            return l4;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse type '");
            stringBuilder.append("ULong");
            stringBuilder.append("' for input '");
            stringBuilder.append(string);
            stringBuilder.append('\'');
            kotlinx.serialization.json.internal.a.x((a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
            throw new j();
        }
    }

    @Override
    public short m() {
        a a4 = this.a;
        String string = a4.q();
        try {
            short s3 = e0.j((String)string);
            return s3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse type '");
            stringBuilder.append("UShort");
            stringBuilder.append("' for input '");
            stringBuilder.append(string);
            stringBuilder.append('\'');
            kotlinx.serialization.json.internal.a.x((a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
            throw new j();
        }
    }

    @Override
    public int u() {
        a a4 = this.a;
        String string = a4.q();
        try {
            int n4 = e0.d((String)string);
            return n4;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse type '");
            stringBuilder.append("UInt");
            stringBuilder.append("' for input '");
            stringBuilder.append(string);
            stringBuilder.append('\'');
            kotlinx.serialization.json.internal.a.x((a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
            throw new j();
        }
    }

    public int w(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        throw new IllegalStateException("unsupported".toString());
    }
}

