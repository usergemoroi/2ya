/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.sequences.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2={"Lkotlin/io/n;", "Lkotlin/sequences/i;", "", "", "iterator", "()Ljava/util/Iterator;", "Ljava/io/BufferedReader;", "a", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class n
implements i<String> {
    @NotNull
    private final BufferedReader a;

    public n(@NotNull BufferedReader bufferedReader) {
        y.j((Object)bufferedReader, (String)"reader");
        this.a = bufferedReader;
    }

    @NotNull
    public Iterator<String> iterator() {
        return new Iterator<String>(this){
            private String c;
            private boolean d;
            final n e;
            {
                this.e = n4;
            }

            public String a() {
                if (this.hasNext()) {
                    String string = this.c;
                    this.c = null;
                    y.g((Object)string);
                    return string;
                }
                throw new NoSuchElementException();
            }

            @Override
            public boolean hasNext() {
                String string = this.c;
                boolean bl = true;
                if (string == null && !this.d) {
                    this.c = string = this.e.a.readLine();
                    if (string == null) {
                        this.d = true;
                    }
                }
                if (this.c == null) {
                    bl = false;
                }
                return bl;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

