/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.collections.m
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.b0;
import kotlin.collections.m;
import kotlin.collections.t;
import kotlin.collections.unsigned.a;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a?\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\bH\u0002\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"T", "", "", "c", "([Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "result", "", "processed", "Lkotlin/k0;", "d", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/ArraysKt")
@SourceDebugExtension(value={"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
class n
extends m {
    @PublishedApi
    @SinceKotlin(version="1.3")
    @JvmName(name="contentDeepToString")
    @NotNull
    public static <T> String c(@Nullable T[] object) {
        if (object == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder(j.i(((T[])object).length, 0x19999999) * 5 + 2);
        n.d(object, stringBuilder, new ArrayList<Object[]>());
        object = stringBuilder.toString();
        y.i(object, (String)"toString(...)");
        return object;
    }

    private static final <T> void d(T[] TArray, StringBuilder stringBuilder, List<Object[]> list) {
        if (list.contains(TArray)) {
            stringBuilder.append("[...]");
            return;
        }
        list.add(TArray);
        stringBuilder.append('[');
        int n4 = TArray.length;
        for (int i4 = 0; i4 < n4; ++i4) {
            Object object;
            if (i4 != 0) {
                stringBuilder.append(", ");
            }
            if ((object = TArray[i4]) == null) {
                stringBuilder.append("null");
                continue;
            }
            if (object instanceof Object[]) {
                n.d((Object[])object, stringBuilder, list);
                continue;
            }
            if (object instanceof byte[]) {
                object = Arrays.toString((byte[])object);
                y.i(object, (String)"toString(...)");
                stringBuilder.append((String)object);
                continue;
            }
            if (object instanceof short[]) {
                object = Arrays.toString((short[])object);
                y.i(object, (String)"toString(...)");
                stringBuilder.append((String)object);
                continue;
            }
            if (object instanceof int[]) {
                object = Arrays.toString((int[])object);
                y.i(object, (String)"toString(...)");
                stringBuilder.append((String)object);
                continue;
            }
            if (object instanceof long[]) {
                object = Arrays.toString((long[])object);
                y.i(object, (String)"toString(...)");
                stringBuilder.append((String)object);
                continue;
            }
            if (object instanceof float[]) {
                object = Arrays.toString((float[])object);
                y.i(object, (String)"toString(...)");
                stringBuilder.append((String)object);
                continue;
            }
            if (object instanceof double[]) {
                object = Arrays.toString((double[])object);
                y.i(object, (String)"toString(...)");
                stringBuilder.append((String)object);
                continue;
            }
            if (object instanceof char[]) {
                object = Arrays.toString((char[])object);
                y.i(object, (String)"toString(...)");
                stringBuilder.append((String)object);
                continue;
            }
            if (object instanceof boolean[]) {
                object = Arrays.toString((boolean[])object);
                y.i(object, (String)"toString(...)");
                stringBuilder.append((String)object);
                continue;
            }
            if (object instanceof b0) {
                stringBuilder.append(a.a(((b0)object).s()));
                continue;
            }
            if (object instanceof i0) {
                stringBuilder.append(a.c(((i0)object).s()));
                continue;
            }
            if (object instanceof d0) {
                stringBuilder.append(a.b(((d0)object).s()));
                continue;
            }
            if (object instanceof f0) {
                stringBuilder.append(a.d(((f0)object).s()));
                continue;
            }
            stringBuilder.append(object.toString());
        }
        stringBuilder.append(']');
        list.remove(t.o(list));
    }
}

