/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.WasExperimental
 *  kotlin.io.c
 *  kotlin.io.path.ExperimentalPathApi
 *  kotlin.io.path.d
 *  kotlin.io.path.e
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.io.path;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.t;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.io.path.c;
import kotlin.io.path.d;
import kotlin.io.path.e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2={"Ljava/nio/file/Path;", "", "glob", "", "a", "(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/util/List;", "kotlin-stdlib-jdk7"}, k=5, mv={1, 9, 0}, xs="kotlin/io/path/PathsKt")
@SourceDebugExtension(value={"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1181:1\n1#2:1182\n1863#3,2:1183\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n440#1:1183,2\n*E\n"})
class f
extends c {
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @NotNull
    public static final List<Path> a(@NotNull Path iterable, @NotNull String object) throws IOException {
        y.j((Object)iterable, (String)"<this>");
        y.j((Object)object, (String)"glob");
        iterable = d.a((Path)iterable, (String)object);
        try {
            object = e.a((Object)iterable);
            y.g((Object)object);
            object = t.e1((Iterable)object);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                kotlin.io.c.a((Closeable)((Object)iterable), (Throwable)throwable);
                throw throwable2;
            }
        }
        kotlin.io.c.a((Closeable)((Object)iterable), null);
        return object;
    }

    public static /* synthetic */ List b(Path path, String string, int n4, Object object) throws IOException {
        if ((n4 & 1) != 0) {
            string = "*";
        }
        return f.a(path, string);
    }
}

