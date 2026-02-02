/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.y
 *  kotlin.time.e
 *  kotlin.time.f
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.y;
import kotlin.time.e;
import kotlin.time.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"", "shortName", "Lkotlin/time/e;", "e", "(Ljava/lang/String;)Lkotlin/time/e;", "", "isoChar", "", "isTimeComponent", "d", "(CZ)Lkotlin/time/e;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/time/DurationUnitKt")
class g
extends f {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @SinceKotlin(version="1.5")
    @NotNull
    public static final e d(char c4, boolean bl) {
        if (!bl) {
            if (c4 == 'D') {
                return e.j;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid or unsupported duration ISO non-time unit: ");
            stringBuilder.append(c4);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (c4 == 'H') return e.i;
        if (c4 == 'M') return e.h;
        if (c4 == 'S') {
            return e.g;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid duration ISO time unit: ");
        stringBuilder.append(c4);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @SinceKotlin(version="1.5")
    @NotNull
    public static final e e(@NotNull String string) {
        block8: {
            block9: {
                block2: {
                    block3: {
                        block4: {
                            block5: {
                                block6: {
                                    block7: {
                                        y.j((Object)string, (String)"shortName");
                                        int n4 = string.hashCode();
                                        if (n4 == 100) break block2;
                                        if (n4 == 104) break block3;
                                        if (n4 == 109) break block4;
                                        if (n4 == 115) break block5;
                                        if (n4 == 3494) break block6;
                                        if (n4 == 3525) break block7;
                                        if (n4 != 3742 || !string.equals("us")) break block8;
                                        string = e.e;
                                        break block9;
                                    }
                                    if (!string.equals("ns")) break block8;
                                    string = e.d;
                                    break block9;
                                }
                                if (!string.equals("ms")) break block8;
                                string = e.f;
                                break block9;
                            }
                            if (!string.equals("s")) break block8;
                            string = e.g;
                            break block9;
                        }
                        if (!string.equals("m")) break block8;
                        string = e.h;
                        break block9;
                    }
                    if (!string.equals("h")) break block8;
                    string = e.i;
                    break block9;
                }
                if (!string.equals("d")) break block8;
                string = e.j;
            }
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown duration unit short name: ");
        stringBuilder.append(string);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

