/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks.lib;

import java.util.Locale;

public enum BlockAlignment {
    LEFT{

        @Override
        public int getGravity() {
            return 0x800003;
        }
    }
    ,
    CENTER{

        @Override
        public int getGravity() {
            return 1;
        }
    }
    ,
    RIGHT{

        @Override
        public int getGravity() {
            return 0x800005;
        }
    };


    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static BlockAlignment alignValueOf(String object) {
        void var0_2;
        BlockAlignment blockAlignment = LEFT;
        try {
            BlockAlignment blockAlignment2 = BlockAlignment.valueOf(((String)object).toUpperCase(Locale.ENGLISH));
            return var0_2;
        }
        catch (IllegalArgumentException | NullPointerException runtimeException) {
            BlockAlignment blockAlignment3 = blockAlignment;
            return var0_2;
        }
    }

    public abstract int getGravity();
}

