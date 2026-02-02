/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.um2
 *  com.yandex.mobile.ads.impl.us
 *  com.yandex.mobile.ads.impl.ws
 *  com.yandex.mobile.ads.instream.InstreamAdBreak
 *  com.yandex.mobile.ads.instream.InstreamAdBreakPosition
 *  com.yandex.mobile.ads.instream.InstreamAdBreakPosition$Type
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.io2;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.us;
import com.yandex.mobile.ads.impl.ws;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class rm2
implements InstreamAdBreak {
    @NotNull
    private final us a;
    @NotNull
    private final um2 b;

    public /* synthetic */ rm2(us us3) {
        this(us3, new um2());
    }

    @JvmOverloads
    public rm2(@NotNull us us3, @NotNull um2 um22) {
        this.a = us3;
        this.b = um22;
    }

    @NotNull
    public final ArrayList a() {
        Object object = this.a.g();
        ArrayList<io2> arrayList = new ArrayList<io2>(t.x((Iterable)object, (int)10));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(new io2((co0)object.next()));
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof rm2 && y.e(((rm2)object).a, this.a);
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    public final InstreamAdBreakPosition getAdBreakPosition() {
        um2 um22 = this.b;
        ws ws3 = this.a.b();
        um22.getClass();
        int n10 = ws3.a().ordinal();
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) throw new r();
                um22 = InstreamAdBreakPosition.Type.POSITION;
                return new InstreamAdBreakPosition((InstreamAdBreakPosition.Type)um22, ws3.b());
            } else {
                um22 = InstreamAdBreakPosition.Type.MILLISECONDS;
            }
            return new InstreamAdBreakPosition((InstreamAdBreakPosition.Type)um22, ws3.b());
        } else {
            um22 = InstreamAdBreakPosition.Type.PERCENTS;
        }
        return new InstreamAdBreakPosition((InstreamAdBreakPosition.Type)um22, ws3.b());
    }

    @NotNull
    public final String getType() {
        return this.a.e();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

