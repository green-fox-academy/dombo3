import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RequestYoda {
  public HttpResponse<String> getResponse(String sentence) throws UnirestException {
    HttpResponse<String> response = com.mashape.unirest.http.Unirest.get("https://yoda.p.mashape.com/yoda?sentence=" + sentence)
        .header("X-Mashape-Key", "PAilzSQEE2msh6u1RGbv9tcqpAnTp14nW2sjsnvcsh9PmfytuV")
        .header("Accept", "text/plain")
        .asString();

    return response;
  }
}
