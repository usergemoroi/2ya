/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  kotlin.t
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlin.sequences.i;
import kotlin.t;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012:\u0010\u0018\u001a6\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00140\u0010\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\fRH\u0010\u0018\u001a6\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00140\u0010\u00a2\u0006\u0002\b\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lkotlin/text/e;", "Lkotlin/sequences/i;", "Lkotlin/ranges/i;", "", "iterator", "()Ljava/util/Iterator;", "", "a", "Ljava/lang/CharSequence;", "input", "", "b", "I", "startIndex", "c", "limit", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/t;", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/p;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/p;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class e
implements i<kotlin.ranges.i> {
    @NotNull
    private final CharSequence a;
    private final int b;
    private final int c;
    @NotNull
    private final kotlin.jvm.functions.p<CharSequence, Integer, t<Integer, Integer>> d;

    public e(@NotNull CharSequence charSequence, int n4, int n5, @NotNull kotlin.jvm.functions.p<? super CharSequence, ? super Integer, t<Integer, Integer>> p4) {
        y.j((Object)charSequence, (String)"input");
        y.j(p4, (String)"getNextMatch");
        this.a = charSequence;
        this.b = n4;
        this.c = n5;
        this.d = p4;
    }

    public static final /* synthetic */ kotlin.jvm.functions.p c(e e4) {
        return e4.d;
    }

    public static final /* synthetic */ int e(e e4) {
        return e4.c;
    }

    @NotNull
    public Iterator<kotlin.ranges.i> iterator() {
        return new Iterator<kotlin.ranges.i>(this){
            private int c;
            private int d;
            private int e;
            private kotlin.ranges.i f;
            private int g;
            final e h;
            {
                int n4;
                this.h = e4;
                this.c = -1;
                this.d = n4 = j.n(e4.b, 0, e4.a.length());
                this.e = n4;
            }

            /*
             * Unable to fully structure code
             */
            private final void a() {
                block6: {
                    block7: {
                        block5: {
                            var2_1 = this.e;
                            var1_2 = 0;
                            if (var2_1 >= 0) break block5;
                            this.c = 0;
                            this.f = null;
                            break block6;
                        }
                        if (e.e(this.h) <= 0) break block7;
                        this.g = var2_1 = this.g + 1;
                        if (var2_1 >= e.e(this.h)) ** GOTO lbl-1000
                    }
                    if (this.e > e.d(this.h).length()) lbl-1000:
                    // 2 sources

                    {
                        this.f = new kotlin.ranges.i(this.d, p.Y(e.d(this.h)));
                        this.e = -1;
                    } else {
                        var4_3 = (t)e.c(this.h).invoke(e.d(this.h), this.e);
                        if (var4_3 == null) {
                            this.f = new kotlin.ranges.i(this.d, p.Y(e.d(this.h)));
                            this.e = -1;
                        } else {
                            var2_1 = ((Number)var4_3.a()).intValue();
                            var3_4 = ((Number)var4_3.b()).intValue();
                            this.f = j.v(this.d, var2_1);
                            this.d = var2_1 += var3_4;
                            if (var3_4 == 0) {
                                var1_2 = 1;
                            }
                            this.e = var2_1 + var1_2;
                        }
                    }
                    this.c = 1;
                }
            }

            public kotlin.ranges.i b() {
                if (this.c == -1) {
                    this.a();
                }
                if (this.c != 0) {
                    kotlin.ranges.i i4 = this.f;
                    y.h((Object)i4, (String)"null cannot be cast to non-null type kotlin.ranges.IntRange");
                    this.f = null;
                    this.c = -1;
                    return i4;
                }
                throw new NoSuchElementException();
            }

            @Override
            public boolean hasNext() {
                if (this.c == -1) {
                    this.a();
                }
                int n4 = this.c;
                boolean bl = true;
                if (n4 != 1) {
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

