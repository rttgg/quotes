package quotes;

import java.util.ArrayList;

public class Quote {
   ArrayList<String> tags;
    String author;
    String likes;
    String text;

    public Quote( ArrayList<String> tags, String author, String likes, String text){
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;

    }
}
