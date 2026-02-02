/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.Html$TagHandler
 *  android.text.style.StyleSpan
 *  kotlin.text.p
 */
package io.intercom.android.sdk.helpcenter.search;

import android.text.Editable;
import android.text.Html;
import android.text.style.StyleSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.XMLReader;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lio/intercom/android/sdk/helpcenter/search/HighlightTagHandler;", "Landroid/text/Html$TagHandler;", "Landroid/text/Editable;", "text", "Lkotlin/k0;", "applyColorSpan", "(Landroid/text/Editable;)V", "", "opening", "", "tag", "output", "Lorg/xml/sax/XMLReader;", "xmlReader", "handleTag", "(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V", "", "startIndex", "I", "endIndex", "<init>", "()V", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class HighlightTagHandler
implements Html.TagHandler {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int SPAN_FLAG = 33;
    private int endIndex;
    private int startIndex;

    private final void applyColorSpan(Editable editable) {
        editable.setSpan((Object)new StyleSpan(1), this.startIndex, this.endIndex, 33);
    }

    public void handleTag(boolean bl2, @NotNull String string2, @NotNull Editable editable, @NotNull XMLReader xMLReader) {
        y.j(string2, "tag");
        y.j(editable, "output");
        y.j(xMLReader, "xmlReader");
        if (kotlin.text.p.z((String)string2, (String)"highlight", (boolean)true)) {
            if (bl2) {
                this.startIndex = editable.length();
            } else {
                this.endIndex = editable.length();
                this.applyColorSpan(editable);
            }
        }
    }

    @Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2={"Lio/intercom/android/sdk/helpcenter/search/HighlightTagHandler$Companion;", "", "()V", "SPAN_FLAG", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }
    }
}

