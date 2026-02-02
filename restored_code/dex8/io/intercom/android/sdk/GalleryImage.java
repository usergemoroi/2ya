/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bw\b\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u00a2\u0006\u0004\b=\u0010>J\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\r\u001a\u00020\fH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\fH\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0004J~\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b#\u0010\u0004J\u0010\u0010$\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b$\u0010\u000eJ\u001a\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b)\u0010\u000eJ \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b.\u0010/R\u0017\u0010\u0016\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b1\u0010\u0004R\u0017\u0010\u0017\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b2\u0010\u0004R\u0017\u0010\u0018\u001a\u00020\u00078\u0006\u00a2\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b4\u0010\tR\u0017\u0010\u0019\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b5\u0010\u0004R\u0017\u0010\u001a\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b6\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\f8\u0006\u00a2\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u0010\u000eR\u0017\u0010\u001c\u001a\u00020\f8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b9\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\f8\u0006\u00a2\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\b:\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00118\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u001f\u001a\u00020\u00118\u0006\u00a2\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010 \u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b \u00100\u001a\u0004\b<\u0010\u0004\u00a8\u0006?"}, d2={"Lio/intercom/android/sdk/GalleryImage;", "Landroid/os/Parcelable;", "", "getImageWidthXHeight", "()Ljava/lang/String;", "component1", "component2", "Landroid/net/Uri;", "component3", "()Landroid/net/Uri;", "component4", "component5", "", "component6", "()I", "component7", "component8", "", "component9", "()Z", "component10", "component11", "fileName", "mimeType", "uri", "previewPath", "attribution", "imageWidth", "imageHeight", "fileSize", "isGif", "isVideo", "duration", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIIZZLjava/lang/String;)Lio/intercom/android/sdk/GalleryImage;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFileName", "getMimeType", "Landroid/net/Uri;", "getUri", "getPreviewPath", "getAttribution", "I", "getImageWidth", "getImageHeight", "getFileSize", "Z", "getDuration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIIZZLjava/lang/String;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@StabilityInferred(parameters=0)
@Parcelize
public final class GalleryImage
implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<GalleryImage> CREATOR = new Creator();
    @NotNull
    private final String attribution;
    @NotNull
    private final String duration;
    @NotNull
    private final String fileName;
    private final int fileSize;
    private final int imageHeight;
    private final int imageWidth;
    private final boolean isGif;
    private final boolean isVideo;
    @NotNull
    private final String mimeType;
    @NotNull
    private final String previewPath;
    @NotNull
    private final Uri uri;

    @JvmOverloads
    public GalleryImage() {
        this(null, null, null, null, null, 0, 0, 0, false, false, null, 2047, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2) {
        y.j(string2, "fileName");
        this(string2, null, null, null, null, 0, 0, 0, false, false, null, 2046, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        this(string2, string3, null, null, null, 0, 0, 0, false, false, null, 2044, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        this(string2, string3, uri, null, null, 0, 0, 0, false, false, null, 2040, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        this(string2, string3, uri, string4, null, 0, 0, 0, false, false, null, 2032, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4, @NotNull String string5) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        y.j(string5, "attribution");
        this(string2, string3, uri, string4, string5, 0, 0, 0, false, false, null, 2016, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4, @NotNull String string5, int n10) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        y.j(string5, "attribution");
        this(string2, string3, uri, string4, string5, n10, 0, 0, false, false, null, 1984, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4, @NotNull String string5, int n10, int n13) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        y.j(string5, "attribution");
        this(string2, string3, uri, string4, string5, n10, n13, 0, false, false, null, 1920, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4, @NotNull String string5, int n10, int n13, int n14) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        y.j(string5, "attribution");
        this(string2, string3, uri, string4, string5, n10, n13, n14, false, false, null, 1792, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4, @NotNull String string5, int n10, int n13, int n14, boolean bl2) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        y.j(string5, "attribution");
        this(string2, string3, uri, string4, string5, n10, n13, n14, bl2, false, null, 1536, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4, @NotNull String string5, int n10, int n13, int n14, boolean bl2, boolean bl3) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        y.j(string5, "attribution");
        this(string2, string3, uri, string4, string5, n10, n13, n14, bl2, bl3, null, 1024, null);
    }

    @JvmOverloads
    public GalleryImage(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4, @NotNull String string5, int n10, int n13, int n14, boolean bl2, boolean bl3, @NotNull String string6) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        y.j(string5, "attribution");
        y.j(string6, "duration");
        this.fileName = string2;
        this.mimeType = string3;
        this.uri = uri;
        this.previewPath = string4;
        this.attribution = string5;
        this.imageWidth = n10;
        this.imageHeight = n13;
        this.fileSize = n14;
        this.isGif = bl2;
        this.isVideo = bl3;
        this.duration = string6;
    }

    public /* synthetic */ GalleryImage(String string2, String string3, Uri uri, String string4, String string5, int n10, int n13, int n14, boolean bl2, boolean bl3, String object, int n15, p object2) {
        object2 = "";
        if ((n15 & 1) != 0) {
            string2 = "";
        }
        if ((n15 & 2) != 0) {
            string3 = "";
        }
        if ((n15 & 4) != 0) {
            uri = Uri.EMPTY;
            y.i(uri, "EMPTY");
        }
        if ((n15 & 8) != 0) {
            string4 = "";
        }
        if ((n15 & 0x10) != 0) {
            string5 = "";
        }
        boolean bl4 = false;
        if ((n15 & 0x20) != 0) {
            n10 = 0;
        }
        if ((n15 & 0x40) != 0) {
            n13 = 0;
        }
        if ((n15 & 0x80) != 0) {
            n14 = 0;
        }
        if ((n15 & 0x100) != 0) {
            bl2 = false;
        }
        if ((n15 & 0x200) != 0) {
            bl3 = bl4;
        }
        if ((n15 & 0x400) != 0) {
            object = object2;
        }
        this(string2, string3, uri, string4, string5, n10, n13, n14, bl2, bl3, (String)object);
    }

    public static /* synthetic */ GalleryImage copy$default(GalleryImage galleryImage, String string2, String string3, Uri uri, String string4, String string5, int n10, int n13, int n14, boolean bl2, boolean bl3, String string6, int n15, Object object) {
        block10: {
            if ((n15 & 1) != 0) {
                string2 = galleryImage.fileName;
            }
            if ((n15 & 2) != 0) {
                string3 = galleryImage.mimeType;
            }
            if ((n15 & 4) != 0) {
                uri = galleryImage.uri;
            }
            if ((n15 & 8) != 0) {
                string4 = galleryImage.previewPath;
            }
            if ((n15 & 0x10) != 0) {
                string5 = galleryImage.attribution;
            }
            if ((n15 & 0x20) != 0) {
                n10 = galleryImage.imageWidth;
            }
            if ((n15 & 0x40) != 0) {
                n13 = galleryImage.imageHeight;
            }
            if ((n15 & 0x80) != 0) {
                n14 = galleryImage.fileSize;
            }
            if ((n15 & 0x100) != 0) {
                bl2 = galleryImage.isGif;
            }
            if ((n15 & 0x200) != 0) {
                bl3 = galleryImage.isVideo;
            }
            if ((n15 & 0x400) == 0) break block10;
            string6 = galleryImage.duration;
        }
        return galleryImage.copy(string2, string3, uri, string4, string5, n10, n13, n14, bl2, bl3, string6);
    }

    @NotNull
    public final String component1() {
        return this.fileName;
    }

    public final boolean component10() {
        return this.isVideo;
    }

    @NotNull
    public final String component11() {
        return this.duration;
    }

    @NotNull
    public final String component2() {
        return this.mimeType;
    }

    @NotNull
    public final Uri component3() {
        return this.uri;
    }

    @NotNull
    public final String component4() {
        return this.previewPath;
    }

    @NotNull
    public final String component5() {
        return this.attribution;
    }

    public final int component6() {
        return this.imageWidth;
    }

    public final int component7() {
        return this.imageHeight;
    }

    public final int component8() {
        return this.fileSize;
    }

    public final boolean component9() {
        return this.isGif;
    }

    @NotNull
    public final GalleryImage copy(@NotNull String string2, @NotNull String string3, @NotNull Uri uri, @NotNull String string4, @NotNull String string5, int n10, int n13, int n14, boolean bl2, boolean bl3, @NotNull String string6) {
        y.j(string2, "fileName");
        y.j(string3, "mimeType");
        y.j(uri, "uri");
        y.j(string4, "previewPath");
        y.j(string5, "attribution");
        y.j(string6, "duration");
        return new GalleryImage(string2, string3, uri, string4, string5, n10, n13, n14, bl2, bl3, string6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof GalleryImage)) {
            return false;
        }
        object = (GalleryImage)object;
        if (!y.e(this.fileName, ((GalleryImage)object).fileName)) {
            return false;
        }
        if (!y.e(this.mimeType, ((GalleryImage)object).mimeType)) {
            return false;
        }
        if (!y.e(this.uri, ((GalleryImage)object).uri)) {
            return false;
        }
        if (!y.e(this.previewPath, ((GalleryImage)object).previewPath)) {
            return false;
        }
        if (!y.e(this.attribution, ((GalleryImage)object).attribution)) {
            return false;
        }
        if (this.imageWidth != ((GalleryImage)object).imageWidth) {
            return false;
        }
        if (this.imageHeight != ((GalleryImage)object).imageHeight) {
            return false;
        }
        if (this.fileSize != ((GalleryImage)object).fileSize) {
            return false;
        }
        if (this.isGif != ((GalleryImage)object).isGif) {
            return false;
        }
        if (this.isVideo != ((GalleryImage)object).isVideo) {
            return false;
        }
        return y.e(this.duration, ((GalleryImage)object).duration);
    }

    @NotNull
    public final String getAttribution() {
        return this.attribution;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    @NotNull
    public final String getImageWidthXHeight() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.imageWidth);
        stringBuilder.append('x');
        stringBuilder.append(this.imageHeight);
        return stringBuilder.toString();
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getPreviewPath() {
        return this.previewPath;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int n10 = this.fileName.hashCode();
        int n13 = this.mimeType.hashCode();
        int n14 = this.uri.hashCode();
        int n15 = this.previewPath.hashCode();
        int n16 = this.attribution.hashCode();
        int n17 = this.imageWidth;
        int n18 = this.imageHeight;
        int n19 = this.fileSize;
        int n23 = this.isGif;
        int n24 = 1;
        int n25 = n23;
        if (n23 != 0) {
            n25 = 1;
        }
        if ((n23 = this.isVideo) == 0) {
            n24 = n23;
        }
        return (((((((((n10 * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n25) * 31 + n24) * 31 + this.duration.hashCode();
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GalleryImage(fileName=");
        stringBuilder.append(this.fileName);
        stringBuilder.append(", mimeType=");
        stringBuilder.append(this.mimeType);
        stringBuilder.append(", uri=");
        stringBuilder.append(this.uri);
        stringBuilder.append(", previewPath=");
        stringBuilder.append(this.previewPath);
        stringBuilder.append(", attribution=");
        stringBuilder.append(this.attribution);
        stringBuilder.append(", imageWidth=");
        stringBuilder.append(this.imageWidth);
        stringBuilder.append(", imageHeight=");
        stringBuilder.append(this.imageHeight);
        stringBuilder.append(", fileSize=");
        stringBuilder.append(this.fileSize);
        stringBuilder.append(", isGif=");
        stringBuilder.append(this.isGif);
        stringBuilder.append(", isVideo=");
        stringBuilder.append(this.isVideo);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        y.j(parcel, "out");
        parcel.writeString(this.fileName);
        parcel.writeString(this.mimeType);
        parcel.writeParcelable((Parcelable)this.uri, n10);
        parcel.writeString(this.previewPath);
        parcel.writeString(this.attribution);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeInt(this.fileSize);
        parcel.writeInt(this.isGif ? 1 : 0);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeString(this.duration);
    }

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public static final class Creator
    implements Parcelable.Creator<GalleryImage> {
        @NotNull
        public final GalleryImage createFromParcel(@NotNull Parcel parcel) {
            y.j(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Uri uri = (Uri)parcel.readParcelable(GalleryImage.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int n10 = parcel.readInt();
            int n13 = parcel.readInt();
            int n14 = parcel.readInt();
            int n15 = parcel.readInt();
            boolean bl2 = true;
            boolean bl3 = n15 != 0;
            if (parcel.readInt() == 0) {
                bl2 = false;
            }
            return new GalleryImage(string2, string3, uri, string4, string5, n10, n13, n14, bl3, bl2, parcel.readString());
        }

        @NotNull
        public final GalleryImage[] newArray(int n10) {
            return new GalleryImage[n10];
        }
    }
}

