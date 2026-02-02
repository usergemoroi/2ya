/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.a
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.internal.SuppressAnimalSniffer
 *  kotlinx.serialization.json.internal.o1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json;

import androidx.compose.animation.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import kotlinx.serialization.json.internal.o1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017\u00a2\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0004\u00a8\u0006\u001d"}, d2={"Lkotlinx/serialization/json/u;", "Lkotlinx/serialization/json/JsonPrimitive;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Z", "f", "()Z", "isString", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "e", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "coerceToInlineType", "Ljava/lang/String;", "content", "body", "<init>", "(Ljava/lang/Object;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonLiteral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class u
extends JsonPrimitive {
    private final boolean c;
    @Nullable
    private final SerialDescriptor d;
    @NotNull
    private final String e;

    public u(@NotNull Object object, boolean bl, @Nullable SerialDescriptor serialDescriptor) {
        y.j((Object)object, (String)"body");
        super(null);
        this.c = bl;
        this.d = serialDescriptor;
        this.e = object.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ u(Object object, boolean bl, SerialDescriptor serialDescriptor, int n4, p p4) {
        if ((n4 & 4) != 0) {
            serialDescriptor = null;
        }
        this(object, bl, serialDescriptor);
    }

    @Override
    @NotNull
    public String d() {
        return this.e;
    }

    @Nullable
    public final SerialDescriptor e() {
        return this.d;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && u.class == object.getClass()) {
            object = (u)((Object)object);
            if (this.f() != ((u)((Object)object)).f()) {
                return false;
            }
            return y.e((Object)this.d(), (Object)((u)((Object)object)).d());
        }
        return false;
    }

    public boolean f() {
        return this.c;
    }

    @SuppressAnimalSniffer
    public int hashCode() {
        return a.a((boolean)this.f()) * 31 + this.d().hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        CharSequence charSequence;
        if (this.f()) {
            charSequence = new StringBuilder();
            o1.c((StringBuilder)charSequence, (String)this.d());
            charSequence = ((StringBuilder)charSequence).toString();
            y.i((Object)charSequence, (String)"toString(...)");
        } else {
            charSequence = this.d();
        }
        return charSequence;
    }
}

