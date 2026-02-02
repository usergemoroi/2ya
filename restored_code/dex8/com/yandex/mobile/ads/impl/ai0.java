/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.sf
 *  com.yandex.mobile.ads.impl.vn
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ci0;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.n01;
import com.yandex.mobile.ads.impl.sf;
import com.yandex.mobile.ads.impl.uy1;
import com.yandex.mobile.ads.impl.vn;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ai0
extends uy1 {
    private static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder a = vn.c.newDecoder();
    private final CharsetDecoder b = vn.b.newDecoder();

    @Override
    protected final k01 a(n01 object, ByteBuffer object2) {
        String string2 = null;
        try {
            object = this.a.decode((ByteBuffer)object2).toString();
            this.a.reset();
        }
        catch (Throwable throwable) {
            this.a.reset();
            ((ByteBuffer)object2).rewind();
            throw throwable;
        }
        catch (CharacterCodingException characterCodingException) {
            this.a.reset();
            ((ByteBuffer)object2).rewind();
            try {
                object = this.b.decode((ByteBuffer)object2).toString();
            }
            catch (CharacterCodingException characterCodingException2) {
                object = null;
            }
            finally {
                this.b.reset();
                ((ByteBuffer)object2).rewind();
            }
        }
        ((ByteBuffer)object2).rewind();
        byte[] byArray = new byte[((Buffer)object2).limit()];
        ((ByteBuffer)object2).get(byArray);
        if (object == null) {
            return new k01(new k01.b[]{new ci0(byArray, null, null)});
        }
        Matcher matcher = c.matcher((CharSequence)object);
        int n10 = 0;
        object = null;
        object2 = string2;
        while (matcher.find(n10)) {
            String string3 = matcher.group(1);
            string2 = matcher.group(2);
            Object object3 = object2;
            Object object4 = object;
            if (string3 != null) {
                object3 = sf.b((String)string3);
                object3.getClass();
                if (!((String)object3).equals("streamurl")) {
                    if (!((String)object3).equals("streamtitle")) {
                        object3 = object2;
                        object4 = object;
                    } else {
                        object3 = string2;
                        object4 = object;
                    }
                } else {
                    object4 = string2;
                    object3 = object2;
                }
            }
            n10 = matcher.end();
            object2 = object3;
            object = object4;
        }
        return new k01(new k01.b[]{new ci0(byArray, (String)object2, (String)object)});
    }
}

