/**
 * Created by user on 2017.03.23..
 */
public class takeslonger {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's" +
            " Law.";
    String insertQuote = "always takes longer than";
    StringBuilder myQuote = new StringBuilder(quote);

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    myQuote = myQuote.insert(quote.indexOf("It") + 2, " " + insertQuote);

    System.out.println(myQuote);
  }
}
