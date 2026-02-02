/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.wj1
 *  com.yandex.mobile.ads.impl.xj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wj1;
import com.yandex.mobile.ads.impl.xj1;

public abstract class un
implements xj1<Character> {
    protected un() {
    }

    public int a(CharSequence charSequence, int n10) {
        int n13 = charSequence.length();
        wj1.b((int)n10, (int)n13);
        while (n10 < n13) {
            if (this.a(charSequence.charAt(n10))) {
                return n10;
            }
            ++n10;
        }
        return -1;
    }

    public abstract boolean a(char var1);

    static abstract class a
    extends un {
        a() {
        }

        @Deprecated
        public final boolean apply(Object object) {
            return this.a(((Character)object).charValue());
        }
    }

    private static final class b
    extends a {
        private final char b;

        b(char c11) {
            this.b = c11;
        }

        @Override
        public final boolean a(char c11) {
            boolean bl2 = c11 == this.b;
            return bl2;
        }

        public final String toString() {
            char[] cArray;
            StringBuilder stringBuilder = new StringBuilder("CharMatcher.is('");
            char c11 = this.b;
            char[] cArray2 = cArray = new char[6];
            cArray[0] = 92;
            cArray2[1] = 117;
            cArray2[2] = 0;
            cArray2[3] = 0;
            cArray2[4] = 0;
            cArray2[5] = 0;
            for (int i14 = 0; i14 < 4; ++i14) {
                cArray[5 - i14] = "0123456789ABCDEF".charAt(c11 & 0xF);
                c11 = (char)(c11 >> 4);
            }
            stringBuilder.append(String.copyValueOf(cArray));
            stringBuilder.append("')");
            return stringBuilder.toString();
        }
    }

    static abstract class c
    extends a {
        private final String b = (String)wj1.a((Object)"CharMatcher.none()");

        c() {
        }

        public final String toString() {
            return this.b;
        }
    }

    private static final class d
    extends c {
        static final d c = new d();

        private d() {
        }

        @Override
        public final int a(CharSequence charSequence, int n10) {
            wj1.b((int)n10, (int)charSequence.length());
            return -1;
        }

        @Override
        public final boolean a(char c11) {
            return false;
        }
    }
}

