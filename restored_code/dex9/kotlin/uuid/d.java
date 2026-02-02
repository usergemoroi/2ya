/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.text.f
 *  kotlin.uuid.c
 */
package kotlin.uuid;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.f;
import kotlin.uuid.c;

@Metadata(d1={"\u0000\"\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"", "", "dst", "", "dstOffset", "count", "Lkotlin/k0;", "d", "(J[BII)V", "", "index", "c", "(Ljava/lang/String;I)V", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/uuid/UuidKt")
@SourceDebugExtension(value={"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,447:1\n1#2:448\n*E\n"})
class d
extends c {
    public static final /* synthetic */ void a(String string, int n4) {
        d.c(string, n4);
    }

    public static final /* synthetic */ void b(long l4, byte[] byArray, int n4, int n5) {
        d.d(l4, byArray, n4, n5);
    }

    private static final void c(String string, int n4) {
        if (string.charAt(n4) == '-') {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected '-' (hyphen) at index 8, but was ");
        stringBuilder.append(string.charAt(n4));
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    private static final void d(long l4, byte[] byArray, int n4, int n5) {
        n4 += n5 * 2;
        for (int i4 = 0; i4 < n5; ++i4) {
            int n6 = (int)(0xFFL & l4);
            n6 = f.d()[n6];
            byArray[n4 - 1] = (byte)n6;
            byArray[n4 -= 2] = (byte)(n6 >> 8);
            l4 >>= 8;
        }
    }
}

