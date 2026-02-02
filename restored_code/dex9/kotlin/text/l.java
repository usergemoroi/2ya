/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.text.i
 *  kotlin.text.k
 *  kotlin.text.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.text.i;
import kotlin.text.j;
import kotlin.text.k;
import kotlin.text.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001e"}, d2={"Lkotlin/text/l;", "Lkotlin/text/k;", "next", "()Lkotlin/text/k;", "Ljava/util/regex/Matcher;", "a", "Ljava/util/regex/Matcher;", "matcher", "", "b", "Ljava/lang/CharSequence;", "input", "Lkotlin/text/j;", "c", "Lkotlin/text/j;", "()Lkotlin/text/j;", "groups", "Ljava/util/regex/MatchResult;", "d", "()Ljava/util/regex/MatchResult;", "matchResult", "Lkotlin/ranges/i;", "()Lkotlin/ranges/i;", "range", "", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class l
implements k {
    @NotNull
    private final Matcher a;
    @NotNull
    private final CharSequence b;
    @NotNull
    private final j c;

    public l(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        y.j((Object)matcher, (String)"matcher");
        y.j((Object)charSequence, (String)"input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new j(this){
            final l c;
            {
                this.c = l4;
            }

            @Override
            public i get(int n4) {
                kotlin.ranges.i i4 = n.c((MatchResult)this.c.d(), (int)n4);
                if (i4.l() >= 0) {
                    String string = this.c.d().group(n4);
                    y.i((Object)string, (String)"group(...)");
                    i4 = new i(string, i4);
                } else {
                    i4 = null;
                }
                return i4;
            }

            @Override
            public int getSize() {
                return this.c.d().groupCount() + 1;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Iterator<i> iterator() {
                return kotlin.sequences.l.y(t.f0((Iterable)t.n((Collection)this)), new kotlin.jvm.functions.l<Integer, i>(this){
                    final a g;
                    {
                        this.g = a4;
                        super(1);
                    }

                    public final i a(int n4) {
                        return this.g.get(n4);
                    }
                }).iterator();
            }
        };
    }

    private final MatchResult d() {
        return this.a;
    }

    @NotNull
    public j a() {
        return this.c;
    }

    @NotNull
    public kotlin.ranges.i b() {
        return n.b((MatchResult)this.d());
    }

    @NotNull
    public String getValue() {
        String string = this.d().group();
        y.i((Object)string, (String)"group(...)");
        return string;
    }

    @Nullable
    public k next() {
        Matcher matcher;
        int n4 = this.d().end();
        int n5 = this.d().end() == this.d().start() ? 1 : 0;
        if ((n5 = n4 + n5) <= this.b.length()) {
            matcher = this.a.pattern().matcher(this.b);
            y.i((Object)matcher, (String)"matcher(...)");
            matcher = n.a((Matcher)matcher, (int)n5, (CharSequence)this.b);
        } else {
            matcher = null;
        }
        return matcher;
    }
}

