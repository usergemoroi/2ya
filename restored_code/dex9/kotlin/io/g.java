/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.io.g$b$d
 *  kotlin.io.g$c
 *  kotlin.io.h
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.r
 *  kotlin.sequences.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.io.g;
import kotlin.io.h;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.r;
import kotlin.sequences.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0006\n\u000fB\u008b\u0001\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u00128\u0010\u001c\u001a4\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001d\u00a2\u0006\u0004\b \u0010!B\u001b\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b \u0010\"J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0010RF\u0010\u001c\u001a4\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u001e\u00a8\u0006#"}, d2={"Lkotlin/io/g;", "Lkotlin/sequences/i;", "Ljava/io/File;", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/io/File;", "start", "Lkotlin/io/h;", "b", "Lkotlin/io/h;", "direction", "Lkotlin/Function1;", "", "c", "Lkotlin/jvm/functions/l;", "onEnter", "Lkotlin/k0;", "d", "onLeave", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "Lkotlin/jvm/functions/p;", "onFail", "", "I", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/h;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/p;I)V", "(Ljava/io/File;Lkotlin/io/h;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class g
implements i<File> {
    @NotNull
    private final File a;
    @NotNull
    private final h b;
    @Nullable
    private final l<File, Boolean> c;
    @Nullable
    private final l<File, k0> d;
    @Nullable
    private final kotlin.jvm.functions.p<File, IOException, k0> e;
    private final int f;

    public g(@NotNull File file, @NotNull h h4) {
        y.j((Object)file, (String)"start");
        y.j((Object)h4, (String)"direction");
        this(file, h4, null, null, null, 0, 32, null);
    }

    private g(File file, h h4, l<? super File, Boolean> l4, l<? super File, k0> l5, kotlin.jvm.functions.p<? super File, ? super IOException, k0> p4, int n4) {
        this.a = file;
        this.b = h4;
        this.c = l4;
        this.d = l5;
        this.e = p4;
        this.f = n4;
    }

    /* synthetic */ g(File file, h h4, l l4, l l5, kotlin.jvm.functions.p p4, int n4, int n5, p p5) {
        if ((n5 & 2) != 0) {
            h4 = h.c;
        }
        if ((n5 & 0x20) != 0) {
            n4 = Integer.MAX_VALUE;
        }
        this(file, h4, l4, l5, p4, n4);
    }

    @NotNull
    public Iterator<File> iterator() {
        return new b(this);
    }

    @Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lkotlin/io/g$a;", "Lkotlin/io/g$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    @SourceDebugExtension(value={"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    private static abstract class a
    extends c {
        public a(@NotNull File file) {
            y.j((Object)file, (String)"rootDir");
            super(file);
        }
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0007\u000eB\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0082\u0010\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2={"Lkotlin/io/g$b;", "Lkotlin/collections/b;", "Ljava/io/File;", "root", "Lkotlin/io/g$a;", "a", "(Ljava/io/File;)Lkotlin/io/g$a;", "b", "()Ljava/io/File;", "Lkotlin/k0;", "computeNext", "()V", "Ljava/util/ArrayDeque;", "Lkotlin/io/g$c;", "c", "Ljava/util/ArrayDeque;", "state", "<init>", "(Lkotlin/io/g;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    private final class kotlin.io.g$b
    extends kotlin.collections.b<File> {
        @NotNull
        private final ArrayDeque<kotlin.io.g$c> c;
        final g d;

        public kotlin.io.g$b(g g4) {
            this.d = g4;
            ArrayDeque<kotlin.io.g$c> arrayDeque = new ArrayDeque<kotlin.io.g$c>();
            this.c = arrayDeque;
            if (g4.a.isDirectory()) {
                arrayDeque.push(this.a(g4.a));
            } else if (g4.a.isFile()) {
                arrayDeque.push(new b(this, g4.a));
            } else {
                this.done();
            }
        }

        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private final kotlin.io.g$a a(File object) {
            void var1_4;
            h h4 = this.d.b;
            int n4 = d.a[h4.ordinal()];
            if (n4 != 1) {
                if (n4 != 2) throw new r();
                a a4 = new a(this, (File)object);
                return var1_4;
            } else {
                c c4 = new c(this, (File)object);
            }
            return var1_4;
        }

        private final File b() {
            File file;
            while (true) {
                kotlin.io.g$c c4;
                if ((c4 = this.c.peek()) == null) {
                    return null;
                }
                file = c4.b();
                if (file == null) {
                    this.c.pop();
                    continue;
                }
                if (y.e((Object)file, (Object)c4.a()) || !file.isDirectory() || this.c.size() >= this.d.f) break;
                this.c.push(this.a(file));
            }
            return file;
        }

        @Override
        protected void computeNext() {
            File file = this.b();
            if (file != null) {
                this.setNext(file);
            } else {
                this.done();
            }
        }

        @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0006\u00a8\u0006\u0015"}, d2={"Lkotlin/io/g$b$a;", "Lkotlin/io/g$a;", "Ljava/io/File;", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "e", "failed", "rootDir", "<init>", "(Lkotlin/io/g$b;Ljava/io/File;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
        private final class a
        extends kotlin.io.g$a {
            private boolean b;
            @Nullable
            private File[] c;
            private int d;
            private boolean e;
            final kotlin.io.g$b f;

            public a(@NotNull kotlin.io.g$b b4, File file) {
                y.j((Object)file, (String)"rootDir");
                this.f = b4;
                super(file);
            }

            @Nullable
            public File b() {
                Object object;
                if (!this.e && this.c == null) {
                    object = this.f.d.c;
                    if (object != null && !((Boolean)object.invoke(this.a())).booleanValue()) {
                        return null;
                    }
                    object = this.a().listFiles();
                    this.c = object;
                    if (object == null) {
                        object = this.f.d.e;
                        if (object != null) {
                            object.invoke(this.a(), new kotlin.io.a(this.a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                if ((object = this.c) != null) {
                    int n4 = this.d;
                    y.g((Object)object);
                    if (n4 < ((File[])object).length) {
                        object = this.c;
                        y.g((Object)object);
                        n4 = this.d;
                        this.d = n4 + 1;
                        return object[n4];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return this.a();
                }
                object = this.f.d.d;
                if (object != null) {
                    object.invoke(this.a());
                }
                return null;
            }
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0006\u00a8\u0006\u000b"}, d2={"Lkotlin/io/g$b$b;", "Lkotlin/io/g$c;", "Ljava/io/File;", "b", "()Ljava/io/File;", "", "Z", "visited", "rootFile", "<init>", "(Lkotlin/io/g$b;Ljava/io/File;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
        @SourceDebugExtension(value={"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        private final class b
        extends kotlin.io.g$c {
            private boolean b;
            final kotlin.io.g$b c;

            public b(@NotNull kotlin.io.g$b b4, File file) {
                y.j((Object)file, (String)"rootFile");
                this.c = b4;
                super(file);
            }

            @Nullable
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.a();
            }
        }

        @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2={"Lkotlin/io/g$b$c;", "Lkotlin/io/g$a;", "Ljava/io/File;", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "rootDir", "<init>", "(Lkotlin/io/g$b;Ljava/io/File;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
        private final class c
        extends kotlin.io.g$a {
            private boolean b;
            @Nullable
            private File[] c;
            private int d;
            final kotlin.io.g$b e;

            public c(@NotNull kotlin.io.g$b b4, File file) {
                y.j((Object)file, (String)"rootDir");
                this.e = b4;
                super(file);
            }

            @Nullable
            public File b() {
                int n4;
                Object object;
                block10: {
                    block11: {
                        if (!this.b) {
                            l l4 = this.e.d.c;
                            if (l4 != null && !((Boolean)l4.invoke(this.a())).booleanValue()) {
                                return null;
                            }
                            this.b = true;
                            return this.a();
                        }
                        object = this.c;
                        if (object != null) {
                            n4 = this.d;
                            y.g((Object)object);
                            if (n4 >= ((File[])object).length) {
                                object = this.e.d.d;
                                if (object != null) {
                                    object.invoke(this.a());
                                }
                                return null;
                            }
                        }
                        if (this.c != null) break block10;
                        object = this.a().listFiles();
                        this.c = object;
                        if (object == null && (object = this.e.d.e) != null) {
                            object.invoke(this.a(), new kotlin.io.a(this.a(), null, "Cannot list files in a directory", 2, null));
                        }
                        if ((object = this.c) == null) break block11;
                        y.g((Object)object);
                        if (((File[])object).length != 0) break block10;
                    }
                    if ((object = this.e.d.d) != null) {
                        object.invoke(this.a());
                    }
                    return null;
                }
                object = this.c;
                y.g((Object)object);
                n4 = this.d;
                this.d = n4 + 1;
                return object[n4];
            }
        }
    }
}

