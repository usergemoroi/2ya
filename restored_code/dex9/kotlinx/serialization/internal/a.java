/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.InternalSerializationApi
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.c
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004\u00a2\u0006\u0004\b(\u0010)J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0002H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00028\u0001H$\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H$\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0002H$\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b*\u00028\u0002H$\u00a2\u0006\u0004\b\u0012\u0010\fJ\u0013\u0010\u0013\u001a\u00028\u0001*\u00028\u0002H$\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0002*\u00028\u0001H$\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0017*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\bH$\u00a2\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0001H\u0007\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00022\b\b\u0002\u0010\"\u001a\u00020!H$\u00a2\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH$\u00a2\u0006\u0004\b&\u0010'\u0082\u0001\u0002*+\u00a8\u0006,"}, d2={"Lkotlinx/serialization/internal/a;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/c;", "decoder", "builder", "", "j", "(Lkotlinx/serialization/encoding/c;Ljava/lang/Object;)I", "e", "(Ljava/lang/Object;)I", "", "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "a", "()Ljava/lang/Object;", "b", "l", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "size", "Lkotlin/k0;", "c", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Decoder;", "previous", "f", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "index", "", "checkIndex", "h", "(Lkotlinx/serialization/encoding/c;ILjava/lang/Object;Z)V", "startIndex", "g", "(Lkotlinx/serialization/encoding/c;Ljava/lang/Object;II)V", "<init>", "()V", "Lkotlinx/serialization/internal/w;", "Lkotlinx/serialization/internal/l1;", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
public abstract class a<Element, Collection, Builder>
implements KSerializer<Collection> {
    private a() {
    }

    public /* synthetic */ a(p p4) {
        this();
    }

    public static /* synthetic */ void i(a a4, c c4, int n4, Object object, boolean bl, int n5, Object object2) {
        if (object2 == null) {
            if ((n5 & 8) != 0) {
                bl = true;
            }
            a4.h(c4, n4, object, bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int j(c c4, Builder Builder2) {
        int n4 = c4.v(this.getDescriptor());
        this.c(Builder2, n4);
        return n4;
    }

    protected abstract Builder a();

    protected abstract int b(Builder var1);

    protected abstract void c(Builder var1, int var2);

    @NotNull
    protected abstract Iterator<Element> d(Collection var1);

    public Collection deserialize(@NotNull Decoder decoder) {
        y.j((Object)decoder, (String)"decoder");
        return this.f(decoder, null);
    }

    protected abstract int e(Collection var1);

    @InternalSerializationApi
    public final Collection f(@NotNull Decoder decoder, @Nullable Collection object) {
        block7: {
            block6: {
                y.j((Object)decoder, (String)"decoder");
                if (object == null) break block6;
                Builder Builder2 = this.k(object);
                object = Builder2;
                if (Builder2 != null) break block7;
            }
            object = this.a();
        }
        int n4 = this.b(object);
        if ((decoder = decoder.b(this.getDescriptor())).k()) {
            this.g((c)decoder, object, n4, this.j((c)decoder, object));
        } else {
            int n5;
            while ((n5 = decoder.w(this.getDescriptor())) != -1) {
                a.i(this, (c)decoder, n4 + n5, object, false, 8, null);
            }
        }
        decoder.c(this.getDescriptor());
        return this.l(object);
    }

    protected abstract void g(@NotNull c var1, Builder var2, int var3, int var4);

    protected abstract void h(@NotNull c var1, int var2, Builder var3, boolean var4);

    protected abstract Builder k(Collection var1);

    protected abstract Collection l(Builder var1);
}

