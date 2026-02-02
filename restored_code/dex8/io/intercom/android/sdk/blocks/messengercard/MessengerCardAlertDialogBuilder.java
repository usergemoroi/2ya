/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.ColorStateList
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.webkit.WebView
 *  android.widget.AutoCompleteTextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.core.view.ViewCompat
 */
package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.ViewCompat;
import io.intercom.android.sdk.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

class MessengerCardAlertDialogBuilder
extends AlertDialog.Builder {
    MessengerCardAlertDialogBuilder(@NonNull Context context, @NonNull Map<String, Object> map2, int n10, @NonNull WebView webView) {
        super(context);
        this.setUp(context, map2, n10, webView);
    }

    private void setUp(Context context, Map<String, Object> map2, int n10, WebView webView) {
        View view = LayoutInflater.from((Context)context).inflate(R.layout.intercom_webview_card_input, null, false);
        this.setTitle((CharSequence)map2.get("label"));
        context = (AutoCompleteTextView)view.findViewById(R.id.input);
        context.setText((CharSequence)map2.get("currentValue"));
        context.setHint((CharSequence)map2.get("placeholder"));
        ViewCompat.setBackgroundTintList((View)context, (ColorStateList)ColorStateList.valueOf((int)n10));
        this.setView(view);
        this.setPositiveButton(17039370, new DialogInterface.OnClickListener(){
            final MessengerCardAlertDialogBuilder this$0;
            final AutoCompleteTextView val$inputView;
            final Map val$payload;
            final WebView val$webView;
            {
                this.this$0 = messengerCardAlertDialogBuilder;
                this.val$webView = webView;
                this.val$inputView = autoCompleteTextView;
                this.val$payload = map2;
            }

            public void onClick(DialogInterface dialogInterface, int n10) {
                this.this$0.sendResultToWebview(this.val$webView, this.val$inputView.getText().toString(), this.val$payload);
                ((InputMethodManager)this.val$inputView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.val$inputView.getWindowToken(), 0);
                dialogInterface.dismiss();
            }
        });
        this.setNegativeButton(0x1040000, new DialogInterface.OnClickListener(){
            final MessengerCardAlertDialogBuilder this$0;
            final AutoCompleteTextView val$inputView;
            {
                this.this$0 = messengerCardAlertDialogBuilder;
                this.val$inputView = autoCompleteTextView;
            }

            public void onClick(DialogInterface dialogInterface, int n10) {
                ((InputMethodManager)this.val$inputView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.val$inputView.getWindowToken(), 0);
                dialogInterface.cancel();
            }
        });
    }

    @VisibleForTesting
    void sendResultToWebview(WebView webView, String string2, Map<String, Object> map2) {
        try {
            string2 = URLEncoder.encode(string2, "UTF-8").replaceAll("\\+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            string2 = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("window.fallbackApp.bridgeEvent('UPDATE_TEXT', { value:'");
        stringBuilder.append(string2);
        stringBuilder.append("', id:'");
        stringBuilder.append(map2.get("id"));
        stringBuilder.append("'})");
        webView.evaluateJavascript(stringBuilder.toString(), null);
    }
}

