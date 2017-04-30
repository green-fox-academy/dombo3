public class YodaSpeak {

  public static void main(String[] args) {
    RequestYoda myRequest = new RequestYoda();

    String sentence = "";

    for (String arg : args) {
      sentence += arg + "+";
    }

    try {
      System.out.println(myRequest.getResponse(sentence).getBody());
    } catch (Exception e) {
      e.getMessage();
    }
  }
}
