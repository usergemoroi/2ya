/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  ru.ok.tracer.base.limits.a
 *  ru.ok.tracer.lite.limits.a$a
 */
package ru.ok.tracer.lite.limits;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ok.tracer.lite.limits.a;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019JA\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016\u00a8\u0006\u001a"}, d2={"Lru/ok/tracer/lite/limits/a;", "Lru/ok/tracer/base/limits/a;", "", "globalShutdownMs", "", "featureName", "featureShutdownMs", "tag", "tagShutdownMs", "Lkotlin/k0;", "a", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "", "c", "(Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/content/Context;", "Landroid/content/Context;", "context", "b", "Ljava/lang/String;", "libraryPackageName", "Landroid/content/SharedPreferences;", "()Landroid/content/SharedPreferences;", "prefs", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "tracer-lite-commons_release"}, k=1, mv={1, 7, 1})
public final class a
implements ru.ok.tracer.base.limits.a {
    @NotNull
    public static final a c = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final Context a;
    @NotNull
    private final String b;

    public a(@NotNull Context context, @NotNull String string) {
        y.j((Object)context, (String)"context");
        y.j((Object)string, (String)"libraryPackageName");
        this.a = context;
        this.b = string;
    }

    private final SharedPreferences b() {
        Context context = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tracer-");
        stringBuilder.append(this.b);
        stringBuilder = context.getSharedPreferences(stringBuilder.toString(), 0);
        y.i((Object)stringBuilder, (String)"context.getSharedPrefere\u2026e\", Context.MODE_PRIVATE)");
        return stringBuilder;
    }

    public void a(@Nullable Long comparable, @Nullable String string, @Nullable Long l4, @Nullable String string2, @Nullable Long l5) {
        block7: {
            block6: {
                boolean bl;
                block5: {
                    string2 = this.b().edit();
                    if (comparable != null && (Long)comparable > 0L) {
                        string2.putLong("system.shutdown.until.ts", System.currentTimeMillis() + (Long)comparable);
                        bl = true;
                    } else {
                        bl = false;
                    }
                    if (string == null || l4 == null || l4 <= 0L) break block5;
                    long l6 = System.currentTimeMillis();
                    long l7 = l4;
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append("system.");
                    ((StringBuilder)comparable).append(string);
                    ((StringBuilder)comparable).append(".shutdown.until.ts");
                    string2.putLong(((StringBuilder)comparable).toString(), l6 + l7);
                    break block6;
                }
                if (!bl) break block7;
            }
            string2.apply();
        }
    }

    public boolean c(@Nullable String string, @Nullable String charSequence) {
        long l4 = System.currentTimeMillis();
        if (l4 < this.b().getLong("system.shutdown.until.ts", Long.MIN_VALUE)) {
            return true;
        }
        if (string != null) {
            SharedPreferences sharedPreferences = this.b();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("system.");
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(".shutdown.until.ts");
            if (l4 < sharedPreferences.getLong(((StringBuilder)charSequence).toString(), Long.MIN_VALUE)) {
                return true;
            }
        }
        return false;
    }
}

