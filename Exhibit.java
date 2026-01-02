package museumsystem;

/**
 *
 * @author xintong
 */
public class Exhibit {
    private String title;
    private String artist;
    private int year;
    private String type;
    private String description;

    public Exhibit(String title, String artist, int year, String type, String description) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.type = type;
        this.description = description;
    }

    public String getArtist() {
        return artist;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public String getDetails() {
        return "Title: " + title + "\n" +
               "Artist: " + artist + "\n" +
               "Year: " + year + "\n" +
               "Type: " + type + "\n" +
               "Description: " + description + "\n";
    }
}