package museumsystem;

/**
 *
 * @author xintong
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Museum {
    private ArrayList<Exhibit> exhibits;

    public Museum() {
        this.exhibits = new ArrayList<>();
    }

    public void loadExhibits(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // We use semicolon (;) to separate data
                String[] data = line.split(";");

                // Ensure the line has all 5 parts before processing
                if (data.length == 5) {
                    String title = data[0].trim();
                    String artist = data[1].trim();
                    int year = Integer.parseInt(data[2].trim());
                    String type = data[3].trim();
                    String description = data[4].trim();

                    Exhibit newExhibit = new Exhibit(title, artist, year, type, description);
                    exhibits.add(newExhibit);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Ensure " + filename + " is in the project folder.");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void viewAllExhibits() {
        for (Exhibit ex : exhibits) {
            System.out.println(ex.getDetails());
        }
    }

    public void searchExhibitsByArtist(String artist) {
        boolean found = false;
        for (Exhibit ex : exhibits) {
            if (ex.getArtist().equalsIgnoreCase(artist)) {
                System.out.println(ex.getDetails());
                found = true;
            }
        }
        if (!found) System.out.println("No exhibits found for artist: " + artist);
    }

    public void searchExhibitsByType(String type) {
        boolean found = false;
        for (Exhibit ex : exhibits) {
            if (ex.getType().equalsIgnoreCase(type)) {
                System.out.println(ex.getDetails());
                found = true;
            }
        }
        if (!found) System.out.println("No exhibits found of type: " + type);
    }

    public void searchExhibitsByYear(int year) {
        boolean found = false;
        for (Exhibit ex : exhibits) {
            if (ex.getYear() == year) {
                System.out.println(ex.getDetails());
                found = true;
            }
        }
        if (!found) System.out.println("No exhibits found for year: " + year);
    }
}