package quotes;

public class Quote {
    protected String[] tags;
    protected String author;
    protected String likes;
    protected String text;

    // Constructor
    public Quote (String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public Quote() {

    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    // Returns a quote and its author
    public String toString() {
        String returnString = "";
        returnString = "Author: "+ this.author + "\nQuote: "+ this.text;
        return returnString;
    }


}