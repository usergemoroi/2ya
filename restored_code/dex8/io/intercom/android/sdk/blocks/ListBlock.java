/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.MovementMethod
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.interfaces.OrderedListBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.UnorderedListBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.spans.OrderedListSpan;
import io.intercom.android.sdk.spans.UnorderedListSpan;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import java.util.List;

class ListBlock
implements OrderedListBlock,
UnorderedListBlock {
    private static final int LARGE_TEXT_SIZE_SP = 16;
    private static final int SMALL_TEXT_SIZE_SP = 14;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    ListBlock(StyleType styleType, Provider<AppConfig> provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    private TextView getListStyledTextView(Context object, BlockMetadata blockMetadata) {
        TextView textView = new TextView((Context)object);
        textView.setLinkTextColor(this.appConfigProvider.get().getPrimaryColor());
        textView.setMovementMethod((MovementMethod)new TrackingLinkMovementMethod());
        BlockUtils.createLayoutParams((View)textView, -2, -2);
        BlockUtils.setMarginLeft((View)textView, 4);
        switch (1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            default: {
                this.styleAsChatList(textView, ContextCompat.getColor((Context)object, (int)R.color.intercom_white));
                break;
            }
            case 7: {
                textView.setTextSize(20.0f);
                object = blockMetadata.getAppearance().getTextColor();
                if (((String)object).isEmpty()) break;
                int n10 = Color.parseColor((String)object);
                textView.setTextColor(n10);
                textView.setLinkTextColor(n10);
                break;
            }
            case 6: {
                this.styleAsChatList(textView, ContextCompat.getColor((Context)object, (int)R.color.intercom_grey_800));
                textView.setMovementMethod(null);
                break;
            }
            case 5: {
                this.styleAsAnnouncementList(textView, ContextCompat.getColor((Context)object, (int)R.color.intercom_white));
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                this.styleAsAnnouncementList(textView, ContextCompat.getColor((Context)object, (int)R.color.intercom_grey_700));
                break;
            }
            case 1: {
                this.styleAsChatList(textView, ContextCompat.getColor((Context)object, (int)R.color.intercom_grey_800));
            }
        }
        return textView;
    }

    private void styleAsAnnouncementList(TextView textView, int n10) {
        textView.setTextSize(16.0f);
        textView.setTextColor(n10);
        BlockUtils.setMarginBottom((View)textView, 16);
        BlockUtils.setLargeLineSpacing(textView);
    }

    private void styleAsChatList(TextView textView, int n10) {
        textView.setTextSize(14.0f);
        textView.setTextColor(n10);
        BlockUtils.setDefaultMarginBottom((View)textView);
        BlockUtils.setSmallLineSpacing(textView);
    }

    @Override
    public View addOrderedList(List<String> list, BlockMetadata blockMetadata, ViewGroup object) {
        TextView textView = this.getListStyledTextView(object.getContext(), blockMetadata);
        int n10 = (int)object.getResources().getDimension(R.dimen.intercom_list_indentation);
        int n13 = list.size();
        object = "";
        for (int i14 = 0; i14 < n13; ++i14) {
            String string2 = list.get(i14);
            Object object2 = object;
            if (!string2.isEmpty()) {
                object2 = i14 < n13 - 1 ? "<br />" : "";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append((String)object2);
                stringBuilder = HtmlCompat.fromHtml(stringBuilder.toString());
                string2 = new SpannableString((CharSequence)stringBuilder);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(i14 + 1);
                ((StringBuilder)object2).append(".");
                string2.setSpan((Object)new OrderedListSpan(n10, ((StringBuilder)object2).toString()), 0, stringBuilder.length(), 0);
                object2 = TextUtils.concat((CharSequence[])new CharSequence[]{object, string2});
            }
            object = object2;
        }
        textView.setText((CharSequence)object);
        BlockUtils.setLayoutMarginsAndGravity((View)textView, 0x800003, blockMetadata.isLastObject());
        return textView;
    }

    @Override
    public View addUnorderedList(List<String> list, BlockMetadata blockMetadata, ViewGroup object) {
        Context context = object.getContext();
        TextView textView = this.getListStyledTextView(context, blockMetadata);
        int n10 = (int)object.getResources().getDimension(R.dimen.intercom_list_indentation);
        int n13 = list.size();
        object = "";
        for (int i14 = 0; i14 < n13; ++i14) {
            String string2 = list.get(i14);
            Object object2 = object;
            if (!string2.isEmpty()) {
                object2 = i14 < n13 - 1 ? "<br />" : "";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append((String)object2);
                string2 = HtmlCompat.fromHtml(stringBuilder.toString());
                object2 = new SpannableString((CharSequence)string2);
                object2.setSpan((Object)new UnorderedListSpan(n10, context), 0, string2.length(), 0);
                object2 = TextUtils.concat((CharSequence[])new CharSequence[]{object, object2});
            }
            object = object2;
        }
        textView.setText((CharSequence)object);
        BlockUtils.setLayoutMarginsAndGravity((View)textView, 0x800003, blockMetadata.isLastObject());
        return textView;
    }
}

