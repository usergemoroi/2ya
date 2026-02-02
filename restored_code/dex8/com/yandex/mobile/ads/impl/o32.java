/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Html
 *  android.text.TextUtils
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.bt0
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.text.Html;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.bt0;
import com.yandex.mobile.ads.impl.p32;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.wy1;
import com.yandex.mobile.ads.impl.zs0;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class o32
extends wy1 {
    private static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder m = new StringBuilder();
    private final ArrayList<String> n = new ArrayList();

    private static long a(Matcher object, int n10) {
        String string2 = ((Matcher)object).group(n10 + 1);
        long l10 = string2 != null ? Long.parseLong(string2) * 3600000L : 0L;
        string2 = ((Matcher)object).group(n10 + 2);
        string2.getClass();
        long l11 = Long.parseLong(string2);
        string2 = ((Matcher)object).group(n10 + 3);
        string2.getClass();
        l11 = Long.parseLong(string2) * 1000L + (l11 * 60000L + l10);
        object = ((Matcher)object).group(n10 + 4);
        l10 = l11;
        if (object != null) {
            l10 = l11 + Long.parseLong((String)object);
        }
        return l10 * 1000L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final q32 a(byte[] object, int n10, boolean bl2) {
        Object object2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        bt0 bt02 = new bt0(0);
        object = new bg1(n10, object);
        while ((object2 = object.j()) != null) {
            CharSequence charSequence;
            block47: {
                block49: {
                    float f11;
                    block51: {
                        block50: {
                            block48: {
                                block46: {
                                    if (((String)object2).length() == 0) continue;
                                    try {
                                        Integer.parseInt((String)object2);
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        zs0.d((String)"SubripDecoder", (String)"Skipping invalid index: ".concat((String)object2));
                                        continue;
                                    }
                                    charSequence = object.j();
                                    if (charSequence == null) {
                                        zs0.d((String)"SubripDecoder", (String)"Unexpected end");
                                        return new p32(arrayList.toArray(new wu[0]), bt02.b());
                                    }
                                    object2 = o.matcher(charSequence);
                                    if (!((Matcher)object2).matches()) break block47;
                                    bt02.a(o32.a((Matcher)object2, 1));
                                    bt02.a(o32.a((Matcher)object2, 6));
                                    this.m.setLength(0);
                                    this.n.clear();
                                    object2 = object.j();
                                    while (!TextUtils.isEmpty((CharSequence)object2)) {
                                        if (this.m.length() > 0) {
                                            this.m.append("<br>");
                                        }
                                        charSequence = this.m;
                                        ArrayList<String> arrayList2 = this.n;
                                        String string2 = ((String)object2).trim();
                                        object2 = new StringBuilder(string2);
                                        Matcher matcher = p.matcher(string2);
                                        n10 = 0;
                                        while (matcher.find()) {
                                            string2 = matcher.group();
                                            arrayList2.add(string2);
                                            int n13 = matcher.start() - n10;
                                            int n14 = string2.length();
                                            ((StringBuilder)object2).replace(n13, n13 + n14, "");
                                            n10 += n14;
                                        }
                                        ((StringBuilder)charSequence).append(((StringBuilder)object2).toString());
                                        object2 = object.j();
                                    }
                                    charSequence = Html.fromHtml((String)this.m.toString());
                                    for (n10 = 0; n10 < this.n.size(); ++n10) {
                                        object2 = this.n.get(n10);
                                        if (!((String)object2).matches("\\{\\\\an[1-9]\\}")) {
                                            continue;
                                        }
                                        break block46;
                                    }
                                    object2 = null;
                                }
                                charSequence = new /* Unavailable Anonymous Inner Class!! */.a(charSequence);
                                if (object2 != null) break block48;
                                object2 = charSequence.a();
                                break block49;
                            }
                            switch (((String)object2).hashCode()) {
                                default: {
                                    break;
                                }
                                case -685620462: {
                                    if (!((String)object2).equals("{\\an9}")) break;
                                    n10 = 5;
                                    break block50;
                                }
                                case -685620493: {
                                    if (!((String)object2).equals("{\\an8}")) break;
                                    n10 = 8;
                                    break block50;
                                }
                                case -685620524: {
                                    if (!((String)object2).equals("{\\an7}")) break;
                                    n10 = 2;
                                    break block50;
                                }
                                case -685620555: {
                                    if (!((String)object2).equals("{\\an6}")) break;
                                    n10 = 4;
                                    break block50;
                                }
                                case -685620586: {
                                    if (!((String)object2).equals("{\\an5}")) break;
                                    n10 = 7;
                                    break block50;
                                }
                                case -685620617: {
                                    if (!((String)object2).equals("{\\an4}")) break;
                                    n10 = 1;
                                    break block50;
                                }
                                case -685620648: {
                                    if (!((String)object2).equals("{\\an3}")) break;
                                    n10 = 3;
                                    break block50;
                                }
                                case -685620679: {
                                    if (!((String)object2).equals("{\\an2}")) break;
                                    n10 = 6;
                                    break block50;
                                }
                                case -685620710: {
                                    if (!((String)object2).equals("{\\an1}")) break;
                                    n10 = 0;
                                    break block50;
                                }
                            }
                            n10 = -1;
                        }
                        if (n10 != 0 && n10 != 1 && n10 != 2) {
                            if (n10 != 3 && n10 != 4 && n10 != 5) {
                                charSequence.b(1);
                            } else {
                                charSequence.b(2);
                            }
                        } else {
                            charSequence.b(0);
                        }
                        switch (((String)object2).hashCode()) {
                            default: {
                                break;
                            }
                            case -685620462: {
                                if (!((String)object2).equals("{\\an9}")) break;
                                n10 = 5;
                                break block51;
                            }
                            case -685620493: {
                                if (!((String)object2).equals("{\\an8}")) break;
                                n10 = 4;
                                break block51;
                            }
                            case -685620524: {
                                if (!((String)object2).equals("{\\an7}")) break;
                                n10 = 3;
                                break block51;
                            }
                            case -685620555: {
                                if (!((String)object2).equals("{\\an6}")) break;
                                n10 = 8;
                                break block51;
                            }
                            case -685620586: {
                                if (!((String)object2).equals("{\\an5}")) break;
                                n10 = 7;
                                break block51;
                            }
                            case -685620617: {
                                if (!((String)object2).equals("{\\an4}")) break;
                                n10 = 6;
                                break block51;
                            }
                            case -685620648: {
                                if (!((String)object2).equals("{\\an3}")) break;
                                n10 = 2;
                                break block51;
                            }
                            case -685620679: {
                                if (!((String)object2).equals("{\\an2}")) break;
                                n10 = 1;
                                break block51;
                            }
                            case -685620710: {
                                if (!((String)object2).equals("{\\an1}")) break;
                                n10 = 0;
                                break block51;
                            }
                        }
                        n10 = -1;
                    }
                    if (n10 != 0 && n10 != 1 && n10 != 2) {
                        if (n10 != 3 && n10 != 4 && n10 != 5) {
                            charSequence.a(1);
                        } else {
                            charSequence.a(0);
                        }
                    } else {
                        charSequence.a(2);
                    }
                    n10 = charSequence.c();
                    float f12 = 0.5f;
                    if (n10 != 0) {
                        if (n10 != 1) {
                            if (n10 != 2) throw new IllegalArgumentException();
                            f11 = 0.92f;
                        } else {
                            f11 = 0.5f;
                        }
                    } else {
                        f11 = 0.08f;
                    }
                    object2 = charSequence.b(f11);
                    n10 = charSequence.b();
                    if (n10 != 0) {
                        f11 = f12;
                        if (n10 != 1) {
                            if (n10 != 2) throw new IllegalArgumentException();
                            f11 = 0.92f;
                        }
                    } else {
                        f11 = 0.08f;
                    }
                    object2 = object2.a(0, f11).a();
                }
                arrayList.add(object2);
                arrayList.add(wu.s);
                continue;
            }
            zs0.d((String)"SubripDecoder", (String)"Skipping invalid timing: ".concat((String)charSequence));
        }
        return new p32(arrayList.toArray(new wu[0]), bt02.b());
    }
}

