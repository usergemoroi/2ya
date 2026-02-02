/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.c0
 *  okhttp3.internal.d
 *  okhttp3.s$b
 *  okhttp3.x
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.c0;
import okhttp3.internal.d;
import okhttp3.s;
import okhttp3.x;
import okio.e;
import okio.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0007\u0015B%\b\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0013\u00a8\u0006\u001a"}, d2={"Lokhttp3/s;", "Lokhttp3/c0;", "Lokio/f;", "sink", "", "countBytes", "", "a", "(Lokio/f;Z)J", "Lokhttp3/x;", "contentType", "()Lokhttp3/x;", "contentLength", "()J", "Lkotlin/k0;", "writeTo", "(Lokio/f;)V", "", "", "Ljava/util/List;", "encodedNames", "b", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "c", "okhttp"}, k=1, mv={1, 8, 0})
public final class s
extends c0 {
    @NotNull
    public static final b c = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final x d = x.e.a("application/x-www-form-urlencoded");
    @NotNull
    private final List<String> a;
    @NotNull
    private final List<String> b;

    public s(@NotNull List<String> list, @NotNull List<String> list2) {
        y.j(list, (String)"encodedNames");
        y.j(list2, (String)"encodedValues");
        this.a = okhttp3.internal.d.W(list);
        this.b = okhttp3.internal.d.W(list2);
    }

    private final long a(f f4, boolean bl) {
        long l4;
        if (bl) {
            f4 = new e();
        } else {
            y.g((Object)f4);
            f4 = f4.getBuffer();
        }
        int n4 = this.a.size();
        for (int i4 = 0; i4 < n4; ++i4) {
            if (i4 > 0) {
                ((e)f4).Y(38);
            }
            ((e)f4).h0(this.a.get(i4));
            ((e)f4).Y(61);
            ((e)f4).h0(this.b.get(i4));
        }
        if (bl) {
            l4 = ((e)f4).size();
            ((e)f4).k();
        } else {
            l4 = 0L;
        }
        return l4;
    }

    public long contentLength() {
        return this.a(null, true);
    }

    @NotNull
    public x contentType() {
        return d;
    }

    public void writeTo(@NotNull f f4) throws IOException {
        y.j((Object)f4, (String)"sink");
        this.a(f4, false);
    }
}

