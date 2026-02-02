/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.widget.ImageView
 *  androidx.annotation.VisibleForTesting
 *  com.intercom.twig.Twig
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.intercom.android.sdk.blocks;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.VideoUrlUtilKt;
import io.intercom.android.sdk.blocks.b;
import io.intercom.android.sdk.blocks.c;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class Video
implements VideoBlock {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;
    private final Twig twig = LumberMill.getLogger();

    Video(StyleType styleType, Api api, Provider<AppConfig> provider) {
        this.style = styleType;
        this.api = api;
        this.appConfigProvider = provider;
    }

    static /* synthetic */ Twig access$100(Video video) {
        return video.twig;
    }

    private void addClickListenerOnThumbnailView(ImageView imageView, String string2) {
        if (this.style != StyleType.CHAT_FULL) {
            imageView.setOnClickListener(new View.OnClickListener(){
                final Video this$0;
                final ImageView val$imageView;
                final String val$videoUrl;
                {
                    this.this$0 = video;
                    this.val$videoUrl = string2;
                    this.val$imageView = imageView;
                }

                public void onClick(View view) {
                    view = new Intent("android.intent.action.VIEW", Uri.parse((String)this.val$videoUrl));
                    view.setFlags(0x10000000);
                    IntentUtils.safelyOpenIntent(this.val$imageView.getContext(), (Intent)view);
                }
            });
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String getThumbnailUrlFromOembedResponse(d0 var1_1) {
        block7: {
            block6: {
                block8: {
                    var3_2 = new JSONObject();
                    try {
                        var4_4 = new JSONObject(var1_1.d().string());
                        var1_1.d().close();
                        var1_1 = var4_4;
                        break block6;
                    }
                    catch (Throwable var3_3) {
                        break block7;
                    }
                    catch (IOException var5_7) {
                    }
                    catch (JSONException var4_5) {
                        ** GOTO lbl-1000
                    }
                    {
                        var6_8 = this.twig;
                        var4_6 = new StringBuilder();
                        var4_6.append("Couldn't read response body: ");
                        var4_6.append(var5_7.getMessage());
                        var6_8.internal("ErrorObject", var4_6.toString());
                        break block8;
                    }
lbl-1000:
                    // 1 sources

                    {
                        var4_5.printStackTrace();
                    }
                }
                var1_1.d().close();
                var1_1 = var3_2;
            }
            var3_2 = var1_1.optString("thumbnail_url");
            var2_9 = var3_2.indexOf("?image_crop_resized");
            var1_1 = var3_2;
            if (var2_9 <= 0) return var1_1;
            return var3_2.substring(0, var2_9);
        }
        var1_1.d().close();
        throw var3_3;
    }

    @Override
    public View addVideo(String string2, VideoProvider videoProvider, String string3, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        string2 = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams((View)string2, -1, 480);
        string2.setWebChromeClient(new WebChromeClient());
        string2.getSettings().setJavaScriptEnabled(true);
        string2.loadUrl(VideoUrlUtilKt.getEmbedUrl(videoProvider, string3));
        return string2;
    }

    void createThumbnail(VideoPreviewView videoPreviewView, String string2, String string3) {
        videoPreviewView.displayThumbnail(string3);
        this.addClickListenerOnThumbnailView(videoPreviewView.getThumbnailImageView(), string2);
    }

    @VisibleForTesting
    void fetchThumbnail(VideoProvider object, String string2, VideoPreviewView videoPreviewView) {
        Object object2 = videoPreviewView.getThumbnailImageView();
        int n10 = 5.$SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[((Enum)object).ordinal()];
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 == 4) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/");
                        ((StringBuilder)object).append(string2);
                        object = ((StringBuilder)object).toString();
                        this.api.getVideo((String)object, new f(){
                            final Video this$0;
                            final String val$id;
                            final VideoPreviewView val$previewView;
                            final ImageView val$videoImageView;
                            {
                                this.this$0 = video;
                                this.val$previewView = videoPreviewView;
                                this.val$id = string2;
                                this.val$videoImageView = imageView;
                            }

                            public static /* synthetic */ void a(3 var0, VideoPreviewView videoPreviewView, String string2, String string3) {
                                var0.lambda$onResponse$0(videoPreviewView, string2, string3);
                            }

                            private /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String string2, String string3) {
                                this.this$0.createThumbnail(videoPreviewView, string2, string3);
                            }

                            @Override
                            public void onFailure(e e11, IOException iOException) {
                                this.val$previewView.showFailedImage();
                            }

                            @Override
                            public void onResponse(e object, d0 object2) {
                                if (((d0)object2).A()) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("https://www.useloom.com/embed/");
                                    ((StringBuilder)object).append(this.val$id);
                                    object = ((StringBuilder)object).toString();
                                    object2 = this.this$0.getThumbnailUrlFromOembedResponse((d0)object2);
                                    this.val$videoImageView.post((Runnable)new c(this, this.val$previewView, (String)object, (String)object2));
                                } else {
                                    this.val$previewView.showFailedImage();
                                }
                            }
                        });
                    }
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("https://vimeo.com/api/v2/video/");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(".json");
                    object = ((StringBuilder)object).toString();
                    this.api.getVideo((String)object, new f(){
                        final Video this$0;
                        final String val$id;
                        final VideoPreviewView val$previewView;
                        final ImageView val$videoImageView;
                        {
                            this.this$0 = video;
                            this.val$previewView = videoPreviewView;
                            this.val$videoImageView = imageView;
                            this.val$id = string2;
                        }

                        public static /* synthetic */ void a(2 var0, VideoPreviewView videoPreviewView, String string2, String string3) {
                            var0.lambda$onResponse$0(videoPreviewView, string2, string3);
                        }

                        private /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String string2, String string3) {
                            Video video = this.this$0;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("https://player.vimeo.com/video/");
                            stringBuilder.append(string2);
                            video.createThumbnail(videoPreviewView, stringBuilder.toString(), string3);
                        }

                        @Override
                        public void onFailure(e e11, IOException iOException) {
                            this.val$previewView.showFailedImage();
                        }

                        /*
                         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                         * Unable to fully structure code
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        @Override
                        public void onResponse(e var1_1, d0 var2_4) {
                            block6: {
                                if (var2_4.A() == false) return;
                                if (var2_4.d() == null) return;
                                try {
                                    var1_1 = new JSONArray(var2_4.d().string());
                                    var6_5 = var1_1.getJSONObject(0).getString("thumbnail_large");
                                    var1_1 = this.val$videoImageView;
                                    var5_6 = this.val$previewView;
                                    var3_7 = this.val$id;
                                    var4_9 = new b(this, var5_6, var3_7, var6_5);
                                    var1_1.post((Runnable)var4_9);
                                }
                                catch (Throwable var1_2) {
                                    break block6;
                                }
                                catch (IOException var3_8) {
                                    ** GOTO lbl-1000
                                }
                                catch (JSONException var1_3) {
                                    ** GOTO lbl30
                                }
lbl19:
                                // 3 sources

                                while (true) {
                                    var2_4.d().close();
                                    return;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var4_10 = Video.access$100(this.this$0);
                                    var1_1 = new StringBuilder();
                                    var1_1.append("Couldn't read response body: ");
                                    var1_1.append(var3_8.getMessage());
                                    var4_10.internal("ErrorObject", var1_1.toString());
                                    ** GOTO lbl19
lbl30:
                                    // 1 sources

                                    var1_3.printStackTrace();
                                    ** continue;
                                }
                            }
                            var2_4.d().close();
                            throw var1_2;
                        }
                    });
                }
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://www.youtube.com/watch?v=");
                ((StringBuilder)object).append(string2);
                object = ((StringBuilder)object).toString();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("https://img.youtube.com/vi/");
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append("/default.jpg");
                this.createThumbnail(videoPreviewView, (String)object, ((StringBuilder)object2).toString());
            }
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/");
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            this.api.getVideo((String)object, new f(){
                final Video this$0;
                final String val$id;
                final VideoPreviewView val$previewView;
                final ImageView val$videoImageView;
                {
                    this.this$0 = video;
                    this.val$previewView = videoPreviewView;
                    this.val$id = string2;
                    this.val$videoImageView = imageView;
                }

                @Override
                public void onFailure(e e11, IOException iOException) {
                    this.val$previewView.showFailedImage();
                }

                @Override
                public void onResponse(e object, d0 object2) {
                    if (((d0)object2).A()) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("https://fast.wistia.net/embed/iframe/");
                        ((StringBuilder)object).append(this.val$id);
                        object = ((StringBuilder)object).toString();
                        object2 = this.this$0.getThumbnailUrlFromOembedResponse((d0)object2);
                        this.val$videoImageView.post(new Runnable(){
                            final 1 this$1;
                            final String val$thumbnailUrl;
                            final String val$videoUrl;
                            {
                                this.this$1 = var1_1;
                                this.val$videoUrl = string2;
                                this.val$thumbnailUrl = string3;
                            }

                            @Override
                            public void run() {
                                1 var1_1 = this.this$1;
                                var1_1.this$0.createThumbnail(var1_1.val$previewView, this.val$videoUrl, this.val$thumbnailUrl);
                            }
                        });
                    } else {
                        this.val$previewView.showFailedImage();
                    }
                }
            });
        }
    }
}

