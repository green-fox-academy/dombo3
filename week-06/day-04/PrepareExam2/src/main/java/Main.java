import static java.time.format.FormatStyle.FULL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.YodaSpeakService;

public class Main {

  public static void main(String[] args) {

    Gson gson = new GsonBuilder()
        .setLenient()
        .create();

    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://yoda.p.mashape.com")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build();

    YodaSpeakService service = retrofit.create(YodaSpeakService.class);

    Call<String> call = service.getYodaSpeak();

    try {
      Response response = call.execute();
      System.out.println(response.isSuccessful());
      System.out.println(response.raw().body());
    } catch (IOException e) {
      System.out.println("In IO catch");
      System.out.println(e.getMessage());
    }

    try {
      HttpResponse<String> response = Unirest
          .get("https://simple-weather.p.mashape.com/weather?lat=47.49801&lng=19.03991")
          .header("X-Mashape-Key", "PAilzSQEE2msh6u1RGbv9tcqpAnTp14nW2sjsnvcsh9PmfytuV")
          .header("Accept", "text/plain")
          .asString();
      System.out.println(response.getBody());
    } catch (UnirestException e) {
      System.out.println(e.getMessage());
    }

    LocalDate d = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
    String text = d.format(formatter);
    LocalDate parseDate = LocalDate.parse(text, formatter);
    System.out.println(parseDate);
    LocalTime t = LocalTime.now();
    System.out.println(t);
    LocalDateTime dt = LocalDateTime.now();
    System.out.println(dt);
//    call.enqueue(new Callback<String>() {
//      @Override
//      public void onResponse(Call<String> call, Response<String> response) {
//        System.out.println(response.body());
//      }
//
//      @Override
//      public void onFailure(Call<String> call, Throwable t) {
//        System.out.println("Failed response");
//      }
//    });

  }
}
