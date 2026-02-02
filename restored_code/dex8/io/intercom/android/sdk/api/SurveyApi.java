/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.api;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.k0;
import okhttp3.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000b\u0010\tJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\tJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\tJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/api/SurveyApi;", "", "", "surveyId", "Lokhttp3/c0;", "options", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/survey/model/SubmitSurveyResponse;", "submitSurveyStep", "(Ljava/lang/String;Lokhttp3/c0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/k0;", "dismissSurvey", "submitCtaStat", "reportFailure", "Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "fetchSurvey", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public interface SurveyApi {
    @POST(value="surveys/{surveyId}/dismiss")
    @Nullable
    public Object dismissSurvey(@Path(value="surveyId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<k0>> var3);

    @POST(value="surveys/{surveyId}/fetch")
    @Nullable
    public Object fetchSurvey(@Path(value="surveyId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<FetchSurveyRequest>> var3);

    @POST(value="surveys/{survey_id}/failure")
    @Nullable
    public Object reportFailure(@Path(value="survey_id") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<k0>> var3);

    @POST(value="surveys/{surveyId}/action_button_clicked")
    @Nullable
    public Object submitCtaStat(@Path(value="surveyId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<k0>> var3);

    @POST(value="surveys/{surveyId}/submit")
    @Nullable
    public Object submitSurveyStep(@Path(value="surveyId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<SubmitSurveyResponse>> var3);
}

