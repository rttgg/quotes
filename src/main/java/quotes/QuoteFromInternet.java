package quotes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class QuoteFromInternet {
    private final String text;
    private String author;

    //    private static String randomQuoteFromInternet;
    public static void main(String[] args) {
        try {
            //make a request to the forismatic API
            URL url = new URL("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            System.out.println(connection.getResponseCode());

            // saving the input as a string AND this line of code goes to the internet
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("request came back");
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = input.readLine()) != null) {
                content.append(inputLine);
                System.out.println(inputLine);
            }
            input.close();

            System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    //quoteText":"The thoughts we choose to think are the tools we use to paint the canvas of our lives. ", "quoteAuthor":"Louise Hay ",
    public QuoteFromInternet(String text, String author){
        String randomQuote = getRandomQuoteFromInternet();
        this.author = getQuoteFromInternetAuthor(randomQuote);
        this.text = text;

    }

    private String getRandomQuoteFromInternet() {
        return null;
    }


    public String toString(){
        return (this.author + ", " + this.text);
    }
//gets the internet quote Author
    protected static String getQuoteFromInternetAuthor(String quoteFromInternet){
        return quoteFromInternet.split("\",")[1].split(":\"")[1];
    }

 //get the internet quote text
 protected static String getQuoteFromInternetText(String quoteFromInternet){
        return quoteFromInternet.split("\",")[1].split(":\"")[1];
 }


    public Quote getFromInternet() {
        return null;
    }
}
