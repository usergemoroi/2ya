/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.E9;
import io.appmetrica.analytics.impl.W9;
import kotlin.text.d;

public abstract class mg {
    public static final String a(E9 object) {
        StringBuilder stringBuilder = new StringBuilder("Event sent: ");
        int n10 = ((E9)object).c;
        String string2 = ((E9)object).d;
        byte[] byArray = ((E9)object).e;
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 4) {
                    if (n10 != 5) {
                        if (n10 != 7) {
                            if (n10 != 13) {
                                if (n10 != 35) {
                                    if (n10 != 40) {
                                        if (n10 != 42) {
                                            if (n10 != 16) {
                                                if (n10 != 17) {
                                                    if (n10 != 20) {
                                                        if (n10 != 21) {
                                                            switch (n10) {
                                                                default: {
                                                                    object = new StringBuilder("type=");
                                                                    ((StringBuilder)object).append(n10);
                                                                    object = ((StringBuilder)object).toString();
                                                                    break;
                                                                }
                                                                case 27: {
                                                                    object = new StringBuilder("Error: ");
                                                                    ((StringBuilder)object).append(string2);
                                                                    object = ((StringBuilder)object).toString();
                                                                    break;
                                                                }
                                                                case 26: {
                                                                    object = new StringBuilder("Crash: ");
                                                                    ((StringBuilder)object).append(string2);
                                                                    object = ((StringBuilder)object).toString();
                                                                    break;
                                                                }
                                                                case 25: {
                                                                    object = "ANR";
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            object = "Revenue";
                                                        }
                                                    } else {
                                                        object = "User profile update";
                                                    }
                                                } else {
                                                    object = "Update";
                                                }
                                            } else {
                                                object = "Open";
                                            }
                                        } else {
                                            object = "External attribution";
                                        }
                                    } else {
                                        object = "Ad revenue (ILRD)";
                                    }
                                } else {
                                    object = "E-Commerce";
                                }
                            } else {
                                object = "The very first event";
                            }
                        } else {
                            object = "Session heartbeat";
                        }
                    } else {
                        object = "Referrer";
                    }
                } else {
                    object = string2;
                    if (string2 == null) {
                        object = "null";
                    }
                    object = new StringBuilder((String)object);
                    if (byArray != null && !TextUtils.isEmpty((CharSequence)(string2 = new String(byArray, d.b)))) {
                        ((StringBuilder)object).append(" with value ");
                        ((StringBuilder)object).append(string2);
                    }
                    object = ((StringBuilder)object).toString();
                }
            } else {
                object = "Session start";
            }
        } else {
            object = "Attribution";
        }
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public static final String a(String string2, Bb bb4, String string3, String string4) {
        int n10 = bb4.a;
        if (W9.d.contains((Object)Bb.a(n10))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(": ");
            stringBuilder.append(bb4.name());
            if (W9.f.contains((Object)bb4) && !TextUtils.isEmpty((CharSequence)string3)) {
                stringBuilder.append(" with name ");
                stringBuilder.append(string3);
            }
            if (W9.e.contains((Object)bb4) && !TextUtils.isEmpty((CharSequence)string4)) {
                stringBuilder.append(" with value ");
                stringBuilder.append(string4);
            }
            string2 = stringBuilder.toString();
        } else {
            string2 = null;
        }
        return string2;
    }
}

