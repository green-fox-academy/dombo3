package service;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface YodaSpeakService {

  @Headers({
      "X-Mashape-Key: PAilzSQEE2msh6u1RGbv9tcqpAnTp14nW2sjsnvcsh9PmfytuV",
      "Accept: application/json"
  })
  @GET("/yoda?sentence=You will learn how to speak like me someday.")
  Call<String> getYodaSpeak();
}
