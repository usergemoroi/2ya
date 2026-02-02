/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  com.yandex.mobile.ads.impl.dy1
 *  com.yandex.mobile.ads.impl.ks0
 *  com.yandex.mobile.ads.impl.ks0$a
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.mobile.ads.impl.dy1;
import com.yandex.mobile.ads.impl.ks0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.a;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint(value={"ApplySharedPref"})
public final class ls0
implements ks0,
SharedPreferences.OnSharedPreferenceChangeListener {
    @NotNull
    private final String a;
    @NotNull
    private final dy1 b;
    @NotNull
    private final Context c;
    @NotNull
    private final m d;
    @NotNull
    private final LinkedHashSet e;

    public ls0(@NotNull Context object, @NotNull String string2, @NotNull dy1 dy12) {
        this.a = string2;
        this.b = dy12;
        string2 = object.getApplicationContext();
        if (string2 != null) {
            object = string2;
        }
        this.c = object;
        this.d = n.b((a)new a<SharedPreferences>(this){
            final ls0 b;
            {
                this.b = ls02;
                super(0);
            }

            public final Object invoke() {
                return dy1.a((dy1)this.b.b, (Context)this.b.c, (String)this.b.a);
            }
        });
        this.e = new LinkedHashSet();
    }

    @NotNull
    public final Map<String, ?> a() {
        return ((SharedPreferences)this.d.getValue()).getAll();
    }

    @Nullable
    public final Set<String> a(@NotNull String string2, @Nullable Set<String> set) {
        return ((SharedPreferences)this.d.getValue()).getStringSet(string2, set);
    }

    public final void a(int n10, @NotNull String string2) {
        ((SharedPreferences)this.d.getValue()).edit().putInt(string2, n10).apply();
    }

    public final void a(@NotNull ks0.a a13) {
        if (this.e.isEmpty()) {
            ((SharedPreferences)this.d.getValue()).registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
        }
        this.e.add(new WeakReference<ks0.a>(a13));
    }

    public final void a(@NotNull String string2) {
        ((SharedPreferences)this.d.getValue()).edit().remove(string2).apply();
    }

    public final void a(@NotNull String string2, long l10) {
        ((SharedPreferences)this.d.getValue()).edit().putLong(string2, l10).apply();
    }

    public final void a(@NotNull String string2, @Nullable String string3) {
        ((SharedPreferences)this.d.getValue()).edit().putString(string2, string3).apply();
    }

    public final void a(@NotNull String string2, @Nullable HashSet hashSet) {
        ((SharedPreferences)this.d.getValue()).edit().putStringSet(string2, (Set)hashSet).apply();
    }

    public final boolean a(@NotNull String string2, boolean bl2) {
        return ((SharedPreferences)this.d.getValue()).getBoolean(string2, bl2);
    }

    public final int b(int n10, @NotNull String string2) {
        ((SharedPreferences)this.d.getValue()).contains(string2);
        return ((SharedPreferences)this.d.getValue()).getInt(string2, n10);
    }

    public final long b(@NotNull String string2) {
        return ((SharedPreferences)this.d.getValue()).getLong(string2, 0L);
    }

    public final void b(@NotNull String string2, boolean bl2) {
        ((SharedPreferences)this.d.getValue()).edit().putBoolean(string2, bl2).apply();
    }

    public final boolean c(@NotNull String string2) {
        return ((SharedPreferences)this.d.getValue()).contains(string2);
    }

    public final void clear() {
        ((SharedPreferences)this.d.getValue()).edit().clear().apply();
    }

    @Nullable
    public final String d(@NotNull String string2) {
        return ((SharedPreferences)this.d.getValue()).getString(string2, null);
    }

    public final void onSharedPreferenceChanged(@Nullable SharedPreferences object, @Nullable String string2) {
        if (string2 != null) {
            object = this.e.iterator();
            while (object.hasNext()) {
                ks0.a a13 = (ks0.a)((WeakReference)object.next()).get();
                if (a13 == null) continue;
                a13.a((ks0)this, string2);
            }
        }
    }
}

